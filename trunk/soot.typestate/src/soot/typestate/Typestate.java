/**
 * 
 */
package soot.typestate;

import soot.Scene;
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
	
	Typestate(UnitGraph graph, ClassAutomaton automaton, boolean pointsToAnalysis)
	{
		TypestateAnalysis analysis;
		
		this.automaton = automaton;
		if (pointsToAnalysis) {
			analysis = new TypestateAnalysis(graph, automaton,
					new SparkAllocationSiteHandler(Scene.v().getPointsToAnalysis()));
		}
		else {
			LocalDefs localDefs = new SimpleLocalDefs(graph);
			analysis = new TypestateAnalysis(graph, automaton, 
					new LocalDefsAllocationSiteHandler(localDefs));
		}
		
		// TODO process the results
	}
}
