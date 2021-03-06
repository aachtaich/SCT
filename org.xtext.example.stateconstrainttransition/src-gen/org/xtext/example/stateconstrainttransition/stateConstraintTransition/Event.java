/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event#getEvOcc <em>Ev Occ</em>}</li>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event#getSttOcc <em>Stt Occ</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Ev Occ</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ev Occ</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ev Occ</em>' containment reference.
   * @see #setEvOcc(EventOccurence)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getEvent_EvOcc()
   * @model containment="true"
   * @generated
   */
  EventOccurence getEvOcc();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event#getEvOcc <em>Ev Occ</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ev Occ</em>' containment reference.
   * @see #getEvOcc()
   * @generated
   */
  void setEvOcc(EventOccurence value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getEvent_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Stt Occ</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stt Occ</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stt Occ</em>' containment reference.
   * @see #setSttOcc(StateOccurence)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getEvent_SttOcc()
   * @model containment="true"
   * @generated
   */
  StateOccurence getSttOcc();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event#getSttOcc <em>Stt Occ</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stt Occ</em>' containment reference.
   * @see #getSttOcc()
   * @generated
   */
  void setSttOcc(StateOccurence value);

} // Event
