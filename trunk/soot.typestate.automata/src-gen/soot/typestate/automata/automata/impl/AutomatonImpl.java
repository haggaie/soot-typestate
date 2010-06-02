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

import soot.typestate.automata.automata.AutomataPackage;
import soot.typestate.automata.automata.Automaton;
import soot.typestate.automata.automata.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automaton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.typestate.automata.automata.impl.AutomatonImpl#getKlass <em>Klass</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.impl.AutomatonImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.impl.AutomatonImpl#getErrorState <em>Error State</em>}</li>
 *   <li>{@link soot.typestate.automata.automata.impl.AutomatonImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutomatonImpl extends MinimalEObjectImpl.Container implements Automaton
{
  /**
   * The cached value of the '{@link #getKlass() <em>Klass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKlass()
   * @generated
   * @ordered
   */
  protected soot.typestate.automata.automata.Class klass;

  /**
   * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialState()
   * @generated
   * @ordered
   */
  protected State initialState;

  /**
   * The cached value of the '{@link #getErrorState() <em>Error State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorState()
   * @generated
   * @ordered
   */
  protected State errorState;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutomatonImpl()
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
    return AutomataPackage.Literals.AUTOMATON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public soot.typestate.automata.automata.Class getKlass()
  {
    return klass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKlass(soot.typestate.automata.automata.Class newKlass, NotificationChain msgs)
  {
    soot.typestate.automata.automata.Class oldKlass = klass;
    klass = newKlass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AutomataPackage.AUTOMATON__KLASS, oldKlass, newKlass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKlass(soot.typestate.automata.automata.Class newKlass)
  {
    if (newKlass != klass)
    {
      NotificationChain msgs = null;
      if (klass != null)
        msgs = ((InternalEObject)klass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AutomataPackage.AUTOMATON__KLASS, null, msgs);
      if (newKlass != null)
        msgs = ((InternalEObject)newKlass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AutomataPackage.AUTOMATON__KLASS, null, msgs);
      msgs = basicSetKlass(newKlass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomataPackage.AUTOMATON__KLASS, newKlass, newKlass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInitialState()
  {
    if (initialState != null && initialState.eIsProxy())
    {
      InternalEObject oldInitialState = (InternalEObject)initialState;
      initialState = (State)eResolveProxy(oldInitialState);
      if (initialState != oldInitialState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomataPackage.AUTOMATON__INITIAL_STATE, oldInitialState, initialState));
      }
    }
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInitialState()
  {
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialState(State newInitialState)
  {
    State oldInitialState = initialState;
    initialState = newInitialState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomataPackage.AUTOMATON__INITIAL_STATE, oldInitialState, initialState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getErrorState()
  {
    if (errorState != null && errorState.eIsProxy())
    {
      InternalEObject oldErrorState = (InternalEObject)errorState;
      errorState = (State)eResolveProxy(oldErrorState);
      if (errorState != oldErrorState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomataPackage.AUTOMATON__ERROR_STATE, oldErrorState, errorState));
      }
    }
    return errorState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetErrorState()
  {
    return errorState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorState(State newErrorState)
  {
    State oldErrorState = errorState;
    errorState = newErrorState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomataPackage.AUTOMATON__ERROR_STATE, oldErrorState, errorState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, AutomataPackage.AUTOMATON__STATES);
    }
    return states;
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
      case AutomataPackage.AUTOMATON__KLASS:
        return basicSetKlass(null, msgs);
      case AutomataPackage.AUTOMATON__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
      case AutomataPackage.AUTOMATON__KLASS:
        return getKlass();
      case AutomataPackage.AUTOMATON__INITIAL_STATE:
        if (resolve) return getInitialState();
        return basicGetInitialState();
      case AutomataPackage.AUTOMATON__ERROR_STATE:
        if (resolve) return getErrorState();
        return basicGetErrorState();
      case AutomataPackage.AUTOMATON__STATES:
        return getStates();
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
      case AutomataPackage.AUTOMATON__KLASS:
        setKlass((soot.typestate.automata.automata.Class)newValue);
        return;
      case AutomataPackage.AUTOMATON__INITIAL_STATE:
        setInitialState((State)newValue);
        return;
      case AutomataPackage.AUTOMATON__ERROR_STATE:
        setErrorState((State)newValue);
        return;
      case AutomataPackage.AUTOMATON__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
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
      case AutomataPackage.AUTOMATON__KLASS:
        setKlass((soot.typestate.automata.automata.Class)null);
        return;
      case AutomataPackage.AUTOMATON__INITIAL_STATE:
        setInitialState((State)null);
        return;
      case AutomataPackage.AUTOMATON__ERROR_STATE:
        setErrorState((State)null);
        return;
      case AutomataPackage.AUTOMATON__STATES:
        getStates().clear();
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
      case AutomataPackage.AUTOMATON__KLASS:
        return klass != null;
      case AutomataPackage.AUTOMATON__INITIAL_STATE:
        return initialState != null;
      case AutomataPackage.AUTOMATON__ERROR_STATE:
        return errorState != null;
      case AutomataPackage.AUTOMATON__STATES:
        return states != null && !states.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AutomatonImpl
