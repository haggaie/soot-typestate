/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soot.typestate.automata.automata.AutomataPackage;
import soot.typestate.automata.automata.BooleanLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.impl.BooleanLiteralImpl#isTrue <em>True</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanLiteralImpl extends MinimalEObjectImpl.Container implements BooleanLiteral
{
  /**
   * The default value of the '{@link #isTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrue()
   * @generated
   * @ordered
   */
  protected static final boolean TRUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrue()
   * @generated
   * @ordered
   */
  protected boolean true_ = TRUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanLiteralImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AutomataPackage.Literals.BOOLEAN_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTrue()
  {
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue(boolean newTrue)
  {
    boolean oldTrue = true_;
    true_ = newTrue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomataPackage.BOOLEAN_LITERAL__TRUE, oldTrue, true_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AutomataPackage.BOOLEAN_LITERAL__TRUE:
        return isTrue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AutomataPackage.BOOLEAN_LITERAL__TRUE:
        setTrue((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AutomataPackage.BOOLEAN_LITERAL__TRUE:
        setTrue(TRUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AutomataPackage.BOOLEAN_LITERAL__TRUE:
        return true_ != TRUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (true: ");
    result.append(true_);
    result.append(')');
    return result.toString();
  }

} //BooleanLiteralImpl
