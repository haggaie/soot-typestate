/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.Class#getName <em>Name</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.Class#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.typestate.automata.automata.AutomataPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Constructor
{
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
   * @see soot.typestate.automata.automata.AutomataPackage#getClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link soot.typestate.automata.automata.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link soot.typestate.automata.automata.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see soot.typestate.automata.automata.AutomataPackage#getClass_Args()
   * @model containment="true"
   * @generated
   */
  EList<Type> getArgs();

} // Class
