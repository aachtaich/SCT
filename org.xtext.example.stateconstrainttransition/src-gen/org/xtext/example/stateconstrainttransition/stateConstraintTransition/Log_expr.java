/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Log_expr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Log_expr#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Log_expr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getLog_expr()
 * @model
 * @generated
 */
public interface Log_expr extends Constraint
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Constraint)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getLog_expr_Left()
   * @model containment="true"
   * @generated
   */
  Constraint getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Log_expr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Constraint value);

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
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getLog_expr_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Log_expr#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Constraint)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getLog_expr_Right()
   * @model containment="true"
   * @generated
   */
  Constraint getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.Log_expr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Constraint value);

} // Log_expr