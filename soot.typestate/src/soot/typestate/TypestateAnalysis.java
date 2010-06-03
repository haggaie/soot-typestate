/**
 * 
 */
package soot.typestate;

import soot.Unit;
import soot.toolkits.graph.DirectedGraph;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.ForwardFlowAnalysis;

/**
 * @author haggaie
 *
 */
public class TypestateAnalysis extends ForwardFlowAnalysis<Unit, FlowSet> {
	
	TypestateAnalysis(DirectedGraph<Unit> graph)
    {
        super(graph);
        doAnalysis();
    }
	
	@Override
	protected void flowThrough(FlowSet in, Unit node, FlowSet out) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void copy(FlowSet source, FlowSet dest) {
		source.copy(dest);		
	}

	@Override
	protected void merge(FlowSet in1, FlowSet in2, FlowSet out) {
		in1.union(in2, out);
	}

	@Override
	protected FlowSet entryInitialFlow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected FlowSet newInitialFlow() {
		// TODO Auto-generated method stub
		return null;
	}
}
