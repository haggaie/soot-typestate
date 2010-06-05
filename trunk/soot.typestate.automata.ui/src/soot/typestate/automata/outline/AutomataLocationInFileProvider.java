/**
 * 
 */
package soot.typestate.automata.outline;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ui.core.DefaultLocationInFileProvider;

import soot.typestate.automata.automata.AutomataPackage;
import soot.typestate.automata.automata.Automaton;
import soot.typestate.automata.automata.Transition;

/**
 * @author haggai
 *
 */
public class AutomataLocationInFileProvider extends DefaultLocationInFileProvider {
	@Override
	protected EStructuralFeature getIdentifierFeature(EObject obj) {
		final EClass eClass = obj.eClass();
		if (obj instanceof Automaton) {
			return AutomataPackage.Literals.CLASS.getEStructuralFeature("name");
		}
		if (obj instanceof Transition)
			return eClass.getEStructuralFeature("method");
		return super.getIdentifierFeature(obj);
	}

}
