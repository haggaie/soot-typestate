/**
 * 
 */
package soot.typestate;

import soot.Scene;
import soot.Unit;
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
