/**
 * 
 */
package soot.typestate;

import java.util.Map;

import soot.Scene;
import soot.Unit;
import soot.tagkit.LineNumberTag;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.LocalDefs;
import soot.toolkits.scalar.SimpleLocalDefs;
import soot.typestate.automata.ClassAutomaton;

/**
 * @author fshaked
 *
 */
public class Typestate {
	TypestateAnalysis analysis;
	final UnitGraph graph;
	final ClassAutomaton automaton;
		
	Typestate(UnitGraph graph, ClassAutomaton automaton, boolean pointsToAnalysis)
	{
		this.graph = graph;
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
	
	public void printResults()
	{
		for (Unit unit : graph) {
			LatticeNode beforeNode = analysis.getFlowBefore(unit);
			LatticeNode afterNode = analysis.getFlowAfter(unit);
			if (!beforeNode.hasState( automaton.getErrorState() ) && afterNode.hasState( automaton.getErrorState() )) {
				System.err.println("found error in line " + unit.getTag("LineNumberTag").toString());
			}
		}
		System.err.flush();
	}
}
