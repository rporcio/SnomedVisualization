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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLON", "RULE_PLUS_SIGN", "RULE_OPENING_CURLY_BRACKET", "RULE_COMMA", "RULE_CLOSING_CURLY_BRACKET", "RULE_EQUAL_SIGN", "RULE_ID", "RULE_PIPE", "RULE_WS", "RULE_TERM", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER"
    };
    public static final int RULE_CLOSING_CURLY_BRACKET=8;
    public static final int RULE_ID=10;
    public static final int RULE_COLON=4;
    public static final int RULE_STRING=17;
    public static final int RULE_PIPE=11;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_OPENING_CURLY_BRACKET=6;
    public static final int RULE_EQUAL_SIGN=9;
    public static final int RULE_INT=16;
    public static final int RULE_TERM=13;
    public static final int RULE_PLUS_SIGN=5;
    public static final int RULE_COMMA=7;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=15;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=14;

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
        	return "Expression";	
       	}
       	
       	@Override
       	protected VisualizationDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExpression"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:67:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:71:2: (iv_ruleExpression= ruleExpression EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:72:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression81);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression91); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:82:1: ruleExpression returns [EObject current=null] : ( ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (this_COLON_1= RULE_COLON ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        EObject lv_isaRelationships_0_0 = null;

        EObject lv_ungroupedRelationships_2_0 = null;

        EObject lv_groupedRelationships_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:86:28: ( ( ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (this_COLON_1= RULE_COLON ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )? ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:87:1: ( ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (this_COLON_1= RULE_COLON ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )? )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:87:1: ( ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (this_COLON_1= RULE_COLON ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )? )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:87:2: ( (lv_isaRelationships_0_0= ruleIsaRelationships ) ) (this_COLON_1= RULE_COLON ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )?
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:87:2: ( (lv_isaRelationships_0_0= ruleIsaRelationships ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:88:1: (lv_isaRelationships_0_0= ruleIsaRelationships )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:88:1: (lv_isaRelationships_0_0= ruleIsaRelationships )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:89:3: lv_isaRelationships_0_0= ruleIsaRelationships
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getIsaRelationshipsIsaRelationshipsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIsaRelationships_in_ruleExpression141);
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

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:105:2: (this_COLON_1= RULE_COLON ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COLON) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:105:3: this_COLON_1= RULE_COLON ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )* ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )*
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleExpression153); 
                     
                        newLeafNode(this_COLON_1, grammarAccess.getExpressionAccess().getCOLONTerminalRuleCall_1_0()); 
                        
                    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:109:1: ( (lv_ungroupedRelationships_2_0= ruleRelationships ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:110:1: (lv_ungroupedRelationships_2_0= ruleRelationships )
                    	    {
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:110:1: (lv_ungroupedRelationships_2_0= ruleRelationships )
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:111:3: lv_ungroupedRelationships_2_0= ruleRelationships
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpressionAccess().getUngroupedRelationshipsRelationshipsParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRelationships_in_ruleExpression173);
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

                    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:127:3: ( (lv_groupedRelationships_3_0= ruleRelationshipGroup ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_OPENING_CURLY_BRACKET) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:128:1: (lv_groupedRelationships_3_0= ruleRelationshipGroup )
                    	    {
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:128:1: (lv_groupedRelationships_3_0= ruleRelationshipGroup )
                    	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:129:3: lv_groupedRelationships_3_0= ruleRelationshipGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpressionAccess().getGroupedRelationshipsRelationshipGroupParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRelationshipGroup_in_ruleExpression195);
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIsaRelationships"
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:156:1: entryRuleIsaRelationships returns [EObject current=null] : iv_ruleIsaRelationships= ruleIsaRelationships EOF ;
    public final EObject entryRuleIsaRelationships() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsaRelationships = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:157:2: (iv_ruleIsaRelationships= ruleIsaRelationships EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:158:2: iv_ruleIsaRelationships= ruleIsaRelationships EOF
            {
             newCompositeNode(grammarAccess.getIsaRelationshipsRule()); 
            pushFollow(FOLLOW_ruleIsaRelationships_in_entryRuleIsaRelationships238);
            iv_ruleIsaRelationships=ruleIsaRelationships();

            state._fsp--;

             current =iv_ruleIsaRelationships; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsaRelationships248); 

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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:165:1: ruleIsaRelationships returns [EObject current=null] : ( ( (lv_relationships_0_0= ruleConcept ) ) (this_PLUS_SIGN_1= RULE_PLUS_SIGN ( (lv_relationships_2_0= ruleConcept ) ) )* ) ;
    public final EObject ruleIsaRelationships() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_SIGN_1=null;
        EObject lv_relationships_0_0 = null;

        EObject lv_relationships_2_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:168:28: ( ( ( (lv_relationships_0_0= ruleConcept ) ) (this_PLUS_SIGN_1= RULE_PLUS_SIGN ( (lv_relationships_2_0= ruleConcept ) ) )* ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:169:1: ( ( (lv_relationships_0_0= ruleConcept ) ) (this_PLUS_SIGN_1= RULE_PLUS_SIGN ( (lv_relationships_2_0= ruleConcept ) ) )* )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:169:1: ( ( (lv_relationships_0_0= ruleConcept ) ) (this_PLUS_SIGN_1= RULE_PLUS_SIGN ( (lv_relationships_2_0= ruleConcept ) ) )* )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:169:2: ( (lv_relationships_0_0= ruleConcept ) ) (this_PLUS_SIGN_1= RULE_PLUS_SIGN ( (lv_relationships_2_0= ruleConcept ) ) )*
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:169:2: ( (lv_relationships_0_0= ruleConcept ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:170:1: (lv_relationships_0_0= ruleConcept )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:170:1: (lv_relationships_0_0= ruleConcept )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:171:3: lv_relationships_0_0= ruleConcept
            {
             
            	        newCompositeNode(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConcept_in_ruleIsaRelationships294);
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

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:187:2: (this_PLUS_SIGN_1= RULE_PLUS_SIGN ( (lv_relationships_2_0= ruleConcept ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_PLUS_SIGN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:187:3: this_PLUS_SIGN_1= RULE_PLUS_SIGN ( (lv_relationships_2_0= ruleConcept ) )
            	    {
            	    this_PLUS_SIGN_1=(Token)match(input,RULE_PLUS_SIGN,FOLLOW_RULE_PLUS_SIGN_in_ruleIsaRelationships306); 
            	     
            	        newLeafNode(this_PLUS_SIGN_1, grammarAccess.getIsaRelationshipsAccess().getPLUS_SIGNTerminalRuleCall_1_0()); 
            	        
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:191:1: ( (lv_relationships_2_0= ruleConcept ) )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:192:1: (lv_relationships_2_0= ruleConcept )
            	    {
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:192:1: (lv_relationships_2_0= ruleConcept )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:193:3: lv_relationships_2_0= ruleConcept
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConcept_in_ruleIsaRelationships326);
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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:217:1: entryRuleRelationshipGroup returns [EObject current=null] : iv_ruleRelationshipGroup= ruleRelationshipGroup EOF ;
    public final EObject entryRuleRelationshipGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipGroup = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:218:2: (iv_ruleRelationshipGroup= ruleRelationshipGroup EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:219:2: iv_ruleRelationshipGroup= ruleRelationshipGroup EOF
            {
             newCompositeNode(grammarAccess.getRelationshipGroupRule()); 
            pushFollow(FOLLOW_ruleRelationshipGroup_in_entryRuleRelationshipGroup364);
            iv_ruleRelationshipGroup=ruleRelationshipGroup();

            state._fsp--;

             current =iv_ruleRelationshipGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipGroup374); 

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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:226:1: ruleRelationshipGroup returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET ( (lv_relationships_1_0= ruleRelationship ) ) (this_COMMA_2= RULE_COMMA ( (lv_relationships_3_0= ruleRelationship ) ) )* this_CLOSING_CURLY_BRACKET_4= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleRelationshipGroup() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_COMMA_2=null;
        Token this_CLOSING_CURLY_BRACKET_4=null;
        EObject lv_relationships_1_0 = null;

        EObject lv_relationships_3_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:229:28: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET ( (lv_relationships_1_0= ruleRelationship ) ) (this_COMMA_2= RULE_COMMA ( (lv_relationships_3_0= ruleRelationship ) ) )* this_CLOSING_CURLY_BRACKET_4= RULE_CLOSING_CURLY_BRACKET ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:230:1: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET ( (lv_relationships_1_0= ruleRelationship ) ) (this_COMMA_2= RULE_COMMA ( (lv_relationships_3_0= ruleRelationship ) ) )* this_CLOSING_CURLY_BRACKET_4= RULE_CLOSING_CURLY_BRACKET )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:230:1: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET ( (lv_relationships_1_0= ruleRelationship ) ) (this_COMMA_2= RULE_COMMA ( (lv_relationships_3_0= ruleRelationship ) ) )* this_CLOSING_CURLY_BRACKET_4= RULE_CLOSING_CURLY_BRACKET )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:230:2: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET ( (lv_relationships_1_0= ruleRelationship ) ) (this_COMMA_2= RULE_COMMA ( (lv_relationships_3_0= ruleRelationship ) ) )* this_CLOSING_CURLY_BRACKET_4= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_RULE_OPENING_CURLY_BRACKET_in_ruleRelationshipGroup410); 
             
                newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getRelationshipGroupAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 
                
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:234:1: ( (lv_relationships_1_0= ruleRelationship ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:235:1: (lv_relationships_1_0= ruleRelationship )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:235:1: (lv_relationships_1_0= ruleRelationship )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:236:3: lv_relationships_1_0= ruleRelationship
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationship_in_ruleRelationshipGroup430);
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

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:252:2: (this_COMMA_2= RULE_COMMA ( (lv_relationships_3_0= ruleRelationship ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:252:3: this_COMMA_2= RULE_COMMA ( (lv_relationships_3_0= ruleRelationship ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRelationshipGroup442); 
            	     
            	        newLeafNode(this_COMMA_2, grammarAccess.getRelationshipGroupAccess().getCOMMATerminalRuleCall_2_0()); 
            	        
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:256:1: ( (lv_relationships_3_0= ruleRelationship ) )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:257:1: (lv_relationships_3_0= ruleRelationship )
            	    {
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:257:1: (lv_relationships_3_0= ruleRelationship )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:258:3: lv_relationships_3_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleRelationshipGroup462);
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

            this_CLOSING_CURLY_BRACKET_4=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_RULE_CLOSING_CURLY_BRACKET_in_ruleRelationshipGroup475); 
             
                newLeafNode(this_CLOSING_CURLY_BRACKET_4, grammarAccess.getRelationshipGroupAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_3()); 
                

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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:286:1: entryRuleRelationships returns [EObject current=null] : iv_ruleRelationships= ruleRelationships EOF ;
    public final EObject entryRuleRelationships() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationships = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:287:2: (iv_ruleRelationships= ruleRelationships EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:288:2: iv_ruleRelationships= ruleRelationships EOF
            {
             newCompositeNode(grammarAccess.getRelationshipsRule()); 
            pushFollow(FOLLOW_ruleRelationships_in_entryRuleRelationships510);
            iv_ruleRelationships=ruleRelationships();

            state._fsp--;

             current =iv_ruleRelationships; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationships520); 

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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:295:1: ruleRelationships returns [EObject current=null] : ( ( (lv_relationships_0_0= ruleRelationship ) ) (this_COMMA_1= RULE_COMMA ( (lv_relationships_2_0= ruleRelationship ) ) )* ) ;
    public final EObject ruleRelationships() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_relationships_0_0 = null;

        EObject lv_relationships_2_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:298:28: ( ( ( (lv_relationships_0_0= ruleRelationship ) ) (this_COMMA_1= RULE_COMMA ( (lv_relationships_2_0= ruleRelationship ) ) )* ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:299:1: ( ( (lv_relationships_0_0= ruleRelationship ) ) (this_COMMA_1= RULE_COMMA ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:299:1: ( ( (lv_relationships_0_0= ruleRelationship ) ) (this_COMMA_1= RULE_COMMA ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:299:2: ( (lv_relationships_0_0= ruleRelationship ) ) (this_COMMA_1= RULE_COMMA ( (lv_relationships_2_0= ruleRelationship ) ) )*
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:299:2: ( (lv_relationships_0_0= ruleRelationship ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:300:1: (lv_relationships_0_0= ruleRelationship )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:300:1: (lv_relationships_0_0= ruleRelationship )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:301:3: lv_relationships_0_0= ruleRelationship
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationship_in_ruleRelationships566);
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

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:317:2: (this_COMMA_1= RULE_COMMA ( (lv_relationships_2_0= ruleRelationship ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:317:3: this_COMMA_1= RULE_COMMA ( (lv_relationships_2_0= ruleRelationship ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRelationships578); 
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRelationshipsAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:321:1: ( (lv_relationships_2_0= ruleRelationship ) )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:322:1: (lv_relationships_2_0= ruleRelationship )
            	    {
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:322:1: (lv_relationships_2_0= ruleRelationship )
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:323:3: lv_relationships_2_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleRelationships598);
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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:347:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:348:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:349:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship636);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship646); 

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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:356:1: ruleRelationship returns [EObject current=null] : ( ( (lv_type_0_0= ruleConcept ) ) this_EQUAL_SIGN_1= RULE_EQUAL_SIGN ( (lv_destination_2_0= ruleConcept ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_SIGN_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_destination_2_0 = null;


         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:359:28: ( ( ( (lv_type_0_0= ruleConcept ) ) this_EQUAL_SIGN_1= RULE_EQUAL_SIGN ( (lv_destination_2_0= ruleConcept ) ) ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:360:1: ( ( (lv_type_0_0= ruleConcept ) ) this_EQUAL_SIGN_1= RULE_EQUAL_SIGN ( (lv_destination_2_0= ruleConcept ) ) )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:360:1: ( ( (lv_type_0_0= ruleConcept ) ) this_EQUAL_SIGN_1= RULE_EQUAL_SIGN ( (lv_destination_2_0= ruleConcept ) ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:360:2: ( (lv_type_0_0= ruleConcept ) ) this_EQUAL_SIGN_1= RULE_EQUAL_SIGN ( (lv_destination_2_0= ruleConcept ) )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:360:2: ( (lv_type_0_0= ruleConcept ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:361:1: (lv_type_0_0= ruleConcept )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:361:1: (lv_type_0_0= ruleConcept )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:362:3: lv_type_0_0= ruleConcept
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getTypeConceptParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConcept_in_ruleRelationship692);
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

            this_EQUAL_SIGN_1=(Token)match(input,RULE_EQUAL_SIGN,FOLLOW_RULE_EQUAL_SIGN_in_ruleRelationship703); 
             
                newLeafNode(this_EQUAL_SIGN_1, grammarAccess.getRelationshipAccess().getEQUAL_SIGNTerminalRuleCall_1()); 
                
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:382:1: ( (lv_destination_2_0= ruleConcept ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:383:1: (lv_destination_2_0= ruleConcept )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:383:1: (lv_destination_2_0= ruleConcept )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:384:3: lv_destination_2_0= ruleConcept
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getDestinationConceptParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcept_in_ruleRelationship723);
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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:408:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:409:2: (iv_ruleConcept= ruleConcept EOF )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:410:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_ruleConcept_in_entryRuleConcept759);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcept769); 

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
    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:417:1: ruleConcept returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) this_PIPE_1= RULE_PIPE (this_WS_2= RULE_WS )* ( (lv_term_3_0= RULE_TERM ) ) this_PIPE_4= RULE_PIPE (this_WS_5= RULE_WS )* ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token this_PIPE_1=null;
        Token this_WS_2=null;
        Token lv_term_3_0=null;
        Token this_PIPE_4=null;
        Token this_WS_5=null;

         enterRule(); 
            
        try {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:420:28: ( ( ( (lv_id_0_0= RULE_ID ) ) this_PIPE_1= RULE_PIPE (this_WS_2= RULE_WS )* ( (lv_term_3_0= RULE_TERM ) ) this_PIPE_4= RULE_PIPE (this_WS_5= RULE_WS )* ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:421:1: ( ( (lv_id_0_0= RULE_ID ) ) this_PIPE_1= RULE_PIPE (this_WS_2= RULE_WS )* ( (lv_term_3_0= RULE_TERM ) ) this_PIPE_4= RULE_PIPE (this_WS_5= RULE_WS )* )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:421:1: ( ( (lv_id_0_0= RULE_ID ) ) this_PIPE_1= RULE_PIPE (this_WS_2= RULE_WS )* ( (lv_term_3_0= RULE_TERM ) ) this_PIPE_4= RULE_PIPE (this_WS_5= RULE_WS )* )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:421:2: ( (lv_id_0_0= RULE_ID ) ) this_PIPE_1= RULE_PIPE (this_WS_2= RULE_WS )* ( (lv_term_3_0= RULE_TERM ) ) this_PIPE_4= RULE_PIPE (this_WS_5= RULE_WS )*
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:421:2: ( (lv_id_0_0= RULE_ID ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:422:1: (lv_id_0_0= RULE_ID )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:422:1: (lv_id_0_0= RULE_ID )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:423:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConcept811); 

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

            this_PIPE_1=(Token)match(input,RULE_PIPE,FOLLOW_RULE_PIPE_in_ruleConcept827); 
             
                newLeafNode(this_PIPE_1, grammarAccess.getConceptAccess().getPIPETerminalRuleCall_1()); 
                
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:443:1: (this_WS_2= RULE_WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:443:2: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleConcept838); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getConceptAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:447:3: ( (lv_term_3_0= RULE_TERM ) )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:448:1: (lv_term_3_0= RULE_TERM )
            {
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:448:1: (lv_term_3_0= RULE_TERM )
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:449:3: lv_term_3_0= RULE_TERM
            {
            lv_term_3_0=(Token)match(input,RULE_TERM,FOLLOW_RULE_TERM_in_ruleConcept856); 

            			newLeafNode(lv_term_3_0, grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConceptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"term",
                    		lv_term_3_0, 
                    		"TERM");
            	    

            }


            }

            this_PIPE_4=(Token)match(input,RULE_PIPE,FOLLOW_RULE_PIPE_in_ruleConcept872); 
             
                newLeafNode(this_PIPE_4, grammarAccess.getConceptAccess().getPIPETerminalRuleCall_4()); 
                
            // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:469:1: (this_WS_5= RULE_WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../snomed.visualization.dsl/src-gen/snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.g:469:2: this_WS_5= RULE_WS
            	    {
            	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleConcept883); 
            	     
            	        newLeafNode(this_WS_5, grammarAccess.getConceptAccess().getWSTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleConcept"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsaRelationships_in_ruleExpression141 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleExpression153 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_ruleRelationships_in_ruleExpression173 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_ruleRelationshipGroup_in_ruleExpression195 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleIsaRelationships_in_entryRuleIsaRelationships238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsaRelationships248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleIsaRelationships294 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_PLUS_SIGN_in_ruleIsaRelationships306 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleIsaRelationships326 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleRelationshipGroup_in_entryRuleRelationshipGroup364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipGroup374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENING_CURLY_BRACKET_in_ruleRelationshipGroup410 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleRelationshipGroup430 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRelationshipGroup442 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleRelationshipGroup462 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_CLOSING_CURLY_BRACKET_in_ruleRelationshipGroup475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationships_in_entryRuleRelationships510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationships520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleRelationships566 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRelationships578 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleRelationships598 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleRelationship692 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUAL_SIGN_in_ruleRelationship703 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleRelationship723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_entryRuleConcept759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcept769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConcept811 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_PIPE_in_ruleConcept827 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleConcept838 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RULE_TERM_in_ruleConcept856 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_PIPE_in_ruleConcept872 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleConcept883 = new BitSet(new long[]{0x0000000000001002L});

}