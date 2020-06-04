/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.stateconstrainttransition.stateConstraintTransition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage
 * @generated
 */
public class StateConstraintTransitionAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StateConstraintTransitionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateConstraintTransitionAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StateConstraintTransitionPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateConstraintTransitionSwitch<Adapter> modelSwitch =
    new StateConstraintTransitionSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter casemultiple(multiple object)
      {
        return createmultipleAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseStartTransition(StartTransition object)
      {
        return createStartTransitionAdapter();
      }
      @Override
      public Adapter caseEndTransition(EndTransition object)
      {
        return createEndTransitionAdapter();
      }
      @Override
      public Adapter caseFullTransition(FullTransition object)
      {
        return createFullTransitionAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseEventOccurence(EventOccurence object)
      {
        return createEventOccurenceAdapter();
      }
      @Override
      public Adapter caseStateOccurence(StateOccurence object)
      {
        return createStateOccurenceAdapter();
      }
      @Override
      public Adapter caseStateConstraint(StateConstraint object)
      {
        return createStateConstraintAdapter();
      }
      @Override
      public Adapter caseCompositeState(CompositeState object)
      {
        return createCompositeStateAdapter();
      }
      @Override
      public Adapter caseConcernLevel(ConcernLevel object)
      {
        return createConcernLevelAdapter();
      }
      @Override
      public Adapter caseSimpleConstraintState(SimpleConstraintState object)
      {
        return createSimpleConstraintStateAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseVariableName(VariableName object)
      {
        return createVariableNameAdapter();
      }
      @Override
      public Adapter caseGlobalConstraint(GlobalConstraint object)
      {
        return createGlobalConstraintAdapter();
      }
      @Override
      public Adapter casegroup_most_least(group_most_least object)
      {
        return creategroup_most_leastAdapter();
      }
      @Override
      public Adapter casegroup_valuation(group_valuation object)
      {
        return creategroup_valuationAdapter();
      }
      @Override
      public Adapter caseMax_Min(Max_Min object)
      {
        return createMax_MinAdapter();
      }
      @Override
      public Adapter casevarEnumeration(varEnumeration object)
      {
        return createvarEnumerationAdapter();
      }
      @Override
      public Adapter caseOr_state(Or_state object)
      {
        return createOr_stateAdapter();
      }
      @Override
      public Adapter caseAnd_state(And_state object)
      {
        return createAnd_stateAdapter();
      }
      @Override
      public Adapter casestateNameRef(stateNameRef object)
      {
        return createstateNameRefAdapter();
      }
      @Override
      public Adapter caseLog_expr(Log_expr object)
      {
        return createLog_exprAdapter();
      }
      @Override
      public Adapter caseOr_expr(Or_expr object)
      {
        return createOr_exprAdapter();
      }
      @Override
      public Adapter caseAnd_expr(And_expr object)
      {
        return createAnd_exprAdapter();
      }
      @Override
      public Adapter caseCompare_expr(Compare_expr object)
      {
        return createCompare_exprAdapter();
      }
      @Override
      public Adapter casemath_expr(math_expr object)
      {
        return createmath_exprAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseVar(Var object)
      {
        return createVarAdapter();
      }
      @Override
      public Adapter casestring(string object)
      {
        return createstringAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.multiple <em>multiple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.multiple
   * @generated
   */
  public Adapter createmultipleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.StartTransition <em>Start Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StartTransition
   * @generated
   */
  public Adapter createStartTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.EndTransition <em>End Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.EndTransition
   * @generated
   */
  public Adapter createEndTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.FullTransition <em>Full Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.FullTransition
   * @generated
   */
  public Adapter createFullTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.EventOccurence <em>Event Occurence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.EventOccurence
   * @generated
   */
  public Adapter createEventOccurenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateOccurence <em>State Occurence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateOccurence
   * @generated
   */
  public Adapter createStateOccurenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraint <em>State Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraint
   * @generated
   */
  public Adapter createStateConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.CompositeState <em>Composite State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.CompositeState
   * @generated
   */
  public Adapter createCompositeStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.ConcernLevel <em>Concern Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.ConcernLevel
   * @generated
   */
  public Adapter createConcernLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.SimpleConstraintState <em>Simple Constraint State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.SimpleConstraintState
   * @generated
   */
  public Adapter createSimpleConstraintStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.VariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.VariableName
   * @generated
   */
  public Adapter createVariableNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.GlobalConstraint <em>Global Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.GlobalConstraint
   * @generated
   */
  public Adapter createGlobalConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_most_least <em>group most least</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_most_least
   * @generated
   */
  public Adapter creategroup_most_leastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_valuation <em>group valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_valuation
   * @generated
   */
  public Adapter creategroup_valuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Max_Min <em>Max Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Max_Min
   * @generated
   */
  public Adapter createMax_MinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.varEnumeration <em>var Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.varEnumeration
   * @generated
   */
  public Adapter createvarEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Or_state <em>Or state</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Or_state
   * @generated
   */
  public Adapter createOr_stateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.And_state <em>And state</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.And_state
   * @generated
   */
  public Adapter createAnd_stateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.stateNameRef <em>state Name Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.stateNameRef
   * @generated
   */
  public Adapter createstateNameRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Log_expr <em>Log expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Log_expr
   * @generated
   */
  public Adapter createLog_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Or_expr <em>Or expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Or_expr
   * @generated
   */
  public Adapter createOr_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.And_expr <em>And expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.And_expr
   * @generated
   */
  public Adapter createAnd_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Compare_expr <em>Compare expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Compare_expr
   * @generated
   */
  public Adapter createCompare_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.math_expr <em>math expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.math_expr
   * @generated
   */
  public Adapter createmath_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.Var
   * @generated
   */
  public Adapter createVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.string <em>string</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.string
   * @generated
   */
  public Adapter createstringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //StateConstraintTransitionAdapterFactory