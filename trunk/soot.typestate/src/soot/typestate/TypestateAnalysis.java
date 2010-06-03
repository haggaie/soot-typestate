/**
 * 
 */
package soot.typestate;

import soot.Unit;
import soot.jimple.AbstractStmtSwitch;
import soot.jimple.AssignStmt;
import soot.jimple.BreakpointStmt;
import soot.jimple.EnterMonitorStmt;
import soot.jimple.ExitMonitorStmt;
import soot.jimple.GotoStmt;
import soot.jimple.IdentityStmt;
import soot.jimple.IfStmt;
import soot.jimple.InvokeStmt;
import soot.jimple.LookupSwitchStmt;
import soot.jimple.NopStmt;
import soot.jimple.RetStmt;
import soot.jimple.ReturnStmt;
import soot.jimple.ReturnVoidStmt;
import soot.jimple.StmtSwitch;
import soot.jimple.TableSwitchStmt;
import soot.jimple.ThrowStmt;
import soot.toolkits.graph.DirectedGraph;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.ForwardFlowAnalysis;

/**
 * @author haggaie
 *
 */
public class TypestateAnalysis extends ForwardFlowAnalysis<Unit, LatticeNode> {
	
	TypestateAnalysis(DirectedGraph<Unit> graph)
    {
        super(graph);
        doAnalysis();
    }
	
	@Override
	protected void flowThrough(final LatticeNode in, Unit node, final LatticeNode out) {
		node.apply(new AbstractStmtSwitch() {
			@Override
			public void defaultCase(Object o) {
				in.copy(out);
			}
			
			// TODO rest of the cases
		});
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
		return new LatticeNode();
	}

	@Override
	protected LatticeNode newInitialFlow() {
		return new LatticeNode();
	}
}
