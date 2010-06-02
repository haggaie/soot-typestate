/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.Automaton#getKlass <em>Klass</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.Automaton#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.Automaton#getErrorState <em>Error State</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.Automaton#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.typestate.automata.automata.AutomataPackage#getAutomaton()
 * @model
 * @generated
 */
public interface Automaton extends EObject
{
  /**
   * Returns the value of the '<em><b>Klass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Klass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Klass</em>' containment reference.
   * @see #setKlass(soot.typestate.automata.automata.Class)
   * @see soot.typestate.automata.automata.AutomataPackage#getAutomaton_Klass()
   * @model containment="true"
   * @generated
   */
  soot.typestate.automata.automata.Class getKlass();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.Automaton#getKlass <em>Klass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Klass</em>' containment reference.
   * @see #getKlass()
   * @generated
   */
  void setKlass(soot.typestate.automata.automata.Class value);

  /**
   * Returns the value of the '<em><b>Initial State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial State</em>' reference.
   * @see #setInitialState(State)
   * @see soot.typestate.automata.automata.AutomataPackage#getAutomaton_InitialState()
   * @model
   * @generated
   */
  State getInitialState();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.Automaton#getInitialState <em>Initial State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial State</em>' reference.
   * @see #getInitialState()
   * @generated
   */
  void setInitialState(State value);

  /**
   * Returns the value of the '<em><b>Error State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error State</em>' reference.
   * @see #setErrorState(State)
   * @see soot.typestate.automata.automata.AutomataPackage#getAutomaton_ErrorState()
   * @model
   * @generated
   */
  State getErrorState();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.Automaton#getErrorState <em>Error State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error State</em>' reference.
   * @see #getErrorState()
   * @generated
   */
  void setErrorState(State value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link soot.typestate.automata.automata.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see soot.typestate.automata.automata.AutomataPackage#getAutomaton_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // Automaton
