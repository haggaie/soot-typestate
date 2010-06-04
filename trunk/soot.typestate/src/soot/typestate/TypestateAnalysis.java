/**
 * 
 */
package soot.typestate;

import java.util.ArrayList;
import java.util.Collection;

import soot.Local;
import soot.RefType;
import soot.Scene;
import soot.SootMethod;
import soot.Unit;
import soot.jimple.AbstractStmtSwitch;
import soot.jimple.AssignStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.InvokeStmt;
import soot.jimple.NewExpr;
import soot.jimple.spark.pag.Node;
import soot.jimple.spark.sets.P2SetVisitor;
import soot.jimple.spark.sets.PointsToSetInternal;
import soot.toolkits.graph.DirectedGraph;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.FlowUniverse;
import soot.toolkits.scalar.ForwardFlowAnalysis;
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
	// Enable/disable the use of Spark for points-to analysis.
	private final boolean pointsToAnalysis;
	
	TypestateAnalysis(DirectedGraph<Unit> graph, ClassAutomaton automaton, boolean pointsToAnalysis)
    {
        super(graph);
        this.automaton = automaton;
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
				if (stmt.getRightOp() instanceof NewExpr) {
					// An allocation statement
					// TODO other kinds of allocations (arrays).
					NewExpr expr = (NewExpr) stmt.getRightOp();
					RefType type = expr.getBaseType();
					if (!type.getSootClass().equals(automaton.getKlass()))
						return; // TODO handle polymorphism

					out.forEachAllocationSite(getAllocationSites(local), new ASInfoVisitor() {
						@Override
						public void visit(Integer allocSite, ASInfo asInfo) {
							asInfo.setStates(automaton.getInitialState());
						}
					});
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
			
				in.forEachAllocationSite(getAllocationSites(base), new ASInfoVisitor() {
					@Override
					public void visit(Integer allocSite, ASInfo inInfo) {
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
	
	protected Collection<Integer> getAllocationSites(Local local)
	{
		final Collection<Integer> allocationSites = new ArrayList<Integer>();
		if (pointsToAnalysis) {
			PointsToSetInternal pts = (PointsToSetInternal) Scene.v().getPointsToAnalysis().reachingObjects(local);
			pts.forall(new P2SetVisitor() {
				@Override
				public void visit(Node node) {
					allocationSites.add(node.getNumber());
				}
			});
		}
		else {
			allocationSites.add(local.getNumber()); // TODO use reaching defintions of some sort.
		}
			
		return allocationSites;
	}
}
