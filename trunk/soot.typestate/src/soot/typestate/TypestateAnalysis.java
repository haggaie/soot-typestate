/**
 * 
 */
package soot.typestate;

import java.util.Collection;

import soot.Local;
import soot.RefType;
import soot.SootMethod;
import soot.SootMethodRef;
import soot.Unit;
import soot.jimple.AbstractStmtSwitch;
import soot.jimple.AssignStmt;
import soot.jimple.InvokeStmt;
import soot.toolkits.graph.DirectedGraph;
import soot.toolkits.scalar.BoundedFlowSet;
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
	// Allocation site handler that finds allocation sites of variables
	private final AllocationSiteHandler allocationSiteHandler;
	
	TypestateAnalysis(DirectedGraph<Unit> graph, ClassAutomaton automaton, AllocationSiteHandler allocationSiteHandler)
    {
        super(graph);
        this.automaton = automaton;
        this.statesUniverse = automaton.getFlowUniverse();
    	this.allocationSiteHandler = allocationSiteHandler;
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
				AllocationSite allocSite = allocationSiteHandler.getDefAllocationSite(stmt);
				if (allocSite != null)
					out.getASInfo(allocSite).setStates(automaton.getInitialState());
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
				
				in.forEachAllocationSite(getAllocationSites(stmt), new ASInfoVisitor() {
					@Override
					public void visit(AllocationSite allocSite, ASInfo inInfo) {
						ASInfo outInfo = out.getASInfo(allocSite);
						
						BoundedFlowSet  states = inInfo.getStates(),
						nextStates = automaton.getDelta(methodRef.resolve(), states);
				
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
	
	private Collection<AllocationSite> getAllocationSites(Unit unit) {
		return allocationSiteHandler.getUseAllocationSites(unit);
	}
}
