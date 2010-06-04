/**
 * 
 */
package soot.typestate.automata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.toolkits.scalar.ArrayPackedSet;
import soot.toolkits.scalar.CollectionFlowUniverse;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.FlowUniverse;
import soot.typestate.automata.automata.Automata;
import soot.typestate.automata.automata.Automaton;
import soot.typestate.automata.automata.Class;
import soot.typestate.automata.automata.Package;
import soot.typestate.automata.automata.Method;
import soot.typestate.automata.automata.State;
import soot.typestate.automata.automata.Transition;
import soot.typestate.automata.automata.Type;

/**
 * @author haggai
 *
 */
public class ClassAutomaton {
	private final SootClass klass;
	private final Map<SootMethod, List<Integer>> map = new HashMap<SootMethod, List<Integer>>();
	private final ArrayList<String> stateNames = new ArrayList<String>();
	private final Map<String, Integer> nameToState = new HashMap<String, Integer>();
	
	private final List<Integer> trivialDelta;
	// Holds the sets of states containing the initial and error states respectively.
	private final FlowSet initialState, errorState;
	
	ClassAutomaton(Automaton automaton, Package pkg)
	{
		klass = resolveClass(automaton.getKlass(), pkg);
		
		int numStates = automaton.getStates().size();
		trivialDelta = new ArrayList<Integer>(numStates);
		for (int s = 0; s < numStates; ++s)
			trivialDelta.add(s);
		
		buildStates(automaton.getStates());
		
		// Initialize the initial state and error state members.
		initialState = new ArrayPackedSet(getFlowUniverse());
		initialState.add(getStateIndex(automaton.getInitialState()));
		errorState = new ArrayPackedSet(getFlowUniverse());
		errorState.add(getStateIndex(automaton.getErrorState()));
	}
	
	public static ClassAutomaton load(String filename) throws Exception
	{
		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(URI.createFileURI(filename));
		resource.load(null);
		EList<Diagnostic> errors = resource.getErrors();
		for (Diagnostic error : errors) {
			System.err.println("Errors:");
			System.err.println(error);
		}
		if (errors.size() > 0)
			throw new Exception("Errors loading the automata file."); 
		
		Automata root = (Automata) resource.getContents().get(0);
		
		// TODO Currently only loading the first automaton 
		return new ClassAutomaton(root.getAutomata().get(0), root.getPackage());
	}

	private void buildStates(EList<State> states) {
		int numStates = states.size();
		stateNames.ensureCapacity(numStates);
		int s = 0;
		for (Iterator<State> iterator = states.iterator(); iterator.hasNext(); ++s) {
			State state = iterator.next();
			
			stateNames.add(state.getName());
			nameToState.put(state.getName(), s);
		}
		
		for (State state : states) {
			for (Transition transition : state.getTransitions()) {
				SootMethod method = resolveMethod(transition.getMethod());
				List<Integer> delta = getDelta(method);
				delta.set(getStateIndex(state), getStateIndex(transition.getState()));
			}
		}
	}
	
	private int getStateIndex(State state) {
		return getStateIndex(state.getName());
	}
	
	public int getStateIndex(String state) {
		return nameToState.get(state);
	}

	public SootClass getKlass()
	{
		return klass;
	}

	public List<Integer> getDelta(SootMethod method) {
		if (!map.containsKey(method))
			map.put(method, new ArrayList<Integer>(trivialDelta));
		
		return map.get(method);
	}
	
	public int getDelta(SootMethod method, int state)
	{
		return getDelta(method).get(state);
	}
	
	// For testing
	public String getDelta(SootMethod method, String state)
	{
		return stateNames.get(getDelta(method, getStateIndex(state)));
	}
	
	@SuppressWarnings("unchecked")
	public FlowSet getDelta(SootMethod method, FlowSet states)
	{
		List<Integer> delta = getDelta(method);
		FlowSet result = (FlowSet) states.emptySet();
		for (Iterator iterator = states.iterator(); iterator.hasNext();) {
			Integer state = (Integer) iterator.next();
			result.add(delta.get(state));
		}
		return result;
	}
	
	// Returns a FlowUniverse containing all the state numbers.
	public FlowUniverse<Integer> getFlowUniverse()
	{
		return new CollectionFlowUniverse<Integer>(nameToState.values());
	}

	private static SootClass resolveClass(Class klass, Package pkg)
	{
		String className = klass.getName();
		if (pkg != null)
			className = pkg.getName() + "." + className;
		
		return Scene.v().loadClassAndSupport(className);
	}
	
	private SootMethod resolveMethod(Method method)
	{
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(method.getReturntype().getName() + " " + Scene.v().quotedNameOf(method.getName()) + "(");
		
		Iterator<Type> typeIt = method.getArgs().iterator();
		if (typeIt.hasNext()) {
			Type type = typeIt.next();
			buffer.append(type.getName());
			
			while (typeIt.hasNext()) {
				buffer.append(",");
				
				type = typeIt.next();
				buffer.append(type.getName());
			}
		}
		buffer.append(")");
		
//		for (SootMethod m : klass.getMethods()) {
//			System.out.println(m);
//		}
		return klass.getMethod(buffer.toString().intern());
	}

	public FlowSet getInitialState() {
		return initialState;
	}
	
	public FlowSet getErrorState() {
		return errorState;
	}
}
