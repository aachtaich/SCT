/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Occurence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.EventOccurence#getEventExpression <em>Event Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getEventOccurence()
 * @model
 * @generated
 */
public interface EventOccurence extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Expression</em>' containment reference list.
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getEventOccurence_EventExpression()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getEventExpression();

} // EventOccurence
