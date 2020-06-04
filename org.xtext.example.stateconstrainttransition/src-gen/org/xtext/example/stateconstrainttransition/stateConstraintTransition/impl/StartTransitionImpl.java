/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StartTransition;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.State;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.impl.StartTransitionImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartTransitionImpl extends TransitionImpl implements StartTransition
{
  /**
   * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetState()
   * @generated
   * @ordered
   */
  protected State targetState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StartTransitionImpl()
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
    return StateConstraintTransitionPackage.Literals.START_TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getTargetState()
  {
    if (targetState != null && targetState.eIsProxy())
    {
      InternalEObject oldTargetState = (InternalEObject)targetState;
      targetState = (State)eResolveProxy(oldTargetState);
      if (targetState != oldTargetState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateConstraintTransitionPackage.START_TRANSITION__TARGET_STATE, oldTargetState, targetState));
      }
    }
    return targetState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTargetState()
  {
    return targetState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetState(State newTargetState)
  {
    State oldTargetState = targetState;
    targetState = newTargetState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateConstraintTransitionPackage.START_TRANSITION__TARGET_STATE, oldTargetState, targetState));
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
      case StateConstraintTransitionPackage.START_TRANSITION__TARGET_STATE:
        if (resolve) return getTargetState();
        return basicGetTargetState();
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
      case StateConstraintTransitionPackage.START_TRANSITION__TARGET_STATE:
        setTargetState((State)newValue);
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
      case StateConstraintTransitionPackage.START_TRANSITION__TARGET_STATE:
        setTargetState((State)null);
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
      case StateConstraintTransitionPackage.START_TRANSITION__TARGET_STATE:
        return targetState != null;
    }
    return super.eIsSet(featureID);
  }

} //StartTransitionImpl