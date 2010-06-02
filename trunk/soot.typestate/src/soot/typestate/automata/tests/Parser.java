/**
 * 
 */
package soot.typestate.automata.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import soot.typestate.automata.AutomataStandaloneSetup;
import soot.typestate.automata.automata.Automata;
import soot.typestate.automata.automata.Automaton;
import soot.typestate.automata.automata.State;


/**
 * @author haggaie
 *
 */
public class Parser {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		AutomataStandaloneSetup.doSetup();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParser() throws IOException {
		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(URI.createFileURI("./examples/java.util.Collection.automata"));
		resource.load(null);
		EList<Diagnostic> errors = resource.getErrors();
		for (Diagnostic error : errors) {
			System.err.println("Errors:");
			System.err.println(error);
		}
		assertEquals(0, errors.size());
		assertEquals(1, resource.getContents().size());
		
		Automata root = (Automata) resource.getContents().get(0);
		assertNotNull(root);
		
		assertEquals(1, root.getAutomata().size());
		assertEquals("java.util", root.getPackage().getName());
		
		for (Automaton automaton : root.getAutomata()) {
			assertEquals("Collection", automaton.getKlass().getName());
		}
	}
}
