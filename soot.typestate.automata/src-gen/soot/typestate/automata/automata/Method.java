/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.Method#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.Method#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.typestate.automata.automata.AutomataPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Invocation
{
  /**
   * Returns the value of the '<em><b>Returntype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returntype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returntype</em>' containment reference.
   * @see #setReturntype(Type)
   * @see soot.typestate.automata.automata.AutomataPackage#getMethod_Returntype()
   * @model containment="true"
   * @generated
   */
  Type getReturntype();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.Method#getReturntype <em>Returntype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returntype</em>' containment reference.
   * @see #getReturntype()
   * @generated
   */
  void setReturntype(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see soot.typestate.automata.automata.AutomataPackage#getMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.Method#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Method
