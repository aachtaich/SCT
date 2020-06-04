/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.idea.highlighting;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.jetbrains.annotations.NotNull;
import org.xtext.example.stateconstrainttransition.idea.lang.StateConstraintTransitionLanguage;

public class StateConstraintTransitionSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
	
	@Override
	@NotNull
	protected SyntaxHighlighter createHighlighter() {
		return StateConstraintTransitionLanguage.INSTANCE.getInstance(SyntaxHighlighter.class);
	}
}