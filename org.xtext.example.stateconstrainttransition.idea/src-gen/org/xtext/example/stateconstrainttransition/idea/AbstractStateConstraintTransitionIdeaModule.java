/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.idea;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.intellij.facet.FacetTypeId;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.idea.DefaultIdeaModule;
import org.eclipse.xtext.idea.facet.AbstractFacetConfiguration;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerBindings;
import org.eclipse.xtext.service.SingletonBinding;
import org.xtext.example.stateconstrainttransition.ide.contentassist.antlr.StateConstraintTransitionParser;
import org.xtext.example.stateconstrainttransition.ide.contentassist.antlr.internal.InternalStateConstraintTransitionLexer;
import org.xtext.example.stateconstrainttransition.idea.facet.StateConstraintTransitionFacetConfiguration;
import org.xtext.example.stateconstrainttransition.idea.facet.StateConstraintTransitionFacetType;
import org.xtext.example.stateconstrainttransition.idea.lang.StateConstraintTransitionElementTypeProvider;
import org.xtext.example.stateconstrainttransition.idea.lang.parser.StateConstraintTransitionParserDefinition;
import org.xtext.example.stateconstrainttransition.idea.lang.parser.StateConstraintTransitionPsiParser;
import org.xtext.example.stateconstrainttransition.idea.lang.parser.StateConstraintTransitionTokenTypeProvider;
import org.xtext.example.stateconstrainttransition.idea.lang.parser.antlr.StateConstraintTransitionAntlrTokenFileProvider;
import org.xtext.example.stateconstrainttransition.idea.parser.antlr.internal.PsiInternalStateConstraintTransitionLexer;

/**
 * Manual modifications go to {@link StateConstraintTransitionIdeaModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractStateConstraintTransitionIdeaModule extends DefaultIdeaModule {
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return StateConstraintTransitionAntlrTokenFileProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends Lexer> bindLexer() {
		return PsiInternalStateConstraintTransitionLexer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public void configureRuntimeLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerBindings.RUNTIME))
			.to(PsiInternalStateConstraintTransitionLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends PsiParser> bindPsiParser() {
		return StateConstraintTransitionPsiParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends TokenTypeProvider> bindTokenTypeProvider() {
		return StateConstraintTransitionTokenTypeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends ParserDefinition> bindParserDefinition() {
		return StateConstraintTransitionParserDefinition.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	@SingletonBinding
	public Class<? extends IElementTypeProvider> bindIElementTypeProvider() {
		return StateConstraintTransitionElementTypeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends AbstractFacetConfiguration> bindAbstractFacetConfiguration() {
		return StateConstraintTransitionFacetConfiguration.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public FacetTypeId bindFacetTypeIdToInstance() {
		return StateConstraintTransitionFacetType.TYPEID;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StateConstraintTransitionParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST)).to(InternalStateConstraintTransitionLexer.class);
	}
	
}
