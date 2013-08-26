package snomed.visualization.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import snomed.visualization.dsl.services.VisualizationDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVisualizationDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TERM", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'+'", "'{'", "','", "'}'", "'='", "'|'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_TERM=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalVisualizationDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVisualizationDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVisualizationDslParser.tokenNames; }
    public String getGrammarFileName() { return "../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g"; }



     	private VisualizationDslGrammarAccess grammarAccess;
     	
        public InternalVisualizationDslParser(TokenStream input, VisualizationDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected VisualizationDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:79:28: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:80:1: ( (lv_expression_0_0= ruleExpression ) )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:80:1: ( (lv_expression_0_0= ruleExpression ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:81:1: (lv_expression_0_0= ruleExpression )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:81:1: (lv_expression_0_0= ruleExpression )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:82:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleModel130);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"Expression");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:106:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:107:2: (iv_ruleExpression= ruleExpression EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:108:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression165);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression175); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:115:1: ruleExpression returns [EObject current=null] : ( ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (otherlv_1= ':' ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_isaRelationships_0_0 = null;

        EObject lv_ungroupedRelationships_2_0 = null;

        EObject lv_groupedRelationships_3_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:118:28: ( ( ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (otherlv_1= ':' ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )? ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:119:1: ( ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (otherlv_1= ':' ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )? )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:119:1: ( ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (otherlv_1= ':' ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )? )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:119:2: ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (otherlv_1= ':' ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )?
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:119:2: ( (lv_isaRelationships_0_0= ruleIsaRelationships ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:120:1: (lv_isaRelationships_0_0= ruleIsaRelationships )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:120:1: (lv_isaRelationships_0_0= ruleIsaRelationships )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:121:3: lv_isaRelationships_0_0= ruleIsaRelationships
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getIsaRelationshipsIsaRelationshipsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIsaRelationships_in_ruleExpression221);
            lv_isaRelationships_0_0=ruleIsaRelationships();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"isaRelationships",
                    		lv_isaRelationships_0_0, 
                    		"IsaRelationships");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:137:2: (otherlv_1= ':' ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:137:4: otherlv_1= ':' ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )*
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleExpression234); 

                        	newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getColonKeyword_1_0());
                        
                    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:141:1: ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:142:1: (lv_ungroupedRelationships_2_0= ruleRelationships )
                    	    {
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:142:1: (lv_ungroupedRelationships_2_0= ruleRelationships )
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:143:3: lv_ungroupedRelationships_2_0= ruleRelationships
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpressionAccess().getUngroupedRelationshipsRelationshipsParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRelationships_in_ruleExpression255);
                    	    lv_ungroupedRelationships_2_0=ruleRelationships();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"ungroupedRelationships",
                    	            		lv_ungroupedRelationships_2_0, 
                    	            		"Relationships");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:159:3: ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:160:1: (lv_groupedRelationships_3_0= ruleRelationshipGroup )
                    	    {
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:160:1: (lv_groupedRelationships_3_0= ruleRelationshipGroup )
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:161:3: lv_groupedRelationships_3_0= ruleRelationshipGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpressionAccess().getGroupedRelationshipsRelationshipGroupParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRelationshipGroup_in_ruleExpression277);
                    	    lv_groupedRelationships_3_0=ruleRelationshipGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groupedRelationships",
                    	            		lv_groupedRelationships_3_0, 
                    	            		"RelationshipGroup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIsaRelationships"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:185:1: entryRuleIsaRelationships returns [EObject current=null] : iv_ruleIsaRelationships= ruleIsaRelationships EOF ;
    public final EObject entryRuleIsaRelationships() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsaRelationships = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:186:2: (iv_ruleIsaRelationships= ruleIsaRelationships EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:187:2: iv_ruleIsaRelationships= ruleIsaRelationships EOF
            {
             newCompositeNode(grammarAccess.getIsaRelationshipsRule()); 
            pushFollow(FOLLOW_ruleIsaRelationships_in_entryRuleIsaRelationships316);
            iv_ruleIsaRelationships=ruleIsaRelationships();

            state._fsp--;

             current =iv_ruleIsaRelationships; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsaRelationships326); 

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
    // $ANTLR end "entryRuleIsaRelationships"


    // $ANTLR start "ruleIsaRelationships"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:194:1: ruleIsaRelationships returns [EObject current=null] : ( ( (lv_relationships_0_0= ruleConcept ) ) (otherlv_1= '+' ( (lv_relationships_2_0= ruleConcept ) ) )* ) ;
    public final EObject ruleIsaRelationships() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_relationships_0_0 = null;

        EObject lv_relationships_2_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:197:28: ( ( ( (lv_relationships_0_0= ruleConcept ) ) (otherlv_1= '+' ( (lv_relationships_2_0= ruleConcept ) ) )* ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:198:1: ( ( (lv_relationships_0_0= ruleConcept ) ) (otherlv_1= '+' ( (lv_relationships_2_0= ruleConcept ) ) )* )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:198:1: ( ( (lv_relationships_0_0= ruleConcept ) ) (otherlv_1= '+' ( (lv_relationships_2_0= ruleConcept ) ) )* )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:198:2: ( (lv_relationships_0_0= ruleConcept ) ) (otherlv_1= '+' ( (lv_relationships_2_0= ruleConcept ) ) )*
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:198:2: ( (lv_relationships_0_0= ruleConcept ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:199:1: (lv_relationships_0_0= ruleConcept )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:199:1: (lv_relationships_0_0= ruleConcept )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:200:3: lv_relationships_0_0= ruleConcept
            {
             
            	        newCompositeNode(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConcept_in_ruleIsaRelationships372);
            lv_relationships_0_0=ruleConcept();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIsaRelationshipsRule());
            	        }
                   		add(
                   			current, 
                   			"relationships",
                    		lv_relationships_0_0, 
                    		"Concept");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:216:2: (otherlv_1= '+' ( (lv_relationships_2_0= ruleConcept ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:216:4: otherlv_1= '+' ( (lv_relationships_2_0= ruleConcept ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleIsaRelationships385); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIsaRelationshipsAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:220:1: ( (lv_relationships_2_0= ruleConcept ) )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:221:1: (lv_relationships_2_0= ruleConcept )
            	    {
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:221:1: (lv_relationships_2_0= ruleConcept )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:222:3: lv_relationships_2_0= ruleConcept
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConcept_in_ruleIsaRelationships406);
            	    lv_relationships_2_0=ruleConcept();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIsaRelationshipsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationships",
            	            		lv_relationships_2_0, 
            	            		"Concept");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleIsaRelationships"


    // $ANTLR start "entryRuleRelationshipGroup"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:246:1: entryRuleRelationshipGroup returns [EObject current=null] : iv_ruleRelationshipGroup= ruleRelationshipGroup EOF ;
    public final EObject entryRuleRelationshipGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipGroup = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:247:2: (iv_ruleRelationshipGroup= ruleRelationshipGroup EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:248:2: iv_ruleRelationshipGroup= ruleRelationshipGroup EOF
            {
             newCompositeNode(grammarAccess.getRelationshipGroupRule()); 
            pushFollow(FOLLOW_ruleRelationshipGroup_in_entryRuleRelationshipGroup444);
            iv_ruleRelationshipGroup=ruleRelationshipGroup();

            state._fsp--;

             current =iv_ruleRelationshipGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipGroup454); 

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
    // $ANTLR end "entryRuleRelationshipGroup"


    // $ANTLR start "ruleRelationshipGroup"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:255:1: ruleRelationshipGroup returns [EObject current=null] : (otherlv_0= '{' ( (lv_relationships_1_0= ruleRelationship ) ) (otherlv_2= ',' ( (lv_relationships_3_0= ruleRelationship ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleRelationshipGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_relationships_1_0 = null;

        EObject lv_relationships_3_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:258:28: ( (otherlv_0= '{' ( (lv_relationships_1_0= ruleRelationship ) ) (otherlv_2= ',' ( (lv_relationships_3_0= ruleRelationship ) ) )* otherlv_4= '}' ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:259:1: (otherlv_0= '{' ( (lv_relationships_1_0= ruleRelationship ) ) (otherlv_2= ',' ( (lv_relationships_3_0= ruleRelationship ) ) )* otherlv_4= '}' )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:259:1: (otherlv_0= '{' ( (lv_relationships_1_0= ruleRelationship ) ) (otherlv_2= ',' ( (lv_relationships_3_0= ruleRelationship ) ) )* otherlv_4= '}' )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:259:3: otherlv_0= '{' ( (lv_relationships_1_0= ruleRelationship ) ) (otherlv_2= ',' ( (lv_relationships_3_0= ruleRelationship ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleRelationshipGroup491); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationshipGroupAccess().getLeftCurlyBracketKeyword_0());
                
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:263:1: ( (lv_relationships_1_0= ruleRelationship ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:264:1: (lv_relationships_1_0= ruleRelationship )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:264:1: (lv_relationships_1_0= ruleRelationship )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:265:3: lv_relationships_1_0= ruleRelationship
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationship_in_ruleRelationshipGroup512);
            lv_relationships_1_0=ruleRelationship();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipGroupRule());
            	        }
                   		add(
                   			current, 
                   			"relationships",
                    		lv_relationships_1_0, 
                    		"Relationship");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:281:2: (otherlv_2= ',' ( (lv_relationships_3_0= ruleRelationship ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:281:4: otherlv_2= ',' ( (lv_relationships_3_0= ruleRelationship ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRelationshipGroup525); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRelationshipGroupAccess().getCommaKeyword_2_0());
            	        
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:285:1: ( (lv_relationships_3_0= ruleRelationship ) )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:286:1: (lv_relationships_3_0= ruleRelationship )
            	    {
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:286:1: (lv_relationships_3_0= ruleRelationship )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:287:3: lv_relationships_3_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleRelationshipGroup546);
            	    lv_relationships_3_0=ruleRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationshipGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationships",
            	            		lv_relationships_3_0, 
            	            		"Relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRelationshipGroup560); 

                	newLeafNode(otherlv_4, grammarAccess.getRelationshipGroupAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleRelationshipGroup"


    // $ANTLR start "entryRuleRelationships"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:315:1: entryRuleRelationships returns [EObject current=null] : iv_ruleRelationships= ruleRelationships EOF ;
    public final EObject entryRuleRelationships() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationships = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:316:2: (iv_ruleRelationships= ruleRelationships EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:317:2: iv_ruleRelationships= ruleRelationships EOF
            {
             newCompositeNode(grammarAccess.getRelationshipsRule()); 
            pushFollow(FOLLOW_ruleRelationships_in_entryRuleRelationships596);
            iv_ruleRelationships=ruleRelationships();

            state._fsp--;

             current =iv_ruleRelationships; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationships606); 

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
    // $ANTLR end "entryRuleRelationships"


    // $ANTLR start "ruleRelationships"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:324:1: ruleRelationships returns [EObject current=null] : ( ( (lv_relationships_0_0= ruleRelationship ) ) (otherlv_1= ',' ( (lv_relationships_2_0= ruleRelationship ) ) )* ) ;
    public final EObject ruleRelationships() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_relationships_0_0 = null;

        EObject lv_relationships_2_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:327:28: ( ( ( (lv_relationships_0_0= ruleRelationship ) ) (otherlv_1= ',' ( (lv_relationships_2_0= ruleRelationship ) ) )* ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:328:1: ( ( (lv_relationships_0_0= ruleRelationship ) ) (otherlv_1= ',' ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:328:1: ( ( (lv_relationships_0_0= ruleRelationship ) ) (otherlv_1= ',' ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:328:2: ( (lv_relationships_0_0= ruleRelationship ) ) (otherlv_1= ',' ( (lv_relationships_2_0= ruleRelationship ) ) )*
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:328:2: ( (lv_relationships_0_0= ruleRelationship ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:329:1: (lv_relationships_0_0= ruleRelationship )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:329:1: (lv_relationships_0_0= ruleRelationship )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:330:3: lv_relationships_0_0= ruleRelationship
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationship_in_ruleRelationships652);
            lv_relationships_0_0=ruleRelationship();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipsRule());
            	        }
                   		add(
                   			current, 
                   			"relationships",
                    		lv_relationships_0_0, 
                    		"Relationship");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:346:2: (otherlv_1= ',' ( (lv_relationships_2_0= ruleRelationship ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:346:4: otherlv_1= ',' ( (lv_relationships_2_0= ruleRelationship ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRelationships665); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRelationshipsAccess().getCommaKeyword_1_0());
            	        
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:350:1: ( (lv_relationships_2_0= ruleRelationship ) )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:351:1: (lv_relationships_2_0= ruleRelationship )
            	    {
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:351:1: (lv_relationships_2_0= ruleRelationship )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:352:3: lv_relationships_2_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleRelationships686);
            	    lv_relationships_2_0=ruleRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationshipsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationships",
            	            		lv_relationships_2_0, 
            	            		"Relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleRelationships"


    // $ANTLR start "entryRuleRelationship"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:376:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:377:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:378:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship724);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship734); 

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:385:1: ruleRelationship returns [EObject current=null] : ( ( (lv_type_0_0= ruleConcept ) ) otherlv_1= '=' ( (lv_destination_2_0= ruleConcept ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_destination_2_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:388:28: ( ( ( (lv_type_0_0= ruleConcept ) ) otherlv_1= '=' ( (lv_destination_2_0= ruleConcept ) ) ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:389:1: ( ( (lv_type_0_0= ruleConcept ) ) otherlv_1= '=' ( (lv_destination_2_0= ruleConcept ) ) )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:389:1: ( ( (lv_type_0_0= ruleConcept ) ) otherlv_1= '=' ( (lv_destination_2_0= ruleConcept ) ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:389:2: ( (lv_type_0_0= ruleConcept ) ) otherlv_1= '=' ( (lv_destination_2_0= ruleConcept ) )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:389:2: ( (lv_type_0_0= ruleConcept ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:390:1: (lv_type_0_0= ruleConcept )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:390:1: (lv_type_0_0= ruleConcept )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:391:3: lv_type_0_0= ruleConcept
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getTypeConceptParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConcept_in_ruleRelationship780);
            lv_type_0_0=ruleConcept();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Concept");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleRelationship792); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getEqualsSignKeyword_1());
                
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:411:1: ( (lv_destination_2_0= ruleConcept ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:412:1: (lv_destination_2_0= ruleConcept )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:412:1: (lv_destination_2_0= ruleConcept )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:413:3: lv_destination_2_0= ruleConcept
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getDestinationConceptParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcept_in_ruleRelationship813);
            lv_destination_2_0=ruleConcept();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
            	        }
                   		set(
                   			current, 
                   			"destination",
                    		lv_destination_2_0, 
                    		"Concept");
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleConcept"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:437:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:438:2: (iv_ruleConcept= ruleConcept EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:439:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_ruleConcept_in_entryRuleConcept849);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcept859); 

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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:446:1: ruleConcept returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '|' ( (lv_term_2_0= RULE_TERM ) ) otherlv_3= '|' ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_term_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:449:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '|' ( (lv_term_2_0= RULE_TERM ) ) otherlv_3= '|' ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:450:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '|' ( (lv_term_2_0= RULE_TERM ) ) otherlv_3= '|' )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:450:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '|' ( (lv_term_2_0= RULE_TERM ) ) otherlv_3= '|' )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:450:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '|' ( (lv_term_2_0= RULE_TERM ) ) otherlv_3= '|'
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:450:2: ( (lv_id_0_0= RULE_ID ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:451:1: (lv_id_0_0= RULE_ID )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:451:1: (lv_id_0_0= RULE_ID )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:452:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConcept901); 

            			newLeafNode(lv_id_0_0, grammarAccess.getConceptAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConceptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleConcept918); 

                	newLeafNode(otherlv_1, grammarAccess.getConceptAccess().getVerticalLineKeyword_1());
                
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:472:1: ( (lv_term_2_0= RULE_TERM ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:473:1: (lv_term_2_0= RULE_TERM )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:473:1: (lv_term_2_0= RULE_TERM )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:474:3: lv_term_2_0= RULE_TERM
            {
            lv_term_2_0=(Token)match(input,RULE_TERM,FOLLOW_RULE_TERM_in_ruleConcept935); 

            			newLeafNode(lv_term_2_0, grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConceptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"term",
                    		lv_term_2_0, 
                    		"TERM");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleConcept952); 

                	newLeafNode(otherlv_3, grammarAccess.getConceptAccess().getVerticalLineKeyword_3());
                

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
    // $ANTLR end "ruleConcept"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsaRelationships_in_ruleExpression221 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleExpression234 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleRelationships_in_ruleExpression255 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleRelationshipGroup_in_ruleExpression277 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleIsaRelationships_in_entryRuleIsaRelationships316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsaRelationships326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleIsaRelationships372 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleIsaRelationships385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleIsaRelationships406 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleRelationshipGroup_in_entryRuleRelationshipGroup444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipGroup454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRelationshipGroup491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleRelationshipGroup512 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleRelationshipGroup525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleRelationshipGroup546 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleRelationshipGroup560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationships_in_entryRuleRelationships596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationships606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleRelationships652 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRelationships665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleRelationships686 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleRelationship780 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelationship792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleRelationship813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_entryRuleConcept849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcept859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConcept901 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConcept918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_TERM_in_ruleConcept935 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConcept952 = new BitSet(new long[]{0x0000000000000002L});

}