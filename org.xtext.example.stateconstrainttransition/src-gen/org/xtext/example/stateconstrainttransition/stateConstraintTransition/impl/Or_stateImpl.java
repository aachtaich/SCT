/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.stateconstrainttransition.stateConstraintTransition.Or_state;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraint;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or state</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.impl.Or_stateImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.impl.Or_stateImpl#getRipe <em>Ripe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Or_stateImpl extends StateConstraintImpl implements Or_state
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected StateConstraint left;

  /**
   * The cached value of the '{@link #getRipe() <em>Ripe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRipe()
   * @generated
   * @ordered
   */
  protected StateConstraint ripe;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Or_stateImpl()
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
    return StateConstraintTransitionPackage.Literals.OR_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateConstraint getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(StateConstraint newLeft, NotificationChain msgs)
  {
    StateConstraint oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateConstraintTransitionPackage.OR_STATE__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(StateConstraint newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateConstraintTransitionPackage.OR_STATE__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateConstraintTransitionPackage.OR_STATE__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateConstraintTransitionPackage.OR_STATE__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateConstraint getRipe()
  {
    return ripe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRipe(StateConstraint newRipe, NotificationChain msgs)
  {
    StateConstraint oldRipe = ripe;
    ripe = newRipe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateConstraintTransitionPackage.OR_STATE__RIPE, oldRipe, newRipe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRipe(StateConstraint newRipe)
  {
    if (newRipe != ripe)
    {
      NotificationChain msgs = null;
      if (ripe != null)
        msgs = ((InternalEObject)ripe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateConstraintTransitionPackage.OR_STATE__RIPE, null, msgs);
      if (newRipe != null)
        msgs = ((InternalEObject)newRipe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateConstraintTransitionPackage.OR_STATE__RIPE, null, msgs);
      msgs = basicSetRipe(newRipe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateConstraintTransitionPackage.OR_STATE__RIPE, newRipe, newRipe));
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
      case StateConstraintTransitionPackage.OR_STATE__LEFT:
        return basicSetLeft(null, msgs);
      case StateConstraintTransitionPackage.OR_STATE__RIPE:
        return basicSetRipe(null, msgs);
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
      case StateConstraintTransitionPackage.OR_STATE__LEFT:
        return getLeft();
      case StateConstraintTransitionPackage.OR_STATE__RIPE:
        return getRipe();
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
      case StateConstraintTransitionPackage.OR_STATE__LEFT:
        setLeft((StateConstraint)newValue);
        return;
      case StateConstraintTransitionPackage.OR_STATE__RIPE:
        setRipe((StateConstraint)newValue);
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
      case StateConstraintTransitionPackage.OR_STATE__LEFT:
        setLeft((StateConstraint)null);
        return;
      case StateConstraintTransitionPackage.OR_STATE__RIPE:
        setRipe((StateConstraint)null);
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
      case StateConstraintTransitionPackage.OR_STATE__LEFT:
        return left != null;
      case StateConstraintTransitionPackage.OR_STATE__RIPE:
        return ripe != null;
    }
    return super.eIsSet(featureID);
  }

} //Or_stateImpl
