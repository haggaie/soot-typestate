package soot.typestate;

import java.util.HashMap;

import soot.Body;
import soot.EntryPoints;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.jimple.spark.SparkTransformer;
import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.UnitGraph;
import soot.typestate.automata.AutomataStandaloneSetup;
import soot.typestate.automata.ClassAutomaton;

public class Main {

	static {
		// Set soot options before starting
		soot.options.Options.v().set_whole_program(true);
//		soot.options.Options.v().setPhaseOption("cg","verbose:true");
		soot.options.Options.v().set_keep_line_number(true);
	}
	

	public static void main(String[] args) throws Exception {
		if (args.length != 2)
		{
			System.out.println("Usage: program <class name to analyze> <automata filename>");
			System.exit(1);
		}

		System.out.println("Loading automaton from: " + args[1]);
		// Setup the XText based automata parser.
		AutomataStandaloneSetup.doSetup();
		ClassAutomaton automaton = ClassAutomaton.load(args[1]);		
		
		// Load the class for analysis.
		SootClass klass = Scene.v().loadClassAndSupport(args[0]);
		Scene.v().loadNecessaryClasses();
		// Set the class (klass) as the main class for Soot's whole-program analysis.
		klass.setApplicationClass();
		Scene.v().setMainClass(klass);
		Scene.v().setEntryPoints(EntryPoints.v().all());
		
		// Run points-to analysis.
		System.out.println("Running Spark points-to analysis. This can take a while ...");
		runSpark();
		
		// Iterate on the class methods and analyze each one. 
		for (SootMethod method : klass.getMethods()) {
			System.out.println("Analysing method: " + method);
			Body body = method.retrieveActiveBody();
			UnitGraph graph = new BriefUnitGraph(body);

			// Analyze the method. 
			Typestate typestate = new Typestate(graph, automaton);
			// Print analysis results
			typestate.printResults();
		}
	}

	/**
	 * Run the Spark points-to analysis
	 */
	private static void runSpark() {
		HashMap<String, String> opt = new HashMap<String, String>();
		opt.put("enabled", "true");
//		opt.put("verbose", "true");
		opt.put("set-impl", "double");
		opt.put("double-set-old", "hybrid");
		opt.put("double-set-new", "hybrid");
		opt.put("propagator", "worklist");
		SparkTransformer.v().transform("", opt);
	}
	
	

}
