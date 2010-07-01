package soot.typestate.automata.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import soot.SootMethod;
import soot.typestate.automata.AutomataStandaloneSetup;
import soot.typestate.automata.ClassAutomaton;

public class Automaton {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		AutomataStandaloneSetup.doSetup();
	}

	/**
	 * Test method for {@link soot.typestate.automata.ClassAutomaton#ClassAutomaton(soot.typestate.automata.automata.Automaton, java.lang.Package)}.
	 * @throws Exception 
	 */
	@Test
	public void testClassAutomaton() throws Exception {
		ClassAutomaton listAutomaton = ClassAutomaton.load("examples/java.util.Collection.automata");
		SootMethod method = listAutomaton.getKlass().getMethod("boolean add(java.lang.Object)");
		assertEquals("NON_EMPTY", listAutomaton.getDelta(method, "NON_EMPTY"));
		assertEquals("NON_EMPTY", listAutomaton.getDelta(method, "EMPTY"));
		method = listAutomaton.getKlass().getMethod("void clear()");
		assertEquals("EMPTY", listAutomaton.getDelta(method, "NON_EMPTY"));
		assertEquals("EMPTY", listAutomaton.getDelta(method, "EMPTY"));
	}

	@Test
	public void testConstructors() throws Exception {
		ClassAutomaton automaton = ClassAutomaton.load("examples/java.net.Socket.automata");
		SootMethod method = automaton.getKlass().getMethod("void <init>(java.net.InetAddress,int)");
		assertEquals("CONNECTED", automaton.getDelta(method, "INIT"));
	}
}
