/**
 * 
 */
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

/**
 * @author fshaked
 *
 */
public class Main {

	final static boolean pointsToAnalysis = true;
	static {
		// Set soot options before starting
		if (pointsToAnalysis)
		{
			soot.options.Options.v().set_whole_program(true);
			soot.options.Options.v().setPhaseOption("cg","verbose:true");
		}
	}
	
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
		ClassAutomaton automaton = ClassAutomaton.load(args[1]);		
		
		soot.options.Options.v().set_keep_line_number(true);
		
		SootClass klass = Scene.v().loadClassAndSupport(args[0]);
		Scene.v().loadNecessaryClasses();
		if (pointsToAnalysis) {
			klass.setApplicationClass();
			Scene.v().setMainClass(klass);
			Scene.v().setEntryPoints(EntryPoints.v().all());
			runSpark();
		}
		
		for (SootMethod method : klass.getMethods()) {
			System.out.println(method);
			Body body = method.retrieveActiveBody();
			UnitGraph graph = new BriefUnitGraph(body);
			Typestate typestate = new Typestate(graph, automaton, pointsToAnalysis);
			
			System.out.println(method);
			System.out.flush();
			typestate.printResults();
		}
	}

	private static void runSpark() {
		HashMap<String, String> opt = new HashMap<String, String>();
		opt.put("enabled", "true");
		opt.put("verbose", "true");
		opt.put("set-impl", "double");
		opt.put("double-set-old", "hybrid");
		opt.put("double-set-new", "hybrid");
		opt.put("propagator", "worklist");
//		opt.put("on-fly-cg", "true");
		SparkTransformer.v().transform("", opt);
	}
	
	

}
