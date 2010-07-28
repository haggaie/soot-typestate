package soot.typestate;

import soot.Unit;
import soot.toolkits.graph.UnitGraph;
import soot.typestate.automata.ClassAutomaton;

/**
 * The Typestate class wraps the TypestateAnalysis class for running
 * the analysis and printing the results.
 */
public class Typestate {
	TypestateAnalysis analysis;
	final UnitGraph graph;
	final ClassAutomaton automaton;
	
	/**
	 * Constructs the Typestate object and run the analysis
	 * @param graph A flow-graph of the method to analyze.
	 * @param automaton An automaton to use with the analysis.
	 */
	Typestate(UnitGraph graph, ClassAutomaton automaton)
	{
		this.graph = graph;
		this.automaton = automaton;
		
		// Run the analysis
		analysis = new TypestateAnalysis(graph, automaton);
	}
	
	/**
	 * Print the errors found in the analysis to standard output.
	 */
	public void printResults()
	{
		boolean hasErrors = false;
		
		// For each unit in the graph we compare the input node and output node,
		// we report an error if the output has an error and the input does not.
		for (Unit unit : graph) {
			LatticeNode beforeNode = analysis.getFlowBefore(unit);
			LatticeNode afterNode = analysis.getFallFlowAfter(unit);
			if (!beforeNode.hasState( automaton.getErrorState() ) && afterNode.hasState( automaton.getErrorState() )) {
				System.out.println(" ** found error in line " + unit.getTag("LineNumberTag").toString());
				hasErrors = true;
			}
		}
		
		if (!hasErrors)
			System.out.println(" ** No errors.");
	}
}
