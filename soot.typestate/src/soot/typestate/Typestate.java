/**
 * 
 */
package soot.typestate;

import soot.Unit;
import soot.toolkits.graph.UnitGraph;
import soot.typestate.automata.ClassAutomaton;

/**
 * @author fshaked
 *
 */
public class Typestate {
	TypestateAnalysis analysis;
	final UnitGraph graph;
	final ClassAutomaton automaton;
		
	Typestate(UnitGraph graph, ClassAutomaton automaton)
	{
		this.graph = graph;
		this.automaton = automaton;
		
		analysis = new TypestateAnalysis(graph, automaton);
	}
	
	public void printResults()
	{
		for (Unit unit : graph) {
			LatticeNode beforeNode = analysis.getFlowBefore(unit);
			LatticeNode afterNode = analysis.getFallFlowAfter(unit);
			if (!beforeNode.hasState( automaton.getErrorState() ) && afterNode.hasState( automaton.getErrorState() )) {
				System.out.println(" ** found error in line " + unit.getTag("LineNumberTag").toString());
			}
		}
		System.out.flush();
	}
}
