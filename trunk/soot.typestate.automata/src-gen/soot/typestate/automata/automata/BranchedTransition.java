/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branched Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.BranchedTransition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.typestate.automata.automata.AutomataPackage#getBranchedTransition()
 * @model
 * @generated
 */
public interface BranchedTransition extends Transition
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(BooleanLiteral)
   * @see soot.typestate.automata.automata.AutomataPackage#getBranchedTransition_Value()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getValue();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.BranchedTransition#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanLiteral value);

} // BranchedTransition
