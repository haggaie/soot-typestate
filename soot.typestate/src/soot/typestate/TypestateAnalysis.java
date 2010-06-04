/**
 * 
 */
package soot.typestate;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import soot.Local;
import soot.RefType;
import soot.Scene;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.ValueBox;
import soot.jimple.AbstractStmtSwitch;
import soot.jimple.AssignStmt;
import soot.jimple.DefinitionStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.InvokeStmt;
import soot.jimple.LookupSwitchStmt;
import soot.jimple.NewExpr;
import soot.jimple.NopStmt;
import soot.jimple.RetStmt;
import soot.jimple.ReturnStmt;
import soot.jimple.ReturnVoidStmt;
import soot.jimple.StmtSwitch;
import soot.jimple.TableSwitchStmt;
import soot.jimple.ThrowStmt;
import soot.jimple.spark.pag.Node;
import soot.jimple.spark.sets.P2SetVisitor;
import soot.jimple.spark.sets.PointsToSetInternal;
import soot.toolkits.graph.DirectedGraph;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.FlowUniverse;
import soot.toolkits.scalar.ForwardFlowAnalysis;
import soot.toolkits.scalar.LocalDefs;
import soot.typestate.LatticeNode.ASInfoVisitor;
import soot.typestate.automata.ClassAutomaton;

/**
 * @author haggaie
 *
 */
public class TypestateAnalysis extends ForwardFlowAnalysis<Unit, LatticeNode> {
	// Our automaton
	private final ClassAutomaton automaton;
	// The FlowUniverse of state numbers.
	private final FlowUniverse<Integer> statesUniverse;
	// Local definitions analysis results
	private final LocalDefs localDefs;
	// Enable/disable the use of Spark for points-to analysis.
	private final boolean pointsToAnalysis;
	
	TypestateAnalysis(DirectedGraph<Unit> graph, ClassAutomaton automaton, LocalDefs localDefs, boolean pointsToAnalysis)
    {
        super(graph);
        this.automaton = automaton;
        this.localDefs = localDefs;
        this.pointsToAnalysis = pointsToAnalysis;
        statesUniverse = automaton.getFlowUniverse();
        doAnalysis();
    }
	
	@Override
	protected void flowThrough(final LatticeNode in, Unit node, final LatticeNode out) {
		System.out.println("  Input: " + in);
		System.out.println("    " + node);
		
		in.copy(out);
		node.apply(new AbstractStmtSwitch() {
			@Override
			public void caseAssignStmt(AssignStmt stmt) {
				if (!(stmt.getLeftOp() instanceof Local))
					return; // TODO handle other assignments
				Local local = (Local) stmt.getLeftOp();
				// Make sure this local is of an interesting type
				if (!(local.getType() instanceof RefType) || 
						!((RefType) local.getType()).getSootClass().equals(automaton.getKlass())) {
					return; // TODO handle polymorphism
				}
				if (stmt.getRightOp() instanceof NewExpr) {
					// An allocation statement
					// TODO other kinds of allocations (arrays).
					NewExpr expr = (NewExpr) stmt.getRightOp();

					out.getASInfo(new UnitAllocationSite(stmt)).setStates(automaton.getInitialState());
				}
				else if (stmt.getRightOp() instanceof Local) {
					// ignore
				}
				else {
					// Consider such definitions as allocation sites as long as we don't have points-to analysis.
					out.getASInfo(new UnitAllocationSite(stmt)).setStates(automaton.getAllStates());
				}
			}
			
			@Override
			public void caseInvokeStmt(InvokeStmt stmt) {
				final SootMethod method = stmt.getInvokeExpr().getMethod();
				if (method.isStatic())
					// TODO handle side effects.
					return;
				if (!method.getDeclaringClass().equals(automaton.getKlass()))
					// TODO should also work with subclasses, or implementing interfaces.
					// TODO handle side effects.
					return;
				
				InstanceInvokeExpr expr = (InstanceInvokeExpr) stmt.getInvokeExpr();
				Local base = (Local) expr.getBase();
			
				in.forEachAllocationSite(getAllocationSites(base, stmt), new ASInfoVisitor() {
					@Override
					public void visit(AllocationSite allocSite, ASInfo inInfo) {
						ASInfo outInfo = out.getASInfo(allocSite);
						
						FlowSet states = inInfo.getStates(),
						nextStates = automaton.getDelta(method, states);
				
						inInfo.copy(outInfo);
						// TODO unique
						// if unique
						//   outInfo.setStates(nextStates);
						// else
						outInfo.merge(nextStates);
					}
				});
			
			}
		});
		
		System.out.println("  Output: " + out);
	}

	@Override
	protected void copy(LatticeNode source, LatticeNode dest) {
		source.copy(dest);		
	}

	@Override
	protected void merge(LatticeNode in1, LatticeNode in2, LatticeNode out) {
		in1.union(in2, out);
	}

	@Override
	protected LatticeNode entryInitialFlow() {
		return new LatticeNode(statesUniverse);
	}

	@Override
	protected LatticeNode newInitialFlow() {
		return new LatticeNode(statesUniverse);
	}
	
	protected Collection<AllocationSite> getAllocationSites(Local local, Unit unit)
	{
		final Collection<AllocationSite> allocationSites = new ArrayList<AllocationSite>();
		if (pointsToAnalysis) {
			PointsToSetInternal pts = (PointsToSetInternal) Scene.v().getPointsToAnalysis().reachingObjects(local);
			pts.forall(new P2SetVisitor() {
				@Override
				public void visit(Node node) {
					allocationSites.add(new IntegerAllocationSite(node.getNumber()));
				}
			});
		}
		else {
			// Recursively try to find a local allocation site for the variable,
			// based on reaching definitions analysis in localDefs.
			// Use whatever local definition it finds if no allocation site is found.
			List<Unit> defs = localDefs.getDefsOfAt(local, unit);
			for (Unit def : defs) {
				DefinitionStmt stmt = (DefinitionStmt) def;
				if (stmt.getLeftOp().equivTo(local))
				{
					Value right = stmt.getRightOp();
					if (right instanceof NewExpr) {
						NewExpr newExpr = (NewExpr) stmt.getRightOp();
						allocationSites.add(new UnitAllocationSite(stmt));
						continue;
					}
					if (right instanceof Local) {
						Local newLocal = (Local) right;
						allocationSites.addAll(getAllocationSites(newLocal, def));
						continue;
					}
					allocationSites.add(new UnitAllocationSite(stmt));
				}
			}
		}
			
		return allocationSites;
	}
}
