/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soot.typestate.automata.automata.AutomataPackage;
import soot.typestate.automata.automata.Constructor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.impl.ConstructorImpl#getKlass <em>Klass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorImpl extends InvocationImpl implements Constructor
{
  /**
   * The cached value of the '{@link #getKlass() <em>Klass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKlass()
   * @generated
   * @ordered
   */
  protected soot.typestate.automata.automata.Class klass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorImpl()
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
    return AutomataPackage.Literals.CONSTRUCTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public soot.typestate.automata.automata.Class getKlass()
  {
    if (klass != null && klass.eIsProxy())
    {
      InternalEObject oldKlass = (InternalEObject)klass;
      klass = (soot.typestate.automata.automata.Class)eResolveProxy(oldKlass);
      if (klass != oldKlass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomataPackage.CONSTRUCTOR__KLASS, oldKlass, klass));
      }
    }
    return klass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public soot.typestate.automata.automata.Class basicGetKlass()
  {
    return klass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKlass(soot.typestate.automata.automata.Class newKlass)
  {
    soot.typestate.automata.automata.Class oldKlass = klass;
    klass = newKlass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomataPackage.CONSTRUCTOR__KLASS, oldKlass, klass));
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
      case AutomataPackage.CONSTRUCTOR__KLASS:
        if (resolve) return getKlass();
        return basicGetKlass();
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
      case AutomataPackage.CONSTRUCTOR__KLASS:
        setKlass((soot.typestate.automata.automata.Class)newValue);
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
      case AutomataPackage.CONSTRUCTOR__KLASS:
        setKlass((soot.typestate.automata.automata.Class)null);
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
      case AutomataPackage.CONSTRUCTOR__KLASS:
        return klass != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstructorImpl
