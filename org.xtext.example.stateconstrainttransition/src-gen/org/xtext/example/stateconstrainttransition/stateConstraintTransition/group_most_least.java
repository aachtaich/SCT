/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.stateConstraintTransition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>group most least</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_most_least#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_most_least#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_most_least#getAtomic <em>Atomic</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getgroup_most_least()
 * @model
 * @generated
 */
public interface group_most_least extends GlobalConstraint
{
  /**
   * Returns the value of the '<em><b>Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' attribute.
   * @see #setInstances(String)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getgroup_most_least_Instances()
   * @model
   * @generated
   */
  String getInstances();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_most_least#getInstances <em>Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instances</em>' attribute.
   * @see #getInstances()
   * @generated
   */
  void setInstances(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(varEnumeration)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getgroup_most_least_Variables()
   * @model containment="true"
   * @generated
   */
  varEnumeration getVariables();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_most_least#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(varEnumeration value);

  /**
   * Returns the value of the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic</em>' containment reference.
   * @see #setAtomic(Constraint)
   * @see org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage#getgroup_most_least_Atomic()
   * @model containment="true"
   * @generated
   */
  Constraint getAtomic();

  /**
   * Sets the value of the '{@link org.xtext.example.stateconstrainttransition.stateConstraintTransition.group_most_least#getAtomic <em>Atomic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atomic</em>' containment reference.
   * @see #getAtomic()
   * @generated
   */
  void setAtomic(Constraint value);

} // group_most_least
