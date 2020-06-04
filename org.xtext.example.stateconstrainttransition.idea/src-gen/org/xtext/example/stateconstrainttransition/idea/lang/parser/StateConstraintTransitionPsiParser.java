/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.idea.lang.parser;

import com.google.inject.Inject;
import com.intellij.lang.PsiBuilder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.idea.parser.AbstractXtextPsiParser;
import org.xtext.example.stateconstrainttransition.idea.lang.StateConstraintTransitionElementTypeProvider;
import org.xtext.example.stateconstrainttransition.idea.parser.antlr.internal.PsiInternalStateConstraintTransitionParser;
import org.xtext.example.stateconstrainttransition.services.StateConstraintTransitionGrammarAccess;

public class StateConstraintTransitionPsiParser extends AbstractXtextPsiParser {

	private static final Set<String> INITIAL_HIDDEN_TOKENS = new HashSet<String>(Arrays.asList("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT"));

	@Inject 
	private StateConstraintTransitionGrammarAccess grammarAccess;

	@Inject 
	private StateConstraintTransitionElementTypeProvider elementTypeProvider;

	@Override
	protected AbstractPsiAntlrParser createParser(PsiBuilder builder, TokenStream tokenStream) {
		return new PsiInternalStateConstraintTransitionParser(builder, tokenStream, elementTypeProvider, grammarAccess);
	}

	@Override
	protected Set<String> getInitialHiddenTokens() {
		return INITIAL_HIDDEN_TOKENS;
	}
}