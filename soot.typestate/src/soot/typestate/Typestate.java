/**
 * 
 */
package soot.typestate;

import soot.Unit;
import soot.toolkits.graph.DirectedGraph;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.LocalDefs;
import soot.toolkits.scalar.SimpleLocalDefs;
import soot.typestate.automata.ClassAutomaton;

/**
 * @author fshaked
 *
 */
public class Typestate {
	final ClassAutomaton automaton;
	final LocalDefs localDefs;
	
	Typestate(UnitGraph graph, ClassAutomaton automaton, boolean pointsToAnalysis)
	{
		this.automaton = automaton;
		localDefs = new SimpleLocalDefs(graph);
		TypestateAnalysis analysis = new TypestateAnalysis(graph, automaton, localDefs, pointsToAnalysis);
		
		// TODO process the results
	}
}
