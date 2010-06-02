/**
 * <copyright>
 * </copyright>
 *
 */
package soot.typestate.automata.automata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see soot.typestate.automata.automata.AutomataFactory
 * @model kind="package"
 * @generated
 */
public interface AutomataPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "automata";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://code.google.com/p/soot-typestate/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "automata";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AutomataPackage eINSTANCE = soot.typestate.automata.automata.impl.AutomataPackageImpl.init();

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.AutomataImpl <em>Automata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.AutomataImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getAutomata()
   * @generated
   */
  int AUTOMATA = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATA__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Automata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATA__AUTOMATA = 1;

  /**
   * The number of structural features of the '<em>Automata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.PackageImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.AutomatonImpl <em>Automaton</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.AutomatonImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getAutomaton()
   * @generated
   */
  int AUTOMATON = 2;

  /**
   * The feature id for the '<em><b>Klass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATON__KLASS = 0;

  /**
   * The feature id for the '<em><b>Initial State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATON__INITIAL_STATE = 1;

  /**
   * The feature id for the '<em><b>Error State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATON__ERROR_STATE = 2;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATON__STATES = 3;

  /**
   * The number of structural features of the '<em>Automaton</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATON_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.TransitionImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 5;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__METHOD = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.ConstructorImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 7;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__METHOD = TRANSITION__METHOD;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__STATE = TRANSITION__STATE;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.ClassImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 3;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__METHOD = CONSTRUCTOR__METHOD;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__STATE = CONSTRUCTOR__STATE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = CONSTRUCTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ARGS = CONSTRUCTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = CONSTRUCTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.StateImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getState()
   * @generated
   */
  int STATE = 4;

  /**
   * The feature id for the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INITIAL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.MethodImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 6;

  /**
   * The feature id for the '<em><b>Returntype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURNTYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ARGS = 2;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link soot.typestate.automata.automata.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.typestate.automata.automata.impl.TypeImpl
   * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getType()
   * @generated
   */
  int TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.Automata <em>Automata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Automata</em>'.
   * @see soot.typestate.automata.automata.Automata
   * @generated
   */
  EClass getAutomata();

  /**
   * Returns the meta object for the containment reference '{@link soot.typestate.automata.automata.Automata#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see soot.typestate.automata.automata.Automata#getPackage()
   * @see #getAutomata()
   * @generated
   */
  EReference getAutomata_Package();

  /**
   * Returns the meta object for the containment reference list '{@link soot.typestate.automata.automata.Automata#getAutomata <em>Automata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Automata</em>'.
   * @see soot.typestate.automata.automata.Automata#getAutomata()
   * @see #getAutomata()
   * @generated
   */
  EReference getAutomata_Automata();

  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see soot.typestate.automata.automata.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link soot.typestate.automata.automata.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.typestate.automata.automata.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.Automaton <em>Automaton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Automaton</em>'.
   * @see soot.typestate.automata.automata.Automaton
   * @generated
   */
  EClass getAutomaton();

  /**
   * Returns the meta object for the containment reference '{@link soot.typestate.automata.automata.Automaton#getKlass <em>Klass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Klass</em>'.
   * @see soot.typestate.automata.automata.Automaton#getKlass()
   * @see #getAutomaton()
   * @generated
   */
  EReference getAutomaton_Klass();

  /**
   * Returns the meta object for the reference '{@link soot.typestate.automata.automata.Automaton#getInitialState <em>Initial State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initial State</em>'.
   * @see soot.typestate.automata.automata.Automaton#getInitialState()
   * @see #getAutomaton()
   * @generated
   */
  EReference getAutomaton_InitialState();

  /**
   * Returns the meta object for the reference '{@link soot.typestate.automata.automata.Automaton#getErrorState <em>Error State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Error State</em>'.
   * @see soot.typestate.automata.automata.Automaton#getErrorState()
   * @see #getAutomaton()
   * @generated
   */
  EReference getAutomaton_ErrorState();

  /**
   * Returns the meta object for the containment reference list '{@link soot.typestate.automata.automata.Automaton#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see soot.typestate.automata.automata.Automaton#getStates()
   * @see #getAutomaton()
   * @generated
   */
  EReference getAutomaton_States();

  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see soot.typestate.automata.automata.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link soot.typestate.automata.automata.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.typestate.automata.automata.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link soot.typestate.automata.automata.Class#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see soot.typestate.automata.automata.Class#getArgs()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Args();

  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see soot.typestate.automata.automata.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link soot.typestate.automata.automata.State#isInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial</em>'.
   * @see soot.typestate.automata.automata.State#isInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Initial();

  /**
   * Returns the meta object for the attribute '{@link soot.typestate.automata.automata.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.typestate.automata.automata.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link soot.typestate.automata.automata.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see soot.typestate.automata.automata.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see soot.typestate.automata.automata.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link soot.typestate.automata.automata.Transition#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see soot.typestate.automata.automata.Transition#getMethod()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Method();

  /**
   * Returns the meta object for the reference '{@link soot.typestate.automata.automata.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see soot.typestate.automata.automata.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see soot.typestate.automata.automata.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link soot.typestate.automata.automata.Method#getReturntype <em>Returntype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Returntype</em>'.
   * @see soot.typestate.automata.automata.Method#getReturntype()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Returntype();

  /**
   * Returns the meta object for the attribute '{@link soot.typestate.automata.automata.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.typestate.automata.automata.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link soot.typestate.automata.automata.Method#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see soot.typestate.automata.automata.Method#getArgs()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Args();

  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see soot.typestate.automata.automata.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for class '{@link soot.typestate.automata.automata.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see soot.typestate.automata.automata.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link soot.typestate.automata.automata.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.typestate.automata.automata.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AutomataFactory getAutomataFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.AutomataImpl <em>Automata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.AutomataImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getAutomata()
     * @generated
     */
    EClass AUTOMATA = eINSTANCE.getAutomata();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTOMATA__PACKAGE = eINSTANCE.getAutomata_Package();

    /**
     * The meta object literal for the '<em><b>Automata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTOMATA__AUTOMATA = eINSTANCE.getAutomata_Automata();

    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.PackageImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.AutomatonImpl <em>Automaton</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.AutomatonImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getAutomaton()
     * @generated
     */
    EClass AUTOMATON = eINSTANCE.getAutomaton();

    /**
     * The meta object literal for the '<em><b>Klass</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTOMATON__KLASS = eINSTANCE.getAutomaton_Klass();

    /**
     * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTOMATON__INITIAL_STATE = eINSTANCE.getAutomaton_InitialState();

    /**
     * The meta object literal for the '<em><b>Error State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTOMATON__ERROR_STATE = eINSTANCE.getAutomaton_ErrorState();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTOMATON__STATES = eINSTANCE.getAutomaton_States();

    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.ClassImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__ARGS = eINSTANCE.getClass_Args();

    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.StateImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.TransitionImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__METHOD = eINSTANCE.getTransition_Method();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.MethodImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Returntype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RETURNTYPE = eINSTANCE.getMethod_Returntype();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__ARGS = eINSTANCE.getMethod_Args();

    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.ConstructorImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '{@link soot.typestate.automata.automata.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.typestate.automata.automata.impl.TypeImpl
     * @see soot.typestate.automata.automata.impl.AutomataPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

  }

} //AutomataPackage
