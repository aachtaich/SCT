package org.xtext.example.stateconstrainttransition.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.stateconstrainttransition.services.StateConstraintTransitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateConstraintTransitionParser extends AbstractInternalAntlrParser {
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


        public InternalStateConstraintTransitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateConstraintTransitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateConstraintTransitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateConstraintTransition.g"; }



     	private StateConstraintTransitionGrammarAccess grammarAccess;

        public InternalStateConstraintTransitionParser(TokenStream input, StateConstraintTransitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected StateConstraintTransitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalStateConstraintTransition.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalStateConstraintTransition.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalStateConstraintTransition.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalStateConstraintTransition.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_variable_2_0 = null;

        EObject lv_flexConstraints_3_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_transition_5_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:77:2: ( (otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+ ) )
            // InternalStateConstraintTransition.g:78:2: (otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+ )
            {
            // InternalStateConstraintTransition.g:78:2: (otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+ )
            // InternalStateConstraintTransition.g:79:3: otherlv_0= 'stateMachine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variable_2_0= ruleVariable ) )+ ( (lv_flexConstraints_3_0= ruleConstraint ) )* ( (lv_state_4_0= ruleState ) )+ ( (lv_transition_5_0= ruleTransition ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getStateMachineKeyword_0());
            		
            // InternalStateConstraintTransition.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateConstraintTransition.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateConstraintTransition.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalStateConstraintTransition.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateConstraintTransition.g:101:3: ( (lv_variable_2_0= ruleVariable ) )+
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
            	    // InternalStateConstraintTransition.g:102:4: (lv_variable_2_0= ruleVariable )
            	    {
            	    // InternalStateConstraintTransition.g:102:4: (lv_variable_2_0= ruleVariable )
            	    // InternalStateConstraintTransition.g:103:5: lv_variable_2_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVariableVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variable_2_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variable",
            	    						lv_variable_2_0,
            	    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            // InternalStateConstraintTransition.g:120:3: ( (lv_flexConstraints_3_0= ruleConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==35||LA2_0==51||(LA2_0>=53 && LA2_0<=59)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:121:4: (lv_flexConstraints_3_0= ruleConstraint )
            	    {
            	    // InternalStateConstraintTransition.g:121:4: (lv_flexConstraints_3_0= ruleConstraint )
            	    // InternalStateConstraintTransition.g:122:5: lv_flexConstraints_3_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFlexConstraintsConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_flexConstraints_3_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flexConstraints",
            	    						lv_flexConstraints_3_0,
            	    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalStateConstraintTransition.g:139:3: ( (lv_state_4_0= ruleState ) )+
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
            	    // InternalStateConstraintTransition.g:140:4: (lv_state_4_0= ruleState )
            	    {
            	    // InternalStateConstraintTransition.g:140:4: (lv_state_4_0= ruleState )
            	    // InternalStateConstraintTransition.g:141:5: lv_state_4_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStateStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_state_4_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"state",
            	    						lv_state_4_0,
            	    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.State");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            // InternalStateConstraintTransition.g:158:3: ( (lv_transition_5_0= ruleTransition ) )+
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
            	    // InternalStateConstraintTransition.g:159:4: (lv_transition_5_0= ruleTransition )
            	    {
            	    // InternalStateConstraintTransition.g:159:4: (lv_transition_5_0= ruleTransition )
            	    // InternalStateConstraintTransition.g:160:5: lv_transition_5_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTransitionTransitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_transition_5_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transition",
            	    						lv_transition_5_0,
            	    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariable"
    // InternalStateConstraintTransition.g:181:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalStateConstraintTransition.g:181:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalStateConstraintTransition.g:182:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalStateConstraintTransition.g:188:1: ruleVariable returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_context_1_0=null;
        Token lv_inEnumeration_2_0=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_isMultiInstanciated_4_0 = null;

        AntlrDatatypeRuleToken lv_domain_5_0 = null;

        AntlrDatatypeRuleToken lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:194:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )? ) )
            // InternalStateConstraintTransition.g:195:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )? )
            {
            // InternalStateConstraintTransition.g:195:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )? )
            // InternalStateConstraintTransition.g:196:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_context_1_0= 'Param' ) )? ( (lv_inEnumeration_2_0= 'Enum' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_isMultiInstanciated_4_0= rulemultiple ) )? ( (lv_domain_5_0= ruleDomain ) )? ( (lv_values_6_0= ruleEnumeration ) )?
            {
            // InternalStateConstraintTransition.g:196:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalStateConstraintTransition.g:197:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalStateConstraintTransition.g:197:4: (lv_varType_0_0= ruleVarType )
            // InternalStateConstraintTransition.g:198:5: lv_varType_0_0= ruleVarType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVarTypeVarTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_varType_0_0=ruleVarType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"varType",
            						lv_varType_0_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.VarType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateConstraintTransition.g:215:3: ( (lv_context_1_0= 'Param' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateConstraintTransition.g:216:4: (lv_context_1_0= 'Param' )
                    {
                    // InternalStateConstraintTransition.g:216:4: (lv_context_1_0= 'Param' )
                    // InternalStateConstraintTransition.g:217:5: lv_context_1_0= 'Param'
                    {
                    lv_context_1_0=(Token)match(input,12,FOLLOW_10); 

                    					newLeafNode(lv_context_1_0, grammarAccess.getVariableAccess().getContextParamKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "context", lv_context_1_0, "Param");
                    				

                    }


                    }
                    break;

            }

            // InternalStateConstraintTransition.g:229:3: ( (lv_inEnumeration_2_0= 'Enum' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateConstraintTransition.g:230:4: (lv_inEnumeration_2_0= 'Enum' )
                    {
                    // InternalStateConstraintTransition.g:230:4: (lv_inEnumeration_2_0= 'Enum' )
                    // InternalStateConstraintTransition.g:231:5: lv_inEnumeration_2_0= 'Enum'
                    {
                    lv_inEnumeration_2_0=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(lv_inEnumeration_2_0, grammarAccess.getVariableAccess().getInEnumerationEnumKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "inEnumeration", lv_inEnumeration_2_0, "Enum");
                    				

                    }


                    }
                    break;

            }

            // InternalStateConstraintTransition.g:243:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalStateConstraintTransition.g:244:4: (lv_name_3_0= RULE_ID )
            {
            // InternalStateConstraintTransition.g:244:4: (lv_name_3_0= RULE_ID )
            // InternalStateConstraintTransition.g:245:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateConstraintTransition.g:261:3: ( (lv_isMultiInstanciated_4_0= rulemultiple ) )?
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
                    // InternalStateConstraintTransition.g:262:4: (lv_isMultiInstanciated_4_0= rulemultiple )
                    {
                    // InternalStateConstraintTransition.g:262:4: (lv_isMultiInstanciated_4_0= rulemultiple )
                    // InternalStateConstraintTransition.g:263:5: lv_isMultiInstanciated_4_0= rulemultiple
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getIsMultiInstanciatedMultipleParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_isMultiInstanciated_4_0=rulemultiple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"isMultiInstanciated",
                    						lv_isMultiInstanciated_4_0,
                    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.multiple");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalStateConstraintTransition.g:280:3: ( (lv_domain_5_0= ruleDomain ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateConstraintTransition.g:281:4: (lv_domain_5_0= ruleDomain )
                    {
                    // InternalStateConstraintTransition.g:281:4: (lv_domain_5_0= ruleDomain )
                    // InternalStateConstraintTransition.g:282:5: lv_domain_5_0= ruleDomain
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getDomainDomainParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_domain_5_0=ruleDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"domain",
                    						lv_domain_5_0,
                    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Domain");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalStateConstraintTransition.g:299:3: ( (lv_values_6_0= ruleEnumeration ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateConstraintTransition.g:300:4: (lv_values_6_0= ruleEnumeration )
                    {
                    // InternalStateConstraintTransition.g:300:4: (lv_values_6_0= ruleEnumeration )
                    // InternalStateConstraintTransition.g:301:5: lv_values_6_0= ruleEnumeration
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getValuesEnumerationParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_values_6_0=ruleEnumeration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					add(
                    						current,
                    						"values",
                    						lv_values_6_0,
                    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Enumeration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarType"
    // InternalStateConstraintTransition.g:322:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalStateConstraintTransition.g:322:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalStateConstraintTransition.g:323:2: iv_ruleVarType= ruleVarType EOF
            {
             newCompositeNode(grammarAccess.getVarTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;

             current =iv_ruleVarType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalStateConstraintTransition.g:329:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Integer' | kw= 'Float' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStateConstraintTransition.g:335:2: ( (kw= 'String' | kw= 'Integer' | kw= 'Float' | kw= 'Boolean' ) )
            // InternalStateConstraintTransition.g:336:2: (kw= 'String' | kw= 'Integer' | kw= 'Float' | kw= 'Boolean' )
            {
            // InternalStateConstraintTransition.g:336:2: (kw= 'String' | kw= 'Integer' | kw= 'Float' | kw= 'Boolean' )
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
                    // InternalStateConstraintTransition.g:337:3: kw= 'String'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:343:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalStateConstraintTransition.g:349:3: kw= 'Float'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getFloatKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalStateConstraintTransition.g:355:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarTypeAccess().getBooleanKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRulemultiple"
    // InternalStateConstraintTransition.g:364:1: entryRulemultiple returns [EObject current=null] : iv_rulemultiple= rulemultiple EOF ;
    public final EObject entryRulemultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiple = null;


        try {
            // InternalStateConstraintTransition.g:364:49: (iv_rulemultiple= rulemultiple EOF )
            // InternalStateConstraintTransition.g:365:2: iv_rulemultiple= rulemultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemultiple=rulemultiple();

            state._fsp--;

             current =iv_rulemultiple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiple"


    // $ANTLR start "rulemultiple"
    // InternalStateConstraintTransition.g:371:1: rulemultiple returns [EObject current=null] : (otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']' ) ;
    public final EObject rulemultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_minimum_1_0 = null;

        AntlrDatatypeRuleToken lv_maximum_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:377:2: ( (otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']' ) )
            // InternalStateConstraintTransition.g:378:2: (otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']' )
            {
            // InternalStateConstraintTransition.g:378:2: (otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']' )
            // InternalStateConstraintTransition.g:379:3: otherlv_0= '[' ( (lv_minimum_1_0= rulemin ) ) otherlv_2= ',' ( (lv_maximum_3_0= rulemax ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalStateConstraintTransition.g:383:3: ( (lv_minimum_1_0= rulemin ) )
            // InternalStateConstraintTransition.g:384:4: (lv_minimum_1_0= rulemin )
            {
            // InternalStateConstraintTransition.g:384:4: (lv_minimum_1_0= rulemin )
            // InternalStateConstraintTransition.g:385:5: lv_minimum_1_0= rulemin
            {

            					newCompositeNode(grammarAccess.getMultipleAccess().getMinimumMinParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_minimum_1_0=rulemin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultipleRule());
            					}
            					add(
            						current,
            						"minimum",
            						lv_minimum_1_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.min");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getCommaKeyword_2());
            		
            // InternalStateConstraintTransition.g:406:3: ( (lv_maximum_3_0= rulemax ) )
            // InternalStateConstraintTransition.g:407:4: (lv_maximum_3_0= rulemax )
            {
            // InternalStateConstraintTransition.g:407:4: (lv_maximum_3_0= rulemax )
            // InternalStateConstraintTransition.g:408:5: lv_maximum_3_0= rulemax
            {

            					newCompositeNode(grammarAccess.getMultipleAccess().getMaximumMaxParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_maximum_3_0=rulemax();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultipleRule());
            					}
            					add(
            						current,
            						"maximum",
            						lv_maximum_3_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultipleAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiple"


    // $ANTLR start "entryRuleDomain"
    // InternalStateConstraintTransition.g:433:1: entryRuleDomain returns [String current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final String entryRuleDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomain = null;


        try {
            // InternalStateConstraintTransition.g:433:46: (iv_ruleDomain= ruleDomain EOF )
            // InternalStateConstraintTransition.g:434:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalStateConstraintTransition.g:440:1: ruleDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FloatDomain_0= ruleFloatDomain | this_IntDomain_1= ruleIntDomain ) ;
    public final AntlrDatatypeRuleToken ruleDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FloatDomain_0 = null;

        AntlrDatatypeRuleToken this_IntDomain_1 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:446:2: ( (this_FloatDomain_0= ruleFloatDomain | this_IntDomain_1= ruleIntDomain ) )
            // InternalStateConstraintTransition.g:447:2: (this_FloatDomain_0= ruleFloatDomain | this_IntDomain_1= ruleIntDomain )
            {
            // InternalStateConstraintTransition.g:447:2: (this_FloatDomain_0= ruleFloatDomain | this_IntDomain_1= ruleIntDomain )
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
                    // InternalStateConstraintTransition.g:448:3: this_FloatDomain_0= ruleFloatDomain
                    {

                    			newCompositeNode(grammarAccess.getDomainAccess().getFloatDomainParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatDomain_0=ruleFloatDomain();

                    state._fsp--;


                    			current.merge(this_FloatDomain_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:459:3: this_IntDomain_1= ruleIntDomain
                    {

                    			newCompositeNode(grammarAccess.getDomainAccess().getIntDomainParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntDomain_1=ruleIntDomain();

                    state._fsp--;


                    			current.merge(this_IntDomain_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleFloatDomain"
    // InternalStateConstraintTransition.g:473:1: entryRuleFloatDomain returns [String current=null] : iv_ruleFloatDomain= ruleFloatDomain EOF ;
    public final String entryRuleFloatDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatDomain = null;


        try {
            // InternalStateConstraintTransition.g:473:51: (iv_ruleFloatDomain= ruleFloatDomain EOF )
            // InternalStateConstraintTransition.g:474:2: iv_ruleFloatDomain= ruleFloatDomain EOF
            {
             newCompositeNode(grammarAccess.getFloatDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatDomain=ruleFloatDomain();

            state._fsp--;

             current =iv_ruleFloatDomain.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatDomain"


    // $ANTLR start "ruleFloatDomain"
    // InternalStateConstraintTransition.g:480:1: ruleFloatDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_IntValue_1= ruleIntValue kw= '.' this_IntValue_3= ruleIntValue kw= '..' this_IntValue_5= ruleIntValue kw= '.' this_IntValue_7= ruleIntValue kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleFloatDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IntValue_1 = null;

        AntlrDatatypeRuleToken this_IntValue_3 = null;

        AntlrDatatypeRuleToken this_IntValue_5 = null;

        AntlrDatatypeRuleToken this_IntValue_7 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:486:2: ( (kw= '[' this_IntValue_1= ruleIntValue kw= '.' this_IntValue_3= ruleIntValue kw= '..' this_IntValue_5= ruleIntValue kw= '.' this_IntValue_7= ruleIntValue kw= ']' ) )
            // InternalStateConstraintTransition.g:487:2: (kw= '[' this_IntValue_1= ruleIntValue kw= '.' this_IntValue_3= ruleIntValue kw= '..' this_IntValue_5= ruleIntValue kw= '.' this_IntValue_7= ruleIntValue kw= ']' )
            {
            // InternalStateConstraintTransition.g:487:2: (kw= '[' this_IntValue_1= ruleIntValue kw= '.' this_IntValue_3= ruleIntValue kw= '..' this_IntValue_5= ruleIntValue kw= '.' this_IntValue_7= ruleIntValue kw= ']' )
            // InternalStateConstraintTransition.g:488:3: kw= '[' this_IntValue_1= ruleIntValue kw= '.' this_IntValue_3= ruleIntValue kw= '..' this_IntValue_5= ruleIntValue kw= '.' this_IntValue_7= ruleIntValue kw= ']'
            {
            kw=(Token)match(input,18,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatDomainAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFloatDomainAccess().getIntValueParserRuleCall_1());
            		
            pushFollow(FOLLOW_16);
            this_IntValue_1=ruleIntValue();

            state._fsp--;


            			current.merge(this_IntValue_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,21,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatDomainAccess().getFullStopKeyword_2());
            		

            			newCompositeNode(grammarAccess.getFloatDomainAccess().getIntValueParserRuleCall_3());
            		
            pushFollow(FOLLOW_17);
            this_IntValue_3=ruleIntValue();

            state._fsp--;


            			current.merge(this_IntValue_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,22,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatDomainAccess().getFullStopFullStopKeyword_4());
            		

            			newCompositeNode(grammarAccess.getFloatDomainAccess().getIntValueParserRuleCall_5());
            		
            pushFollow(FOLLOW_16);
            this_IntValue_5=ruleIntValue();

            state._fsp--;


            			current.merge(this_IntValue_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,21,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatDomainAccess().getFullStopKeyword_6());
            		

            			newCompositeNode(grammarAccess.getFloatDomainAccess().getIntValueParserRuleCall_7());
            		
            pushFollow(FOLLOW_15);
            this_IntValue_7=ruleIntValue();

            state._fsp--;


            			current.merge(this_IntValue_7);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,20,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatDomainAccess().getRightSquareBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatDomain"


    // $ANTLR start "entryRuleIntDomain"
    // InternalStateConstraintTransition.g:557:1: entryRuleIntDomain returns [String current=null] : iv_ruleIntDomain= ruleIntDomain EOF ;
    public final String entryRuleIntDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntDomain = null;


        try {
            // InternalStateConstraintTransition.g:557:49: (iv_ruleIntDomain= ruleIntDomain EOF )
            // InternalStateConstraintTransition.g:558:2: iv_ruleIntDomain= ruleIntDomain EOF
            {
             newCompositeNode(grammarAccess.getIntDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntDomain=ruleIntDomain();

            state._fsp--;

             current =iv_ruleIntDomain.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntDomain"


    // $ANTLR start "ruleIntDomain"
    // InternalStateConstraintTransition.g:564:1: ruleIntDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_IntValue_1= ruleIntValue kw= '..' this_IntValue_3= ruleIntValue kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleIntDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IntValue_1 = null;

        AntlrDatatypeRuleToken this_IntValue_3 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:570:2: ( (kw= '[' this_IntValue_1= ruleIntValue kw= '..' this_IntValue_3= ruleIntValue kw= ']' ) )
            // InternalStateConstraintTransition.g:571:2: (kw= '[' this_IntValue_1= ruleIntValue kw= '..' this_IntValue_3= ruleIntValue kw= ']' )
            {
            // InternalStateConstraintTransition.g:571:2: (kw= '[' this_IntValue_1= ruleIntValue kw= '..' this_IntValue_3= ruleIntValue kw= ']' )
            // InternalStateConstraintTransition.g:572:3: kw= '[' this_IntValue_1= ruleIntValue kw= '..' this_IntValue_3= ruleIntValue kw= ']'
            {
            kw=(Token)match(input,18,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIntDomainAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getIntDomainAccess().getIntValueParserRuleCall_1());
            		
            pushFollow(FOLLOW_17);
            this_IntValue_1=ruleIntValue();

            state._fsp--;


            			current.merge(this_IntValue_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,22,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIntDomainAccess().getFullStopFullStopKeyword_2());
            		

            			newCompositeNode(grammarAccess.getIntDomainAccess().getIntValueParserRuleCall_3());
            		
            pushFollow(FOLLOW_15);
            this_IntValue_3=ruleIntValue();

            state._fsp--;


            			current.merge(this_IntValue_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,20,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIntDomainAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntDomain"


    // $ANTLR start "entryRuleEnumeration"
    // InternalStateConstraintTransition.g:611:1: entryRuleEnumeration returns [String current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final String entryRuleEnumeration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumeration = null;


        try {
            // InternalStateConstraintTransition.g:611:51: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalStateConstraintTransition.g:612:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalStateConstraintTransition.g:618:1: ruleEnumeration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntEnumeration_0= ruleIntEnumeration | this_StringEnumeration_1= ruleStringEnumeration ) ;
    public final AntlrDatatypeRuleToken ruleEnumeration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntEnumeration_0 = null;

        AntlrDatatypeRuleToken this_StringEnumeration_1 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:624:2: ( (this_IntEnumeration_0= ruleIntEnumeration | this_StringEnumeration_1= ruleStringEnumeration ) )
            // InternalStateConstraintTransition.g:625:2: (this_IntEnumeration_0= ruleIntEnumeration | this_StringEnumeration_1= ruleStringEnumeration )
            {
            // InternalStateConstraintTransition.g:625:2: (this_IntEnumeration_0= ruleIntEnumeration | this_StringEnumeration_1= ruleStringEnumeration )
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
                    // InternalStateConstraintTransition.g:626:3: this_IntEnumeration_0= ruleIntEnumeration
                    {

                    			newCompositeNode(grammarAccess.getEnumerationAccess().getIntEnumerationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntEnumeration_0=ruleIntEnumeration();

                    state._fsp--;


                    			current.merge(this_IntEnumeration_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:637:3: this_StringEnumeration_1= ruleStringEnumeration
                    {

                    			newCompositeNode(grammarAccess.getEnumerationAccess().getStringEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringEnumeration_1=ruleStringEnumeration();

                    state._fsp--;


                    			current.merge(this_StringEnumeration_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleIntEnumeration"
    // InternalStateConstraintTransition.g:651:1: entryRuleIntEnumeration returns [String current=null] : iv_ruleIntEnumeration= ruleIntEnumeration EOF ;
    public final String entryRuleIntEnumeration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntEnumeration = null;


        try {
            // InternalStateConstraintTransition.g:651:54: (iv_ruleIntEnumeration= ruleIntEnumeration EOF )
            // InternalStateConstraintTransition.g:652:2: iv_ruleIntEnumeration= ruleIntEnumeration EOF
            {
             newCompositeNode(grammarAccess.getIntEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntEnumeration=ruleIntEnumeration();

            state._fsp--;

             current =iv_ruleIntEnumeration.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntEnumeration"


    // $ANTLR start "ruleIntEnumeration"
    // InternalStateConstraintTransition.g:658:1: ruleIntEnumeration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_IntValue_1= ruleIntValue (kw= ',' this_IntValue_3= ruleIntValue )+ kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleIntEnumeration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IntValue_1 = null;

        AntlrDatatypeRuleToken this_IntValue_3 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:664:2: ( (kw= '{' this_IntValue_1= ruleIntValue (kw= ',' this_IntValue_3= ruleIntValue )+ kw= '}' ) )
            // InternalStateConstraintTransition.g:665:2: (kw= '{' this_IntValue_1= ruleIntValue (kw= ',' this_IntValue_3= ruleIntValue )+ kw= '}' )
            {
            // InternalStateConstraintTransition.g:665:2: (kw= '{' this_IntValue_1= ruleIntValue (kw= ',' this_IntValue_3= ruleIntValue )+ kw= '}' )
            // InternalStateConstraintTransition.g:666:3: kw= '{' this_IntValue_1= ruleIntValue (kw= ',' this_IntValue_3= ruleIntValue )+ kw= '}'
            {
            kw=(Token)match(input,23,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIntEnumerationAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getIntEnumerationAccess().getIntValueParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_IntValue_1=ruleIntValue();

            state._fsp--;


            			current.merge(this_IntValue_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalStateConstraintTransition.g:681:3: (kw= ',' this_IntValue_3= ruleIntValue )+
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
            	    // InternalStateConstraintTransition.g:682:4: kw= ',' this_IntValue_3= ruleIntValue
            	    {
            	    kw=(Token)match(input,19,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIntEnumerationAccess().getCommaKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getIntEnumerationAccess().getIntValueParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_18);
            	    this_IntValue_3=ruleIntValue();

            	    state._fsp--;


            	    				current.merge(this_IntValue_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

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

            kw=(Token)match(input,24,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIntEnumerationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntEnumeration"


    // $ANTLR start "entryRuleStringEnumeration"
    // InternalStateConstraintTransition.g:707:1: entryRuleStringEnumeration returns [String current=null] : iv_ruleStringEnumeration= ruleStringEnumeration EOF ;
    public final String entryRuleStringEnumeration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringEnumeration = null;


        try {
            // InternalStateConstraintTransition.g:707:57: (iv_ruleStringEnumeration= ruleStringEnumeration EOF )
            // InternalStateConstraintTransition.g:708:2: iv_ruleStringEnumeration= ruleStringEnumeration EOF
            {
             newCompositeNode(grammarAccess.getStringEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringEnumeration=ruleStringEnumeration();

            state._fsp--;

             current =iv_ruleStringEnumeration.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringEnumeration"


    // $ANTLR start "ruleStringEnumeration"
    // InternalStateConstraintTransition.g:714:1: ruleStringEnumeration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_strings_1= rulestrings (kw= ',' this_strings_3= rulestrings )+ kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStringEnumeration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_strings_1 = null;

        AntlrDatatypeRuleToken this_strings_3 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:720:2: ( (kw= '{' this_strings_1= rulestrings (kw= ',' this_strings_3= rulestrings )+ kw= '}' ) )
            // InternalStateConstraintTransition.g:721:2: (kw= '{' this_strings_1= rulestrings (kw= ',' this_strings_3= rulestrings )+ kw= '}' )
            {
            // InternalStateConstraintTransition.g:721:2: (kw= '{' this_strings_1= rulestrings (kw= ',' this_strings_3= rulestrings )+ kw= '}' )
            // InternalStateConstraintTransition.g:722:3: kw= '{' this_strings_1= rulestrings (kw= ',' this_strings_3= rulestrings )+ kw= '}'
            {
            kw=(Token)match(input,23,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStringEnumerationAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getStringEnumerationAccess().getStringsParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_strings_1=rulestrings();

            state._fsp--;


            			current.merge(this_strings_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalStateConstraintTransition.g:737:3: (kw= ',' this_strings_3= rulestrings )+
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
            	    // InternalStateConstraintTransition.g:738:4: kw= ',' this_strings_3= rulestrings
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getStringEnumerationAccess().getCommaKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getStringEnumerationAccess().getStringsParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_18);
            	    this_strings_3=rulestrings();

            	    state._fsp--;


            	    				current.merge(this_strings_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

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

            kw=(Token)match(input,24,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStringEnumerationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringEnumeration"


    // $ANTLR start "entryRulemax"
    // InternalStateConstraintTransition.g:763:1: entryRulemax returns [String current=null] : iv_rulemax= rulemax EOF ;
    public final String entryRulemax() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemax = null;


        try {
            // InternalStateConstraintTransition.g:763:43: (iv_rulemax= rulemax EOF )
            // InternalStateConstraintTransition.g:764:2: iv_rulemax= rulemax EOF
            {
             newCompositeNode(grammarAccess.getMaxRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemax=rulemax();

            state._fsp--;

             current =iv_rulemax.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemax"


    // $ANTLR start "rulemax"
    // InternalStateConstraintTransition.g:770:1: rulemax returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IntValue_0= ruleIntValue ;
    public final AntlrDatatypeRuleToken rulemax() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntValue_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:776:2: (this_IntValue_0= ruleIntValue )
            // InternalStateConstraintTransition.g:777:2: this_IntValue_0= ruleIntValue
            {

            		newCompositeNode(grammarAccess.getMaxAccess().getIntValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_IntValue_0=ruleIntValue();

            state._fsp--;


            		current.merge(this_IntValue_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemax"


    // $ANTLR start "entryRulemin"
    // InternalStateConstraintTransition.g:790:1: entryRulemin returns [String current=null] : iv_rulemin= rulemin EOF ;
    public final String entryRulemin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemin = null;


        try {
            // InternalStateConstraintTransition.g:790:43: (iv_rulemin= rulemin EOF )
            // InternalStateConstraintTransition.g:791:2: iv_rulemin= rulemin EOF
            {
             newCompositeNode(grammarAccess.getMinRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemin=rulemin();

            state._fsp--;

             current =iv_rulemin.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemin"


    // $ANTLR start "rulemin"
    // InternalStateConstraintTransition.g:797:1: rulemin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IntValue_0= ruleIntValue ;
    public final AntlrDatatypeRuleToken rulemin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntValue_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:803:2: (this_IntValue_0= ruleIntValue )
            // InternalStateConstraintTransition.g:804:2: this_IntValue_0= ruleIntValue
            {

            		newCompositeNode(grammarAccess.getMinAccess().getIntValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_IntValue_0=ruleIntValue();

            state._fsp--;


            		current.merge(this_IntValue_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemin"


    // $ANTLR start "entryRulestrings"
    // InternalStateConstraintTransition.g:817:1: entryRulestrings returns [String current=null] : iv_rulestrings= rulestrings EOF ;
    public final String entryRulestrings() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestrings = null;


        try {
            // InternalStateConstraintTransition.g:817:47: (iv_rulestrings= rulestrings EOF )
            // InternalStateConstraintTransition.g:818:2: iv_rulestrings= rulestrings EOF
            {
             newCompositeNode(grammarAccess.getStringsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestrings=rulestrings();

            state._fsp--;

             current =iv_rulestrings.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestrings"


    // $ANTLR start "rulestrings"
    // InternalStateConstraintTransition.g:824:1: rulestrings returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken rulestrings() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalStateConstraintTransition.g:830:2: (this_STRING_0= RULE_STRING )
            // InternalStateConstraintTransition.g:831:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getStringsAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestrings"


    // $ANTLR start "entryRuleState"
    // InternalStateConstraintTransition.g:841:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateConstraintTransition.g:841:46: (iv_ruleState= ruleState EOF )
            // InternalStateConstraintTransition.g:842:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateConstraintTransition.g:848:1: ruleState returns [EObject current=null] : (this_SimpleConstraintState_0= ruleSimpleConstraintState | this_CompositeState_1= ruleCompositeState ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleConstraintState_0 = null;

        EObject this_CompositeState_1 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:854:2: ( (this_SimpleConstraintState_0= ruleSimpleConstraintState | this_CompositeState_1= ruleCompositeState ) )
            // InternalStateConstraintTransition.g:855:2: (this_SimpleConstraintState_0= ruleSimpleConstraintState | this_CompositeState_1= ruleCompositeState )
            {
            // InternalStateConstraintTransition.g:855:2: (this_SimpleConstraintState_0= ruleSimpleConstraintState | this_CompositeState_1= ruleCompositeState )
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
                    // InternalStateConstraintTransition.g:856:3: this_SimpleConstraintState_0= ruleSimpleConstraintState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getSimpleConstraintStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleConstraintState_0=ruleSimpleConstraintState();

                    state._fsp--;


                    			current = this_SimpleConstraintState_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:865:3: this_CompositeState_1= ruleCompositeState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getCompositeStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeState_1=ruleCompositeState();

                    state._fsp--;


                    			current = this_CompositeState_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStateConstraintTransition.g:877:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateConstraintTransition.g:877:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateConstraintTransition.g:878:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateConstraintTransition.g:884:1: ruleTransition returns [EObject current=null] : (this_StartTransition_0= ruleStartTransition | this_EndTransition_1= ruleEndTransition | this_FullTransition_2= ruleFullTransition ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_StartTransition_0 = null;

        EObject this_EndTransition_1 = null;

        EObject this_FullTransition_2 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:890:2: ( (this_StartTransition_0= ruleStartTransition | this_EndTransition_1= ruleEndTransition | this_FullTransition_2= ruleFullTransition ) )
            // InternalStateConstraintTransition.g:891:2: (this_StartTransition_0= ruleStartTransition | this_EndTransition_1= ruleEndTransition | this_FullTransition_2= ruleFullTransition )
            {
            // InternalStateConstraintTransition.g:891:2: (this_StartTransition_0= ruleStartTransition | this_EndTransition_1= ruleEndTransition | this_FullTransition_2= ruleFullTransition )
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
                    // InternalStateConstraintTransition.g:892:3: this_StartTransition_0= ruleStartTransition
                    {

                    			newCompositeNode(grammarAccess.getTransitionAccess().getStartTransitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartTransition_0=ruleStartTransition();

                    state._fsp--;


                    			current = this_StartTransition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:901:3: this_EndTransition_1= ruleEndTransition
                    {

                    			newCompositeNode(grammarAccess.getTransitionAccess().getEndTransitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndTransition_1=ruleEndTransition();

                    state._fsp--;


                    			current = this_EndTransition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStateConstraintTransition.g:910:3: this_FullTransition_2= ruleFullTransition
                    {

                    			newCompositeNode(grammarAccess.getTransitionAccess().getFullTransitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FullTransition_2=ruleFullTransition();

                    state._fsp--;


                    			current = this_FullTransition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleStartTransition"
    // InternalStateConstraintTransition.g:922:1: entryRuleStartTransition returns [EObject current=null] : iv_ruleStartTransition= ruleStartTransition EOF ;
    public final EObject entryRuleStartTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartTransition = null;


        try {
            // InternalStateConstraintTransition.g:922:56: (iv_ruleStartTransition= ruleStartTransition EOF )
            // InternalStateConstraintTransition.g:923:2: iv_ruleStartTransition= ruleStartTransition EOF
            {
             newCompositeNode(grammarAccess.getStartTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartTransition=ruleStartTransition();

            state._fsp--;

             current =iv_ruleStartTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartTransition"


    // $ANTLR start "ruleStartTransition"
    // InternalStateConstraintTransition.g:929:1: ruleStartTransition returns [EObject current=null] : (otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) ) ) ;
    public final EObject ruleStartTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateConstraintTransition.g:935:2: ( (otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) ) ) )
            // InternalStateConstraintTransition.g:936:2: (otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) ) )
            {
            // InternalStateConstraintTransition.g:936:2: (otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) ) )
            // InternalStateConstraintTransition.g:937:3: otherlv_0= 'Start' otherlv_1= 'transition' otherlv_2= 'to' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getStartTransitionAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getStartTransitionAccess().getTransitionKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStartTransitionAccess().getToKeyword_2());
            		
            // InternalStateConstraintTransition.g:949:3: ( ( ruleFQN ) )
            // InternalStateConstraintTransition.g:950:4: ( ruleFQN )
            {
            // InternalStateConstraintTransition.g:950:4: ( ruleFQN )
            // InternalStateConstraintTransition.g:951:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStartTransitionAccess().getTargetStateStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartTransition"


    // $ANTLR start "entryRuleEndTransition"
    // InternalStateConstraintTransition.g:969:1: entryRuleEndTransition returns [EObject current=null] : iv_ruleEndTransition= ruleEndTransition EOF ;
    public final EObject entryRuleEndTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndTransition = null;


        try {
            // InternalStateConstraintTransition.g:969:54: (iv_ruleEndTransition= ruleEndTransition EOF )
            // InternalStateConstraintTransition.g:970:2: iv_ruleEndTransition= ruleEndTransition EOF
            {
             newCompositeNode(grammarAccess.getEndTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndTransition=ruleEndTransition();

            state._fsp--;

             current =iv_ruleEndTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndTransition"


    // $ANTLR start "ruleEndTransition"
    // InternalStateConstraintTransition.g:976:1: ruleEndTransition returns [EObject current=null] : (otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEndTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateConstraintTransition.g:982:2: ( (otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) ) ) )
            // InternalStateConstraintTransition.g:983:2: (otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) ) )
            {
            // InternalStateConstraintTransition.g:983:2: (otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) ) )
            // InternalStateConstraintTransition.g:984:3: otherlv_0= 'End' otherlv_1= 'transition' otherlv_2= 'from' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEndTransitionAccess().getEndKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEndTransitionAccess().getTransitionKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEndTransitionAccess().getFromKeyword_2());
            		
            // InternalStateConstraintTransition.g:996:3: ( ( ruleFQN ) )
            // InternalStateConstraintTransition.g:997:4: ( ruleFQN )
            {
            // InternalStateConstraintTransition.g:997:4: ( ruleFQN )
            // InternalStateConstraintTransition.g:998:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEndTransitionAccess().getSourceStateStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndTransition"


    // $ANTLR start "entryRuleFullTransition"
    // InternalStateConstraintTransition.g:1016:1: entryRuleFullTransition returns [EObject current=null] : iv_ruleFullTransition= ruleFullTransition EOF ;
    public final EObject entryRuleFullTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullTransition = null;


        try {
            // InternalStateConstraintTransition.g:1016:55: (iv_ruleFullTransition= ruleFullTransition EOF )
            // InternalStateConstraintTransition.g:1017:2: iv_ruleFullTransition= ruleFullTransition EOF
            {
             newCompositeNode(grammarAccess.getFullTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullTransition=ruleFullTransition();

            state._fsp--;

             current =iv_ruleFullTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullTransition"


    // $ANTLR start "ruleFullTransition"
    // InternalStateConstraintTransition.g:1023:1: ruleFullTransition returns [EObject current=null] : ( (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) ) ) ;
    public final EObject ruleFullTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_event_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1029:2: ( ( (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) ) ) )
            // InternalStateConstraintTransition.g:1030:2: ( (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) ) )
            {
            // InternalStateConstraintTransition.g:1030:2: ( (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) ) )
            // InternalStateConstraintTransition.g:1031:3: (otherlv_0= 'When' ( ( ruleFQN ) ) )? otherlv_2= 'if' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'transition' otherlv_5= 'from' ( ( ruleFQN ) ) otherlv_7= 'to' ( ( ruleFQN ) )
            {
            // InternalStateConstraintTransition.g:1031:3: (otherlv_0= 'When' ( ( ruleFQN ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalStateConstraintTransition.g:1032:4: otherlv_0= 'When' ( ( ruleFQN ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getFullTransitionAccess().getWhenKeyword_0_0());
                    			
                    // InternalStateConstraintTransition.g:1036:4: ( ( ruleFQN ) )
                    // InternalStateConstraintTransition.g:1037:5: ( ruleFQN )
                    {
                    // InternalStateConstraintTransition.g:1037:5: ( ruleFQN )
                    // InternalStateConstraintTransition.g:1038:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFullTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFullTransitionAccess().getStateStateCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getFullTransitionAccess().getIfKeyword_1());
            		
            // InternalStateConstraintTransition.g:1057:3: ( (lv_event_3_0= ruleEvent ) )
            // InternalStateConstraintTransition.g:1058:4: (lv_event_3_0= ruleEvent )
            {
            // InternalStateConstraintTransition.g:1058:4: (lv_event_3_0= ruleEvent )
            // InternalStateConstraintTransition.g:1059:5: lv_event_3_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getFullTransitionAccess().getEventEventParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_event_3_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFullTransitionRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_3_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getFullTransitionAccess().getTransitionKeyword_3());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFullTransitionAccess().getFromKeyword_4());
            		
            // InternalStateConstraintTransition.g:1084:3: ( ( ruleFQN ) )
            // InternalStateConstraintTransition.g:1085:4: ( ruleFQN )
            {
            // InternalStateConstraintTransition.g:1085:4: ( ruleFQN )
            // InternalStateConstraintTransition.g:1086:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFullTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFullTransitionAccess().getSourceStateStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_21);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getFullTransitionAccess().getToKeyword_6());
            		
            // InternalStateConstraintTransition.g:1104:3: ( ( ruleFQN ) )
            // InternalStateConstraintTransition.g:1105:4: ( ruleFQN )
            {
            // InternalStateConstraintTransition.g:1105:4: ( ruleFQN )
            // InternalStateConstraintTransition.g:1106:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFullTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFullTransitionAccess().getTargetStateStateCrossReference_7_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullTransition"


    // $ANTLR start "entryRuleEvent"
    // InternalStateConstraintTransition.g:1124:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateConstraintTransition.g:1124:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateConstraintTransition.g:1125:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStateConstraintTransition.g:1131:1: ruleEvent returns [EObject current=null] : ( () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject lv_evOcc_1_0 = null;

        EObject lv_sttOcc_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1137:2: ( ( () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )? ) )
            // InternalStateConstraintTransition.g:1138:2: ( () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )? )
            {
            // InternalStateConstraintTransition.g:1138:2: ( () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )? )
            // InternalStateConstraintTransition.g:1139:3: () ( (lv_evOcc_1_0= ruleEventOccurence ) )? ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )? ( (lv_sttOcc_3_0= ruleStateOccurence ) )?
            {
            // InternalStateConstraintTransition.g:1139:3: ()
            // InternalStateConstraintTransition.g:1140:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalStateConstraintTransition.g:1146:3: ( (lv_evOcc_1_0= ruleEventOccurence ) )?
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

                    if ( (LA18_4==RULE_INT||LA18_4==51||LA18_4==53||LA18_4==59) ) {
                        alt18=1;
                    }
                    else if ( ((LA18_4>=RULE_ID && LA18_4<=RULE_STRING)||LA18_4==35) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalStateConstraintTransition.g:1147:4: (lv_evOcc_1_0= ruleEventOccurence )
                    {
                    // InternalStateConstraintTransition.g:1147:4: (lv_evOcc_1_0= ruleEventOccurence )
                    // InternalStateConstraintTransition.g:1148:5: lv_evOcc_1_0= ruleEventOccurence
                    {

                    					newCompositeNode(grammarAccess.getEventAccess().getEvOccEventOccurenceParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_evOcc_1_0=ruleEventOccurence();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEventRule());
                    					}
                    					set(
                    						current,
                    						"evOcc",
                    						lv_evOcc_1_0,
                    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.EventOccurence");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalStateConstraintTransition.g:1165:3: ( ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=32 && LA20_0<=33)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalStateConstraintTransition.g:1166:4: ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) )
                    {
                    // InternalStateConstraintTransition.g:1166:4: ( (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' ) )
                    // InternalStateConstraintTransition.g:1167:5: (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' )
                    {
                    // InternalStateConstraintTransition.g:1167:5: (lv_operator_2_1= '\\\\/' | lv_operator_2_2= '/\\\\' )
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
                            // InternalStateConstraintTransition.g:1168:6: lv_operator_2_1= '\\\\/'
                            {
                            lv_operator_2_1=(Token)match(input,32,FOLLOW_26); 

                            						newLeafNode(lv_operator_2_1, grammarAccess.getEventAccess().getOperatorReverseSolidusSolidusKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEventRule());
                            						}
                            						setWithLastConsumed(current, "operator", lv_operator_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalStateConstraintTransition.g:1179:6: lv_operator_2_2= '/\\\\'
                            {
                            lv_operator_2_2=(Token)match(input,33,FOLLOW_26); 

                            						newLeafNode(lv_operator_2_2, grammarAccess.getEventAccess().getOperatorSolidusReverseSolidusKeyword_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEventRule());
                            						}
                            						setWithLastConsumed(current, "operator", lv_operator_2_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalStateConstraintTransition.g:1192:3: ( (lv_sttOcc_3_0= ruleStateOccurence ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalStateConstraintTransition.g:1193:4: (lv_sttOcc_3_0= ruleStateOccurence )
                    {
                    // InternalStateConstraintTransition.g:1193:4: (lv_sttOcc_3_0= ruleStateOccurence )
                    // InternalStateConstraintTransition.g:1194:5: lv_sttOcc_3_0= ruleStateOccurence
                    {

                    					newCompositeNode(grammarAccess.getEventAccess().getSttOccStateOccurenceParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sttOcc_3_0=ruleStateOccurence();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEventRule());
                    					}
                    					set(
                    						current,
                    						"sttOcc",
                    						lv_sttOcc_3_0,
                    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.StateOccurence");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventOccurence"
    // InternalStateConstraintTransition.g:1215:1: entryRuleEventOccurence returns [EObject current=null] : iv_ruleEventOccurence= ruleEventOccurence EOF ;
    public final EObject entryRuleEventOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventOccurence = null;


        try {
            // InternalStateConstraintTransition.g:1215:55: (iv_ruleEventOccurence= ruleEventOccurence EOF )
            // InternalStateConstraintTransition.g:1216:2: iv_ruleEventOccurence= ruleEventOccurence EOF
            {
             newCompositeNode(grammarAccess.getEventOccurenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventOccurence=ruleEventOccurence();

            state._fsp--;

             current =iv_ruleEventOccurence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventOccurence"


    // $ANTLR start "ruleEventOccurence"
    // InternalStateConstraintTransition.g:1222:1: ruleEventOccurence returns [EObject current=null] : ( (lv_eventExpression_0_0= ruleConstraint ) ) ;
    public final EObject ruleEventOccurence() throws RecognitionException {
        EObject current = null;

        EObject lv_eventExpression_0_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1228:2: ( ( (lv_eventExpression_0_0= ruleConstraint ) ) )
            // InternalStateConstraintTransition.g:1229:2: ( (lv_eventExpression_0_0= ruleConstraint ) )
            {
            // InternalStateConstraintTransition.g:1229:2: ( (lv_eventExpression_0_0= ruleConstraint ) )
            // InternalStateConstraintTransition.g:1230:3: (lv_eventExpression_0_0= ruleConstraint )
            {
            // InternalStateConstraintTransition.g:1230:3: (lv_eventExpression_0_0= ruleConstraint )
            // InternalStateConstraintTransition.g:1231:4: lv_eventExpression_0_0= ruleConstraint
            {

            				newCompositeNode(grammarAccess.getEventOccurenceAccess().getEventExpressionConstraintParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_eventExpression_0_0=ruleConstraint();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEventOccurenceRule());
            				}
            				add(
            					current,
            					"eventExpression",
            					lv_eventExpression_0_0,
            					"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Constraint");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventOccurence"


    // $ANTLR start "entryRuleStateOccurence"
    // InternalStateConstraintTransition.g:1251:1: entryRuleStateOccurence returns [EObject current=null] : iv_ruleStateOccurence= ruleStateOccurence EOF ;
    public final EObject entryRuleStateOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateOccurence = null;


        try {
            // InternalStateConstraintTransition.g:1251:55: (iv_ruleStateOccurence= ruleStateOccurence EOF )
            // InternalStateConstraintTransition.g:1252:2: iv_ruleStateOccurence= ruleStateOccurence EOF
            {
             newCompositeNode(grammarAccess.getStateOccurenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateOccurence=ruleStateOccurence();

            state._fsp--;

             current =iv_ruleStateOccurence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateOccurence"


    // $ANTLR start "ruleStateOccurence"
    // InternalStateConstraintTransition.g:1258:1: ruleStateOccurence returns [EObject current=null] : ( (lv_stateExpression_0_0= ruleStateConstraint ) ) ;
    public final EObject ruleStateOccurence() throws RecognitionException {
        EObject current = null;

        EObject lv_stateExpression_0_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1264:2: ( ( (lv_stateExpression_0_0= ruleStateConstraint ) ) )
            // InternalStateConstraintTransition.g:1265:2: ( (lv_stateExpression_0_0= ruleStateConstraint ) )
            {
            // InternalStateConstraintTransition.g:1265:2: ( (lv_stateExpression_0_0= ruleStateConstraint ) )
            // InternalStateConstraintTransition.g:1266:3: (lv_stateExpression_0_0= ruleStateConstraint )
            {
            // InternalStateConstraintTransition.g:1266:3: (lv_stateExpression_0_0= ruleStateConstraint )
            // InternalStateConstraintTransition.g:1267:4: lv_stateExpression_0_0= ruleStateConstraint
            {

            				newCompositeNode(grammarAccess.getStateOccurenceAccess().getStateExpressionStateConstraintParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_stateExpression_0_0=ruleStateConstraint();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStateOccurenceRule());
            				}
            				add(
            					current,
            					"stateExpression",
            					lv_stateExpression_0_0,
            					"org.xtext.example.stateconstrainttransition.StateConstraintTransition.StateConstraint");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateOccurence"


    // $ANTLR start "entryRuleStateConstraint"
    // InternalStateConstraintTransition.g:1287:1: entryRuleStateConstraint returns [EObject current=null] : iv_ruleStateConstraint= ruleStateConstraint EOF ;
    public final EObject entryRuleStateConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateConstraint = null;


        try {
            // InternalStateConstraintTransition.g:1287:56: (iv_ruleStateConstraint= ruleStateConstraint EOF )
            // InternalStateConstraintTransition.g:1288:2: iv_ruleStateConstraint= ruleStateConstraint EOF
            {
             newCompositeNode(grammarAccess.getStateConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateConstraint=ruleStateConstraint();

            state._fsp--;

             current =iv_ruleStateConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateConstraint"


    // $ANTLR start "ruleStateConstraint"
    // InternalStateConstraintTransition.g:1294:1: ruleStateConstraint returns [EObject current=null] : this_Or_state_0= ruleOr_state ;
    public final EObject ruleStateConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_Or_state_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1300:2: (this_Or_state_0= ruleOr_state )
            // InternalStateConstraintTransition.g:1301:2: this_Or_state_0= ruleOr_state
            {

            		newCompositeNode(grammarAccess.getStateConstraintAccess().getOr_stateParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_state_0=ruleOr_state();

            state._fsp--;


            		current = this_Or_state_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateConstraint"


    // $ANTLR start "entryRuleOr_state"
    // InternalStateConstraintTransition.g:1312:1: entryRuleOr_state returns [EObject current=null] : iv_ruleOr_state= ruleOr_state EOF ;
    public final EObject entryRuleOr_state() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr_state = null;


        try {
            // InternalStateConstraintTransition.g:1312:49: (iv_ruleOr_state= ruleOr_state EOF )
            // InternalStateConstraintTransition.g:1313:2: iv_ruleOr_state= ruleOr_state EOF
            {
             newCompositeNode(grammarAccess.getOr_stateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr_state=ruleOr_state();

            state._fsp--;

             current =iv_ruleOr_state; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr_state"


    // $ANTLR start "ruleOr_state"
    // InternalStateConstraintTransition.g:1319:1: ruleOr_state returns [EObject current=null] : (this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )* ) ;
    public final EObject ruleOr_state() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_state_0 = null;

        EObject lv_ripe_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1325:2: ( (this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )* ) )
            // InternalStateConstraintTransition.g:1326:2: (this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )* )
            {
            // InternalStateConstraintTransition.g:1326:2: (this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )* )
            // InternalStateConstraintTransition.g:1327:3: this_And_state_0= ruleAnd_state ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )*
            {

            			newCompositeNode(grammarAccess.getOr_stateAccess().getAnd_stateParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_And_state_0=ruleAnd_state();

            state._fsp--;


            			current = this_And_state_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateConstraintTransition.g:1335:3: ( () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:1336:4: () otherlv_2= '\\\\/' ( (lv_ripe_3_0= ruleAnd_state ) )
            	    {
            	    // InternalStateConstraintTransition.g:1336:4: ()
            	    // InternalStateConstraintTransition.g:1337:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOr_stateAccess().getOr_stateLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOr_stateAccess().getReverseSolidusSolidusKeyword_1_1());
            	    			
            	    // InternalStateConstraintTransition.g:1347:4: ( (lv_ripe_3_0= ruleAnd_state ) )
            	    // InternalStateConstraintTransition.g:1348:5: (lv_ripe_3_0= ruleAnd_state )
            	    {
            	    // InternalStateConstraintTransition.g:1348:5: (lv_ripe_3_0= ruleAnd_state )
            	    // InternalStateConstraintTransition.g:1349:6: lv_ripe_3_0= ruleAnd_state
            	    {

            	    						newCompositeNode(grammarAccess.getOr_stateAccess().getRipeAnd_stateParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ripe_3_0=ruleAnd_state();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOr_stateRule());
            	    						}
            	    						set(
            	    							current,
            	    							"ripe",
            	    							lv_ripe_3_0,
            	    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.And_state");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr_state"


    // $ANTLR start "entryRuleAnd_state"
    // InternalStateConstraintTransition.g:1371:1: entryRuleAnd_state returns [EObject current=null] : iv_ruleAnd_state= ruleAnd_state EOF ;
    public final EObject entryRuleAnd_state() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd_state = null;


        try {
            // InternalStateConstraintTransition.g:1371:50: (iv_ruleAnd_state= ruleAnd_state EOF )
            // InternalStateConstraintTransition.g:1372:2: iv_ruleAnd_state= ruleAnd_state EOF
            {
             newCompositeNode(grammarAccess.getAnd_stateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd_state=ruleAnd_state();

            state._fsp--;

             current =iv_ruleAnd_state; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd_state"


    // $ANTLR start "ruleAnd_state"
    // InternalStateConstraintTransition.g:1378:1: ruleAnd_state returns [EObject current=null] : (this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )* ) ;
    public final EObject ruleAnd_state() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_StateName_0 = null;

        EObject lv_ripe_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1384:2: ( (this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )* ) )
            // InternalStateConstraintTransition.g:1385:2: (this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )* )
            {
            // InternalStateConstraintTransition.g:1385:2: (this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )* )
            // InternalStateConstraintTransition.g:1386:3: this_StateName_0= ruleStateName ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )*
            {

            			newCompositeNode(grammarAccess.getAnd_stateAccess().getStateNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_StateName_0=ruleStateName();

            state._fsp--;


            			current = this_StateName_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateConstraintTransition.g:1394:3: ( () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:1395:4: () otherlv_2= '/\\\\' ( (lv_ripe_3_0= ruleStateName ) )
            	    {
            	    // InternalStateConstraintTransition.g:1395:4: ()
            	    // InternalStateConstraintTransition.g:1396:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAnd_stateAccess().getAnd_stateLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAnd_stateAccess().getSolidusReverseSolidusKeyword_1_1());
            	    			
            	    // InternalStateConstraintTransition.g:1406:4: ( (lv_ripe_3_0= ruleStateName ) )
            	    // InternalStateConstraintTransition.g:1407:5: (lv_ripe_3_0= ruleStateName )
            	    {
            	    // InternalStateConstraintTransition.g:1407:5: (lv_ripe_3_0= ruleStateName )
            	    // InternalStateConstraintTransition.g:1408:6: lv_ripe_3_0= ruleStateName
            	    {

            	    						newCompositeNode(grammarAccess.getAnd_stateAccess().getRipeStateNameParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_ripe_3_0=ruleStateName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAnd_stateRule());
            	    						}
            	    						set(
            	    							current,
            	    							"ripe",
            	    							lv_ripe_3_0,
            	    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.StateName");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd_state"


    // $ANTLR start "entryRuleStateName"
    // InternalStateConstraintTransition.g:1430:1: entryRuleStateName returns [EObject current=null] : iv_ruleStateName= ruleStateName EOF ;
    public final EObject entryRuleStateName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateName = null;


        try {
            // InternalStateConstraintTransition.g:1430:50: (iv_ruleStateName= ruleStateName EOF )
            // InternalStateConstraintTransition.g:1431:2: iv_ruleStateName= ruleStateName EOF
            {
             newCompositeNode(grammarAccess.getStateNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateName=ruleStateName();

            state._fsp--;

             current =iv_ruleStateName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateName"


    // $ANTLR start "ruleStateName"
    // InternalStateConstraintTransition.g:1437:1: ruleStateName returns [EObject current=null] : ( () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1' ) ;
    public final EObject ruleStateName() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1443:2: ( ( () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1' ) )
            // InternalStateConstraintTransition.g:1444:2: ( () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1' )
            {
            // InternalStateConstraintTransition.g:1444:2: ( () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1' )
            // InternalStateConstraintTransition.g:1445:3: () ( ( ruleFQN ) ) otherlv_2= '=' otherlv_3= '1'
            {
            // InternalStateConstraintTransition.g:1445:3: ()
            // InternalStateConstraintTransition.g:1446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateNameAccess().getStateNameRefAction_0(),
            					current);
            			

            }

            // InternalStateConstraintTransition.g:1452:3: ( ( ruleFQN ) )
            // InternalStateConstraintTransition.g:1453:4: ( ruleFQN )
            {
            // InternalStateConstraintTransition.g:1453:4: ( ruleFQN )
            // InternalStateConstraintTransition.g:1454:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateNameRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateNameAccess().getValueStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_29);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getStateNameAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStateNameAccess().getDigitOneKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateName"


    // $ANTLR start "entryRuleCompositeState"
    // InternalStateConstraintTransition.g:1480:1: entryRuleCompositeState returns [EObject current=null] : iv_ruleCompositeState= ruleCompositeState EOF ;
    public final EObject entryRuleCompositeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeState = null;


        try {
            // InternalStateConstraintTransition.g:1480:55: (iv_ruleCompositeState= ruleCompositeState EOF )
            // InternalStateConstraintTransition.g:1481:2: iv_ruleCompositeState= ruleCompositeState EOF
            {
             newCompositeNode(grammarAccess.getCompositeStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeState=ruleCompositeState();

            state._fsp--;

             current =iv_ruleCompositeState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeState"


    // $ANTLR start "ruleCompositeState"
    // InternalStateConstraintTransition.g:1487:1: ruleCompositeState returns [EObject current=null] : ( ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleCompositeState() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_concernlevel_2_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1493:2: ( ( ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalStateConstraintTransition.g:1494:2: ( ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalStateConstraintTransition.g:1494:2: ( ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) ) )
            // InternalStateConstraintTransition.g:1495:3: ( (lv_type_0_0= 'compositeState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_concernlevel_2_0= ruleConcernLevel ) )+ otherlv_3= 'end_compositeState' ( (otherlv_4= RULE_ID ) )
            {
            // InternalStateConstraintTransition.g:1495:3: ( (lv_type_0_0= 'compositeState' ) )
            // InternalStateConstraintTransition.g:1496:4: (lv_type_0_0= 'compositeState' )
            {
            // InternalStateConstraintTransition.g:1496:4: (lv_type_0_0= 'compositeState' )
            // InternalStateConstraintTransition.g:1497:5: lv_type_0_0= 'compositeState'
            {
            lv_type_0_0=(Token)match(input,36,FOLLOW_3); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCompositeStateAccess().getTypeCompositeStateKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeStateRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "compositeState");
            				

            }


            }

            // InternalStateConstraintTransition.g:1509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateConstraintTransition.g:1510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateConstraintTransition.g:1510:4: (lv_name_1_0= RULE_ID )
            // InternalStateConstraintTransition.g:1511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateConstraintTransition.g:1527:3: ( (lv_concernlevel_2_0= ruleConcernLevel ) )+
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
            	    // InternalStateConstraintTransition.g:1528:4: (lv_concernlevel_2_0= ruleConcernLevel )
            	    {
            	    // InternalStateConstraintTransition.g:1528:4: (lv_concernlevel_2_0= ruleConcernLevel )
            	    // InternalStateConstraintTransition.g:1529:5: lv_concernlevel_2_0= ruleConcernLevel
            	    {

            	    					newCompositeNode(grammarAccess.getCompositeStateAccess().getConcernlevelConcernLevelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_concernlevel_2_0=ruleConcernLevel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concernlevel",
            	    						lv_concernlevel_2_0,
            	    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.ConcernLevel");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_3=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeStateAccess().getEnd_compositeStateKeyword_3());
            		
            // InternalStateConstraintTransition.g:1550:3: ( (otherlv_4= RULE_ID ) )
            // InternalStateConstraintTransition.g:1551:4: (otherlv_4= RULE_ID )
            {
            // InternalStateConstraintTransition.g:1551:4: (otherlv_4= RULE_ID )
            // InternalStateConstraintTransition.g:1552:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeStateRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getCompositeStateAccess().getEndCompositeStateCompositeStateCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeState"


    // $ANTLR start "entryRuleConcernLevel"
    // InternalStateConstraintTransition.g:1567:1: entryRuleConcernLevel returns [EObject current=null] : iv_ruleConcernLevel= ruleConcernLevel EOF ;
    public final EObject entryRuleConcernLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcernLevel = null;


        try {
            // InternalStateConstraintTransition.g:1567:53: (iv_ruleConcernLevel= ruleConcernLevel EOF )
            // InternalStateConstraintTransition.g:1568:2: iv_ruleConcernLevel= ruleConcernLevel EOF
            {
             newCompositeNode(grammarAccess.getConcernLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcernLevel=ruleConcernLevel();

            state._fsp--;

             current =iv_ruleConcernLevel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcernLevel"


    // $ANTLR start "ruleConcernLevel"
    // InternalStateConstraintTransition.g:1574:1: ruleConcernLevel returns [EObject current=null] : (otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleConcernLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1580:2: ( (otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalStateConstraintTransition.g:1581:2: (otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalStateConstraintTransition.g:1581:2: (otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) ) )
            // InternalStateConstraintTransition.g:1582:3: otherlv_0= 'concernLevel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_state_2_0= ruleState ) )+ otherlv_3= 'end_concernLevel' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConcernLevelAccess().getConcernLevelKeyword_0());
            		
            // InternalStateConstraintTransition.g:1586:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateConstraintTransition.g:1587:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateConstraintTransition.g:1587:4: (lv_name_1_0= RULE_ID )
            // InternalStateConstraintTransition.g:1588:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConcernLevelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcernLevelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateConstraintTransition.g:1604:3: ( (lv_state_2_0= ruleState ) )+
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
            	    // InternalStateConstraintTransition.g:1605:4: (lv_state_2_0= ruleState )
            	    {
            	    // InternalStateConstraintTransition.g:1605:4: (lv_state_2_0= ruleState )
            	    // InternalStateConstraintTransition.g:1606:5: lv_state_2_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getConcernLevelAccess().getStateStateParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_state_2_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConcernLevelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"state",
            	    						lv_state_2_0,
            	    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.State");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_3=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConcernLevelAccess().getEnd_concernLevelKeyword_3());
            		
            // InternalStateConstraintTransition.g:1627:3: ( (otherlv_4= RULE_ID ) )
            // InternalStateConstraintTransition.g:1628:4: (otherlv_4= RULE_ID )
            {
            // InternalStateConstraintTransition.g:1628:4: (otherlv_4= RULE_ID )
            // InternalStateConstraintTransition.g:1629:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcernLevelRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getConcernLevelAccess().getEndConcernLevelConcernLevelCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcernLevel"


    // $ANTLR start "entryRuleSimpleConstraintState"
    // InternalStateConstraintTransition.g:1644:1: entryRuleSimpleConstraintState returns [EObject current=null] : iv_ruleSimpleConstraintState= ruleSimpleConstraintState EOF ;
    public final EObject entryRuleSimpleConstraintState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleConstraintState = null;


        try {
            // InternalStateConstraintTransition.g:1644:62: (iv_ruleSimpleConstraintState= ruleSimpleConstraintState EOF )
            // InternalStateConstraintTransition.g:1645:2: iv_ruleSimpleConstraintState= ruleSimpleConstraintState EOF
            {
             newCompositeNode(grammarAccess.getSimpleConstraintStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleConstraintState=ruleSimpleConstraintState();

            state._fsp--;

             current =iv_ruleSimpleConstraintState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleConstraintState"


    // $ANTLR start "ruleSimpleConstraintState"
    // InternalStateConstraintTransition.g:1651:1: ruleSimpleConstraintState returns [EObject current=null] : ( ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+ ) ;
    public final EObject ruleSimpleConstraintState() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_newVariable_2_0 = null;

        EObject lv_constraint_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1657:2: ( ( ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+ ) )
            // InternalStateConstraintTransition.g:1658:2: ( ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+ )
            {
            // InternalStateConstraintTransition.g:1658:2: ( ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+ )
            // InternalStateConstraintTransition.g:1659:3: ( (lv_type_0_0= 'simpleConstraintState' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_newVariable_2_0= ruleVariable ) )* ( (lv_constraint_3_0= ruleConstraint ) )+
            {
            // InternalStateConstraintTransition.g:1659:3: ( (lv_type_0_0= 'simpleConstraintState' ) )
            // InternalStateConstraintTransition.g:1660:4: (lv_type_0_0= 'simpleConstraintState' )
            {
            // InternalStateConstraintTransition.g:1660:4: (lv_type_0_0= 'simpleConstraintState' )
            // InternalStateConstraintTransition.g:1661:5: lv_type_0_0= 'simpleConstraintState'
            {
            lv_type_0_0=(Token)match(input,40,FOLLOW_3); 

            					newLeafNode(lv_type_0_0, grammarAccess.getSimpleConstraintStateAccess().getTypeSimpleConstraintStateKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleConstraintStateRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "simpleConstraintState");
            				

            }


            }

            // InternalStateConstraintTransition.g:1673:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateConstraintTransition.g:1674:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateConstraintTransition.g:1674:4: (lv_name_1_0= RULE_ID )
            // InternalStateConstraintTransition.g:1675:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSimpleConstraintStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleConstraintStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateConstraintTransition.g:1691:3: ( (lv_newVariable_2_0= ruleVariable ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=14 && LA26_0<=17)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:1692:4: (lv_newVariable_2_0= ruleVariable )
            	    {
            	    // InternalStateConstraintTransition.g:1692:4: (lv_newVariable_2_0= ruleVariable )
            	    // InternalStateConstraintTransition.g:1693:5: lv_newVariable_2_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleConstraintStateAccess().getNewVariableVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_newVariable_2_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleConstraintStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"newVariable",
            	    						lv_newVariable_2_0,
            	    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalStateConstraintTransition.g:1710:3: ( (lv_constraint_3_0= ruleConstraint ) )+
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
            	    // InternalStateConstraintTransition.g:1711:4: (lv_constraint_3_0= ruleConstraint )
            	    {
            	    // InternalStateConstraintTransition.g:1711:4: (lv_constraint_3_0= ruleConstraint )
            	    // InternalStateConstraintTransition.g:1712:5: lv_constraint_3_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleConstraintStateAccess().getConstraintConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_constraint_3_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleConstraintStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraint",
            	    						lv_constraint_3_0,
            	    						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleConstraintState"


    // $ANTLR start "entryRuleConstraint"
    // InternalStateConstraintTransition.g:1733:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalStateConstraintTransition.g:1733:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalStateConstraintTransition.g:1734:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalStateConstraintTransition.g:1740:1: ruleConstraint returns [EObject current=null] : this_Log_expr_0= ruleLog_expr ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_Log_expr_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1746:2: (this_Log_expr_0= ruleLog_expr )
            // InternalStateConstraintTransition.g:1747:2: this_Log_expr_0= ruleLog_expr
            {

            		newCompositeNode(grammarAccess.getConstraintAccess().getLog_exprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Log_expr_0=ruleLog_expr();

            state._fsp--;


            		current = this_Log_expr_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleLog_expr"
    // InternalStateConstraintTransition.g:1758:1: entryRuleLog_expr returns [EObject current=null] : iv_ruleLog_expr= ruleLog_expr EOF ;
    public final EObject entryRuleLog_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog_expr = null;


        try {
            // InternalStateConstraintTransition.g:1758:49: (iv_ruleLog_expr= ruleLog_expr EOF )
            // InternalStateConstraintTransition.g:1759:2: iv_ruleLog_expr= ruleLog_expr EOF
            {
             newCompositeNode(grammarAccess.getLog_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLog_expr=ruleLog_expr();

            state._fsp--;

             current =iv_ruleLog_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLog_expr"


    // $ANTLR start "ruleLog_expr"
    // InternalStateConstraintTransition.g:1765:1: ruleLog_expr returns [EObject current=null] : (this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )* ) ;
    public final EObject ruleLog_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_Or_expr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1771:2: ( (this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )* ) )
            // InternalStateConstraintTransition.g:1772:2: (this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )* )
            {
            // InternalStateConstraintTransition.g:1772:2: (this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )* )
            // InternalStateConstraintTransition.g:1773:3: this_Or_expr_0= ruleOr_expr ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )*
            {

            			newCompositeNode(grammarAccess.getLog_exprAccess().getOr_exprParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Or_expr_0=ruleOr_expr();

            state._fsp--;


            			current = this_Or_expr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateConstraintTransition.g:1781:3: ( () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=41 && LA29_0<=43)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:1782:4: () ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) ) ( (lv_right_3_0= ruleOr_expr ) )
            	    {
            	    // InternalStateConstraintTransition.g:1782:4: ()
            	    // InternalStateConstraintTransition.g:1783:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLog_exprAccess().getLog_exprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalStateConstraintTransition.g:1789:4: ( ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) ) )
            	    // InternalStateConstraintTransition.g:1790:5: ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) )
            	    {
            	    // InternalStateConstraintTransition.g:1790:5: ( (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' ) )
            	    // InternalStateConstraintTransition.g:1791:6: (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' )
            	    {
            	    // InternalStateConstraintTransition.g:1791:6: (lv_operator_2_1= '->' | lv_operator_2_2= '<->' | lv_operator_2_3= '<-' )
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
            	            // InternalStateConstraintTransition.g:1792:7: lv_operator_2_1= '->'
            	            {
            	            lv_operator_2_1=(Token)match(input,41,FOLLOW_37); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getLog_exprAccess().getOperatorHyphenMinusGreaterThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getLog_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalStateConstraintTransition.g:1803:7: lv_operator_2_2= '<->'
            	            {
            	            lv_operator_2_2=(Token)match(input,42,FOLLOW_37); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getLog_exprAccess().getOperatorLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getLog_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalStateConstraintTransition.g:1814:7: lv_operator_2_3= '<-'
            	            {
            	            lv_operator_2_3=(Token)match(input,43,FOLLOW_37); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getLog_exprAccess().getOperatorLessThanSignHyphenMinusKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getLog_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalStateConstraintTransition.g:1827:4: ( (lv_right_3_0= ruleOr_expr ) )
            	    // InternalStateConstraintTransition.g:1828:5: (lv_right_3_0= ruleOr_expr )
            	    {
            	    // InternalStateConstraintTransition.g:1828:5: (lv_right_3_0= ruleOr_expr )
            	    // InternalStateConstraintTransition.g:1829:6: lv_right_3_0= ruleOr_expr
            	    {

            	    						newCompositeNode(grammarAccess.getLog_exprAccess().getRightOr_exprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleOr_expr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLog_exprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Or_expr");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLog_expr"


    // $ANTLR start "entryRuleOr_expr"
    // InternalStateConstraintTransition.g:1851:1: entryRuleOr_expr returns [EObject current=null] : iv_ruleOr_expr= ruleOr_expr EOF ;
    public final EObject entryRuleOr_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr_expr = null;


        try {
            // InternalStateConstraintTransition.g:1851:48: (iv_ruleOr_expr= ruleOr_expr EOF )
            // InternalStateConstraintTransition.g:1852:2: iv_ruleOr_expr= ruleOr_expr EOF
            {
             newCompositeNode(grammarAccess.getOr_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr_expr=ruleOr_expr();

            state._fsp--;

             current =iv_ruleOr_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr_expr"


    // $ANTLR start "ruleOr_expr"
    // InternalStateConstraintTransition.g:1858:1: ruleOr_expr returns [EObject current=null] : (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )* ) ;
    public final EObject ruleOr_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_expr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1864:2: ( (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )* ) )
            // InternalStateConstraintTransition.g:1865:2: (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )* )
            {
            // InternalStateConstraintTransition.g:1865:2: (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )* )
            // InternalStateConstraintTransition.g:1866:3: this_And_expr_0= ruleAnd_expr ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )*
            {

            			newCompositeNode(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_And_expr_0=ruleAnd_expr();

            state._fsp--;


            			current = this_And_expr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateConstraintTransition.g:1874:3: ( () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==RULE_ID) ) {
                        int LA30_3 = input.LA(3);

                        if ( (LA30_3==EOF||(LA30_3>=RULE_ID && LA30_3<=RULE_INT)||LA30_3==18||(LA30_3>=25 && LA30_3<=26)||LA30_3==28||(LA30_3>=30 && LA30_3<=33)||(LA30_3>=35 && LA30_3<=36)||(LA30_3>=39 && LA30_3<=59)) ) {
                            alt30=1;
                        }
                        else if ( (LA30_3==34) ) {
                            int LA30_5 = input.LA(4);

                            if ( (LA30_5==RULE_INT||LA30_5==51||LA30_5==53||LA30_5==59) ) {
                                alt30=1;
                            }
                            else if ( ((LA30_5>=RULE_ID && LA30_5<=RULE_STRING)||LA30_5==35) ) {
                                alt30=1;
                            }


                        }


                    }
                    else if ( ((LA30_2>=RULE_STRING && LA30_2<=RULE_INT)||LA30_2==35||LA30_2==51||(LA30_2>=53 && LA30_2<=59)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:1875:4: () otherlv_2= '/\\\\' ( (lv_right_3_0= ruleAnd_expr ) )
            	    {
            	    // InternalStateConstraintTransition.g:1875:4: ()
            	    // InternalStateConstraintTransition.g:1876:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOr_exprAccess().getSolidusReverseSolidusKeyword_1_1());
            	    			
            	    // InternalStateConstraintTransition.g:1886:4: ( (lv_right_3_0= ruleAnd_expr ) )
            	    // InternalStateConstraintTransition.g:1887:5: (lv_right_3_0= ruleAnd_expr )
            	    {
            	    // InternalStateConstraintTransition.g:1887:5: (lv_right_3_0= ruleAnd_expr )
            	    // InternalStateConstraintTransition.g:1888:6: lv_right_3_0= ruleAnd_expr
            	    {

            	    						newCompositeNode(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleAnd_expr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOr_exprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.And_expr");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr_expr"


    // $ANTLR start "entryRuleAnd_expr"
    // InternalStateConstraintTransition.g:1910:1: entryRuleAnd_expr returns [EObject current=null] : iv_ruleAnd_expr= ruleAnd_expr EOF ;
    public final EObject entryRuleAnd_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd_expr = null;


        try {
            // InternalStateConstraintTransition.g:1910:49: (iv_ruleAnd_expr= ruleAnd_expr EOF )
            // InternalStateConstraintTransition.g:1911:2: iv_ruleAnd_expr= ruleAnd_expr EOF
            {
             newCompositeNode(grammarAccess.getAnd_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd_expr=ruleAnd_expr();

            state._fsp--;

             current =iv_ruleAnd_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd_expr"


    // $ANTLR start "ruleAnd_expr"
    // InternalStateConstraintTransition.g:1917:1: ruleAnd_expr returns [EObject current=null] : ( (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )* ) ;
    public final EObject ruleAnd_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Compare_expr_0 = null;

        EObject this_GlobalConstraint_1 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1923:2: ( ( (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )* ) )
            // InternalStateConstraintTransition.g:1924:2: ( (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )* )
            {
            // InternalStateConstraintTransition.g:1924:2: ( (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )* )
            // InternalStateConstraintTransition.g:1925:3: (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint ) ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )*
            {
            // InternalStateConstraintTransition.g:1925:3: (this_Compare_expr_0= ruleCompare_expr | this_GlobalConstraint_1= ruleGlobalConstraint )
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
                    // InternalStateConstraintTransition.g:1926:4: this_Compare_expr_0= ruleCompare_expr
                    {

                    				newCompositeNode(grammarAccess.getAnd_exprAccess().getCompare_exprParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_27);
                    this_Compare_expr_0=ruleCompare_expr();

                    state._fsp--;


                    				current = this_Compare_expr_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:1935:4: this_GlobalConstraint_1= ruleGlobalConstraint
                    {

                    				newCompositeNode(grammarAccess.getAnd_exprAccess().getGlobalConstraintParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_GlobalConstraint_1=ruleGlobalConstraint();

                    state._fsp--;


                    				current = this_GlobalConstraint_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalStateConstraintTransition.g:1944:3: ( () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) ) )*
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

                        if ( (LA32_4==EOF||(LA32_4>=RULE_ID && LA32_4<=RULE_INT)||LA32_4==18||(LA32_4>=25 && LA32_4<=26)||LA32_4==28||(LA32_4>=30 && LA32_4<=33)||(LA32_4>=35 && LA32_4<=36)||(LA32_4>=39 && LA32_4<=59)) ) {
                            alt32=1;
                        }
                        else if ( (LA32_4==34) ) {
                            int LA32_5 = input.LA(4);

                            if ( (LA32_5==RULE_INT||LA32_5==51||LA32_5==53||LA32_5==59) ) {
                                alt32=1;
                            }
                            else if ( ((LA32_5>=RULE_ID && LA32_5<=RULE_STRING)||LA32_5==35) ) {
                                alt32=1;
                            }


                        }


                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:1945:4: () otherlv_3= '\\\\/' ( (lv_right_4_0= ruleCompare_expr ) )
            	    {
            	    // InternalStateConstraintTransition.g:1945:4: ()
            	    // InternalStateConstraintTransition.g:1946:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_3=(Token)match(input,32,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAnd_exprAccess().getReverseSolidusSolidusKeyword_1_1());
            	    			
            	    // InternalStateConstraintTransition.g:1956:4: ( (lv_right_4_0= ruleCompare_expr ) )
            	    // InternalStateConstraintTransition.g:1957:5: (lv_right_4_0= ruleCompare_expr )
            	    {
            	    // InternalStateConstraintTransition.g:1957:5: (lv_right_4_0= ruleCompare_expr )
            	    // InternalStateConstraintTransition.g:1958:6: lv_right_4_0= ruleCompare_expr
            	    {

            	    						newCompositeNode(grammarAccess.getAnd_exprAccess().getRightCompare_exprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_4_0=ruleCompare_expr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAnd_exprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Compare_expr");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd_expr"


    // $ANTLR start "entryRuleCompare_expr"
    // InternalStateConstraintTransition.g:1980:1: entryRuleCompare_expr returns [EObject current=null] : iv_ruleCompare_expr= ruleCompare_expr EOF ;
    public final EObject entryRuleCompare_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare_expr = null;


        try {
            // InternalStateConstraintTransition.g:1980:53: (iv_ruleCompare_expr= ruleCompare_expr EOF )
            // InternalStateConstraintTransition.g:1981:2: iv_ruleCompare_expr= ruleCompare_expr EOF
            {
             newCompositeNode(grammarAccess.getCompare_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare_expr=ruleCompare_expr();

            state._fsp--;

             current =iv_ruleCompare_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompare_expr"


    // $ANTLR start "ruleCompare_expr"
    // InternalStateConstraintTransition.g:1987:1: ruleCompare_expr returns [EObject current=null] : (this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )* ) ;
    public final EObject ruleCompare_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        EObject this_math_expr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:1993:2: ( (this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )* ) )
            // InternalStateConstraintTransition.g:1994:2: (this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )* )
            {
            // InternalStateConstraintTransition.g:1994:2: (this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )* )
            // InternalStateConstraintTransition.g:1995:3: this_math_expr_0= rulemath_expr ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompare_exprAccess().getMath_exprParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_math_expr_0=rulemath_expr();

            state._fsp--;


            			current = this_math_expr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateConstraintTransition.g:2003:3: ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34||(LA34_0>=44 && LA34_0<=48)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:2004:4: () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= rulemath_expr ) )
            	    {
            	    // InternalStateConstraintTransition.g:2004:4: ()
            	    // InternalStateConstraintTransition.g:2005:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompare_exprAccess().getCompare_exprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalStateConstraintTransition.g:2011:4: ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) )
            	    // InternalStateConstraintTransition.g:2012:5: ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    {
            	    // InternalStateConstraintTransition.g:2012:5: ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    // InternalStateConstraintTransition.g:2013:6: (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    {
            	    // InternalStateConstraintTransition.g:2013:6: (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '=' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
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
            	            // InternalStateConstraintTransition.g:2014:7: lv_operator_2_1= '>='
            	            {
            	            lv_operator_2_1=(Token)match(input,44,FOLLOW_19); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getCompare_exprAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalStateConstraintTransition.g:2025:7: lv_operator_2_2= '<='
            	            {
            	            lv_operator_2_2=(Token)match(input,45,FOLLOW_19); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getCompare_exprAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalStateConstraintTransition.g:2036:7: lv_operator_2_3= '='
            	            {
            	            lv_operator_2_3=(Token)match(input,34,FOLLOW_19); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getCompare_exprAccess().getOperatorEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalStateConstraintTransition.g:2047:7: lv_operator_2_4= '!='
            	            {
            	            lv_operator_2_4=(Token)match(input,46,FOLLOW_19); 

            	            							newLeafNode(lv_operator_2_4, grammarAccess.getCompare_exprAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalStateConstraintTransition.g:2058:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,47,FOLLOW_19); 

            	            							newLeafNode(lv_operator_2_5, grammarAccess.getCompare_exprAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalStateConstraintTransition.g:2069:7: lv_operator_2_6= '<'
            	            {
            	            lv_operator_2_6=(Token)match(input,48,FOLLOW_19); 

            	            							newLeafNode(lv_operator_2_6, grammarAccess.getCompare_exprAccess().getOperatorLessThanSignKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_6, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalStateConstraintTransition.g:2082:4: ( (lv_right_3_0= rulemath_expr ) )
            	    // InternalStateConstraintTransition.g:2083:5: (lv_right_3_0= rulemath_expr )
            	    {
            	    // InternalStateConstraintTransition.g:2083:5: (lv_right_3_0= rulemath_expr )
            	    // InternalStateConstraintTransition.g:2084:6: lv_right_3_0= rulemath_expr
            	    {

            	    						newCompositeNode(grammarAccess.getCompare_exprAccess().getRightMath_exprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=rulemath_expr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompare_exprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.math_expr");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompare_expr"


    // $ANTLR start "entryRulemath_expr"
    // InternalStateConstraintTransition.g:2106:1: entryRulemath_expr returns [EObject current=null] : iv_rulemath_expr= rulemath_expr EOF ;
    public final EObject entryRulemath_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemath_expr = null;


        try {
            // InternalStateConstraintTransition.g:2106:50: (iv_rulemath_expr= rulemath_expr EOF )
            // InternalStateConstraintTransition.g:2107:2: iv_rulemath_expr= rulemath_expr EOF
            {
             newCompositeNode(grammarAccess.getMath_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemath_expr=rulemath_expr();

            state._fsp--;

             current =iv_rulemath_expr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemath_expr"


    // $ANTLR start "rulemath_expr"
    // InternalStateConstraintTransition.g:2113:1: rulemath_expr returns [EObject current=null] : (this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )* ) ;
    public final EObject rulemath_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_term_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2119:2: ( (this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )* ) )
            // InternalStateConstraintTransition.g:2120:2: (this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )* )
            {
            // InternalStateConstraintTransition.g:2120:2: (this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )* )
            // InternalStateConstraintTransition.g:2121:3: this_term_0= ruleterm ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )*
            {

            			newCompositeNode(grammarAccess.getMath_exprAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_term_0=ruleterm();

            state._fsp--;


            			current = this_term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateConstraintTransition.g:2129:3: ( () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=49 && LA36_0<=50)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:2130:4: () (otherlv_2= '+' | otherlv_3= '*' ) ( (lv_right_4_0= ruleterm ) )
            	    {
            	    // InternalStateConstraintTransition.g:2130:4: ()
            	    // InternalStateConstraintTransition.g:2131:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMath_exprAccess().getMath_exprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalStateConstraintTransition.g:2137:4: (otherlv_2= '+' | otherlv_3= '*' )
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
            	            // InternalStateConstraintTransition.g:2138:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_19); 

            	            					newLeafNode(otherlv_2, grammarAccess.getMath_exprAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalStateConstraintTransition.g:2143:5: otherlv_3= '*'
            	            {
            	            otherlv_3=(Token)match(input,50,FOLLOW_19); 

            	            					newLeafNode(otherlv_3, grammarAccess.getMath_exprAccess().getAsteriskKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalStateConstraintTransition.g:2148:4: ( (lv_right_4_0= ruleterm ) )
            	    // InternalStateConstraintTransition.g:2149:5: (lv_right_4_0= ruleterm )
            	    {
            	    // InternalStateConstraintTransition.g:2149:5: (lv_right_4_0= ruleterm )
            	    // InternalStateConstraintTransition.g:2150:6: lv_right_4_0= ruleterm
            	    {

            	    						newCompositeNode(grammarAccess.getMath_exprAccess().getRightTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_right_4_0=ruleterm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMath_exprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.term");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemath_expr"


    // $ANTLR start "entryRuleterm"
    // InternalStateConstraintTransition.g:2172:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalStateConstraintTransition.g:2172:45: (iv_ruleterm= ruleterm EOF )
            // InternalStateConstraintTransition.g:2173:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalStateConstraintTransition.g:2179:1: ruleterm returns [EObject current=null] : ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Constraint_1 = null;

        EObject lv_Constraint_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2185:2: ( ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalStateConstraintTransition.g:2186:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalStateConstraintTransition.g:2186:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) ) | this_Atomic_6= ruleAtomic )
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
                    // InternalStateConstraintTransition.g:2187:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    {
                    // InternalStateConstraintTransition.g:2187:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    // InternalStateConstraintTransition.g:2188:4: otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_37); 

                    				newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTermAccess().getConstraintParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_40);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;


                    				current = this_Constraint_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,52,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTermAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:2206:3: ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) )
                    {
                    // InternalStateConstraintTransition.g:2206:3: ( () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) ) )
                    // InternalStateConstraintTransition.g:2207:4: () otherlv_4= 'not' ( (lv_Constraint_5_0= ruleterm ) )
                    {
                    // InternalStateConstraintTransition.g:2207:4: ()
                    // InternalStateConstraintTransition.g:2208:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTermAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getTermAccess().getNotKeyword_1_1());
                    			
                    // InternalStateConstraintTransition.g:2218:4: ( (lv_Constraint_5_0= ruleterm ) )
                    // InternalStateConstraintTransition.g:2219:5: (lv_Constraint_5_0= ruleterm )
                    {
                    // InternalStateConstraintTransition.g:2219:5: (lv_Constraint_5_0= ruleterm )
                    // InternalStateConstraintTransition.g:2220:6: lv_Constraint_5_0= ruleterm
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getConstraintTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Constraint_5_0=ruleterm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						set(
                    							current,
                    							"Constraint",
                    							lv_Constraint_5_0,
                    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalStateConstraintTransition.g:2239:3: this_Atomic_6= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRuleAtomic"
    // InternalStateConstraintTransition.g:2251:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalStateConstraintTransition.g:2251:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalStateConstraintTransition.g:2252:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalStateConstraintTransition.g:2258:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (lv_value_3_0= ruleVariableName ) ) ) | ( () ( (lv_value_5_0= rulestrings ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2264:2: ( ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (lv_value_3_0= ruleVariableName ) ) ) | ( () ( (lv_value_5_0= rulestrings ) ) ) ) )
            // InternalStateConstraintTransition.g:2265:2: ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (lv_value_3_0= ruleVariableName ) ) ) | ( () ( (lv_value_5_0= rulestrings ) ) ) )
            {
            // InternalStateConstraintTransition.g:2265:2: ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (lv_value_3_0= ruleVariableName ) ) ) | ( () ( (lv_value_5_0= rulestrings ) ) ) )
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
                    // InternalStateConstraintTransition.g:2266:3: ( () ( (lv_value_1_0= ruleConstant ) ) )
                    {
                    // InternalStateConstraintTransition.g:2266:3: ( () ( (lv_value_1_0= ruleConstant ) ) )
                    // InternalStateConstraintTransition.g:2267:4: () ( (lv_value_1_0= ruleConstant ) )
                    {
                    // InternalStateConstraintTransition.g:2267:4: ()
                    // InternalStateConstraintTransition.g:2268:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalStateConstraintTransition.g:2274:4: ( (lv_value_1_0= ruleConstant ) )
                    // InternalStateConstraintTransition.g:2275:5: (lv_value_1_0= ruleConstant )
                    {
                    // InternalStateConstraintTransition.g:2275:5: (lv_value_1_0= ruleConstant )
                    // InternalStateConstraintTransition.g:2276:6: lv_value_1_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getValueConstantParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:2295:3: ( () ( (lv_value_3_0= ruleVariableName ) ) )
                    {
                    // InternalStateConstraintTransition.g:2295:3: ( () ( (lv_value_3_0= ruleVariableName ) ) )
                    // InternalStateConstraintTransition.g:2296:4: () ( (lv_value_3_0= ruleVariableName ) )
                    {
                    // InternalStateConstraintTransition.g:2296:4: ()
                    // InternalStateConstraintTransition.g:2297:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVarAction_1_0(),
                    						current);
                    				

                    }

                    // InternalStateConstraintTransition.g:2303:4: ( (lv_value_3_0= ruleVariableName ) )
                    // InternalStateConstraintTransition.g:2304:5: (lv_value_3_0= ruleVariableName )
                    {
                    // InternalStateConstraintTransition.g:2304:5: (lv_value_3_0= ruleVariableName )
                    // InternalStateConstraintTransition.g:2305:6: lv_value_3_0= ruleVariableName
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getValueVariableNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleVariableName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.VariableName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalStateConstraintTransition.g:2324:3: ( () ( (lv_value_5_0= rulestrings ) ) )
                    {
                    // InternalStateConstraintTransition.g:2324:3: ( () ( (lv_value_5_0= rulestrings ) ) )
                    // InternalStateConstraintTransition.g:2325:4: () ( (lv_value_5_0= rulestrings ) )
                    {
                    // InternalStateConstraintTransition.g:2325:4: ()
                    // InternalStateConstraintTransition.g:2326:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringAction_2_0(),
                    						current);
                    				

                    }

                    // InternalStateConstraintTransition.g:2332:4: ( (lv_value_5_0= rulestrings ) )
                    // InternalStateConstraintTransition.g:2333:5: (lv_value_5_0= rulestrings )
                    {
                    // InternalStateConstraintTransition.g:2333:5: (lv_value_5_0= rulestrings )
                    // InternalStateConstraintTransition.g:2334:6: lv_value_5_0= rulestrings
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getValueStringsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=rulestrings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.strings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleVariableName"
    // InternalStateConstraintTransition.g:2356:1: entryRuleVariableName returns [EObject current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final EObject entryRuleVariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableName = null;


        try {
            // InternalStateConstraintTransition.g:2356:53: (iv_ruleVariableName= ruleVariableName EOF )
            // InternalStateConstraintTransition.g:2357:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // InternalStateConstraintTransition.g:2363:1: ruleVariableName returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleVariableName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_instance_2_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2369:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )? ) )
            // InternalStateConstraintTransition.g:2370:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )? )
            {
            // InternalStateConstraintTransition.g:2370:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )? )
            // InternalStateConstraintTransition.g:2371:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )?
            {
            // InternalStateConstraintTransition.g:2371:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateConstraintTransition.g:2372:4: (otherlv_0= RULE_ID )
            {
            // InternalStateConstraintTransition.g:2372:4: (otherlv_0= RULE_ID )
            // InternalStateConstraintTransition.g:2373:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableNameRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_0, grammarAccess.getVariableNameAccess().getNameVariableCrossReference_0_0());
            				

            }


            }

            // InternalStateConstraintTransition.g:2384:3: (otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalStateConstraintTransition.g:2385:4: otherlv_1= '[' ( (lv_instance_2_0= ruleIntValue ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariableNameAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalStateConstraintTransition.g:2389:4: ( (lv_instance_2_0= ruleIntValue ) )
                    // InternalStateConstraintTransition.g:2390:5: (lv_instance_2_0= ruleIntValue )
                    {
                    // InternalStateConstraintTransition.g:2390:5: (lv_instance_2_0= ruleIntValue )
                    // InternalStateConstraintTransition.g:2391:6: lv_instance_2_0= ruleIntValue
                    {

                    						newCompositeNode(grammarAccess.getVariableNameAccess().getInstanceIntValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_instance_2_0=ruleIntValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableNameRule());
                    						}
                    						set(
                    							current,
                    							"instance",
                    							lv_instance_2_0,
                    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.IntValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableNameAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleGlobalConstraint"
    // InternalStateConstraintTransition.g:2417:1: entryRuleGlobalConstraint returns [EObject current=null] : iv_ruleGlobalConstraint= ruleGlobalConstraint EOF ;
    public final EObject entryRuleGlobalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalConstraint = null;


        try {
            // InternalStateConstraintTransition.g:2417:57: (iv_ruleGlobalConstraint= ruleGlobalConstraint EOF )
            // InternalStateConstraintTransition.g:2418:2: iv_ruleGlobalConstraint= ruleGlobalConstraint EOF
            {
             newCompositeNode(grammarAccess.getGlobalConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalConstraint=ruleGlobalConstraint();

            state._fsp--;

             current =iv_ruleGlobalConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalConstraint"


    // $ANTLR start "ruleGlobalConstraint"
    // InternalStateConstraintTransition.g:2424:1: ruleGlobalConstraint returns [EObject current=null] : (this_group_valuation_0= rulegroup_valuation | this_group_most_least_1= rulegroup_most_least | this_Max_Min_2= ruleMax_Min ) ;
    public final EObject ruleGlobalConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_group_valuation_0 = null;

        EObject this_group_most_least_1 = null;

        EObject this_Max_Min_2 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2430:2: ( (this_group_valuation_0= rulegroup_valuation | this_group_most_least_1= rulegroup_most_least | this_Max_Min_2= ruleMax_Min ) )
            // InternalStateConstraintTransition.g:2431:2: (this_group_valuation_0= rulegroup_valuation | this_group_most_least_1= rulegroup_most_least | this_Max_Min_2= ruleMax_Min )
            {
            // InternalStateConstraintTransition.g:2431:2: (this_group_valuation_0= rulegroup_valuation | this_group_most_least_1= rulegroup_most_least | this_Max_Min_2= ruleMax_Min )
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
                    // InternalStateConstraintTransition.g:2432:3: this_group_valuation_0= rulegroup_valuation
                    {

                    			newCompositeNode(grammarAccess.getGlobalConstraintAccess().getGroup_valuationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_group_valuation_0=rulegroup_valuation();

                    state._fsp--;


                    			current = this_group_valuation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:2441:3: this_group_most_least_1= rulegroup_most_least
                    {

                    			newCompositeNode(grammarAccess.getGlobalConstraintAccess().getGroup_most_leastParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_group_most_least_1=rulegroup_most_least();

                    state._fsp--;


                    			current = this_group_most_least_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStateConstraintTransition.g:2450:3: this_Max_Min_2= ruleMax_Min
                    {

                    			newCompositeNode(grammarAccess.getGlobalConstraintAccess().getMax_MinParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Max_Min_2=ruleMax_Min();

                    state._fsp--;


                    			current = this_Max_Min_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalConstraint"


    // $ANTLR start "entryRulegroup_most_least"
    // InternalStateConstraintTransition.g:2462:1: entryRulegroup_most_least returns [EObject current=null] : iv_rulegroup_most_least= rulegroup_most_least EOF ;
    public final EObject entryRulegroup_most_least() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroup_most_least = null;


        try {
            // InternalStateConstraintTransition.g:2462:57: (iv_rulegroup_most_least= rulegroup_most_least EOF )
            // InternalStateConstraintTransition.g:2463:2: iv_rulegroup_most_least= rulegroup_most_least EOF
            {
             newCompositeNode(grammarAccess.getGroup_most_leastRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegroup_most_least=rulegroup_most_least();

            state._fsp--;

             current =iv_rulegroup_most_least; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup_most_least"


    // $ANTLR start "rulegroup_most_least"
    // InternalStateConstraintTransition.g:2469:1: rulegroup_most_least returns [EObject current=null] : ( (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')' ) ;
    public final EObject rulegroup_most_least() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_instances_2_0 = null;

        EObject lv_variables_4_0 = null;

        EObject lv_atomic_7_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2475:2: ( ( (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')' ) )
            // InternalStateConstraintTransition.g:2476:2: ( (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')' )
            {
            // InternalStateConstraintTransition.g:2476:2: ( (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')' )
            // InternalStateConstraintTransition.g:2477:3: (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' ) ( (lv_instances_2_0= ruleIntValue ) ) otherlv_3= ',' ( (lv_variables_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ',' ( (lv_atomic_7_0= ruleAtomic ) ) otherlv_8= ')'
            {
            // InternalStateConstraintTransition.g:2477:3: (otherlv_0= 'at_least(' | otherlv_1= 'at_most(' )
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
                    // InternalStateConstraintTransition.g:2478:4: otherlv_0= 'at_least('
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getGroup_most_leastAccess().getAt_leastKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:2483:4: otherlv_1= 'at_most('
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getGroup_most_leastAccess().getAt_mostKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalStateConstraintTransition.g:2488:3: ( (lv_instances_2_0= ruleIntValue ) )
            // InternalStateConstraintTransition.g:2489:4: (lv_instances_2_0= ruleIntValue )
            {
            // InternalStateConstraintTransition.g:2489:4: (lv_instances_2_0= ruleIntValue )
            // InternalStateConstraintTransition.g:2490:5: lv_instances_2_0= ruleIntValue
            {

            					newCompositeNode(grammarAccess.getGroup_most_leastAccess().getInstancesIntValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_instances_2_0=ruleIntValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroup_most_leastRule());
            					}
            					set(
            						current,
            						"instances",
            						lv_instances_2_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.IntValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getGroup_most_leastAccess().getCommaKeyword_2());
            		
            // InternalStateConstraintTransition.g:2511:3: ( (lv_variables_4_0= rulevarEnumeration ) )
            // InternalStateConstraintTransition.g:2512:4: (lv_variables_4_0= rulevarEnumeration )
            {
            // InternalStateConstraintTransition.g:2512:4: (lv_variables_4_0= rulevarEnumeration )
            // InternalStateConstraintTransition.g:2513:5: lv_variables_4_0= rulevarEnumeration
            {

            					newCompositeNode(grammarAccess.getGroup_most_leastAccess().getVariablesVarEnumerationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_variables_4_0=rulevarEnumeration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroup_most_leastRule());
            					}
            					set(
            						current,
            						"variables",
            						lv_variables_4_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.varEnumeration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getGroup_most_leastAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getGroup_most_leastAccess().getCommaKeyword_5());
            		
            // InternalStateConstraintTransition.g:2538:3: ( (lv_atomic_7_0= ruleAtomic ) )
            // InternalStateConstraintTransition.g:2539:4: (lv_atomic_7_0= ruleAtomic )
            {
            // InternalStateConstraintTransition.g:2539:4: (lv_atomic_7_0= ruleAtomic )
            // InternalStateConstraintTransition.g:2540:5: lv_atomic_7_0= ruleAtomic
            {

            					newCompositeNode(grammarAccess.getGroup_most_leastAccess().getAtomicAtomicParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_40);
            lv_atomic_7_0=ruleAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroup_most_leastRule());
            					}
            					set(
            						current,
            						"atomic",
            						lv_atomic_7_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Atomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGroup_most_leastAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegroup_most_least"


    // $ANTLR start "entryRulegroup_valuation"
    // InternalStateConstraintTransition.g:2565:1: entryRulegroup_valuation returns [EObject current=null] : iv_rulegroup_valuation= rulegroup_valuation EOF ;
    public final EObject entryRulegroup_valuation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroup_valuation = null;


        try {
            // InternalStateConstraintTransition.g:2565:56: (iv_rulegroup_valuation= rulegroup_valuation EOF )
            // InternalStateConstraintTransition.g:2566:2: iv_rulegroup_valuation= rulegroup_valuation EOF
            {
             newCompositeNode(grammarAccess.getGroup_valuationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegroup_valuation=rulegroup_valuation();

            state._fsp--;

             current =iv_rulegroup_valuation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup_valuation"


    // $ANTLR start "rulegroup_valuation"
    // InternalStateConstraintTransition.g:2572:1: rulegroup_valuation returns [EObject current=null] : (otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')' ) ;
    public final EObject rulegroup_valuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_var_1_0 = null;

        EObject lv_atomic_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2578:2: ( (otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')' ) )
            // InternalStateConstraintTransition.g:2579:2: (otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')' )
            {
            // InternalStateConstraintTransition.g:2579:2: (otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')' )
            // InternalStateConstraintTransition.g:2580:3: otherlv_0= 'all_equal(' ( (lv_var_1_0= rulevarEnumeration ) ) otherlv_2= ',' ( (lv_atomic_3_0= ruleAtomic ) ) otherlv_4= ']' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getGroup_valuationAccess().getAll_equalKeyword_0());
            		
            // InternalStateConstraintTransition.g:2584:3: ( (lv_var_1_0= rulevarEnumeration ) )
            // InternalStateConstraintTransition.g:2585:4: (lv_var_1_0= rulevarEnumeration )
            {
            // InternalStateConstraintTransition.g:2585:4: (lv_var_1_0= rulevarEnumeration )
            // InternalStateConstraintTransition.g:2586:5: lv_var_1_0= rulevarEnumeration
            {

            					newCompositeNode(grammarAccess.getGroup_valuationAccess().getVarVarEnumerationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_var_1_0=rulevarEnumeration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroup_valuationRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.varEnumeration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getGroup_valuationAccess().getCommaKeyword_2());
            		
            // InternalStateConstraintTransition.g:2607:3: ( (lv_atomic_3_0= ruleAtomic ) )
            // InternalStateConstraintTransition.g:2608:4: (lv_atomic_3_0= ruleAtomic )
            {
            // InternalStateConstraintTransition.g:2608:4: (lv_atomic_3_0= ruleAtomic )
            // InternalStateConstraintTransition.g:2609:5: lv_atomic_3_0= ruleAtomic
            {

            					newCompositeNode(grammarAccess.getGroup_valuationAccess().getAtomicAtomicParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_atomic_3_0=ruleAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroup_valuationRule());
            					}
            					set(
            						current,
            						"atomic",
            						lv_atomic_3_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.Atomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getGroup_valuationAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGroup_valuationAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegroup_valuation"


    // $ANTLR start "entryRuleMax_Min"
    // InternalStateConstraintTransition.g:2638:1: entryRuleMax_Min returns [EObject current=null] : iv_ruleMax_Min= ruleMax_Min EOF ;
    public final EObject entryRuleMax_Min() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMax_Min = null;


        try {
            // InternalStateConstraintTransition.g:2638:48: (iv_ruleMax_Min= ruleMax_Min EOF )
            // InternalStateConstraintTransition.g:2639:2: iv_ruleMax_Min= ruleMax_Min EOF
            {
             newCompositeNode(grammarAccess.getMax_MinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMax_Min=ruleMax_Min();

            state._fsp--;

             current =iv_ruleMax_Min; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMax_Min"


    // $ANTLR start "ruleMax_Min"
    // InternalStateConstraintTransition.g:2645:1: ruleMax_Min returns [EObject current=null] : ( (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')' ) ;
    public final EObject ruleMax_Min() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_var_2_0 = null;

        EObject lv_var_4_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2651:2: ( ( (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')' ) )
            // InternalStateConstraintTransition.g:2652:2: ( (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')' )
            {
            // InternalStateConstraintTransition.g:2652:2: ( (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')' )
            // InternalStateConstraintTransition.g:2653:3: (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' ) ( (lv_var_2_0= ruleVariableName ) ) otherlv_3= ',' ( (lv_var_4_0= rulevarEnumeration ) ) otherlv_5= ']' otherlv_6= ')'
            {
            // InternalStateConstraintTransition.g:2653:3: (otherlv_0= 'maximum(' | otherlv_1= 'minimum(' )
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
                    // InternalStateConstraintTransition.g:2654:4: otherlv_0= 'maximum('
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getMax_MinAccess().getMaximumKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:2659:4: otherlv_1= 'minimum('
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMax_MinAccess().getMinimumKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalStateConstraintTransition.g:2664:3: ( (lv_var_2_0= ruleVariableName ) )
            // InternalStateConstraintTransition.g:2665:4: (lv_var_2_0= ruleVariableName )
            {
            // InternalStateConstraintTransition.g:2665:4: (lv_var_2_0= ruleVariableName )
            // InternalStateConstraintTransition.g:2666:5: lv_var_2_0= ruleVariableName
            {

            					newCompositeNode(grammarAccess.getMax_MinAccess().getVarVariableNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_var_2_0=ruleVariableName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMax_MinRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.VariableName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getMax_MinAccess().getCommaKeyword_2());
            		
            // InternalStateConstraintTransition.g:2687:3: ( (lv_var_4_0= rulevarEnumeration ) )
            // InternalStateConstraintTransition.g:2688:4: (lv_var_4_0= rulevarEnumeration )
            {
            // InternalStateConstraintTransition.g:2688:4: (lv_var_4_0= rulevarEnumeration )
            // InternalStateConstraintTransition.g:2689:5: lv_var_4_0= rulevarEnumeration
            {

            					newCompositeNode(grammarAccess.getMax_MinAccess().getVarVarEnumerationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_var_4_0=rulevarEnumeration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMax_MinRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_4_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.varEnumeration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getMax_MinAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMax_MinAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMax_Min"


    // $ANTLR start "entryRulevarEnumeration"
    // InternalStateConstraintTransition.g:2718:1: entryRulevarEnumeration returns [EObject current=null] : iv_rulevarEnumeration= rulevarEnumeration EOF ;
    public final EObject entryRulevarEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarEnumeration = null;


        try {
            // InternalStateConstraintTransition.g:2718:55: (iv_rulevarEnumeration= rulevarEnumeration EOF )
            // InternalStateConstraintTransition.g:2719:2: iv_rulevarEnumeration= rulevarEnumeration EOF
            {
             newCompositeNode(grammarAccess.getVarEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevarEnumeration=rulevarEnumeration();

            state._fsp--;

             current =iv_rulevarEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevarEnumeration"


    // $ANTLR start "rulevarEnumeration"
    // InternalStateConstraintTransition.g:2725:1: rulevarEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+ ) ;
    public final EObject rulevarEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_varName_1_0 = null;

        EObject lv_varName_3_0 = null;



        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2731:2: ( (otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+ ) )
            // InternalStateConstraintTransition.g:2732:2: (otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+ )
            {
            // InternalStateConstraintTransition.g:2732:2: (otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+ )
            // InternalStateConstraintTransition.g:2733:3: otherlv_0= '[' ( (lv_varName_1_0= ruleVariableName ) ) (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalStateConstraintTransition.g:2737:3: ( (lv_varName_1_0= ruleVariableName ) )
            // InternalStateConstraintTransition.g:2738:4: (lv_varName_1_0= ruleVariableName )
            {
            // InternalStateConstraintTransition.g:2738:4: (lv_varName_1_0= ruleVariableName )
            // InternalStateConstraintTransition.g:2739:5: lv_varName_1_0= ruleVariableName
            {

            					newCompositeNode(grammarAccess.getVarEnumerationAccess().getVarNameVariableNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_varName_1_0=ruleVariableName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarEnumerationRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.xtext.example.stateconstrainttransition.StateConstraintTransition.VariableName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateConstraintTransition.g:2756:3: (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:2757:4: otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVarEnumerationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStateConstraintTransition.g:2761:4: ( (lv_varName_3_0= ruleVariableName ) )
            	    // InternalStateConstraintTransition.g:2762:5: (lv_varName_3_0= ruleVariableName )
            	    {
            	    // InternalStateConstraintTransition.g:2762:5: (lv_varName_3_0= ruleVariableName )
            	    // InternalStateConstraintTransition.g:2763:6: lv_varName_3_0= ruleVariableName
            	    {

            	    						newCompositeNode(grammarAccess.getVarEnumerationAccess().getVarNameVariableNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_varName_3_0=ruleVariableName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarEnumerationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"varName",
            	    							lv_varName_3_0,
            	    							"org.xtext.example.stateconstrainttransition.StateConstraintTransition.VariableName");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevarEnumeration"


    // $ANTLR start "entryRuleFQN"
    // InternalStateConstraintTransition.g:2785:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalStateConstraintTransition.g:2785:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalStateConstraintTransition.g:2786:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalStateConstraintTransition.g:2792:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2798:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalStateConstraintTransition.g:2799:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalStateConstraintTransition.g:2799:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalStateConstraintTransition.g:2800:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalStateConstraintTransition.g:2807:3: (kw= '.' this_ID_2= RULE_ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==21) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalStateConstraintTransition.g:2808:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_44); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleIntValue"
    // InternalStateConstraintTransition.g:2825:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // InternalStateConstraintTransition.g:2825:48: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalStateConstraintTransition.g:2826:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalStateConstraintTransition.g:2832:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '0' | kw= '1' ) ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2838:2: ( (this_INT_0= RULE_INT | kw= '0' | kw= '1' ) )
            // InternalStateConstraintTransition.g:2839:2: (this_INT_0= RULE_INT | kw= '0' | kw= '1' )
            {
            // InternalStateConstraintTransition.g:2839:2: (this_INT_0= RULE_INT | kw= '0' | kw= '1' )
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
                    // InternalStateConstraintTransition.g:2840:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getIntValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:2848:3: kw= '0'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIntValueAccess().getDigitZeroKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalStateConstraintTransition.g:2854:3: kw= '1'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIntValueAccess().getDigitOneKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleConstant"
    // InternalStateConstraintTransition.g:2863:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalStateConstraintTransition.g:2863:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalStateConstraintTransition.g:2864:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalStateConstraintTransition.g:2870:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '0' | kw= '1' ) ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalStateConstraintTransition.g:2876:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '0' | kw= '1' ) ) )
            // InternalStateConstraintTransition.g:2877:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '0' | kw= '1' ) )
            {
            // InternalStateConstraintTransition.g:2877:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '0' | kw= '1' ) )
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
                    // InternalStateConstraintTransition.g:2878:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getConstantAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateConstraintTransition.g:2886:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // InternalStateConstraintTransition.g:2886:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // InternalStateConstraintTransition.g:2887:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_16); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getConstantAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,21,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConstantAccess().getFullStopKeyword_1_1());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getConstantAccess().getINTTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalStateConstraintTransition.g:2908:3: (kw= '0' | kw= '1' )
                    {
                    // InternalStateConstraintTransition.g:2908:3: (kw= '0' | kw= '1' )
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
                            // InternalStateConstraintTransition.g:2909:4: kw= '0'
                            {
                            kw=(Token)match(input,59,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getConstantAccess().getDigitZeroKeyword_2_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalStateConstraintTransition.g:2915:4: kw= '1'
                            {
                            kw=(Token)match(input,35,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getConstantAccess().getDigitOneKeyword_2_1());
                            			

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
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
            "\1\12\40\uffff\1\12",
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
            return "()+ loopback of 2756:3: (otherlv_2= ',' ( (lv_varName_3_0= ruleVariableName ) ) )+";
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