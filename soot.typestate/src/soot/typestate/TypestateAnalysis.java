/**
 * 
 */
package soot.typestate;

import java.util.List;

import soot.Local;
import soot.RefType;
import soot.SootMethodRef;
import soot.Unit;
import soot.jimple.AbstractStmtSwitch;
import soot.jimple.AssignStmt;
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
	
	@Override
	protected void flowThrough(final LatticeNode in, Unit node, 
            List<LatticeNode> fallOut, List<LatticeNode> branchOuts) {
		final LatticeNode out = new LatticeNode(in),
		      			  outBranch = out;
		
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
			
			@Override
			public void caseInvokeStmt(InvokeStmt stmt) {
				final SootMethodRef methodRef = stmt.getInvokeExpr().getMethodRef();
				if (methodRef.isStatic())
					// TODO handle side effects.
					return;
				if (!methodRef.declaringClass().equals(automaton.getKlass()))
					// TODO should also work with subclasses, or implementing interfaces.
					// TODO handle side effects.
					return;
				
				// TODO check if invocation parameters appear as Used values in the stmt.
				in.forEachAllocationSite(allocationSiteHandler.getUseAllocationSites(stmt), new ASInfoVisitor() {
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
			
			}
			
			// TODO handle Identity statements
		});
		
		for (LatticeNode latticeNode : fallOut) {
			out.copy(latticeNode);
		}
		for (LatticeNode latticeNode : branchOuts) {
			outBranch.copy(latticeNode);
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
