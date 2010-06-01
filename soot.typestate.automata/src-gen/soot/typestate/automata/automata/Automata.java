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
 * A representation of the model object '<em><b>Automata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.Automata#getPackage <em>Package</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.Automata#getAutomata <em>Automata</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.typestate.automata.automata.AutomataPackage#getAutomata()
 * @model
 * @generated
 */
public interface Automata extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see soot.typestate.automata.automata.AutomataPackage#getAutomata_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.Automata#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Automata</b></em>' containment reference list.
   * The list contents are of type {@link soot.typestate.automata.automata.Automaton}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Automata</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Automata</em>' containment reference list.
   * @see soot.typestate.automata.automata.AutomataPackage#getAutomata_Automata()
   * @model containment="true"
   * @generated
   */
  EList<Automaton> getAutomata();

} // Automata
