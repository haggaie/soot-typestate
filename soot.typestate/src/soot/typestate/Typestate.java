/**
 * 
 */
package soot.typestate;

import soot.Unit;
import soot.toolkits.graph.DirectedGraph;
import soot.typestate.automata.ClassAutomaton;

/**
 * @author fshaked
 *
 */
public class Typestate {
	final ClassAutomaton automaton;
	
	Typestate(DirectedGraph<Unit> graph, ClassAutomaton automaton)
	{
		this.automaton = automaton;
		TypestateAnalysis analysis = new TypestateAnalysis(graph);
		
		// TODO process the results
	}
}
