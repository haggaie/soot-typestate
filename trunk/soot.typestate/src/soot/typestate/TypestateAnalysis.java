/**
 * 
 */
package soot.typestate;

import soot.Local;
import soot.RefType;
import soot.SootMethod;
import soot.Unit;
import soot.jimple.AbstractStmtSwitch;
import soot.jimple.AssignStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.InvokeStmt;
import soot.jimple.NewExpr;
import soot.toolkits.graph.DirectedGraph;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.FlowUniverse;
import soot.toolkits.scalar.ForwardFlowAnalysis;
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
	
	TypestateAnalysis(DirectedGraph<Unit> graph, ClassAutomaton automaton)
    {
        super(graph);
        this.automaton = automaton;
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

					ASInfo outInfo = out.getASInfo(local.getNumber());
					outInfo.setStates(automaton.getInitialState());
				}
			}
			
			@Override
			public void caseInvokeStmt(InvokeStmt stmt) {
				SootMethod method = stmt.getInvokeExpr().getMethod();
				if (method.isStatic())
					// TODO handle side effects.
					return;
				if (!method.getDeclaringClass().equals(automaton.getKlass()))
					// TODO should also work with subclasses, or implementing interfaces.
					// TODO handle side effects.
					return;
				
				InstanceInvokeExpr expr = (InstanceInvokeExpr) stmt.getInvokeExpr();
				Local base = (Local) expr.getBase();
				
				ASInfo inInfo  = in.getASInfo(base.getNumber()),
					   outInfo = out.getASInfo(base.getNumber());
			
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
}
