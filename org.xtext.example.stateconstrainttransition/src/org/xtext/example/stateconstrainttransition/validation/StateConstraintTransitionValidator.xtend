/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.validation


import org.xtext.example.stateconstrainttransition.stateConstraintTransition.VariableName
import org.eclipse.xtext.validation.Check
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraintTransitionPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class StateConstraintTransitionValidator extends AbstractStateConstraintTransitionValidator {
	
	public static val INVALID_CARDINALITY = 'invalidName'

//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					StateConstraintTransitionPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	@Check
	def checkVariableCardinality(VariableName variableName ) {
		//var currentVariableCardinality = Integer::parseInt(variableName.instance)
		var nameOfVariable = variableName.name.name
		if (variableName.name.isMultiInstanciated == null){
			if (variableName.instance != null)
			{
				error(nameOfVariable +"canno't be multi-instantiated", variableName ,StateConstraintTransitionPackage::eINSTANCE.variableName_Name)
			}
		}
		
		if (variableName.name.isMultiInstanciated != null) {
			if (variableName.instance == null) {
				error("Multi-instantiated variable! Must specify instance i.e. " +nameOfVariable +"[instance]", variableName, StateConstraintTransitionPackage::eINSTANCE.variableName_Name, INVALID_CARDINALITY)
			}
			else 
			{
				var currentVariableCardinality = Integer::parseInt(variableName.instance)
				
				
				
				if (currentVariableCardinality > Integer::parseInt(variableName.name.isMultiInstanciated.maximum.get(0)) || currentVariableCardinality==0)
				{
					error("Cardinality of" + nameOfVariable + "must be in [1,"+variableName.name.isMultiInstanciated.maximum.get(0)+"]", variableName, StateConstraintTransitionPackage::eINSTANCE.variableName_Name)
				}
			}
			
		}
			
	}
}
