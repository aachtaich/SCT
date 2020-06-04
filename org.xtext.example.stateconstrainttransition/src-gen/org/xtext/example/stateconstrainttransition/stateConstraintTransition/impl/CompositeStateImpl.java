/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.stateconstrainttransition.stateConstraintTransition.CompositeState;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.ConcernLevel;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.impl.CompositeStateImpl#getConcernlevel <em>Concernlevel</em>}</li>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.impl.CompositeStateImpl#getEndCompositeState <em>End Composite State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeStateImpl extends StateImpl implements CompositeState
{
  /**
   * The cached value of the '{@link #getConcernlevel() <em>Concernlevel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcernlevel()
   * @generated
   * @ordered
   */
  protected EList<ConcernLevel> concernlevel;

  /**
   * The cached value of the '{@link #getEndCompositeState() <em>End Composite State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndCompositeState()
   * @generated
   * @ordered
   */
  protected CompositeState endCompositeState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeStateImpl()
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
    return StateConstraintTransitionPackage.Literals.COMPOSITE_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcernLevel> getConcernlevel()
  {
    if (concernlevel == null)
    {
      concernlevel = new EObjectContainmentEList<ConcernLevel>(ConcernLevel.class, this, StateConstraintTransitionPackage.COMPOSITE_STATE__CONCERNLEVEL);
    }
    return concernlevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeState getEndCompositeState()
  {
    if (endCompositeState != null && endCompositeState.eIsProxy())
    {
      InternalEObject oldEndCompositeState = (InternalEObject)endCompositeState;
      endCompositeState = (CompositeState)eResolveProxy(oldEndCompositeState);
      if (endCompositeState != oldEndCompositeState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateConstraintTransitionPackage.COMPOSITE_STATE__END_COMPOSITE_STATE, oldEndCompositeState, endCompositeState));
      }
    }
    return endCompositeState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeState basicGetEndCompositeState()
  {
    return endCompositeState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndCompositeState(CompositeState newEndCompositeState)
  {
    CompositeState oldEndCompositeState = endCompositeState;
    endCompositeState = newEndCompositeState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateConstraintTransitionPackage.COMPOSITE_STATE__END_COMPOSITE_STATE, oldEndCompositeState, endCompositeState));
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
      case StateConstraintTransitionPackage.COMPOSITE_STATE__CONCERNLEVEL:
        return ((InternalEList<?>)getConcernlevel()).basicRemove(otherEnd, msgs);
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
      case StateConstraintTransitionPackage.COMPOSITE_STATE__CONCERNLEVEL:
        return getConcernlevel();
      case StateConstraintTransitionPackage.COMPOSITE_STATE__END_COMPOSITE_STATE:
        if (resolve) return getEndCompositeState();
        return basicGetEndCompositeState();
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
      case StateConstraintTransitionPackage.COMPOSITE_STATE__CONCERNLEVEL:
        getConcernlevel().clear();
        getConcernlevel().addAll((Collection<? extends ConcernLevel>)newValue);
        return;
      case StateConstraintTransitionPackage.COMPOSITE_STATE__END_COMPOSITE_STATE:
        setEndCompositeState((CompositeState)newValue);
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
      case StateConstraintTransitionPackage.COMPOSITE_STATE__CONCERNLEVEL:
        getConcernlevel().clear();
        return;
      case StateConstraintTransitionPackage.COMPOSITE_STATE__END_COMPOSITE_STATE:
        setEndCompositeState((CompositeState)null);
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
      case StateConstraintTransitionPackage.COMPOSITE_STATE__CONCERNLEVEL:
        return concernlevel != null && !concernlevel.isEmpty();
      case StateConstraintTransitionPackage.COMPOSITE_STATE__END_COMPOSITE_STATE:
        return endCompositeState != null;
    }
    return super.eIsSet(featureID);
  }

} //CompositeStateImpl
