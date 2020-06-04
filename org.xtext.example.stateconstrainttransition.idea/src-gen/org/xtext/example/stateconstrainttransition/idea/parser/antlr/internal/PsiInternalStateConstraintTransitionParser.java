package org.xtext.example.stateconstrainttransition.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.xtext.example.stateconstrainttransition.idea.lang.StateConstraintTransitionElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.xtext.example.stateconstrainttransition.services.StateConstraintTransitionGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalStateConstraintTransitionParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stateMachine'", "'Param'", "'Enum'", "'String'", "'Integer'", "'Float'", "'Boolean'", "'['", "','", "']'", "'.'", "'..'", "'{'", "'}'", "'Start'", "'transition'", "'to'", "'End'", "'from'", "'When'", "'if'", "'\\\\/'", "'/\\\\'", "'='", "'1'", "'compositeState'", "'end_compositeState'", "'concernLevel'", "'end_concernLevel'", "'simpleConstraintState'", "'->'", "'<->'", "'<-'", "'>='", "'<='", "'!='", "'>'", "'<'", "'+'", "'*'", "'('", "')'", "'not'", "'at_least('", "'at_most('", "'all_equal('", "'maximum('", "'minimum('", "'0'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public PsiInternalStateConstraintTransitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalStateConstraintTransitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalStateConstraintTransitionParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalStateConstraintTransition.g"; }



    	protected StateConstraintTransitionGrammarAccess grammarAccess;

    	protected StateConstraintTransitionElementTypeProvider elementTypeProvider;

    	public PsiInternalStateConstraintTransitionParser(PsiBuilder builder, TokenStream input, StateConstraintTransitionElementTypeProvider elementTypeProvider, StateConstraintTransitionGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
    		this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // PsiInternalStateConstraintTransition.g:52:1: entryRuleModel returns [Boolean current=false] : iv_ruleModel= ruleModel EOF ;
    public final Boolean entryRuleModel() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleModel = null;


        try {
            // PsiInternalStateConstraintTransition.g:52:47: (iv_ruleModel= ruleModel EOF )
            // PsiInternalStateConstraintTransition.g:53:2: iv_ruleModel= ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // PsiInternalStateConstraintTransition.g:59:1: ruleModel returns [Boolean current=false] : (otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+ ) ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Boolean lv_variable_2_0 = null;

        Boolean lv_flexConstraints_3_0 = null;

        Boolean lv_state_4_0 = null;

        Boolean lv_transition_5_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:60:1: ( (otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+ ) )
            // PsiInternalStateConstraintTransition.g:61:2: (otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+ )
            {
            // PsiInternalStateConstraintTransition.g:61:2: (otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+ )
            // PsiInternalStateConstraintTransition.g:62:3: otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+
            {

            			markLeaf(elementTypeProvider.getModel_StateMachineKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalStateConstraintTransition.g:69:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalStateConstraintTransition.g:70:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalStateConstraintTransition.g:70:4: (lv_name_1_0= RULE_ID )
            // PsiInternalStateConstraintTransition.g:71:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getModel_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:86:3: ( (lv_variable_2_0= ruleVariable ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:87:4: (lv_variable_2_0= ruleVariable )
            	    {
            	    // PsiInternalStateConstraintTransition.g:87:4: (lv_variable_2_0= ruleVariable )
            	    // PsiInternalStateConstraintTransition.g:88:5: lv_variable_2_0= ruleVariable
            	    {

            	    					markComposite(elementTypeProvider.getModel_VariableVariableParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variable_2_0=ruleVariable();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // PsiInternalStateConstraintTransition.g:101:3: ( (lv_flexConstraints_3_0= ruleConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==35||LA2_0==51||(LA2_0>=53 && LA2_0<=59)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:102:4: (lv_flexConstraints_3_0= ruleConstraint )
            	    {
            	    // PsiInternalStateConstraintTransition.g:102:4: (lv_flexConstraints_3_0= ruleConstraint )
            	    // PsiInternalStateConstraintTransition.g:103:5: lv_flexConstraints_3_0= ruleConstraint
            	    {

            	    					markComposite(elementTypeProvider.getModel_FlexConstraintsConstraintParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_flexConstraints_3_0=ruleConstraint();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // PsiInternalStateConstraintTransition.g:116:3: ( (lv_state_4_0= ruleState ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36||LA3_0==40) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:117:4: (lv_state_4_0= ruleState )
            	    {
            	    // PsiInternalStateConstraintTransition.g:117:4: (lv_state_4_0= ruleState )
            	    // PsiInternalStateConstraintTransition.g:118:5: lv_state_4_0= ruleState
            	    {

            	    					markComposite(elementTypeProvider.getModel_StateStateParserRuleCall_4_0ElementType());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_state_4_0=ruleState();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // PsiInternalStateConstraintTransition.g:131:3: ( (lv_transition_5_0= ruleTransition ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25||LA4_0==28||(LA4_0>=30 && LA4_0<=31)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:132:4: (lv_transition_5_0= ruleTransition )
            	    {
            	    // PsiInternalStateConstraintTransition.g:132:4: (lv_transition_5_0= ruleTransition )
            	    // PsiInternalStateConstraintTransition.g:133:5: lv_transition_5_0= ruleTransition
            	    {

            	    					markComposite(elementTypeProvider.getModel_TransitionTransitionParserRuleCall_5_0ElementType());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_transition_5_0=ruleTransition();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariable"
    // PsiInternalStateConstraintTransition.g:150:1: entryRuleVariable returns [Boolean current=false] : iv_ruleVariable= ruleVariable EOF ;
    public final Boolean entryRuleVariable() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleVariable = null;


        try {
            // PsiInternalStateConstraintTransition.g:150:50: (iv_ruleVariable= ruleVariable EOF )
            // PsiInternalStateConstraintTransition.g:151:2: iv_ruleVariable= ruleVariable EOF
            {
             markComposite(elementTypeProvider.getVariableElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // PsiInternalStateConstraintTransition.g:157:1: ruleVariable returns [Boolean current=false] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )? ) ;
    public final Boolean ruleVariable() throws RecognitionException {
        Boolean current = false;

        Token lv_context_1_0=null;
        Token lv_inEnumeration_2_0=null;
        Token lv_name_3_0=null;
        Boolean lv_varType_0_0 = null;

        Boolean lv_isMultiInstanciated_4_0 = null;

        Boolean lv_domain_5_0 = null;

        Boolean lv_values_6_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:158:1: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )? ) )
            // PsiInternalStateConstraintTransition.g:159:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )? )
            {
            // PsiInternalStateConstraintTransition.g:159:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )? )
            // PsiInternalStateConstraintTransition.g:160:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )?
            {
            // PsiInternalStateConstraintTransition.g:160:3: ( (lv_varType_0_0= ruleVarType ) )
            // PsiInternalStateConstraintTransition.g:161:4: (lv_varType_0_0= ruleVarType )
            {
            // PsiInternalStateConstraintTransition.g:161:4: (lv_varType_0_0= ruleVarType )
            // PsiInternalStateConstraintTransition.g:162:5: lv_varType_0_0= ruleVarType
            {

            					markComposite(elementTypeProvider.getVariable_VarTypeVarTypeParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_9);
            lv_varType_0_0=ruleVarType();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:175:3: ( (lv_context_1_0= 'Param' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:176:4: (lv_context_1_0= 'Param' )
                    {
                    // PsiInternalStateConstraintTransition.g:176:4: (lv_context_1_0= 'Param' )
                    // PsiInternalStateConstraintTransition.g:177:5: lv_context_1_0= 'Param'
                    {

                    					markLeaf(elementTypeProvider.getVariable_ContextParamKeyword_1_0ElementType());
                    				
                    lv_context_1_0=(Token)match(input,12,FOLLOW_10); 

                    					doneLeaf(lv_context_1_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:192:3: ( (lv_inEnumeration_2_0= 'Enum' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:193:4: (lv_inEnumeration_2_0= 'Enum' )
                    {
                    // PsiInternalStateConstraintTransition.g:193:4: (lv_inEnumeration_2_0= 'Enum' )
                    // PsiInternalStateConstraintTransition.g:194:5: lv_inEnumeration_2_0= 'Enum'
                    {

                    					markLeaf(elementTypeProvider.getVariable_InEnumerationEnumKeyword_2_0ElementType());
                    				
                    lv_inEnumeration_2_0=(Token)match(input,13,FOLLOW_3); 

                    					doneLeaf(lv_inEnumeration_2_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:209:3: ( (lv_name_3_0= RULE_ID ) )
            // PsiInternalStateConstraintTransition.g:210:4: (lv_name_3_0= RULE_ID )
            {
            // PsiInternalStateConstraintTransition.g:210:4: (lv_name_3_0= RULE_ID )
            // PsiInternalStateConstraintTransition.g:211:5: lv_name_3_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getVariable_NameIDTerminalRuleCall_3_0ElementType());
            				
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_3_0);
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:226:3: ( (lv_isMultiInstanciated_4_0= rulemultiple ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                switch ( input.LA(2) ) {
                    case RULE_INT:
                        {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==19) ) {
                            alt7=1;
                        }
                        }
                        break;
                    case 59:
                        {
                        int LA7_4 = input.LA(3);

                        if ( (LA7_4==19) ) {
                            alt7=1;
                        }
                        }
                        break;
                    case 35:
                        {
                        int LA7_5 = input.LA(3);

                        if ( (LA7_5==19) ) {
                            alt7=1;
                        }
                        }
                        break;
                }

            }
            switch (alt7) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:227:4: (lv_isMultiInstanciated_4_0= rulemultiple )
                    {
                    // PsiInternalStateConstraintTransition.g:227:4: (lv_isMultiInstanciated_4_0= rulemultiple )
                    // PsiInternalStateConstraintTransition.g:228:5: lv_isMultiInstanciated_4_0= rulemultiple
                    {

                    					markComposite(elementTypeProvider.getVariable_IsMultiInstanciatedMultipleParserRuleCall_4_0ElementType());
                    				
                    pushFollow(FOLLOW_11);
                    lv_isMultiInstanciated_4_0=rulemultiple();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:241:3: ( (lv_domain_5_0= ruleDomain ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:242:4: (lv_domain_5_0= ruleDomain )
                    {
                    // PsiInternalStateConstraintTransition.g:242:4: (lv_domain_5_0= ruleDomain )
                    // PsiInternalStateConstraintTransition.g:243:5: lv_domain_5_0= ruleDomain
                    {

                    					markComposite(elementTypeProvider.getVariable_DomainDomainParserRuleCall_5_0ElementType());
                    				
                    pushFollow(FOLLOW_12);
                    lv_domain_5_0=ruleDomain();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:256:3: ( (lv_values_6_0= ruleEnumeration ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:257:4: (lv_values_6_0= ruleEnumeration )
                    {
                    // PsiInternalStateConstraintTransition.g:257:4: (lv_values_6_0= ruleEnumeration )
                    // PsiInternalStateConstraintTransition.g:258:5: lv_values_6_0= ruleEnumeration
                    {

                    					markComposite(elementTypeProvider.getVariable_ValuesEnumerationParserRuleCall_6_0ElementType());
                    				
                    pushFollow(FOLLOW_2);
                    lv_values_6_0=ruleEnumeration();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarType"
    // PsiInternalStateConstraintTransition.g:275:1: entryRuleVarType returns [Boolean current=false] : iv_ruleVarType= ruleVarType EOF ;
    public final Boolean entryRuleVarType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleVarType = null;


        try {
            // PsiInternalStateConstraintTransition.g:275:49: (iv_ruleVarType= ruleVarType EOF )
            // PsiInternalStateConstraintTransition.g:276:2: iv_ruleVarType= ruleVarType EOF
            {
             markComposite(elementTypeProvider.getVarTypeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;

             current =iv_ruleVarType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // PsiInternalStateConstraintTransition.g:282:1: ruleVarType returns [Boolean current=false] : (kw= 'String' | kw= 'Integer' | kw= 'Float' | kw= 'Boolean' ) ;
    public final Boolean ruleVarType() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalStateConstraintTransition.g:283:1: ( (kw= 'String' | kw= 'Integer' | kw= 'Float' | kw= 'Boolean' ) )
            // PsiInternalStateConstraintTransition.g:284:2: (kw= 'String' | kw= 'Integer' | kw= 'Float' | kw= 'Boolean' )
            {
            // PsiInternalStateConstraintTransition.g:284:2: (kw= 'String' | kw= 'Integer' | kw= 'Float' | kw= 'Boolean' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:285:3: kw= 'String'
                    {

                    			markLeaf(elementTypeProvider.getVarType_StringKeyword_0ElementType());
                    		
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:293:3: kw= 'Integer'
                    {

                    			markLeaf(elementTypeProvider.getVarType_IntegerKeyword_1ElementType());
                    		
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalStateConstraintTransition.g:301:3: kw= 'Float'
                    {

                    			markLeaf(elementTypeProvider.getVarType_FloatKeyword_2ElementType());
                    		
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalStateConstraintTransition.g:309:3: kw= 'Boolean'
                    {

                    			markLeaf(elementTypeProvider.getVarType_BooleanKeyword_3ElementType());
                    		
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRulemultiple"
    // PsiInternalStateConstraintTransition.g:320:1: entryRulemultiple returns [Boolean current=false] : iv_rulemultiple= rulemultiple EOF ;
    public final Boolean entryRulemultiple() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulemultiple = null;


        try {
            // PsiInternalStateConstraintTransition.g:320:50: (iv_rulemultiple= rulemultiple EOF )
            // PsiInternalStateConstraintTransition.g:321:2: iv_rulemultiple= rulemultiple EOF
            {
             markComposite(elementTypeProvider.getMultipleElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulemultiple=rulemultiple();

            state._fsp--;

             current =iv_rulemultiple; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiple"


    // $ANTLR start "rulemultiple"
    // PsiInternalStateConstraintTransition.g:327:1: rulemultiple returns [Boolean current=false] : (otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']' ) ;
    public final Boolean rulemultiple() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_minimum_1_0 = null;

        Boolean lv_maximum_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:328:1: ( (otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']' ) )
            // PsiInternalStateConstraintTransition.g:329:2: (otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']' )
            {
            // PsiInternalStateConstraintTransition.g:329:2: (otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']' )
            // PsiInternalStateConstraintTransition.g:330:3: otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']'
            {

            			markLeaf(elementTypeProvider.getMultiple_LeftSquareBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalStateConstraintTransition.g:337:3: ( (lv_minimum_1_0= rulemin ) )
            // PsiInternalStateConstraintTransition.g:338:4: (lv_minimum_1_0= rulemin )
            {
            // PsiInternalStateConstraintTransition.g:338:4: (lv_minimum_1_0= rulemin )
            // PsiInternalStateConstraintTransition.g:339:5: lv_minimum_1_0= rulemin
            {

            					markComposite(elementTypeProvider.getMultiple_MinimumMinParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_14);
            lv_minimum_1_0=rulemin();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getMultiple_CommaKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalStateConstraintTransition.g:359:3: ( (lv_maximum_3_0= rulemax ) )
            // PsiInternalStateConstraintTransition.g:360:4: (lv_maximum_3_0= rulemax )
            {
            // PsiInternalStateConstraintTransition.g:360:4: (lv_maximum_3_0= rulemax )
            // PsiInternalStateConstraintTransition.g:361:5: lv_maximum_3_0= rulemax
            {

            					markComposite(elementTypeProvider.getMultiple_MaximumMaxParserRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_15);
            lv_maximum_3_0=rulemax();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getMultiple_RightSquareBracketKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiple"


    // $ANTLR start "entryRuleDomain"
    // PsiInternalStateConstraintTransition.g:385:1: entryRuleDomain returns [Boolean current=false] : iv_ruleDomain= ruleDomain EOF ;
    public final Boolean entryRuleDomain() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDomain = null;


        try {
            // PsiInternalStateConstraintTransition.g:385:48: (iv_ruleDomain= ruleDomain EOF )
            // PsiInternalStateConstraintTransition.g:386:2: iv_ruleDomain= ruleDomain EOF
            {
             markComposite(elementTypeProvider.getDomainElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // PsiInternalStateConstraintTransition.g:392:1: ruleDomain returns [Boolean current=false] : ( ruleFloatDomain | ruleIntDomain ) ;
    public final Boolean ruleDomain() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalStateConstraintTransition.g:393:1: ( ( ruleFloatDomain | ruleIntDomain ) )
            // PsiInternalStateConstraintTransition.g:394:2: ( ruleFloatDomain | ruleIntDomain )
            {
            // PsiInternalStateConstraintTransition.g:394:2: ( ruleFloatDomain | ruleIntDomain )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==22) ) {
                        alt11=2;
                    }
                    else if ( (LA11_2==21) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==22) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==21) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==22) ) {
                        alt11=2;
                    }
                    else if ( (LA11_4==21) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:395:3: ruleFloatDomain
                    {

                    			markComposite(elementTypeProvider.getDomain_FloatDomainParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleFloatDomain();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:403:3: ruleIntDomain
                    {

                    			markComposite(elementTypeProvider.getDomain_IntDomainParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleIntDomain();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleFloatDomain"
    // PsiInternalStateConstraintTransition.g:414:1: entryRuleFloatDomain returns [Boolean current=false] : iv_ruleFloatDomain= ruleFloatDomain EOF ;
    public final Boolean entryRuleFloatDomain() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFloatDomain = null;


        try {
            // PsiInternalStateConstraintTransition.g:414:53: (iv_ruleFloatDomain= ruleFloatDomain EOF )
            // PsiInternalStateConstraintTransition.g:415:2: iv_ruleFloatDomain= ruleFloatDomain EOF
            {
             markComposite(elementTypeProvider.getFloatDomainElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatDomain=ruleFloatDomain();

            state._fsp--;

             current =iv_ruleFloatDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatDomain"


    // $ANTLR start "ruleFloatDomain"
    // PsiInternalStateConstraintTransition.g:421:1: ruleFloatDomain returns [Boolean current=false] : (kw= '[' ruleIntValue kw= '.' ruleIntValue kw= '..' ruleIntValue kw= '.' ruleIntValue kw= ']' ) ;
    public final Boolean ruleFloatDomain() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalStateConstraintTransition.g:422:1: ( (kw= '[' ruleIntValue kw= '.' ruleIntValue kw= '..' ruleIntValue kw= '.' ruleIntValue kw= ']' ) )
            // PsiInternalStateConstraintTransition.g:423:2: (kw= '[' ruleIntValue kw= '.' ruleIntValue kw= '..' ruleIntValue kw= '.' ruleIntValue kw= ']' )
            {
            // PsiInternalStateConstraintTransition.g:423:2: (kw= '[' ruleIntValue kw= '.' ruleIntValue kw= '..' ruleIntValue kw= '.' ruleIntValue kw= ']' )
            // PsiInternalStateConstraintTransition.g:424:3: kw= '[' ruleIntValue kw= '.' ruleIntValue kw= '..' ruleIntValue kw= '.' ruleIntValue kw= ']'
            {

            			markLeaf(elementTypeProvider.getFloatDomain_LeftSquareBracketKeyword_0ElementType());
            		
            kw=(Token)match(input,18,FOLLOW_13); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getFloatDomain_IntValueParserRuleCall_1ElementType());
            		
            pushFollow(FOLLOW_16);
            ruleIntValue();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getFloatDomain_FullStopKeyword_2ElementType());
            		
            kw=(Token)match(input,21,FOLLOW_13); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getFloatDomain_IntValueParserRuleCall_3ElementType());
            		
            pushFollow(FOLLOW_17);
            ruleIntValue();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getFloatDomain_FullStopFullStopKeyword_4ElementType());
            		
            kw=(Token)match(input,22,FOLLOW_13); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getFloatDomain_IntValueParserRuleCall_5ElementType());
            		
            pushFollow(FOLLOW_16);
            ruleIntValue();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getFloatDomain_FullStopKeyword_6ElementType());
            		
            kw=(Token)match(input,21,FOLLOW_13); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getFloatDomain_IntValueParserRuleCall_7ElementType());
            		
            pushFollow(FOLLOW_15);
            ruleIntValue();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getFloatDomain_RightSquareBracketKeyword_8ElementType());
            		
            kw=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(kw);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatDomain"


    // $ANTLR start "entryRuleIntDomain"
    // PsiInternalStateConstraintTransition.g:491:1: entryRuleIntDomain returns [Boolean current=false] : iv_ruleIntDomain= ruleIntDomain EOF ;
    public final Boolean entryRuleIntDomain() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIntDomain = null;


        try {
            // PsiInternalStateConstraintTransition.g:491:51: (iv_ruleIntDomain= ruleIntDomain EOF )
            // PsiInternalStateConstraintTransition.g:492:2: iv_ruleIntDomain= ruleIntDomain EOF
            {
             markComposite(elementTypeProvider.getIntDomainElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntDomain=ruleIntDomain();

            state._fsp--;

             current =iv_ruleIntDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntDomain"


    // $ANTLR start "ruleIntDomain"
    // PsiInternalStateConstraintTransition.g:498:1: ruleIntDomain returns [Boolean current=false] : (kw= '[' ruleIntValue kw= '..' ruleIntValue kw= ']' ) ;
    public final Boolean ruleIntDomain() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalStateConstraintTransition.g:499:1: ( (kw= '[' ruleIntValue kw= '..' ruleIntValue kw= ']' ) )
            // PsiInternalStateConstraintTransition.g:500:2: (kw= '[' ruleIntValue kw= '..' ruleIntValue kw= ']' )
            {
            // PsiInternalStateConstraintTransition.g:500:2: (kw= '[' ruleIntValue kw= '..' ruleIntValue kw= ']' )
            // PsiInternalStateConstraintTransition.g:501:3: kw= '[' ruleIntValue kw= '..' ruleIntValue kw= ']'
            {

            			markLeaf(elementTypeProvider.getIntDomain_LeftSquareBracketKeyword_0ElementType());
            		
            kw=(Token)match(input,18,FOLLOW_13); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getIntDomain_IntValueParserRuleCall_1ElementType());
            		
            pushFollow(FOLLOW_17);
            ruleIntValue();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getIntDomain_FullStopFullStopKeyword_2ElementType());
            		
            kw=(Token)match(input,22,FOLLOW_13); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getIntDomain_IntValueParserRuleCall_3ElementType());
            		
            pushFollow(FOLLOW_15);
            ruleIntValue();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getIntDomain_RightSquareBracketKeyword_4ElementType());
            		
            kw=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(kw);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntDomain"


    // $ANTLR start "entryRuleEnumeration"
    // PsiInternalStateConstraintTransition.g:540:1: entryRuleEnumeration returns [Boolean current=false] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final Boolean entryRuleEnumeration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEnumeration = null;


        try {
            // PsiInternalStateConstraintTransition.g:540:53: (iv_ruleEnumeration= ruleEnumeration EOF )
            // PsiInternalStateConstraintTransition.g:541:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             markComposite(elementTypeProvider.getEnumerationElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // PsiInternalStateConstraintTransition.g:547:1: ruleEnumeration returns [Boolean current=false] : ( ruleIntEnumeration | ruleStringEnumeration ) ;
    public final Boolean ruleEnumeration() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalStateConstraintTransition.g:548:1: ( ( ruleIntEnumeration | ruleStringEnumeration ) )
            // PsiInternalStateConstraintTransition.g:549:2: ( ruleIntEnumeration | ruleStringEnumeration )
            {
            // PsiInternalStateConstraintTransition.g:549:2: ( ruleIntEnumeration | ruleStringEnumeration )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_STRING) ) {
                    alt12=2;
                }
                else if ( (LA12_1==RULE_INT||LA12_1==35||LA12_1==59) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:550:3: ruleIntEnumeration
                    {

                    			markComposite(elementTypeProvider.getEnumeration_IntEnumerationParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleIntEnumeration();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:558:3: ruleStringEnumeration
                    {

                    			markComposite(elementTypeProvider.getEnumeration_StringEnumerationParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleStringEnumeration();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleIntEnumeration"
    // PsiInternalStateConstraintTransition.g:569:1: entryRuleIntEnumeration returns [Boolean current=false] : iv_ruleIntEnumeration= ruleIntEnumeration EOF ;
    public final Boolean entryRuleIntEnumeration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIntEnumeration = null;


        try {
            // PsiInternalStateConstraintTransition.g:569:56: (iv_ruleIntEnumeration= ruleIntEnumeration EOF )
            // PsiInternalStateConstraintTransition.g:570:2: iv_ruleIntEnumeration= ruleIntEnumeration EOF
            {
             markComposite(elementTypeProvider.getIntEnumerationElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntEnumeration=ruleIntEnumeration();

            state._fsp--;

             current =iv_ruleIntEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntEnumeration"


    // $ANTLR start "ruleIntEnumeration"
    // PsiInternalStateConstraintTransition.g:576:1: ruleIntEnumeration returns [Boolean current=false] : (kw= '{' ruleIntValue (kw= ',' ruleIntValue )+ kw= '}' ) ;
    public final Boolean ruleIntEnumeration() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalStateConstraintTransition.g:577:1: ( (kw= '{' ruleIntValue (kw= ',' ruleIntValue )+ kw= '}' ) )
            // PsiInternalStateConstraintTransition.g:578:2: (kw= '{' ruleIntValue (kw= ',' ruleIntValue )+ kw= '}' )
            {
            // PsiInternalStateConstraintTransition.g:578:2: (kw= '{' ruleIntValue (kw= ',' ruleIntValue )+ kw= '}' )
            // PsiInternalStateConstraintTransition.g:579:3: kw= '{' ruleIntValue (kw= ',' ruleIntValue )+ kw= '}'
            {

            			markLeaf(elementTypeProvider.getIntEnumeration_LeftCurlyBracketKeyword_0ElementType());
            		
            kw=(Token)match(input,23,FOLLOW_13); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getIntEnumeration_IntValueParserRuleCall_1ElementType());
            		
            pushFollow(FOLLOW_14);
            ruleIntValue();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalStateConstraintTransition.g:593:3: (kw= ',' ruleIntValue )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:594:4: kw= ',' ruleIntValue
            	    {

            	    				markLeaf(elementTypeProvider.getIntEnumeration_CommaKeyword_2_0ElementType());
            	    			
            	    kw=(Token)match(input,19,FOLLOW_13); 

            	    				doneLeaf(kw);
            	    			

            	    				markComposite(elementTypeProvider.getIntEnumeration_IntValueParserRuleCall_2_1ElementType());
            	    			
            	    pushFollow(FOLLOW_18);
            	    ruleIntValue();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            			markLeaf(elementTypeProvider.getIntEnumeration_RightCurlyBracketKeyword_3ElementType());
            		
            kw=(Token)match(input,24,FOLLOW_2); 

            			doneLeaf(kw);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntEnumeration"


    // $ANTLR start "entryRuleStringEnumeration"
    // PsiInternalStateConstraintTransition.g:620:1: entryRuleStringEnumeration returns [Boolean current=false] : iv_ruleStringEnumeration= ruleStringEnumeration EOF ;
    public final Boolean entryRuleStringEnumeration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStringEnumeration = null;


        try {
            // PsiInternalStateConstraintTransition.g:620:59: (iv_ruleStringEnumeration= ruleStringEnumeration EOF )
            // PsiInternalStateConstraintTransition.g:621:2: iv_ruleStringEnumeration= ruleStringEnumeration EOF
            {
             markComposite(elementTypeProvider.getStringEnumerationElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringEnumeration=ruleStringEnumeration();

            state._fsp--;

             current =iv_ruleStringEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringEnumeration"


    // $ANTLR start "ruleStringEnumeration"
    // PsiInternalStateConstraintTransition.g:627:1: ruleStringEnumeration returns [Boolean current=false] : (kw= '{' rulestrings (kw= ',' rulestrings )+ kw= '}' ) ;
    public final Boolean ruleStringEnumeration() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalStateConstraintTransition.g:628:1: ( (kw= '{' rulestrings (kw= ',' rulestrings )+ kw= '}' ) )
            // PsiInternalStateConstraintTransition.g:629:2: (kw= '{' rulestrings (kw= ',' rulestrings )+ kw= '}' )
            {
            // PsiInternalStateConstraintTransition.g:629:2: (kw= '{' rulestrings (kw= ',' rulestrings )+ kw= '}' )
            // PsiInternalStateConstraintTransition.g:630:3: kw= '{' rulestrings (kw= ',' rulestrings )+ kw= '}'
            {

            			markLeaf(elementTypeProvider.getStringEnumeration_LeftCurlyBracketKeyword_0ElementType());
            		
            kw=(Token)match(input,23,FOLLOW_19); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getStringEnumeration_StringsParserRuleCall_1ElementType());
            		
            pushFollow(FOLLOW_14);
            rulestrings();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalStateConstraintTransition.g:644:3: (kw= ',' rulestrings )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:645:4: kw= ',' rulestrings
            	    {

            	    				markLeaf(elementTypeProvider.getStringEnumeration_CommaKeyword_2_0ElementType());
            	    			
            	    kw=(Token)match(input,19,FOLLOW_19); 

            	    				doneLeaf(kw);
            	    			

            	    				markComposite(elementTypeProvider.getStringEnumeration_StringsParserRuleCall_2_1ElementType());
            	    			
            	    pushFollow(FOLLOW_18);
            	    rulestrings();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            			markLeaf(elementTypeProvider.getStringEnumeration_RightCurlyBracketKeyword_3ElementType());
            		
            kw=(Token)match(input,24,FOLLOW_2); 

            			doneLeaf(kw);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringEnumeration"


    // $ANTLR start "entryRulemax"
    // PsiInternalStateConstraintTransition.g:671:1: entryRulemax returns [Boolean current=false] : iv_rulemax= rulemax EOF ;
    public final Boolean entryRulemax() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulemax = null;


        try {
            // PsiInternalStateConstraintTransition.g:671:45: (iv_rulemax= rulemax EOF )
            // PsiInternalStateConstraintTransition.g:672:2: iv_rulemax= rulemax EOF
            {
             markComposite(elementTypeProvider.getMaxElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulemax=rulemax();

            state._fsp--;

             current =iv_rulemax; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemax"


    // $ANTLR start "rulemax"
    // PsiInternalStateConstraintTransition.g:678:1: rulemax returns [Boolean current=false] : ruleIntValue ;
    public final Boolean rulemax() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalStateConstraintTransition.g:679:1: ( ruleIntValue )
            // PsiInternalStateConstraintTransition.g:680:2: ruleIntValue
            {

            		markComposite(elementTypeProvider.getMax_IntValueParserRuleCallElementType());
            	
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;


            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemax"


    // $ANTLR start "entryRulemin"
    // PsiInternalStateConstraintTransition.g:690:1: entryRulemin returns [Boolean current=false] : iv_rulemin= rulemin EOF ;
    public final Boolean entryRulemin() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulemin = null;


        try {
            // PsiInternalStateConstraintTransition.g:690:45: (iv_rulemin= rulemin EOF )
            // PsiInternalStateConstraintTransition.g:691:2: iv_rulemin= rulemin EOF
            {
             markComposite(elementTypeProvider.getMinElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulemin=rulemin();

            state._fsp--;

             current =iv_rulemin; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemin"


    // $ANTLR start "rulemin"
    // PsiInternalStateConstraintTransition.g:697:1: rulemin returns [Boolean current=false] : ruleIntValue ;
    public final Boolean rulemin() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalStateConstraintTransition.g:698:1: ( ruleIntValue )
            // PsiInternalStateConstraintTransition.g:699:2: ruleIntValue
            {

            		markComposite(elementTypeProvider.getMin_IntValueParserRuleCallElementType());
            	
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;


            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemin"


    // $ANTLR start "entryRulestrings"
    // PsiInternalStateConstraintTransition.g:709:1: entryRulestrings returns [Boolean current=false] : iv_rulestrings= rulestrings EOF ;
    public final Boolean entryRulestrings() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulestrings = null;


        try {
            // PsiInternalStateConstraintTransition.g:709:49: (iv_rulestrings= rulestrings EOF )
            // PsiInternalStateConstraintTransition.g:710:2: iv_rulestrings= rulestrings EOF
            {
             markComposite(elementTypeProvider.getStringsElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulestrings=rulestrings();

            state._fsp--;

             current =iv_rulestrings; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestrings"


    // $ANTLR start "rulestrings"
    // PsiInternalStateConstraintTransition.g:716:1: rulestrings returns [Boolean current=false] : this_STRING_0= RULE_STRING ;
    public final Boolean rulestrings() throws RecognitionException {
        Boolean current = false;

        Token this_STRING_0=null;

        try {
            // PsiInternalStateConstraintTransition.g:717:1: (this_STRING_0= RULE_STRING )
            // PsiInternalStateConstraintTransition.g:718:2: this_STRING_0= RULE_STRING
            {

            		markLeaf(elementTypeProvider.getStrings_STRINGTerminalRuleCallElementType());
            	
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		doneLeaf(this_STRING_0);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestrings"


    // $ANTLR start "entryRuleState"
    // PsiInternalStateConstraintTransition.g:728:1: entryRuleState returns [Boolean current=false] : iv_ruleState= ruleState EOF ;
    public final Boolean entryRuleState() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleState = null;


        try {
            // PsiInternalStateConstraintTransition.g:728:47: (iv_ruleState= ruleState EOF )
            // PsiInternalStateConstraintTransition.g:729:2: iv_ruleState= ruleState EOF
            {
             markComposite(elementTypeProvider.getStateElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // PsiInternalStateConstraintTransition.g:735:1: ruleState returns [Boolean current=false] : (this_SimpleConstraintState_0= ruleSimpleConstraintState | this_CompositeState_1= ruleCompositeState ) ;
    public final Boolean ruleState() throws RecognitionException {
        Boolean current = false;

        Boolean this_SimpleConstraintState_0 = null;

        Boolean this_CompositeState_1 = null;


        try {
            // PsiInternalStateConstraintTransition.g:736:1: ( (this_SimpleConstraintState_0= ruleSimpleConstraintState | this_CompositeState_1= ruleCompositeState ) )
            // PsiInternalStateConstraintTransition.g:737:2: (this_SimpleConstraintState_0= ruleSimpleConstraintState | this_CompositeState_1= ruleCompositeState )
            {
            // PsiInternalStateConstraintTransition.g:737:2: (this_SimpleConstraintState_0= ruleSimpleConstraintState | this_CompositeState_1= ruleCompositeState )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:738:3: this_SimpleConstraintState_0= ruleSimpleConstraintState
                    {

                    			markComposite(elementTypeProvider.getState_SimpleConstraintStateParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleConstraintState_0=ruleSimpleConstraintState();

                    state._fsp--;


                    			current = this_SimpleConstraintState_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:747:3: this_CompositeState_1= ruleCompositeState
                    {

                    			markComposite(elementTypeProvider.getState_CompositeStateParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeState_1=ruleCompositeState();

                    state._fsp--;


                    			current = this_CompositeState_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // PsiInternalStateConstraintTransition.g:759:1: entryRuleTransition returns [Boolean current=false] : iv_ruleTransition= ruleTransition EOF ;
    public final Boolean entryRuleTransition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTransition = null;


        try {
            // PsiInternalStateConstraintTransition.g:759:52: (iv_ruleTransition= ruleTransition EOF )
            // PsiInternalStateConstraintTransition.g:760:2: iv_ruleTransition= ruleTransition EOF
            {
             markComposite(elementTypeProvider.getTransitionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // PsiInternalStateConstraintTransition.g:766:1: ruleTransition returns [Boolean current=false] : (this_StartTransition_0= ruleStartTransition | this_EndTransition_1= ruleEndTransition | this_FullTransition_2= ruleFullTransition ) ;
    public final Boolean ruleTransition() throws RecognitionException {
        Boolean current = false;

        Boolean this_StartTransition_0 = null;

        Boolean this_EndTransition_1 = null;

        Boolean this_FullTransition_2 = null;


        try {
            // PsiInternalStateConstraintTransition.g:767:1: ( (this_StartTransition_0= ruleStartTransition | this_EndTransition_1= ruleEndTransition | this_FullTransition_2= ruleFullTransition ) )
            // PsiInternalStateConstraintTransition.g:768:2: (this_StartTransition_0= ruleStartTransition | this_EndTransition_1= ruleEndTransition | this_FullTransition_2= ruleFullTransition )
            {
            // PsiInternalStateConstraintTransition.g:768:2: (this_StartTransition_0= ruleStartTransition | this_EndTransition_1= ruleEndTransition | this_FullTransition_2= ruleFullTransition )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case 30:
            case 31:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:769:3: this_StartTransition_0= ruleStartTransition
                    {

                    			markComposite(elementTypeProvider.getTransition_StartTransitionParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartTransition_0=ruleStartTransition();

                    state._fsp--;


                    			current = this_StartTransition_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:778:3: this_EndTransition_1= ruleEndTransition
                    {

                    			markComposite(elementTypeProvider.getTransition_EndTransitionParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndTransition_1=ruleEndTransition();

                    state._fsp--;


                    			current = this_EndTransition_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalStateConstraintTransition.g:787:3: this_FullTransition_2= ruleFullTransition
                    {

                    			markComposite(elementTypeProvider.getTransition_FullTransitionParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_FullTransition_2=ruleFullTransition();

                    state._fsp--;


                    			current = this_FullTransition_2;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleStartTransition"
    // PsiInternalStateConstraintTransition.g:799:1: entryRuleStartTransition returns [Boolean current=false] : iv_ruleStartTransition= ruleStartTransition EOF ;
    public final Boolean entryRuleStartTransition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStartTransition = null;


        try {
            // PsiInternalStateConstraintTransition.g:799:57: (iv_ruleStartTransition= ruleStartTransition EOF )
            // PsiInternalStateConstraintTransition.g:800:2: iv_ruleStartTransition= ruleStartTransition EOF
            {
             markComposite(elementTypeProvider.getStartTransitionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartTransition=ruleStartTransition();

            state._fsp--;

             current =iv_ruleStartTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartTransition"


    // $ANTLR start "ruleStartTransition"
    // PsiInternalStateConstraintTransition.g:806:1: ruleStartTransition returns [Boolean current=false] : (otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) ) ) ;
    public final Boolean ruleStartTransition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // PsiInternalStateConstraintTransition.g:807:1: ( (otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) ) ) )
            // PsiInternalStateConstraintTransition.g:808:2: (otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) ) )
            {
            // PsiInternalStateConstraintTransition.g:808:2: (otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) ) )
            // PsiInternalStateConstraintTransition.g:809:3: otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) )
            {

            			markLeaf(elementTypeProvider.getStartTransition_StartKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getStartTransition_TransitionKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			doneLeaf(otherlv_1);
            		

            			markLeaf(elementTypeProvider.getStartTransition_ToKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalStateConstraintTransition.g:830:3: ( ( ruleFQN ) )
            // PsiInternalStateConstraintTransition.g:831:4: ( ruleFQN )
            {
            // PsiInternalStateConstraintTransition.g:831:4: ( ruleFQN )
            // PsiInternalStateConstraintTransition.g:832:5: ruleFQN
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStartTransition_TargetStateStateCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartTransition"


    // $ANTLR start "entryRuleEndTransition"
    // PsiInternalStateConstraintTransition.g:851:1: entryRuleEndTransition returns [Boolean current=false] : iv_ruleEndTransition= ruleEndTransition EOF ;
    public final Boolean entryRuleEndTransition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEndTransition = null;


        try {
            // PsiInternalStateConstraintTransition.g:851:55: (iv_ruleEndTransition= ruleEndTransition EOF )
            // PsiInternalStateConstraintTransition.g:852:2: iv_ruleEndTransition= ruleEndTransition EOF
            {
             markComposite(elementTypeProvider.getEndTransitionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndTransition=ruleEndTransition();

            state._fsp--;

             current =iv_ruleEndTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndTransition"


    // $ANTLR start "ruleEndTransition"
    // PsiInternalStateConstraintTransition.g:858:1: ruleEndTransition returns [Boolean current=false] : (otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) ) ) ;
    public final Boolean ruleEndTransition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // PsiInternalStateConstraintTransition.g:859:1: ( (otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) ) ) )
            // PsiInternalStateConstraintTransition.g:860:2: (otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) ) )
            {
            // PsiInternalStateConstraintTransition.g:860:2: (otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) ) )
            // PsiInternalStateConstraintTransition.g:861:3: otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) )
            {

            			markLeaf(elementTypeProvider.getEndTransition_EndKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getEndTransition_TransitionKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_22); 

            			doneLeaf(otherlv_1);
            		

            			markLeaf(elementTypeProvider.getEndTransition_FromKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalStateConstraintTransition.g:882:3: ( ( ruleFQN ) )
            // PsiInternalStateConstraintTransition.g:883:4: ( ruleFQN )
            {
            // PsiInternalStateConstraintTransition.g:883:4: ( ruleFQN )
            // PsiInternalStateConstraintTransition.g:884:5: ruleFQN
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEndTransition_SourceStateStateCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndTransition"


    // $ANTLR start "entryRuleFullTransition"
    // PsiInternalStateConstraintTransition.g:903:1: entryRuleFullTransition returns [Boolean current=false] : iv_ruleFullTransition= ruleFullTransition EOF ;
    public final Boolean entryRuleFullTransition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFullTransition = null;


        try {
            // PsiInternalStateConstraintTransition.g:903:56: (iv_ruleFullTransition= ruleFullTransition EOF )
            // PsiInternalStateConstraintTransition.g:904:2: iv_ruleFullTransition= ruleFullTransition EOF
            {
             markComposite(elementTypeProvider.getFullTransitionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullTransition=ruleFullTransition();

            state._fsp--;

             current =iv_ruleFullTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullTransition"


    // $ANTLR start "ruleFullTransition"
    // PsiInternalStateConstraintTransition.g:910:1: ruleFullTransition returns [Boolean current=false] : ( (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) ) ) ;
    public final Boolean ruleFullTransition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_event_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:911:1: ( ( (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) ) ) )
            // PsiInternalStateConstraintTransition.g:912:2: ( (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) ) )
            {
            // PsiInternalStateConstraintTransition.g:912:2: ( (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) ) )
            // PsiInternalStateConstraintTransition.g:913:3: (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) )
            {
            // PsiInternalStateConstraintTransition.g:913:3: (otherlv_0= 'When' ( ( ruleFQN ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:914:4: otherlv_0= 'When' ( ( ruleFQN ) )
                    {

                    				markLeaf(elementTypeProvider.getFullTransition_WhenKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,30,FOLLOW_3); 

                    				doneLeaf(otherlv_0);
                    			
                    // PsiInternalStateConstraintTransition.g:921:4: ( ( ruleFQN ) )
                    // PsiInternalStateConstraintTransition.g:922:5: ( ruleFQN )
                    {
                    // PsiInternalStateConstraintTransition.g:922:5: ( ruleFQN )
                    // PsiInternalStateConstraintTransition.g:923:6: ruleFQN
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markComposite(elementTypeProvider.getFullTransition_StateStateCrossReference_0_1_0ElementType());
                    					
                    pushFollow(FOLLOW_23);
                    ruleFQN();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getFullTransition_IfKeyword_1ElementType());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_24); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalStateConstraintTransition.g:946:3: ( (lv_event_3_0= ruleEvent ) )
            // PsiInternalStateConstraintTransition.g:947:4: (lv_event_3_0= ruleEvent )
            {
            // PsiInternalStateConstraintTransition.g:947:4: (lv_event_3_0= ruleEvent )
            // PsiInternalStateConstraintTransition.g:948:5: lv_event_3_0= ruleEvent
            {

            					markComposite(elementTypeProvider.getFullTransition_EventEventParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_20);
            lv_event_3_0=ruleEvent();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getFullTransition_TransitionKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_22); 

            			doneLeaf(otherlv_4);
            		

            			markLeaf(elementTypeProvider.getFullTransition_FromKeyword_4ElementType());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			doneLeaf(otherlv_5);
            		
            // PsiInternalStateConstraintTransition.g:975:3: ( ( ruleFQN ) )
            // PsiInternalStateConstraintTransition.g:976:4: ( ruleFQN )
            {
            // PsiInternalStateConstraintTransition.g:976:4: ( ruleFQN )
            // PsiInternalStateConstraintTransition.g:977:5: ruleFQN
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getFullTransition_SourceStateStateCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_21);
            ruleFQN();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getFullTransition_ToKeyword_6ElementType());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_3); 

            			doneLeaf(otherlv_7);
            		
            // PsiInternalStateConstraintTransition.g:999:3: ( ( ruleFQN ) )
            // PsiInternalStateConstraintTransition.g:1000:4: ( ruleFQN )
            {
            // PsiInternalStateConstraintTransition.g:1000:4: ( ruleFQN )
            // PsiInternalStateConstraintTransition.g:1001:5: ruleFQN
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getFullTransition_TargetStateStateCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullTransition"


    // $ANTLR start "entryRuleEvent"
    // PsiInternalStateConstraintTransition.g:1020:1: entryRuleEvent returns [Boolean current=false] : iv_ruleEvent= ruleEvent EOF ;
    public final Boolean entryRuleEvent() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEvent = null;


        try {
            // PsiInternalStateConstraintTransition.g:1020:47: (iv_ruleEvent= ruleEvent EOF )
            // PsiInternalStateConstraintTransition.g:1021:2: iv_ruleEvent= ruleEvent EOF
            {
             markComposite(elementTypeProvider.getEventElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // PsiInternalStateConstraintTransition.g:1027:1: ruleEvent returns [Boolean current=false] : ( () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )? ) ;
    public final Boolean ruleEvent() throws RecognitionException {
        Boolean current = false;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Boolean lv_evOcc_1_0 = null;

        Boolean lv_sttOcc_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1028:1: ( ( () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )? ) )
            // PsiInternalStateConstraintTransition.g:1029:2: ( () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )? )
            {
            // PsiInternalStateConstraintTransition.g:1029:2: ( () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )? )
            // PsiInternalStateConstraintTransition.g:1030:3: () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )?
            {
            // PsiInternalStateConstraintTransition.g:1030:3: ()
            // PsiInternalStateConstraintTransition.g:1031:4: 
            {

            				precedeComposite(elementTypeProvider.getEvent_EventAction_0ElementType());
            				doneComposite();
            				associateWithSemanticElement();
            			

            }

            // PsiInternalStateConstraintTransition.g:1037:3: ( (lv_evOcc_1_0= ruleEventOccurence ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_INT)||LA18_0==35||LA18_0==51||(LA18_0>=53 && LA18_0<=59)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EOF||LA18_2==RULE_ID||LA18_2==18||LA18_2==26||(LA18_2>=32 && LA18_2<=33)||(LA18_2>=41 && LA18_2<=50)) ) {
                    alt18=1;
                }
                else if ( (LA18_2==34) ) {
                    int LA18_4 = input.LA(3);

                    if ( ((LA18_4>=RULE_ID && LA18_4<=RULE_INT)||LA18_4==35||LA18_4==51||LA18_4==53||LA18_4==59) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:1038:4: (lv_evOcc_1_0= ruleEventOccurence )
                    {
                    // PsiInternalStateConstraintTransition.g:1038:4: (lv_evOcc_1_0= ruleEventOccurence )
                    // PsiInternalStateConstraintTransition.g:1039:5: lv_evOcc_1_0= ruleEventOccurence
                    {

                    					markComposite(elementTypeProvider.getEvent_EvOccEventOccurenceParserRuleCall_1_0ElementType());
                    				
                    pushFollow(FOLLOW_25);
                    lv_evOcc_1_0=ruleEventOccurence();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:1052:3: ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=32 && LA20_0<=33)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:1053:4: ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) )
                    {
                    // PsiInternalStateConstraintTransition.g:1053:4: ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) )
                    // PsiInternalStateConstraintTransition.g:1054:5: (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' )
                    {
                    // PsiInternalStateConstraintTransition.g:1054:5: (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==32) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==33) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // PsiInternalStateConstraintTransition.g:1055:6: lv_operator_2_1= '\\\\/'
                            {

                            						markLeaf(elementTypeProvider.getEvent_OperatorReverseSolidusSolidusKeyword_2_0_0ElementType());
                            					
                            lv_operator_2_1=(Token)match(input,32,FOLLOW_26); 

                            						doneLeaf(lv_operator_2_1);
                            					

                            						if (!current) {
                            							associateWithSemanticElement();
                            							current = true;
                            						}
                            					

                            }
                            break;
                        case 2 :
                            // PsiInternalStateConstraintTransition.g:1069:6: lv_operator_2_2= '/\\\\'
                            {

                            						markLeaf(elementTypeProvider.getEvent_OperatorSolidusReverseSolidusKeyword_2_0_1ElementType());
                            					
                            lv_operator_2_2=(Token)match(input,33,FOLLOW_26); 

                            						doneLeaf(lv_operator_2_2);
                            					

                            						if (!current) {
                            							associateWithSemanticElement();
                            							current = true;
                            						}
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:1085:3: ( (lv_sttOcc_3_0= ruleStateOccurence ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:1086:4: (lv_sttOcc_3_0= ruleStateOccurence )
                    {
                    // PsiInternalStateConstraintTransition.g:1086:4: (lv_sttOcc_3_0= ruleStateOccurence )
                    // PsiInternalStateConstraintTransition.g:1087:5: lv_sttOcc_3_0= ruleStateOccurence
                    {

                    					markComposite(elementTypeProvider.getEvent_SttOccStateOccurenceParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sttOcc_3_0=ruleStateOccurence();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventOccurence"
    // PsiInternalStateConstraintTransition.g:1104:1: entryRuleEventOccurence returns [Boolean current=false] : iv_ruleEventOccurence= ruleEventOccurence EOF ;
    public final Boolean entryRuleEventOccurence() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEventOccurence = null;


        try {
            // PsiInternalStateConstraintTransition.g:1104:56: (iv_ruleEventOccurence= ruleEventOccurence EOF )
            // PsiInternalStateConstraintTransition.g:1105:2: iv_ruleEventOccurence= ruleEventOccurence EOF
            {
             markComposite(elementTypeProvider.getEventOccurenceElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventOccurence=ruleEventOccurence();

            state._fsp--;

             current =iv_ruleEventOccurence; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventOccurence"


    // $ANTLR start "ruleEventOccurence"
    // PsiInternalStateConstraintTransition.g:1111:1: ruleEventOccurence returns [Boolean current=false] : ( (lv_eventExpression_0_0= ruleConstraint ) ) ;
    public final Boolean ruleEventOccurence() throws RecognitionException {
        Boolean current = false;

        Boolean lv_eventExpression_0_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1112:1: ( ( (lv_eventExpression_0_0= ruleConstraint ) ) )
            // PsiInternalStateConstraintTransition.g:1113:2: ( (lv_eventExpression_0_0= ruleConstraint ) )
            {
            // PsiInternalStateConstraintTransition.g:1113:2: ( (lv_eventExpression_0_0= ruleConstraint ) )
            // PsiInternalStateConstraintTransition.g:1114:3: (lv_eventExpression_0_0= ruleConstraint )
            {
            // PsiInternalStateConstraintTransition.g:1114:3: (lv_eventExpression_0_0= ruleConstraint )
            // PsiInternalStateConstraintTransition.g:1115:4: lv_eventExpression_0_0= ruleConstraint
            {

            				markComposite(elementTypeProvider.getEventOccurence_EventExpressionConstraintParserRuleCall_0ElementType());
            			
            pushFollow(FOLLOW_2);
            lv_eventExpression_0_0=ruleConstraint();

            state._fsp--;


            				doneComposite();
            				if(!current) {
            					associateWithSemanticElement();
            					current = true;
            				}
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventOccurence"


    // $ANTLR start "entryRuleStateOccurence"
    // PsiInternalStateConstraintTransition.g:1131:1: entryRuleStateOccurence returns [Boolean current=false] : iv_ruleStateOccurence= ruleStateOccurence EOF ;
    public final Boolean entryRuleStateOccurence() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStateOccurence = null;


        try {
            // PsiInternalStateConstraintTransition.g:1131:56: (iv_ruleStateOccurence= ruleStateOccurence EOF )
            // PsiInternalStateConstraintTransition.g:1132:2: iv_ruleStateOccurence= ruleStateOccurence EOF
            {
             markComposite(elementTypeProvider.getStateOccurenceElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateOccurence=ruleStateOccurence();

            state._fsp--;

             current =iv_ruleStateOccurence; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateOccurence"


    // $ANTLR start "ruleStateOccurence"
    // PsiInternalStateConstraintTransition.g:1138:1: ruleStateOccurence returns [Boolean current=false] : ( (lv_stateExpression_0_0= ruleStateConstraint ) ) ;
    public final Boolean ruleStateOccurence() throws RecognitionException {
        Boolean current = false;

        Boolean lv_stateExpression_0_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1139:1: ( ( (lv_stateExpression_0_0= ruleStateConstraint ) ) )
            // PsiInternalStateConstraintTransition.g:1140:2: ( (lv_stateExpression_0_0= ruleStateConstraint ) )
            {
            // PsiInternalStateConstraintTransition.g:1140:2: ( (lv_stateExpression_0_0= ruleStateConstraint ) )
            // PsiInternalStateConstraintTransition.g:1141:3: (lv_stateExpression_0_0= ruleStateConstraint )
            {
            // PsiInternalStateConstraintTransition.g:1141:3: (lv_stateExpression_0_0= ruleStateConstraint )
            // PsiInternalStateConstraintTransition.g:1142:4: lv_stateExpression_0_0= ruleStateConstraint
            {

            				markComposite(elementTypeProvider.getStateOccurence_StateExpressionStateConstraintParserRuleCall_0ElementType());
            			
            pushFollow(FOLLOW_2);
            lv_stateExpression_0_0=ruleStateConstraint();

            state._fsp--;


            				doneComposite();
            				if(!current) {
            					associateWithSemanticElement();
            					current = true;
            				}
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateOccurence"


    // $ANTLR start "entryRuleStateConstraint"
    // PsiInternalStateConstraintTransition.g:1158:1: entryRuleStateConstraint returns [Boolean current=false] : iv_ruleStateConstraint= ruleStateConstraint EOF ;
    public final Boolean entryRuleStateConstraint() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStateConstraint = null;


        try {
            // PsiInternalStateConstraintTransition.g:1158:57: (iv_ruleStateConstraint= ruleStateConstraint EOF )
            // PsiInternalStateConstraintTransition.g:1159:2: iv_ruleStateConstraint= ruleStateConstraint EOF
            {
             markComposite(elementTypeProvider.getStateConstraintElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateConstraint=ruleStateConstraint();

            state._fsp--;

             current =iv_ruleStateConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateConstraint"


    // $ANTLR start "ruleStateConstraint"
    // PsiInternalStateConstraintTransition.g:1165:1: ruleStateConstraint returns [Boolean current=false] : this_Or_state_0= ruleOr_state ;
    public final Boolean ruleStateConstraint() throws RecognitionException {
        Boolean current = false;

        Boolean this_Or_state_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1166:1: (this_Or_state_0= ruleOr_state )
            // PsiInternalStateConstraintTransition.g:1167:2: this_Or_state_0= ruleOr_state
            {

            		markComposite(elementTypeProvider.getStateConstraint_Or_stateParserRuleCallElementType());
            	
            pushFollow(FOLLOW_2);
            this_Or_state_0=ruleOr_state();

            state._fsp--;


            		current = this_Or_state_0;
            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateConstraint"


    // $ANTLR start "entryRuleOr_state"
    // PsiInternalStateConstraintTransition.g:1178:1: entryRuleOr_state returns [Boolean current=false] : iv_ruleOr_state= ruleOr_state EOF ;
    public final Boolean entryRuleOr_state() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOr_state = null;


        try {
            // PsiInternalStateConstraintTransition.g:1178:50: (iv_ruleOr_state= ruleOr_state EOF )
            // PsiInternalStateConstraintTransition.g:1179:2: iv_ruleOr_state= ruleOr_state EOF
            {
             markComposite(elementTypeProvider.getOr_stateElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr_state=ruleOr_state();

            state._fsp--;

             current =iv_ruleOr_state; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr_state"


    // $ANTLR start "ruleOr_state"
    // PsiInternalStateConstraintTransition.g:1185:1: ruleOr_state returns [Boolean current=false] : (this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )* ) ;
    public final Boolean ruleOr_state() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_And_state_0 = null;

        Boolean lv_ripe_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1186:1: ( (this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )* ) )
            // PsiInternalStateConstraintTransition.g:1187:2: (this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )* )
            {
            // PsiInternalStateConstraintTransition.g:1187:2: (this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )* )
            // PsiInternalStateConstraintTransition.g:1188:3: this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )*
            {

            			markComposite(elementTypeProvider.getOr_state_And_stateParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_27);
            this_And_state_0=ruleAnd_state();

            state._fsp--;


            			current = this_And_state_0;
            			doneComposite();
            		
            // PsiInternalStateConstraintTransition.g:1196:3: ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1197:4: () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1197:4: ()
            	    // PsiInternalStateConstraintTransition.g:1198:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getOr_state_Or_stateLeftAction_1_0ElementType());
            	    					doneComposite();
            	    					associateWithSemanticElement();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getOr_state_ReverseSolidusSolidusKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,32,FOLLOW_3); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalStateConstraintTransition.g:1211:4: ( (lv_ripe_3_0= ruleAnd_state ) )
            	    // PsiInternalStateConstraintTransition.g:1212:5: (lv_ripe_3_0= ruleAnd_state )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1212:5: (lv_ripe_3_0= ruleAnd_state )
            	    // PsiInternalStateConstraintTransition.g:1213:6: lv_ripe_3_0= ruleAnd_state
            	    {

            	    						markComposite(elementTypeProvider.getOr_state_RipeAnd_stateParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ripe_3_0=ruleAnd_state();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr_state"


    // $ANTLR start "entryRuleAnd_state"
    // PsiInternalStateConstraintTransition.g:1231:1: entryRuleAnd_state returns [Boolean current=false] : iv_ruleAnd_state= ruleAnd_state EOF ;
    public final Boolean entryRuleAnd_state() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAnd_state = null;


        try {
            // PsiInternalStateConstraintTransition.g:1231:51: (iv_ruleAnd_state= ruleAnd_state EOF )
            // PsiInternalStateConstraintTransition.g:1232:2: iv_ruleAnd_state= ruleAnd_state EOF
            {
             markComposite(elementTypeProvider.getAnd_stateElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd_state=ruleAnd_state();

            state._fsp--;

             current =iv_ruleAnd_state; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd_state"


    // $ANTLR start "ruleAnd_state"
    // PsiInternalStateConstraintTransition.g:1238:1: ruleAnd_state returns [Boolean current=false] : (this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )* ) ;
    public final Boolean ruleAnd_state() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_StateName_0 = null;

        Boolean lv_ripe_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1239:1: ( (this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )* ) )
            // PsiInternalStateConstraintTransition.g:1240:2: (this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )* )
            {
            // PsiInternalStateConstraintTransition.g:1240:2: (this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )* )
            // PsiInternalStateConstraintTransition.g:1241:3: this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )*
            {

            			markComposite(elementTypeProvider.getAnd_state_StateNameParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_28);
            this_StateName_0=ruleStateName();

            state._fsp--;


            			current = this_StateName_0;
            			doneComposite();
            		
            // PsiInternalStateConstraintTransition.g:1249:3: ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1250:4: () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1250:4: ()
            	    // PsiInternalStateConstraintTransition.g:1251:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getAnd_state_And_stateLeftAction_1_0ElementType());
            	    					doneComposite();
            	    					associateWithSemanticElement();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getAnd_state_SolidusReverseSolidusKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,33,FOLLOW_3); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalStateConstraintTransition.g:1264:4: ( (lv_ripe_3_0= ruleStateName ) )
            	    // PsiInternalStateConstraintTransition.g:1265:5: (lv_ripe_3_0= ruleStateName )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1265:5: (lv_ripe_3_0= ruleStateName )
            	    // PsiInternalStateConstraintTransition.g:1266:6: lv_ripe_3_0= ruleStateName
            	    {

            	    						markComposite(elementTypeProvider.getAnd_state_RipeStateNameParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_ripe_3_0=ruleStateName();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd_state"


    // $ANTLR start "entryRuleStateName"
    // PsiInternalStateConstraintTransition.g:1284:1: entryRuleStateName returns [Boolean current=false] : iv_ruleStateName= ruleStateName EOF ;
    public final Boolean entryRuleStateName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStateName = null;


        try {
            // PsiInternalStateConstraintTransition.g:1284:51: (iv_ruleStateName= ruleStateName EOF )
            // PsiInternalStateConstraintTransition.g:1285:2: iv_ruleStateName= ruleStateName EOF
            {
             markComposite(elementTypeProvider.getStateNameElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateName=ruleStateName();

            state._fsp--;

             current =iv_ruleStateName; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateName"


    // $ANTLR start "ruleStateName"
    // PsiInternalStateConstraintTransition.g:1291:1: ruleStateName returns [Boolean current=false] : ( () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1' ) ;
    public final Boolean ruleStateName() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // PsiInternalStateConstraintTransition.g:1292:1: ( ( () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1' ) )
            // PsiInternalStateConstraintTransition.g:1293:2: ( () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1' )
            {
            // PsiInternalStateConstraintTransition.g:1293:2: ( () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1' )
            // PsiInternalStateConstraintTransition.g:1294:3: () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1'
            {
            // PsiInternalStateConstraintTransition.g:1294:3: ()
            // PsiInternalStateConstraintTransition.g:1295:4: 
            {

            				precedeComposite(elementTypeProvider.getStateName_StateNameRefAction_0ElementType());
            				doneComposite();
            				associateWithSemanticElement();
            			

            }

            // PsiInternalStateConstraintTransition.g:1301:3: ( ( ruleFQN ) )
            // PsiInternalStateConstraintTransition.g:1302:4: ( ruleFQN )
            {
            // PsiInternalStateConstraintTransition.g:1302:4: ( ruleFQN )
            // PsiInternalStateConstraintTransition.g:1303:5: ruleFQN
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStateName_ValueStateCrossReference_1_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleFQN();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getStateName_EqualsSignKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_30); 

            			doneLeaf(otherlv_2);
            		

            			markLeaf(elementTypeProvider.getStateName_DigitOneKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			doneLeaf(otherlv_3);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateName"


    // $ANTLR start "entryRuleCompositeState"
    // PsiInternalStateConstraintTransition.g:1336:1: entryRuleCompositeState returns [Boolean current=false] : iv_ruleCompositeState= ruleCompositeState EOF ;
    public final Boolean entryRuleCompositeState() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCompositeState = null;


        try {
            // PsiInternalStateConstraintTransition.g:1336:56: (iv_ruleCompositeState= ruleCompositeState EOF )
            // PsiInternalStateConstraintTransition.g:1337:2: iv_ruleCompositeState= ruleCompositeState EOF
            {
             markComposite(elementTypeProvider.getCompositeStateElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeState=ruleCompositeState();

            state._fsp--;

             current =iv_ruleCompositeState; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeState"


    // $ANTLR start "ruleCompositeState"
    // PsiInternalStateConstraintTransition.g:1343:1: ruleCompositeState returns [Boolean current=false] : ( ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) ) ) ;
    public final Boolean ruleCompositeState() throws RecognitionException {
        Boolean current = false;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Boolean lv_concernlevel_2_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1344:1: ( ( ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) ) ) )
            // PsiInternalStateConstraintTransition.g:1345:2: ( ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) ) )
            {
            // PsiInternalStateConstraintTransition.g:1345:2: ( ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) ) )
            // PsiInternalStateConstraintTransition.g:1346:3: ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) )
            {
            // PsiInternalStateConstraintTransition.g:1346:3: ( (lv_type_0_0= 'compositeState' ) )
            // PsiInternalStateConstraintTransition.g:1347:4: (lv_type_0_0= 'compositeState' )
            {
            // PsiInternalStateConstraintTransition.g:1347:4: (lv_type_0_0= 'compositeState' )
            // PsiInternalStateConstraintTransition.g:1348:5: lv_type_0_0= 'compositeState'
            {

            					markLeaf(elementTypeProvider.getCompositeState_TypeCompositeStateKeyword_0_0ElementType());
            				
            lv_type_0_0=(Token)match(input,36,FOLLOW_3); 

            					doneLeaf(lv_type_0_0);
            				

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:1363:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalStateConstraintTransition.g:1364:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalStateConstraintTransition.g:1364:4: (lv_name_1_0= RULE_ID )
            // PsiInternalStateConstraintTransition.g:1365:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getCompositeState_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:1380:3: ( (lv_concernlevel_2_0= ruleConcernLevel ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1381:4: (lv_concernlevel_2_0= ruleConcernLevel )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1381:4: (lv_concernlevel_2_0= ruleConcernLevel )
            	    // PsiInternalStateConstraintTransition.g:1382:5: lv_concernlevel_2_0= ruleConcernLevel
            	    {

            	    					markComposite(elementTypeProvider.getCompositeState_ConcernlevelConcernLevelParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_concernlevel_2_0=ruleConcernLevel();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            			markLeaf(elementTypeProvider.getCompositeState_End_compositeStateKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_3); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalStateConstraintTransition.g:1402:3: ( (otherlv_4= RULE_ID ) )
            // PsiInternalStateConstraintTransition.g:1403:4: (otherlv_4= RULE_ID )
            {
            // PsiInternalStateConstraintTransition.g:1403:4: (otherlv_4= RULE_ID )
            // PsiInternalStateConstraintTransition.g:1404:5: otherlv_4= RULE_ID
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markLeaf(elementTypeProvider.getCompositeState_EndCompositeStateCompositeStateCrossReference_4_0ElementType());
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					doneLeaf(otherlv_4);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeState"


    // $ANTLR start "entryRuleConcernLevel"
    // PsiInternalStateConstraintTransition.g:1423:1: entryRuleConcernLevel returns [Boolean current=false] : iv_ruleConcernLevel= ruleConcernLevel EOF ;
    public final Boolean entryRuleConcernLevel() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConcernLevel = null;


        try {
            // PsiInternalStateConstraintTransition.g:1423:54: (iv_ruleConcernLevel= ruleConcernLevel EOF )
            // PsiInternalStateConstraintTransition.g:1424:2: iv_ruleConcernLevel= ruleConcernLevel EOF
            {
             markComposite(elementTypeProvider.getConcernLevelElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcernLevel=ruleConcernLevel();

            state._fsp--;

             current =iv_ruleConcernLevel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcernLevel"


    // $ANTLR start "ruleConcernLevel"
    // PsiInternalStateConstraintTransition.g:1430:1: ruleConcernLevel returns [Boolean current=false] : (otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) ) ) ;
    public final Boolean ruleConcernLevel() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Boolean lv_state_2_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1431:1: ( (otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) ) ) )
            // PsiInternalStateConstraintTransition.g:1432:2: (otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) ) )
            {
            // PsiInternalStateConstraintTransition.g:1432:2: (otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) ) )
            // PsiInternalStateConstraintTransition.g:1433:3: otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getConcernLevel_ConcernLevelKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalStateConstraintTransition.g:1440:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalStateConstraintTransition.g:1441:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalStateConstraintTransition.g:1441:4: (lv_name_1_0= RULE_ID )
            // PsiInternalStateConstraintTransition.g:1442:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getConcernLevel_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:1457:3: ( (lv_state_2_0= ruleState ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36||LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1458:4: (lv_state_2_0= ruleState )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1458:4: (lv_state_2_0= ruleState )
            	    // PsiInternalStateConstraintTransition.g:1459:5: lv_state_2_0= ruleState
            	    {

            	    					markComposite(elementTypeProvider.getConcernLevel_StateStateParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_state_2_0=ruleState();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            			markLeaf(elementTypeProvider.getConcernLevel_End_concernLevelKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_3); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalStateConstraintTransition.g:1479:3: ( (otherlv_4= RULE_ID ) )
            // PsiInternalStateConstraintTransition.g:1480:4: (otherlv_4= RULE_ID )
            {
            // PsiInternalStateConstraintTransition.g:1480:4: (otherlv_4= RULE_ID )
            // PsiInternalStateConstraintTransition.g:1481:5: otherlv_4= RULE_ID
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markLeaf(elementTypeProvider.getConcernLevel_EndConcernLevelConcernLevelCrossReference_4_0ElementType());
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					doneLeaf(otherlv_4);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcernLevel"


    // $ANTLR start "entryRuleSimpleConstraintState"
    // PsiInternalStateConstraintTransition.g:1500:1: entryRuleSimpleConstraintState returns [Boolean current=false] : iv_ruleSimpleConstraintState= ruleSimpleConstraintState EOF ;
    public final Boolean entryRuleSimpleConstraintState() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSimpleConstraintState = null;


        try {
            // PsiInternalStateConstraintTransition.g:1500:63: (iv_ruleSimpleConstraintState= ruleSimpleConstraintState EOF )
            // PsiInternalStateConstraintTransition.g:1501:2: iv_ruleSimpleConstraintState= ruleSimpleConstraintState EOF
            {
             markComposite(elementTypeProvider.getSimpleConstraintStateElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleConstraintState=ruleSimpleConstraintState();

            state._fsp--;

             current =iv_ruleSimpleConstraintState; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleConstraintState"


    // $ANTLR start "ruleSimpleConstraintState"
    // PsiInternalStateConstraintTransition.g:1507:1: ruleSimpleConstraintState returns [Boolean current=false] : ( ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+ ) ;
    public final Boolean ruleSimpleConstraintState() throws RecognitionException {
        Boolean current = false;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Boolean lv_newVariable_2_0 = null;

        Boolean lv_constraint_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1508:1: ( ( ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+ ) )
            // PsiInternalStateConstraintTransition.g:1509:2: ( ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+ )
            {
            // PsiInternalStateConstraintTransition.g:1509:2: ( ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+ )
            // PsiInternalStateConstraintTransition.g:1510:3: ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+
            {
            // PsiInternalStateConstraintTransition.g:1510:3: ( (lv_type_0_0= 'simpleConstraintState' ) )
            // PsiInternalStateConstraintTransition.g:1511:4: (lv_type_0_0= 'simpleConstraintState' )
            {
            // PsiInternalStateConstraintTransition.g:1511:4: (lv_type_0_0= 'simpleConstraintState' )
            // PsiInternalStateConstraintTransition.g:1512:5: lv_type_0_0= 'simpleConstraintState'
            {

            					markLeaf(elementTypeProvider.getSimpleConstraintState_TypeSimpleConstraintStateKeyword_0_0ElementType());
            				
            lv_type_0_0=(Token)match(input,40,FOLLOW_3); 

            					doneLeaf(lv_type_0_0);
            				

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:1527:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalStateConstraintTransition.g:1528:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalStateConstraintTransition.g:1528:4: (lv_name_1_0= RULE_ID )
            // PsiInternalStateConstraintTransition.g:1529:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSimpleConstraintState_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:1544:3: ( (lv_newVariable_2_0= ruleVariable ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=14 && LA26_0<=17)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1545:4: (lv_newVariable_2_0= ruleVariable )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1545:4: (lv_newVariable_2_0= ruleVariable )
            	    // PsiInternalStateConstraintTransition.g:1546:5: lv_newVariable_2_0= ruleVariable
            	    {

            	    					markComposite(elementTypeProvider.getSimpleConstraintState_NewVariableVariableParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_newVariable_2_0=ruleVariable();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // PsiInternalStateConstraintTransition.g:1559:3: ( (lv_constraint_3_0= ruleConstraint ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||LA27_0==35||LA27_0==51||(LA27_0>=53 && LA27_0<=59)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1560:4: (lv_constraint_3_0= ruleConstraint )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1560:4: (lv_constraint_3_0= ruleConstraint )
            	    // PsiInternalStateConstraintTransition.g:1561:5: lv_constraint_3_0= ruleConstraint
            	    {

            	    					markComposite(elementTypeProvider.getSimpleConstraintState_ConstraintConstraintParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_constraint_3_0=ruleConstraint();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleConstraintState"


    // $ANTLR start "entryRuleConstraint"
    // PsiInternalStateConstraintTransition.g:1578:1: entryRuleConstraint returns [Boolean current=false] : iv_ruleConstraint= ruleConstraint EOF ;
    public final Boolean entryRuleConstraint() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConstraint = null;


        try {
            // PsiInternalStateConstraintTransition.g:1578:52: (iv_ruleConstraint= ruleConstraint EOF )
            // PsiInternalStateConstraintTransition.g:1579:2: iv_ruleConstraint= ruleConstraint EOF
            {
             markComposite(elementTypeProvider.getConstraintElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // PsiInternalStateConstraintTransition.g:1585:1: ruleConstraint returns [Boolean current=false] : this_Log_expr_0= ruleLog_expr ;
    public final Boolean ruleConstraint() throws RecognitionException {
        Boolean current = false;

        Boolean this_Log_expr_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1586:1: (this_Log_expr_0= ruleLog_expr )
            // PsiInternalStateConstraintTransition.g:1587:2: this_Log_expr_0= ruleLog_expr
            {

            		markComposite(elementTypeProvider.getConstraint_Log_exprParserRuleCallElementType());
            	
            pushFollow(FOLLOW_2);
            this_Log_expr_0=ruleLog_expr();

            state._fsp--;


            		current = this_Log_expr_0;
            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleLog_expr"
    // PsiInternalStateConstraintTransition.g:1598:1: entryRuleLog_expr returns [Boolean current=false] : iv_ruleLog_expr= ruleLog_expr EOF ;
    public final Boolean entryRuleLog_expr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLog_expr = null;


        try {
            // PsiInternalStateConstraintTransition.g:1598:50: (iv_ruleLog_expr= ruleLog_expr EOF )
            // PsiInternalStateConstraintTransition.g:1599:2: iv_ruleLog_expr= ruleLog_expr EOF
            {
             markComposite(elementTypeProvider.getLog_exprElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleLog_expr=ruleLog_expr();

            state._fsp--;

             current =iv_ruleLog_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLog_expr"


    // $ANTLR start "ruleLog_expr"
    // PsiInternalStateConstraintTransition.g:1605:1: ruleLog_expr returns [Boolean current=false] : (this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )* ) ;
    public final Boolean ruleLog_expr() throws RecognitionException {
        Boolean current = false;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Boolean this_Or_expr_0 = null;

        Boolean lv_right_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1606:1: ( (this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )* ) )
            // PsiInternalStateConstraintTransition.g:1607:2: (this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )* )
            {
            // PsiInternalStateConstraintTransition.g:1607:2: (this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )* )
            // PsiInternalStateConstraintTransition.g:1608:3: this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )*
            {

            			markComposite(elementTypeProvider.getLog_expr_Or_exprParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_36);
            this_Or_expr_0=ruleOr_expr();

            state._fsp--;


            			current = this_Or_expr_0;
            			doneComposite();
            		
            // PsiInternalStateConstraintTransition.g:1616:3: ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=41 && LA29_0<=43)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1617:4: () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1617:4: ()
            	    // PsiInternalStateConstraintTransition.g:1618:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getLog_expr_Log_exprLeftAction_1_0ElementType());
            	    					doneComposite();
            	    					associateWithSemanticElement();
            	    				

            	    }

            	    // PsiInternalStateConstraintTransition.g:1624:4: ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) )
            	    // PsiInternalStateConstraintTransition.g:1625:5: ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1625:5: ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) )
            	    // PsiInternalStateConstraintTransition.g:1626:6: (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1626:6: (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // PsiInternalStateConstraintTransition.g:1627:7: lv_operator_2_1= '->'
            	            {

            	            							markLeaf(elementTypeProvider.getLog_expr_OperatorHyphenMinusGreaterThanSignKeyword_1_1_0_0ElementType());
            	            						
            	            lv_operator_2_1=(Token)match(input,41,FOLLOW_37); 

            	            							doneLeaf(lv_operator_2_1);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalStateConstraintTransition.g:1641:7: lv_operator_2_2= '<->'
            	            {

            	            							markLeaf(elementTypeProvider.getLog_expr_OperatorLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1ElementType());
            	            						
            	            lv_operator_2_2=(Token)match(input,42,FOLLOW_37); 

            	            							doneLeaf(lv_operator_2_2);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // PsiInternalStateConstraintTransition.g:1655:7: lv_operator_2_3= '<-'
            	            {

            	            							markLeaf(elementTypeProvider.getLog_expr_OperatorLessThanSignHyphenMinusKeyword_1_1_0_2ElementType());
            	            						
            	            lv_operator_2_3=(Token)match(input,43,FOLLOW_37); 

            	            							doneLeaf(lv_operator_2_3);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // PsiInternalStateConstraintTransition.g:1671:4: ( (lv_right_3_0= ruleOr_expr ) )
            	    // PsiInternalStateConstraintTransition.g:1672:5: (lv_right_3_0= ruleOr_expr )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1672:5: (lv_right_3_0= ruleOr_expr )
            	    // PsiInternalStateConstraintTransition.g:1673:6: lv_right_3_0= ruleOr_expr
            	    {

            	    						markComposite(elementTypeProvider.getLog_expr_RightOr_exprParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleOr_expr();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLog_expr"


    // $ANTLR start "entryRuleOr_expr"
    // PsiInternalStateConstraintTransition.g:1691:1: entryRuleOr_expr returns [Boolean current=false] : iv_ruleOr_expr= ruleOr_expr EOF ;
    public final Boolean entryRuleOr_expr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOr_expr = null;


        try {
            // PsiInternalStateConstraintTransition.g:1691:49: (iv_ruleOr_expr= ruleOr_expr EOF )
            // PsiInternalStateConstraintTransition.g:1692:2: iv_ruleOr_expr= ruleOr_expr EOF
            {
             markComposite(elementTypeProvider.getOr_exprElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr_expr=ruleOr_expr();

            state._fsp--;

             current =iv_ruleOr_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr_expr"


    // $ANTLR start "ruleOr_expr"
    // PsiInternalStateConstraintTransition.g:1698:1: ruleOr_expr returns [Boolean current=false] : (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )* ) ;
    public final Boolean ruleOr_expr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_And_expr_0 = null;

        Boolean lv_right_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1699:1: ( (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )* ) )
            // PsiInternalStateConstraintTransition.g:1700:2: (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )* )
            {
            // PsiInternalStateConstraintTransition.g:1700:2: (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )* )
            // PsiInternalStateConstraintTransition.g:1701:3: this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )*
            {

            			markComposite(elementTypeProvider.getOr_expr_And_exprParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_28);
            this_And_expr_0=ruleAnd_expr();

            state._fsp--;


            			current = this_And_expr_0;
            			doneComposite();
            		
            // PsiInternalStateConstraintTransition.g:1709:3: ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    int LA30_2 = input.LA(2);

                    if ( ((LA30_2>=RULE_STRING && LA30_2<=RULE_INT)||LA30_2==35||LA30_2==51||(LA30_2>=53 && LA30_2<=59)) ) {
                        alt30=1;
                    }
                    else if ( (LA30_2==RULE_ID) ) {
                        int LA30_4 = input.LA(3);

                        if ( (LA30_4==34) ) {
                            int LA30_5 = input.LA(4);

                            if ( (LA30_5==RULE_INT||LA30_5==51||LA30_5==53||LA30_5==59) ) {
                                alt30=1;
                            }
                            else if ( ((LA30_5>=RULE_ID && LA30_5<=RULE_STRING)||LA30_5==35) ) {
                                alt30=1;
                            }


                        }
                        else if ( (LA30_4==EOF||(LA30_4>=RULE_ID && LA30_4<=RULE_INT)||LA30_4==18||(LA30_4>=25 && LA30_4<=26)||LA30_4==28||(LA30_4>=30 && LA30_4<=33)||(LA30_4>=35 && LA30_4<=36)||(LA30_4>=39 && LA30_4<=59)) ) {
                            alt30=1;
                        }


                    }


                }


                switch (alt30) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1710:4: () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1710:4: ()
            	    // PsiInternalStateConstraintTransition.g:1711:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getOr_expr_Or_exprLeftAction_1_0ElementType());
            	    					doneComposite();
            	    					associateWithSemanticElement();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getOr_expr_SolidusReverseSolidusKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,33,FOLLOW_37); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalStateConstraintTransition.g:1724:4: ( (lv_right_3_0= ruleAnd_expr ) )
            	    // PsiInternalStateConstraintTransition.g:1725:5: (lv_right_3_0= ruleAnd_expr )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1725:5: (lv_right_3_0= ruleAnd_expr )
            	    // PsiInternalStateConstraintTransition.g:1726:6: lv_right_3_0= ruleAnd_expr
            	    {

            	    						markComposite(elementTypeProvider.getOr_expr_RightAnd_exprParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleAnd_expr();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr_expr"


    // $ANTLR start "entryRuleAnd_expr"
    // PsiInternalStateConstraintTransition.g:1744:1: entryRuleAnd_expr returns [Boolean current=false] : iv_ruleAnd_expr= ruleAnd_expr EOF ;
    public final Boolean entryRuleAnd_expr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAnd_expr = null;


        try {
            // PsiInternalStateConstraintTransition.g:1744:50: (iv_ruleAnd_expr= ruleAnd_expr EOF )
            // PsiInternalStateConstraintTransition.g:1745:2: iv_ruleAnd_expr= ruleAnd_expr EOF
            {
             markComposite(elementTypeProvider.getAnd_exprElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd_expr=ruleAnd_expr();

            state._fsp--;

             current =iv_ruleAnd_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd_expr"


    // $ANTLR start "ruleAnd_expr"
    // PsiInternalStateConstraintTransition.g:1751:1: ruleAnd_expr returns [Boolean current=false] : ( (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )* ) ;
    public final Boolean ruleAnd_expr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_3=null;
        Boolean this_Compare_expr_0 = null;

        Boolean this_GlobalConstraint_1 = null;

        Boolean lv_right_4_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1752:1: ( ( (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )* ) )
            // PsiInternalStateConstraintTransition.g:1753:2: ( (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )* )
            {
            // PsiInternalStateConstraintTransition.g:1753:2: ( (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )* )
            // PsiInternalStateConstraintTransition.g:1754:3: (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )*
            {
            // PsiInternalStateConstraintTransition.g:1754:3: (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||LA31_0==35||LA31_0==51||LA31_0==53||LA31_0==59) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=54 && LA31_0<=58)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:1755:4: this_Compare_expr_0= ruleCompare_expr
                    {

                    				markComposite(elementTypeProvider.getAnd_expr_Compare_exprParserRuleCall_0_0ElementType());
                    			
                    pushFollow(FOLLOW_27);
                    this_Compare_expr_0=ruleCompare_expr();

                    state._fsp--;


                    				current = this_Compare_expr_0;
                    				doneComposite();
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:1764:4: this_GlobalConstraint_1= ruleGlobalConstraint
                    {

                    				markComposite(elementTypeProvider.getAnd_expr_GlobalConstraintParserRuleCall_0_1ElementType());
                    			
                    pushFollow(FOLLOW_27);
                    this_GlobalConstraint_1=ruleGlobalConstraint();

                    state._fsp--;


                    				current = this_GlobalConstraint_1;
                    				doneComposite();
                    			

                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:1773:3: ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    int LA32_2 = input.LA(2);

                    if ( ((LA32_2>=RULE_STRING && LA32_2<=RULE_INT)||LA32_2==35||LA32_2==51||LA32_2==53||LA32_2==59) ) {
                        alt32=1;
                    }
                    else if ( (LA32_2==RULE_ID) ) {
                        int LA32_4 = input.LA(3);

                        if ( (LA32_4==34) ) {
                            int LA32_5 = input.LA(4);

                            if ( (LA32_5==RULE_INT||LA32_5==51||LA32_5==53||LA32_5==59) ) {
                                alt32=1;
                            }
                            else if ( ((LA32_5>=RULE_ID && LA32_5<=RULE_STRING)||LA32_5==35) ) {
                                alt32=1;
                            }


                        }
                        else if ( (LA32_4==EOF||(LA32_4>=RULE_ID && LA32_4<=RULE_INT)||LA32_4==18||(LA32_4>=25 && LA32_4<=26)||LA32_4==28||(LA32_4>=30 && LA32_4<=33)||(LA32_4>=35 && LA32_4<=36)||(LA32_4>=39 && LA32_4<=59)) ) {
                            alt32=1;
                        }


                    }


                }


                switch (alt32) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1774:4: () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1774:4: ()
            	    // PsiInternalStateConstraintTransition.g:1775:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getAnd_expr_And_exprLeftAction_1_0ElementType());
            	    					doneComposite();
            	    					associateWithSemanticElement();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getAnd_expr_ReverseSolidusSolidusKeyword_1_1ElementType());
            	    			
            	    otherlv_3=(Token)match(input,32,FOLLOW_19); 

            	    				doneLeaf(otherlv_3);
            	    			
            	    // PsiInternalStateConstraintTransition.g:1788:4: ( (lv_right_4_0= ruleCompare_expr ) )
            	    // PsiInternalStateConstraintTransition.g:1789:5: (lv_right_4_0= ruleCompare_expr )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1789:5: (lv_right_4_0= ruleCompare_expr )
            	    // PsiInternalStateConstraintTransition.g:1790:6: lv_right_4_0= ruleCompare_expr
            	    {

            	    						markComposite(elementTypeProvider.getAnd_expr_RightCompare_exprParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_4_0=ruleCompare_expr();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd_expr"


    // $ANTLR start "entryRuleCompare_expr"
    // PsiInternalStateConstraintTransition.g:1808:1: entryRuleCompare_expr returns [Boolean current=false] : iv_ruleCompare_expr= ruleCompare_expr EOF ;
    public final Boolean entryRuleCompare_expr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCompare_expr = null;


        try {
            // PsiInternalStateConstraintTransition.g:1808:54: (iv_ruleCompare_expr= ruleCompare_expr EOF )
            // PsiInternalStateConstraintTransition.g:1809:2: iv_ruleCompare_expr= ruleCompare_expr EOF
            {
             markComposite(elementTypeProvider.getCompare_exprElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare_expr=ruleCompare_expr();

            state._fsp--;

             current =iv_ruleCompare_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompare_expr"


    // $ANTLR start "ruleCompare_expr"
    // PsiInternalStateConstraintTransition.g:1815:1: ruleCompare_expr returns [Boolean current=false] : (this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )* ) ;
    public final Boolean ruleCompare_expr() throws RecognitionException {
        Boolean current = false;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        Boolean this_math_expr_0 = null;

        Boolean lv_right_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1816:1: ( (this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )* ) )
            // PsiInternalStateConstraintTransition.g:1817:2: (this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )* )
            {
            // PsiInternalStateConstraintTransition.g:1817:2: (this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )* )
            // PsiInternalStateConstraintTransition.g:1818:3: this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )*
            {

            			markComposite(elementTypeProvider.getCompare_expr_Math_exprParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_38);
            this_math_expr_0=rulemath_expr();

            state._fsp--;


            			current = this_math_expr_0;
            			doneComposite();
            		
            // PsiInternalStateConstraintTransition.g:1826:3: ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34||(LA34_0>=44 && LA34_0<=48)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1827:4: () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1827:4: ()
            	    // PsiInternalStateConstraintTransition.g:1828:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getCompare_expr_Compare_exprLeftAction_1_0ElementType());
            	    					doneComposite();
            	    					associateWithSemanticElement();
            	    				

            	    }

            	    // PsiInternalStateConstraintTransition.g:1834:4: ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) )
            	    // PsiInternalStateConstraintTransition.g:1835:5: ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1835:5: ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    // PsiInternalStateConstraintTransition.g:1836:6: (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1836:6: (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    int alt33=6;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt33=5;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt33=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // PsiInternalStateConstraintTransition.g:1837:7: lv_operator_2_1= '>='
            	            {

            	            							markLeaf(elementTypeProvider.getCompare_expr_OperatorGreaterThanSignEqualsSignKeyword_1_1_0_0ElementType());
            	            						
            	            lv_operator_2_1=(Token)match(input,44,FOLLOW_19); 

            	            							doneLeaf(lv_operator_2_1);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalStateConstraintTransition.g:1851:7: lv_operator_2_2= '<='
            	            {

            	            							markLeaf(elementTypeProvider.getCompare_expr_OperatorLessThanSignEqualsSignKeyword_1_1_0_1ElementType());
            	            						
            	            lv_operator_2_2=(Token)match(input,45,FOLLOW_19); 

            	            							doneLeaf(lv_operator_2_2);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // PsiInternalStateConstraintTransition.g:1865:7: lv_operator_2_3= '='
            	            {

            	            							markLeaf(elementTypeProvider.getCompare_expr_OperatorEqualsSignKeyword_1_1_0_2ElementType());
            	            						
            	            lv_operator_2_3=(Token)match(input,34,FOLLOW_19); 

            	            							doneLeaf(lv_operator_2_3);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // PsiInternalStateConstraintTransition.g:1879:7: lv_operator_2_4= '!='
            	            {

            	            							markLeaf(elementTypeProvider.getCompare_expr_OperatorExclamationMarkEqualsSignKeyword_1_1_0_3ElementType());
            	            						
            	            lv_operator_2_4=(Token)match(input,46,FOLLOW_19); 

            	            							doneLeaf(lv_operator_2_4);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // PsiInternalStateConstraintTransition.g:1893:7: lv_operator_2_5= '>'
            	            {

            	            							markLeaf(elementTypeProvider.getCompare_expr_OperatorGreaterThanSignKeyword_1_1_0_4ElementType());
            	            						
            	            lv_operator_2_5=(Token)match(input,47,FOLLOW_19); 

            	            							doneLeaf(lv_operator_2_5);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // PsiInternalStateConstraintTransition.g:1907:7: lv_operator_2_6= '<'
            	            {

            	            							markLeaf(elementTypeProvider.getCompare_expr_OperatorLessThanSignKeyword_1_1_0_5ElementType());
            	            						
            	            lv_operator_2_6=(Token)match(input,48,FOLLOW_19); 

            	            							doneLeaf(lv_operator_2_6);
            	            						

            	            							if (!current) {
            	            								associateWithSemanticElement();
            	            								current = true;
            	            							}
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // PsiInternalStateConstraintTransition.g:1923:4: ( (lv_right_3_0= rulemath_expr ) )
            	    // PsiInternalStateConstraintTransition.g:1924:5: (lv_right_3_0= rulemath_expr )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1924:5: (lv_right_3_0= rulemath_expr )
            	    // PsiInternalStateConstraintTransition.g:1925:6: lv_right_3_0= rulemath_expr
            	    {

            	    						markComposite(elementTypeProvider.getCompare_expr_RightMath_exprParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=rulemath_expr();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompare_expr"


    // $ANTLR start "entryRulemath_expr"
    // PsiInternalStateConstraintTransition.g:1943:1: entryRulemath_expr returns [Boolean current=false] : iv_rulemath_expr= rulemath_expr EOF ;
    public final Boolean entryRulemath_expr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulemath_expr = null;


        try {
            // PsiInternalStateConstraintTransition.g:1943:51: (iv_rulemath_expr= rulemath_expr EOF )
            // PsiInternalStateConstraintTransition.g:1944:2: iv_rulemath_expr= rulemath_expr EOF
            {
             markComposite(elementTypeProvider.getMath_exprElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulemath_expr=rulemath_expr();

            state._fsp--;

             current =iv_rulemath_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemath_expr"


    // $ANTLR start "rulemath_expr"
    // PsiInternalStateConstraintTransition.g:1950:1: rulemath_expr returns [Boolean current=false] : (this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )* ) ;
    public final Boolean rulemath_expr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Boolean this_term_0 = null;

        Boolean lv_right_4_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:1951:1: ( (this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )* ) )
            // PsiInternalStateConstraintTransition.g:1952:2: (this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )* )
            {
            // PsiInternalStateConstraintTransition.g:1952:2: (this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )* )
            // PsiInternalStateConstraintTransition.g:1953:3: this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )*
            {

            			markComposite(elementTypeProvider.getMath_expr_TermParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_39);
            this_term_0=ruleterm();

            state._fsp--;


            			current = this_term_0;
            			doneComposite();
            		
            // PsiInternalStateConstraintTransition.g:1961:3: ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=49 && LA36_0<=50)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:1962:4: () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1962:4: ()
            	    // PsiInternalStateConstraintTransition.g:1963:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getMath_expr_Math_exprLeftAction_1_0ElementType());
            	    					doneComposite();
            	    					associateWithSemanticElement();
            	    				

            	    }

            	    // PsiInternalStateConstraintTransition.g:1969:4: (otherlv_2= '+' | otherlv_3= '*' )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==49) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==50) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // PsiInternalStateConstraintTransition.g:1970:5: otherlv_2= '+'
            	            {

            	            					markLeaf(elementTypeProvider.getMath_expr_PlusSignKeyword_1_1_0ElementType());
            	            				
            	            otherlv_2=(Token)match(input,49,FOLLOW_19); 

            	            					doneLeaf(otherlv_2);
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalStateConstraintTransition.g:1978:5: otherlv_3= '*'
            	            {

            	            					markLeaf(elementTypeProvider.getMath_expr_AsteriskKeyword_1_1_1ElementType());
            	            				
            	            otherlv_3=(Token)match(input,50,FOLLOW_19); 

            	            					doneLeaf(otherlv_3);
            	            				

            	            }
            	            break;

            	    }

            	    // PsiInternalStateConstraintTransition.g:1986:4: ( (lv_right_4_0= ruleterm ) )
            	    // PsiInternalStateConstraintTransition.g:1987:5: (lv_right_4_0= ruleterm )
            	    {
            	    // PsiInternalStateConstraintTransition.g:1987:5: (lv_right_4_0= ruleterm )
            	    // PsiInternalStateConstraintTransition.g:1988:6: lv_right_4_0= ruleterm
            	    {

            	    						markComposite(elementTypeProvider.getMath_expr_RightTermParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_right_4_0=ruleterm();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemath_expr"


    // $ANTLR start "entryRuleterm"
    // PsiInternalStateConstraintTransition.g:2006:1: entryRuleterm returns [Boolean current=false] : iv_ruleterm= ruleterm EOF ;
    public final Boolean entryRuleterm() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleterm = null;


        try {
            // PsiInternalStateConstraintTransition.g:2006:46: (iv_ruleterm= ruleterm EOF )
            // PsiInternalStateConstraintTransition.g:2007:2: iv_ruleterm= ruleterm EOF
            {
             markComposite(elementTypeProvider.getTermElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // PsiInternalStateConstraintTransition.g:2013:1: ruleterm returns [Boolean current=false] : ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final Boolean ruleterm() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean this_Constraint_1 = null;

        Boolean lv_Constraint_5_0 = null;

        Boolean this_Atomic_6 = null;


        try {
            // PsiInternalStateConstraintTransition.g:2014:1: ( ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) ) | this_Atomic_6= ruleAtomic ) )
            // PsiInternalStateConstraintTransition.g:2015:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // PsiInternalStateConstraintTransition.g:2015:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) ) | this_Atomic_6= ruleAtomic )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt37=1;
                }
                break;
            case 53:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 35:
            case 59:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:2016:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    {
                    // PsiInternalStateConstraintTransition.g:2016:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    // PsiInternalStateConstraintTransition.g:2017:4: otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')'
                    {

                    				markLeaf(elementTypeProvider.getTerm_LeftParenthesisKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,51,FOLLOW_37); 

                    				doneLeaf(otherlv_0);
                    			

                    				markComposite(elementTypeProvider.getTerm_ConstraintParserRuleCall_0_1ElementType());
                    			
                    pushFollow(FOLLOW_40);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;


                    				current = this_Constraint_1;
                    				doneComposite();
                    			

                    				markLeaf(elementTypeProvider.getTerm_RightParenthesisKeyword_0_2ElementType());
                    			
                    otherlv_2=(Token)match(input,52,FOLLOW_2); 

                    				doneLeaf(otherlv_2);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:2041:3: ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) )
                    {
                    // PsiInternalStateConstraintTransition.g:2041:3: ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) )
                    // PsiInternalStateConstraintTransition.g:2042:4: () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) )
                    {
                    // PsiInternalStateConstraintTransition.g:2042:4: ()
                    // PsiInternalStateConstraintTransition.g:2043:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerm_NotAction_1_0ElementType());
                    					doneComposite();
                    					associateWithSemanticElement();
                    				

                    }


                    				markLeaf(elementTypeProvider.getTerm_NotKeyword_1_1ElementType());
                    			
                    otherlv_4=(Token)match(input,53,FOLLOW_19); 

                    				doneLeaf(otherlv_4);
                    			
                    // PsiInternalStateConstraintTransition.g:2056:4: ( (lv_Constraint_5_0= ruleterm ) )
                    // PsiInternalStateConstraintTransition.g:2057:5: (lv_Constraint_5_0= ruleterm )
                    {
                    // PsiInternalStateConstraintTransition.g:2057:5: (lv_Constraint_5_0= ruleterm )
                    // PsiInternalStateConstraintTransition.g:2058:6: lv_Constraint_5_0= ruleterm
                    {

                    						markComposite(elementTypeProvider.getTerm_ConstraintTermParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Constraint_5_0=ruleterm();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalStateConstraintTransition.g:2073:3: this_Atomic_6= ruleAtomic
                    {

                    			markComposite(elementTypeProvider.getTerm_AtomicParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_6;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRuleAtomic"
    // PsiInternalStateConstraintTransition.g:2085:1: entryRuleAtomic returns [Boolean current=false] : iv_ruleAtomic= ruleAtomic EOF ;
    public final Boolean entryRuleAtomic() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAtomic = null;


        try {
            // PsiInternalStateConstraintTransition.g:2085:48: (iv_ruleAtomic= ruleAtomic EOF )
            // PsiInternalStateConstraintTransition.g:2086:2: iv_ruleAtomic= ruleAtomic EOF
            {
             markComposite(elementTypeProvider.getAtomicElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // PsiInternalStateConstraintTransition.g:2092:1: ruleAtomic returns [Boolean current=false] : ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (lv_value_3_0= ruleVariableName ) ) ) | ( () ( (lv_value_5_0= rulestrings ) ) ) ) ;
    public final Boolean ruleAtomic() throws RecognitionException {
        Boolean current = false;

        Boolean lv_value_1_0 = null;

        Boolean lv_value_3_0 = null;

        Boolean lv_value_5_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:2093:1: ( ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (lv_value_3_0= ruleVariableName ) ) ) | ( () ( (lv_value_5_0= rulestrings ) ) ) ) )
            // PsiInternalStateConstraintTransition.g:2094:2: ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (lv_value_3_0= ruleVariableName ) ) ) | ( () ( (lv_value_5_0= rulestrings ) ) ) )
            {
            // PsiInternalStateConstraintTransition.g:2094:2: ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (lv_value_3_0= ruleVariableName ) ) ) | ( () ( (lv_value_5_0= rulestrings ) ) ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 35:
            case 59:
                {
                alt38=1;
                }
                break;
            case RULE_ID:
                {
                alt38=2;
                }
                break;
            case RULE_STRING:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:2095:3: ( () ( (lv_value_1_0= ruleConstant ) ) )
                    {
                    // PsiInternalStateConstraintTransition.g:2095:3: ( () ( (lv_value_1_0= ruleConstant ) ) )
                    // PsiInternalStateConstraintTransition.g:2096:4: () ( (lv_value_1_0= ruleConstant ) )
                    {
                    // PsiInternalStateConstraintTransition.g:2096:4: ()
                    // PsiInternalStateConstraintTransition.g:2097:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAtomic_ConstantAction_0_0ElementType());
                    					doneComposite();
                    					associateWithSemanticElement();
                    				

                    }

                    // PsiInternalStateConstraintTransition.g:2103:4: ( (lv_value_1_0= ruleConstant ) )
                    // PsiInternalStateConstraintTransition.g:2104:5: (lv_value_1_0= ruleConstant )
                    {
                    // PsiInternalStateConstraintTransition.g:2104:5: (lv_value_1_0= ruleConstant )
                    // PsiInternalStateConstraintTransition.g:2105:6: lv_value_1_0= ruleConstant
                    {

                    						markComposite(elementTypeProvider.getAtomic_ValueConstantParserRuleCall_0_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleConstant();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:2120:3: ( () ( (lv_value_3_0= ruleVariableName ) ) )
                    {
                    // PsiInternalStateConstraintTransition.g:2120:3: ( () ( (lv_value_3_0= ruleVariableName ) ) )
                    // PsiInternalStateConstraintTransition.g:2121:4: () ( (lv_value_3_0= ruleVariableName ) )
                    {
                    // PsiInternalStateConstraintTransition.g:2121:4: ()
                    // PsiInternalStateConstraintTransition.g:2122:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAtomic_VarAction_1_0ElementType());
                    					doneComposite();
                    					associateWithSemanticElement();
                    				

                    }

                    // PsiInternalStateConstraintTransition.g:2128:4: ( (lv_value_3_0= ruleVariableName ) )
                    // PsiInternalStateConstraintTransition.g:2129:5: (lv_value_3_0= ruleVariableName )
                    {
                    // PsiInternalStateConstraintTransition.g:2129:5: (lv_value_3_0= ruleVariableName )
                    // PsiInternalStateConstraintTransition.g:2130:6: lv_value_3_0= ruleVariableName
                    {

                    						markComposite(elementTypeProvider.getAtomic_ValueVariableNameParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleVariableName();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalStateConstraintTransition.g:2145:3: ( () ( (lv_value_5_0= rulestrings ) ) )
                    {
                    // PsiInternalStateConstraintTransition.g:2145:3: ( () ( (lv_value_5_0= rulestrings ) ) )
                    // PsiInternalStateConstraintTransition.g:2146:4: () ( (lv_value_5_0= rulestrings ) )
                    {
                    // PsiInternalStateConstraintTransition.g:2146:4: ()
                    // PsiInternalStateConstraintTransition.g:2147:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAtomic_StringAction_2_0ElementType());
                    					doneComposite();
                    					associateWithSemanticElement();
                    				

                    }

                    // PsiInternalStateConstraintTransition.g:2153:4: ( (lv_value_5_0= rulestrings ) )
                    // PsiInternalStateConstraintTransition.g:2154:5: (lv_value_5_0= rulestrings )
                    {
                    // PsiInternalStateConstraintTransition.g:2154:5: (lv_value_5_0= rulestrings )
                    // PsiInternalStateConstraintTransition.g:2155:6: lv_value_5_0= rulestrings
                    {

                    						markComposite(elementTypeProvider.getAtomic_ValueStringsParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=rulestrings();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleVariableName"
    // PsiInternalStateConstraintTransition.g:2173:1: entryRuleVariableName returns [Boolean current=false] : iv_ruleVariableName= ruleVariableName EOF ;
    public final Boolean entryRuleVariableName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleVariableName = null;


        try {
            // PsiInternalStateConstraintTransition.g:2173:54: (iv_ruleVariableName= ruleVariableName EOF )
            // PsiInternalStateConstraintTransition.g:2174:2: iv_ruleVariableName= ruleVariableName EOF
            {
             markComposite(elementTypeProvider.getVariableNameElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // PsiInternalStateConstraintTransition.g:2180:1: ruleVariableName returns [Boolean current=false] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )? ) ;
    public final Boolean ruleVariableName() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_instance_2_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:2181:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )? ) )
            // PsiInternalStateConstraintTransition.g:2182:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )? )
            {
            // PsiInternalStateConstraintTransition.g:2182:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )? )
            // PsiInternalStateConstraintTransition.g:2183:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )?
            {
            // PsiInternalStateConstraintTransition.g:2183:3: ( (otherlv_0= RULE_ID ) )
            // PsiInternalStateConstraintTransition.g:2184:4: (otherlv_0= RULE_ID )
            {
            // PsiInternalStateConstraintTransition.g:2184:4: (otherlv_0= RULE_ID )
            // PsiInternalStateConstraintTransition.g:2185:5: otherlv_0= RULE_ID
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markLeaf(elementTypeProvider.getVariableName_NameVariableCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					doneLeaf(otherlv_0);
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:2200:3: (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:2201:4: otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']'
                    {

                    				markLeaf(elementTypeProvider.getVariableName_LeftSquareBracketKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_13); 

                    				doneLeaf(otherlv_1);
                    			
                    // PsiInternalStateConstraintTransition.g:2208:4: ( (lv_instance_2_0= ruleIntValue ) )
                    // PsiInternalStateConstraintTransition.g:2209:5: (lv_instance_2_0= ruleIntValue )
                    {
                    // PsiInternalStateConstraintTransition.g:2209:5: (lv_instance_2_0= ruleIntValue )
                    // PsiInternalStateConstraintTransition.g:2210:6: lv_instance_2_0= ruleIntValue
                    {

                    						markComposite(elementTypeProvider.getVariableName_InstanceIntValueParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FOLLOW_15);
                    lv_instance_2_0=ruleIntValue();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getVariableName_RightSquareBracketKeyword_1_2ElementType());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				doneLeaf(otherlv_3);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleGlobalConstraint"
    // PsiInternalStateConstraintTransition.g:2235:1: entryRuleGlobalConstraint returns [Boolean current=false] : iv_ruleGlobalConstraint= ruleGlobalConstraint EOF ;
    public final Boolean entryRuleGlobalConstraint() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleGlobalConstraint = null;


        try {
            // PsiInternalStateConstraintTransition.g:2235:58: (iv_ruleGlobalConstraint= ruleGlobalConstraint EOF )
            // PsiInternalStateConstraintTransition.g:2236:2: iv_ruleGlobalConstraint= ruleGlobalConstraint EOF
            {
             markComposite(elementTypeProvider.getGlobalConstraintElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalConstraint=ruleGlobalConstraint();

            state._fsp--;

             current =iv_ruleGlobalConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalConstraint"


    // $ANTLR start "ruleGlobalConstraint"
    // PsiInternalStateConstraintTransition.g:2242:1: ruleGlobalConstraint returns [Boolean current=false] : (this_group_valuation_0= rulegroup_valuation | this_group_most_least_1= rulegroup_most_least | this_Max_Min_2= ruleMax_Min ) ;
    public final Boolean ruleGlobalConstraint() throws RecognitionException {
        Boolean current = false;

        Boolean this_group_valuation_0 = null;

        Boolean this_group_most_least_1 = null;

        Boolean this_Max_Min_2 = null;


        try {
            // PsiInternalStateConstraintTransition.g:2243:1: ( (this_group_valuation_0= rulegroup_valuation | this_group_most_least_1= rulegroup_most_least | this_Max_Min_2= ruleMax_Min ) )
            // PsiInternalStateConstraintTransition.g:2244:2: (this_group_valuation_0= rulegroup_valuation | this_group_most_least_1= rulegroup_most_least | this_Max_Min_2= ruleMax_Min )
            {
            // PsiInternalStateConstraintTransition.g:2244:2: (this_group_valuation_0= rulegroup_valuation | this_group_most_least_1= rulegroup_most_least | this_Max_Min_2= ruleMax_Min )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt40=1;
                }
                break;
            case 54:
            case 55:
                {
                alt40=2;
                }
                break;
            case 57:
            case 58:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:2245:3: this_group_valuation_0= rulegroup_valuation
                    {

                    			markComposite(elementTypeProvider.getGlobalConstraint_Group_valuationParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_group_valuation_0=rulegroup_valuation();

                    state._fsp--;


                    			current = this_group_valuation_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:2254:3: this_group_most_least_1= rulegroup_most_least
                    {

                    			markComposite(elementTypeProvider.getGlobalConstraint_Group_most_leastParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_group_most_least_1=rulegroup_most_least();

                    state._fsp--;


                    			current = this_group_most_least_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalStateConstraintTransition.g:2263:3: this_Max_Min_2= ruleMax_Min
                    {

                    			markComposite(elementTypeProvider.getGlobalConstraint_Max_MinParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Max_Min_2=ruleMax_Min();

                    state._fsp--;


                    			current = this_Max_Min_2;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalConstraint"


    // $ANTLR start "entryRulegroup_most_least"
    // PsiInternalStateConstraintTransition.g:2275:1: entryRulegroup_most_least returns [Boolean current=false] : iv_rulegroup_most_least= rulegroup_most_least EOF ;
    public final Boolean entryRulegroup_most_least() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulegroup_most_least = null;


        try {
            // PsiInternalStateConstraintTransition.g:2275:58: (iv_rulegroup_most_least= rulegroup_most_least EOF )
            // PsiInternalStateConstraintTransition.g:2276:2: iv_rulegroup_most_least= rulegroup_most_least EOF
            {
             markComposite(elementTypeProvider.getGroup_most_leastElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulegroup_most_least=rulegroup_most_least();

            state._fsp--;

             current =iv_rulegroup_most_least; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup_most_least"


    // $ANTLR start "rulegroup_most_least"
    // PsiInternalStateConstraintTransition.g:2282:1: rulegroup_most_least returns [Boolean current=false] : ( (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')' ) ;
    public final Boolean rulegroup_most_least() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Boolean lv_instances_2_0 = null;

        Boolean lv_variables_4_0 = null;

        Boolean lv_atomic_7_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:2283:1: ( ( (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')' ) )
            // PsiInternalStateConstraintTransition.g:2284:2: ( (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')' )
            {
            // PsiInternalStateConstraintTransition.g:2284:2: ( (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')' )
            // PsiInternalStateConstraintTransition.g:2285:3: (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')'
            {
            // PsiInternalStateConstraintTransition.g:2285:3: (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            else if ( (LA41_0==55) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:2286:4: otherlv_0= 'at_least('
                    {

                    				markLeaf(elementTypeProvider.getGroup_most_least_At_leastKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,54,FOLLOW_13); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:2294:4: otherlv_1= 'at_most('
                    {

                    				markLeaf(elementTypeProvider.getGroup_most_least_At_mostKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,55,FOLLOW_13); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:2302:3: ( (lv_instances_2_0= ruleIntValue ) )
            // PsiInternalStateConstraintTransition.g:2303:4: (lv_instances_2_0= ruleIntValue )
            {
            // PsiInternalStateConstraintTransition.g:2303:4: (lv_instances_2_0= ruleIntValue )
            // PsiInternalStateConstraintTransition.g:2304:5: lv_instances_2_0= ruleIntValue
            {

            					markComposite(elementTypeProvider.getGroup_most_least_InstancesIntValueParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_14);
            lv_instances_2_0=ruleIntValue();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getGroup_most_least_CommaKeyword_2ElementType());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_42); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalStateConstraintTransition.g:2324:3: ( (lv_variables_4_0= rulevarEnumeration ) )
            // PsiInternalStateConstraintTransition.g:2325:4: (lv_variables_4_0= rulevarEnumeration )
            {
            // PsiInternalStateConstraintTransition.g:2325:4: (lv_variables_4_0= rulevarEnumeration )
            // PsiInternalStateConstraintTransition.g:2326:5: lv_variables_4_0= rulevarEnumeration
            {

            					markComposite(elementTypeProvider.getGroup_most_least_VariablesVarEnumerationParserRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_15);
            lv_variables_4_0=rulevarEnumeration();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getGroup_most_least_RightSquareBracketKeyword_4ElementType());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			doneLeaf(otherlv_5);
            		

            			markLeaf(elementTypeProvider.getGroup_most_least_CommaKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_19); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalStateConstraintTransition.g:2353:3: ( (lv_atomic_7_0= ruleAtomic ) )
            // PsiInternalStateConstraintTransition.g:2354:4: (lv_atomic_7_0= ruleAtomic )
            {
            // PsiInternalStateConstraintTransition.g:2354:4: (lv_atomic_7_0= ruleAtomic )
            // PsiInternalStateConstraintTransition.g:2355:5: lv_atomic_7_0= ruleAtomic
            {

            					markComposite(elementTypeProvider.getGroup_most_least_AtomicAtomicParserRuleCall_6_0ElementType());
            				
            pushFollow(FOLLOW_40);
            lv_atomic_7_0=ruleAtomic();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getGroup_most_least_RightParenthesisKeyword_7ElementType());
            		
            otherlv_8=(Token)match(input,52,FOLLOW_2); 

            			doneLeaf(otherlv_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegroup_most_least"


    // $ANTLR start "entryRulegroup_valuation"
    // PsiInternalStateConstraintTransition.g:2379:1: entryRulegroup_valuation returns [Boolean current=false] : iv_rulegroup_valuation= rulegroup_valuation EOF ;
    public final Boolean entryRulegroup_valuation() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulegroup_valuation = null;


        try {
            // PsiInternalStateConstraintTransition.g:2379:57: (iv_rulegroup_valuation= rulegroup_valuation EOF )
            // PsiInternalStateConstraintTransition.g:2380:2: iv_rulegroup_valuation= rulegroup_valuation EOF
            {
             markComposite(elementTypeProvider.getGroup_valuationElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulegroup_valuation=rulegroup_valuation();

            state._fsp--;

             current =iv_rulegroup_valuation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup_valuation"


    // $ANTLR start "rulegroup_valuation"
    // PsiInternalStateConstraintTransition.g:2386:1: rulegroup_valuation returns [Boolean current=false] : (otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')' ) ;
    public final Boolean rulegroup_valuation() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Boolean lv_var_1_0 = null;

        Boolean lv_atomic_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:2387:1: ( (otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')' ) )
            // PsiInternalStateConstraintTransition.g:2388:2: (otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')' )
            {
            // PsiInternalStateConstraintTransition.g:2388:2: (otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')' )
            // PsiInternalStateConstraintTransition.g:2389:3: otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')'
            {

            			markLeaf(elementTypeProvider.getGroup_valuation_All_equalKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,56,FOLLOW_42); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalStateConstraintTransition.g:2396:3: ( (lv_var_1_0= rulevarEnumeration ) )
            // PsiInternalStateConstraintTransition.g:2397:4: (lv_var_1_0= rulevarEnumeration )
            {
            // PsiInternalStateConstraintTransition.g:2397:4: (lv_var_1_0= rulevarEnumeration )
            // PsiInternalStateConstraintTransition.g:2398:5: lv_var_1_0= rulevarEnumeration
            {

            					markComposite(elementTypeProvider.getGroup_valuation_VarVarEnumerationParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_14);
            lv_var_1_0=rulevarEnumeration();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getGroup_valuation_CommaKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_19); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalStateConstraintTransition.g:2418:3: ( (lv_atomic_3_0= ruleAtomic ) )
            // PsiInternalStateConstraintTransition.g:2419:4: (lv_atomic_3_0= ruleAtomic )
            {
            // PsiInternalStateConstraintTransition.g:2419:4: (lv_atomic_3_0= ruleAtomic )
            // PsiInternalStateConstraintTransition.g:2420:5: lv_atomic_3_0= ruleAtomic
            {

            					markComposite(elementTypeProvider.getGroup_valuation_AtomicAtomicParserRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_15);
            lv_atomic_3_0=ruleAtomic();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getGroup_valuation_RightSquareBracketKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_40); 

            			doneLeaf(otherlv_4);
            		

            			markLeaf(elementTypeProvider.getGroup_valuation_RightParenthesisKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,52,FOLLOW_2); 

            			doneLeaf(otherlv_5);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegroup_valuation"


    // $ANTLR start "entryRuleMax_Min"
    // PsiInternalStateConstraintTransition.g:2451:1: entryRuleMax_Min returns [Boolean current=false] : iv_ruleMax_Min= ruleMax_Min EOF ;
    public final Boolean entryRuleMax_Min() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMax_Min = null;


        try {
            // PsiInternalStateConstraintTransition.g:2451:49: (iv_ruleMax_Min= ruleMax_Min EOF )
            // PsiInternalStateConstraintTransition.g:2452:2: iv_ruleMax_Min= ruleMax_Min EOF
            {
             markComposite(elementTypeProvider.getMax_MinElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleMax_Min=ruleMax_Min();

            state._fsp--;

             current =iv_ruleMax_Min; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMax_Min"


    // $ANTLR start "ruleMax_Min"
    // PsiInternalStateConstraintTransition.g:2458:1: ruleMax_Min returns [Boolean current=false] : ( (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')' ) ;
    public final Boolean ruleMax_Min() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Boolean lv_var_2_0 = null;

        Boolean lv_var_4_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:2459:1: ( ( (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')' ) )
            // PsiInternalStateConstraintTransition.g:2460:2: ( (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')' )
            {
            // PsiInternalStateConstraintTransition.g:2460:2: ( (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')' )
            // PsiInternalStateConstraintTransition.g:2461:3: (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')'
            {
            // PsiInternalStateConstraintTransition.g:2461:3: (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            else if ( (LA42_0==58) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:2462:4: otherlv_0= 'maximum('
                    {

                    				markLeaf(elementTypeProvider.getMax_Min_MaximumKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,57,FOLLOW_3); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:2470:4: otherlv_1= 'minimum('
                    {

                    				markLeaf(elementTypeProvider.getMax_Min_MinimumKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,58,FOLLOW_3); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalStateConstraintTransition.g:2478:3: ( (lv_var_2_0= ruleVariableName ) )
            // PsiInternalStateConstraintTransition.g:2479:4: (lv_var_2_0= ruleVariableName )
            {
            // PsiInternalStateConstraintTransition.g:2479:4: (lv_var_2_0= ruleVariableName )
            // PsiInternalStateConstraintTransition.g:2480:5: lv_var_2_0= ruleVariableName
            {

            					markComposite(elementTypeProvider.getMax_Min_VarVariableNameParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_14);
            lv_var_2_0=ruleVariableName();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getMax_Min_CommaKeyword_2ElementType());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_42); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalStateConstraintTransition.g:2500:3: ( (lv_var_4_0= rulevarEnumeration ) )
            // PsiInternalStateConstraintTransition.g:2501:4: (lv_var_4_0= rulevarEnumeration )
            {
            // PsiInternalStateConstraintTransition.g:2501:4: (lv_var_4_0= rulevarEnumeration )
            // PsiInternalStateConstraintTransition.g:2502:5: lv_var_4_0= rulevarEnumeration
            {

            					markComposite(elementTypeProvider.getMax_Min_VarVarEnumerationParserRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_15);
            lv_var_4_0=rulevarEnumeration();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getMax_Min_RightSquareBracketKeyword_4ElementType());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_40); 

            			doneLeaf(otherlv_5);
            		

            			markLeaf(elementTypeProvider.getMax_Min_RightParenthesisKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,52,FOLLOW_2); 

            			doneLeaf(otherlv_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMax_Min"


    // $ANTLR start "entryRulevarEnumeration"
    // PsiInternalStateConstraintTransition.g:2533:1: entryRulevarEnumeration returns [Boolean current=false] : iv_rulevarEnumeration= rulevarEnumeration EOF ;
    public final Boolean entryRulevarEnumeration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulevarEnumeration = null;


        try {
            // PsiInternalStateConstraintTransition.g:2533:56: (iv_rulevarEnumeration= rulevarEnumeration EOF )
            // PsiInternalStateConstraintTransition.g:2534:2: iv_rulevarEnumeration= rulevarEnumeration EOF
            {
             markComposite(elementTypeProvider.getVarEnumerationElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulevarEnumeration=rulevarEnumeration();

            state._fsp--;

             current =iv_rulevarEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevarEnumeration"


    // $ANTLR start "rulevarEnumeration"
    // PsiInternalStateConstraintTransition.g:2540:1: rulevarEnumeration returns [Boolean current=false] : (otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+ ) ;
    public final Boolean rulevarEnumeration() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Boolean lv_varName_1_0 = null;

        Boolean lv_varName_3_0 = null;


        try {
            // PsiInternalStateConstraintTransition.g:2541:1: ( (otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+ ) )
            // PsiInternalStateConstraintTransition.g:2542:2: (otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+ )
            {
            // PsiInternalStateConstraintTransition.g:2542:2: (otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+ )
            // PsiInternalStateConstraintTransition.g:2543:3: otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+
            {

            			markLeaf(elementTypeProvider.getVarEnumeration_LeftSquareBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalStateConstraintTransition.g:2550:3: ( (lv_varName_1_0= ruleVariableName ) )
            // PsiInternalStateConstraintTransition.g:2551:4: (lv_varName_1_0= ruleVariableName )
            {
            // PsiInternalStateConstraintTransition.g:2551:4: (lv_varName_1_0= ruleVariableName )
            // PsiInternalStateConstraintTransition.g:2552:5: lv_varName_1_0= ruleVariableName
            {

            					markComposite(elementTypeProvider.getVarEnumeration_VarNameVariableNameParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_14);
            lv_varName_1_0=ruleVariableName();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalStateConstraintTransition.g:2565:3: (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:2566:4: otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) )
            	    {

            	    				markLeaf(elementTypeProvider.getVarEnumeration_CommaKeyword_2_0ElementType());
            	    			
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalStateConstraintTransition.g:2573:4: ( (lv_varName_3_0= ruleVariableName ) )
            	    // PsiInternalStateConstraintTransition.g:2574:5: (lv_varName_3_0= ruleVariableName )
            	    {
            	    // PsiInternalStateConstraintTransition.g:2574:5: (lv_varName_3_0= ruleVariableName )
            	    // PsiInternalStateConstraintTransition.g:2575:6: lv_varName_3_0= ruleVariableName
            	    {

            	    						markComposite(elementTypeProvider.getVarEnumeration_VarNameVariableNameParserRuleCall_2_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_varName_3_0=ruleVariableName();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevarEnumeration"


    // $ANTLR start "entryRuleFQN"
    // PsiInternalStateConstraintTransition.g:2593:1: entryRuleFQN returns [Boolean current=false] : iv_ruleFQN= ruleFQN EOF ;
    public final Boolean entryRuleFQN() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFQN = null;


        try {
            // PsiInternalStateConstraintTransition.g:2593:45: (iv_ruleFQN= ruleFQN EOF )
            // PsiInternalStateConstraintTransition.g:2594:2: iv_ruleFQN= ruleFQN EOF
            {
             markComposite(elementTypeProvider.getFQNElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // PsiInternalStateConstraintTransition.g:2600:1: ruleFQN returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleFQN() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalStateConstraintTransition.g:2601:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalStateConstraintTransition.g:2602:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalStateConstraintTransition.g:2602:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalStateConstraintTransition.g:2603:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getFQN_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalStateConstraintTransition.g:2610:3: (kw= '.' this_ID_2= RULE_ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==21) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // PsiInternalStateConstraintTransition.g:2611:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getFQN_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,21,FOLLOW_3); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getFQN_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_44); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleIntValue"
    // PsiInternalStateConstraintTransition.g:2630:1: entryRuleIntValue returns [Boolean current=false] : iv_ruleIntValue= ruleIntValue EOF ;
    public final Boolean entryRuleIntValue() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIntValue = null;


        try {
            // PsiInternalStateConstraintTransition.g:2630:50: (iv_ruleIntValue= ruleIntValue EOF )
            // PsiInternalStateConstraintTransition.g:2631:2: iv_ruleIntValue= ruleIntValue EOF
            {
             markComposite(elementTypeProvider.getIntValueElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // PsiInternalStateConstraintTransition.g:2637:1: ruleIntValue returns [Boolean current=false] : (this_INT_0= RULE_INT | kw= '0' | kw= '1' ) ;
    public final Boolean ruleIntValue() throws RecognitionException {
        Boolean current = false;

        Token this_INT_0=null;
        Token kw=null;

        try {
            // PsiInternalStateConstraintTransition.g:2638:1: ( (this_INT_0= RULE_INT | kw= '0' | kw= '1' ) )
            // PsiInternalStateConstraintTransition.g:2639:2: (this_INT_0= RULE_INT | kw= '0' | kw= '1' )
            {
            // PsiInternalStateConstraintTransition.g:2639:2: (this_INT_0= RULE_INT | kw= '0' | kw= '1' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt45=1;
                }
                break;
            case 59:
                {
                alt45=2;
                }
                break;
            case 35:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:2640:3: this_INT_0= RULE_INT
                    {

                    			markLeaf(elementTypeProvider.getIntValue_INTTerminalRuleCall_0ElementType());
                    		
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			doneLeaf(this_INT_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:2648:3: kw= '0'
                    {

                    			markLeaf(elementTypeProvider.getIntValue_DigitZeroKeyword_1ElementType());
                    		
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalStateConstraintTransition.g:2656:3: kw= '1'
                    {

                    			markLeaf(elementTypeProvider.getIntValue_DigitOneKeyword_2ElementType());
                    		
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleConstant"
    // PsiInternalStateConstraintTransition.g:2667:1: entryRuleConstant returns [Boolean current=false] : iv_ruleConstant= ruleConstant EOF ;
    public final Boolean entryRuleConstant() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConstant = null;


        try {
            // PsiInternalStateConstraintTransition.g:2667:50: (iv_ruleConstant= ruleConstant EOF )
            // PsiInternalStateConstraintTransition.g:2668:2: iv_ruleConstant= ruleConstant EOF
            {
             markComposite(elementTypeProvider.getConstantElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // PsiInternalStateConstraintTransition.g:2674:1: ruleConstant returns [Boolean current=false] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '0' | kw= '1' ) ) ;
    public final Boolean ruleConstant() throws RecognitionException {
        Boolean current = false;

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;

        try {
            // PsiInternalStateConstraintTransition.g:2675:1: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '0' | kw= '1' ) ) )
            // PsiInternalStateConstraintTransition.g:2676:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '0' | kw= '1' ) )
            {
            // PsiInternalStateConstraintTransition.g:2676:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '0' | kw= '1' ) )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==EOF||(LA47_1>=RULE_ID && LA47_1<=RULE_INT)||LA47_1==20||(LA47_1>=25 && LA47_1<=26)||LA47_1==28||(LA47_1>=30 && LA47_1<=36)||(LA47_1>=39 && LA47_1<=59)) ) {
                    alt47=1;
                }
                else if ( (LA47_1==21) ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==35||LA47_0==59) ) {
                alt47=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // PsiInternalStateConstraintTransition.g:2677:3: this_INT_0= RULE_INT
                    {

                    			markLeaf(elementTypeProvider.getConstant_INTTerminalRuleCall_0ElementType());
                    		
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			doneLeaf(this_INT_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalStateConstraintTransition.g:2685:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // PsiInternalStateConstraintTransition.g:2685:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // PsiInternalStateConstraintTransition.g:2686:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {

                    				markLeaf(elementTypeProvider.getConstant_INTTerminalRuleCall_1_0ElementType());
                    			
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_16); 

                    				doneLeaf(this_INT_1);
                    			

                    				markLeaf(elementTypeProvider.getConstant_FullStopKeyword_1_1ElementType());
                    			
                    kw=(Token)match(input,21,FOLLOW_45); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getConstant_INTTerminalRuleCall_1_2ElementType());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				doneLeaf(this_INT_3);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalStateConstraintTransition.g:2709:3: (kw= '0' | kw= '1' )
                    {
                    // PsiInternalStateConstraintTransition.g:2709:3: (kw= '0' | kw= '1' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==59) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==35) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // PsiInternalStateConstraintTransition.g:2710:4: kw= '0'
                            {

                            				markLeaf(elementTypeProvider.getConstant_DigitZeroKeyword_2_0ElementType());
                            			
                            kw=(Token)match(input,59,FOLLOW_2); 

                            				doneLeaf(kw);
                            			

                            }
                            break;
                        case 2 :
                            // PsiInternalStateConstraintTransition.g:2718:4: kw= '1'
                            {

                            				markLeaf(elementTypeProvider.getConstant_DigitOneKeyword_2_1ElementType());
                            			
                            kw=(Token)match(input,35,FOLLOW_2); 

                            				doneLeaf(kw);
                            			

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"

    // Delegated rules


    protected DFA43 dfa43 = new DFA43(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\2\uffff\1\6\7\uffff\1\12";
    static final String dfa_3s = "\1\23\1\uffff\1\4\1\22\1\6\1\23\1\uffff\3\24\1\uffff\1\23";
    static final String dfa_4s = "\1\24\1\uffff\1\73\1\24\1\73\1\64\1\uffff\3\24\1\uffff\1\24";
    static final String dfa_5s = "\1\uffff\1\2\4\uffff\1\1\3\uffff\1\1\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1",
            "",
            "\1\3\2\1\34\uffff\1\1\27\uffff\1\1",
            "\1\4\1\6\1\5",
            "\1\7\34\uffff\1\11\27\uffff\1\10",
            "\1\6\40\uffff\1\12",
            "",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "\1\6\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 2565:3: (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0FE801180003C070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0FE8011800000070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0FE80118D2000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000D2000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0800000800000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0828000800000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0FE8000B04000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0FE8019800000070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0FE800080003C070L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0FE8000800000072L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0FE8000800000070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001F00400000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});

}