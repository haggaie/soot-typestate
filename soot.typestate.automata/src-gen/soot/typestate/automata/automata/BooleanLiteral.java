/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.BooleanLiteral#isTrue <em>True</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.typestate.automata.automata.AutomataPackage#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' attribute.
   * @see #setTrue(boolean)
   * @see soot.typestate.automata.automata.AutomataPackage#getBooleanLiteral_True()
   * @model
   * @generated
   */
  boolean isTrue();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.BooleanLiteral#isTrue <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' attribute.
   * @see #isTrue()
   * @generated
   */
  void setTrue(boolean value);

} // BooleanLiteral
