/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Min</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Max_Min#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getMax_Min()
 * @model
 * @generated
 */
public interface Max_Min extends GlobalConstraint
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(EObject)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getMax_Min_Var()
   * @model containment="true"
   * @generated
   */
  EObject getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Max_Min#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EObject value);

} // Max_Min
