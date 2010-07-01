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
	 * Constructs the Typestate object
	 * @param graph A flow-graph of the method to analyze.
	 * @param automaton An automaton to use with the analysis.
	 */
	Typestate(UnitGraph graph, ClassAutomaton automaton)
	{
		this.graph = graph;
		this.automaton = automaton;
		
		analysis = new TypestateAnalysis(graph, automaton);
	}
	
	/**
	 * Print the errors found in the analysis to standard output.
	 */
	public void printResults()
	{
		boolean hasErrors = false;
		for (Unit unit : graph) {
			// An error is printed if the current node didn't contain an error state in the lattice element
			// before it, but does in its output lattice node.
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
