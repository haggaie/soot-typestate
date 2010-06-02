/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soot.typestate.automata.automata.Automata;
import soot.typestate.automata.automata.AutomataPackage;
import soot.typestate.automata.automata.Automaton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.impl.AutomataImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.impl.AutomataImpl#getAutomata <em>Automata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutomataImpl extends MinimalEObjectImpl.Container implements Automata
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected soot.typestate.automata.automata.Package package_;

  /**
   * The cached value of the '{@link #getAutomata() <em>Automata</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutomata()
   * @generated
   * @ordered
   */
  protected EList<Automaton> automata;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutomataImpl()
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
    return AutomataPackage.Literals.AUTOMATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public soot.typestate.automata.automata.Package getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(soot.typestate.automata.automata.Package newPackage, NotificationChain msgs)
  {
    soot.typestate.automata.automata.Package oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AutomataPackage.AUTOMATA__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(soot.typestate.automata.automata.Package newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AutomataPackage.AUTOMATA__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AutomataPackage.AUTOMATA__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomataPackage.AUTOMATA__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Automaton> getAutomata()
  {
    if (automata == null)
    {
      automata = new EObjectContainmentEList<Automaton>(Automaton.class, this, AutomataPackage.AUTOMATA__AUTOMATA);
    }
    return automata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AutomataPackage.AUTOMATA__PACKAGE:
        return basicSetPackage(null, msgs);
      case AutomataPackage.AUTOMATA__AUTOMATA:
        return ((InternalEList<?>)getAutomata()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AutomataPackage.AUTOMATA__PACKAGE:
        return getPackage();
      case AutomataPackage.AUTOMATA__AUTOMATA:
        return getAutomata();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AutomataPackage.AUTOMATA__PACKAGE:
        setPackage((soot.typestate.automata.automata.Package)newValue);
        return;
      case AutomataPackage.AUTOMATA__AUTOMATA:
        getAutomata().clear();
        getAutomata().addAll((Collection<? extends Automaton>)newValue);
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
      case AutomataPackage.AUTOMATA__PACKAGE:
        setPackage((soot.typestate.automata.automata.Package)null);
        return;
      case AutomataPackage.AUTOMATA__AUTOMATA:
        getAutomata().clear();
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
      case AutomataPackage.AUTOMATA__PACKAGE:
        return package_ != null;
      case AutomataPackage.AUTOMATA__AUTOMATA:
        return automata != null && !automata.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AutomataImpl
