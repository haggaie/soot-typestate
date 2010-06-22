/**
 * 
 */
package soot.typestate;

import java.util.ArrayList;
import java.util.List;

import soot.BooleanType;
import soot.Local;
import soot.RefType;
import soot.SootMethod;
import soot.SootMethodRef;
import soot.Unit;
import soot.Value;
import soot.jimple.AbstractStmtSwitch;
import soot.jimple.AssignStmt;
import soot.jimple.Constant;
import soot.jimple.EqExpr;
import soot.jimple.IfStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.IntConstant;
import soot.jimple.InvokeExpr;
import soot.jimple.InvokeStmt;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.BoundedFlowSet;
import soot.toolkits.scalar.FlowUniverse;
import soot.toolkits.scalar.ForwardBranchedFlowAnalysis;
import soot.typestate.LatticeNode.ASInfoVisitor;
import soot.typestate.automata.ClassAutomaton;

/**
 * @author haggaie
 *
 */
public class TypestateAnalysis extends ForwardBranchedFlowAnalysis<LatticeNode> {
	// Our automaton
	private final ClassAutomaton automaton;
	// The FlowUniverse of state numbers.
	private final FlowUniverse<Integer> statesUniverse;
	// Allocation site handler that finds allocation sites of variables
	private final AllocationSiteHandler allocationSiteHandler;
	
	TypestateAnalysis(UnitGraph graph, ClassAutomaton automaton, AllocationSiteHandler allocationSiteHandler)
    {
        super(graph);
        this.automaton = automaton;
        this.statesUniverse = automaton.getFlowUniverse();
    	this.allocationSiteHandler = allocationSiteHandler;
        doAnalysis();
    }
	
	boolean ourType(Local local) {
		return local.getType() instanceof RefType &&
			((RefType) local.getType()).getSootClass().equals(automaton.getKlass());
	}
	
	@Override
	protected void flowThrough(final LatticeNode in, Unit node, 
            List<LatticeNode> fallOut, List<LatticeNode> branchOuts) {
		final LatticeNode out = new LatticeNode(in),
		      			  outBranch = new LatticeNode(in);
		final List<Boolean> differentFallAndBranch = new ArrayList<Boolean>(1);
		differentFallAndBranch.add(false);
		
		node.apply(new AbstractStmtSwitch() {
			@Override
			public void caseAssignStmt(AssignStmt stmt) {
				if (!(stmt.getLeftOp() instanceof Local))
					return; // TODO handle other assignments
				Local local = (Local) stmt.getLeftOp();
				// Make sure this local is of an interesting type
				if (ourType(local)) {
					AllocationSiteSet allocSite = allocationSiteHandler.getDefAllocationSite(stmt);
					if (allocSite != null)
					{
						final ASInfo inAsInfo  = in.getASInfo(allocSite),
									 outAsInfo = out.getASInfo(allocSite);
						if (inAsInfo != null)
						{
							inAsInfo.copy(outAsInfo);
							outAsInfo.setUnique(false);
						}
						else
						{
							final ASInfo newOutInfo = new ASInfo(automaton.getInitialState());
							out.addASInfo(allocSite, newOutInfo);
						}
					}
				}
				else if (local.getType() instanceof BooleanType) {
					if (stmt.getRightOp() instanceof InstanceInvokeExpr) {
						InstanceInvokeExpr invokeExpr = (InstanceInvokeExpr) stmt.getRightOp();
						Local base = (Local) invokeExpr.getBase();
						if (!ourType(base))
							out.killConditional(local);
						
						out.setConditional(local, stmt);
					}
					else
						out.killConditional(local);
				}
			}
			
			@Override
			public void caseInvokeStmt(InvokeStmt stmt) {
				final SootMethodRef methodRef = stmt.getInvokeExpr().getMethodRef();
				if (!(stmt.getInvokeExpr() instanceof InstanceInvokeExpr))
					// TODO handle side effects.
					return;
				InstanceInvokeExpr invokeExpr = (InstanceInvokeExpr) stmt.getInvokeExpr();
				if (!methodRef.declaringClass().equals(automaton.getKlass()))
					// TODO should also work with subclasses, or implementing interfaces.
					// TODO handle side effects.
					return;
				// TODO check if invocation parameters appear as Used values in the stmt.
				Local base = (Local) invokeExpr.getBase();
				in.forEachAllocationSite(allocationSiteHandler.getUseAllocationSites(stmt, base), new ASInfoVisitor() {
					@Override
					public void visit(AllocationSiteSet allocSite, ASInfo inInfo) {
						ASInfo outInfo = out.getASInfo(allocSite);
						if (outInfo == null)
							out.addASInfo(allocSite, inInfo.clone());
						
						BoundedFlowSet  states = inInfo.getStates(),
						nextStates = automaton.getDelta(methodRef.resolve(), states);
				
						if (inInfo.isUnique())
						{
							assert outInfo.isUnique();
							outInfo.setStates(nextStates);
						}
						else
						{
							inInfo.copy(outInfo);
							outInfo.merge(nextStates);
						}
					}
				});
				
				out.killConditional(base);
			}
			
			// TODO handle Identity statements
			
			@Override
			public void caseIfStmt(IfStmt stmt) {
				if (stmt.getCondition() instanceof EqExpr) {
					Local local; 
					final IntConstant constant;
					EqExpr eqExpr = (EqExpr) stmt.getCondition();
					if (eqExpr.getOp1() instanceof Local && eqExpr.getOp2() instanceof Constant) {
						local = (Local) eqExpr.getOp1();
						constant = (IntConstant) eqExpr.getOp2();
					}
					else if (eqExpr.getOp2() instanceof Local && eqExpr.getOp1() instanceof Constant) {
						local = (Local) eqExpr.getOp2();
						constant = (IntConstant) eqExpr.getOp1();
					}
					else
						return;
					AssignStmt defStmt = in.getConditional(local);
					if (defStmt == null)
						return;
					if (!(defStmt.getInvokeExpr() instanceof InstanceInvokeExpr))
						return;
					InstanceInvokeExpr invokeExpr = (InstanceInvokeExpr) defStmt.getInvokeExpr();
					AllocationSiteSet allocSite = allocationSiteHandler.getUseAllocationSites(defStmt, (Local)invokeExpr.getBase());
					
					final SootMethod method = invokeExpr.getMethod();

					in.forEachAllocationSite(allocSite, new ASInfoVisitor() {
						@Override
						public void visit(AllocationSiteSet allocSite, ASInfo asInfo) {
							final BoundedFlowSet nextStatesTrue  = automaton.getDelta(method, 
									constant.value != 0, asInfo.getStates());
							final BoundedFlowSet nextStatesFalse = automaton.getDelta(method, 
									constant.value == 0, asInfo.getStates());
							if (asInfo.isUnique()) {
								// Strong update
								differentFallAndBranch.set(0, true);
								out.getASInfo(allocSite).setStates(nextStatesFalse);
								outBranch.getASInfo(allocSite).setStates(nextStatesTrue);
							}
						}
					});
				}
			}
		});
		
		for (LatticeNode latticeNode : fallOut) {
			out.copy(latticeNode);
		}
		for (LatticeNode latticeNode : branchOuts) {
			(differentFallAndBranch.get(0) ? outBranch : out).copy(latticeNode);
		}

		System.out.println("  Input: " + in);
		System.out.println("    " + node.getTag("LineNumberTag") + ": " + node);
		System.out.println("  Output: ");
		System.out.println("    Fall: " + fallOut);
		System.out.println("    Branch: " + branchOuts);
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
}
