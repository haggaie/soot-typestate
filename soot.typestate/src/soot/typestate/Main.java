/**
 * 
 */
package soot.typestate;

import soot.Body;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.UnitGraph;
import soot.typestate.automata.AutomataStandaloneSetup;
import soot.typestate.automata.ClassAutomaton;

/**
 * @author fshaked
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		if (args.length != 2)
		{
			System.out.println("Usage: program <class name to analyze> <automata filename>");
			System.exit(1);
		}
		
		AutomataStandaloneSetup.doSetup();
		
		SootClass klass = Scene.v().loadClassAndSupport(args[0]);
		ClassAutomaton automaton = ClassAutomaton.load(args[1]);
		
		for (SootMethod method : klass.getMethods()) {
			Body body = method.retrieveActiveBody();
			UnitGraph graph = new BriefUnitGraph(body);
			Typestate typestate = new Typestate(graph, automaton);
			// TODO
		}
	}

}
