/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.Constructor#getKlass <em>Klass</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.typestate.automata.automata.AutomataPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends Invocation
{
  /**
   * Returns the value of the '<em><b>Klass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Klass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Klass</em>' reference.
   * @see #setKlass(soot.typestate.automata.automata.Class)
   * @see soot.typestate.automata.automata.AutomataPackage#getConstructor_Klass()
   * @model
   * @generated
   */
  soot.typestate.automata.automata.Class getKlass();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.Constructor#getKlass <em>Klass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Klass</em>' reference.
   * @see #getKlass()
   * @generated
   */
  void setKlass(soot.typestate.automata.automata.Class value);

} // Constructor
