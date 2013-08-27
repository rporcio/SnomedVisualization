package snomed.visualization.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import snomed.visualization.dsl.services.VisualizationDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVisualizationDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLON", "RULE_PLUS_SIGN", "RULE_OPENING_CURLY_BRACKET", "RULE_CLOSING_CURLY_BRACKET", "RULE_COMMA", "RULE_EQUAL_SIGN", "RULE_PIPE", "RULE_WS", "RULE_ID", "RULE_TERM", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER"
    };
    public static final int RULE_CLOSING_CURLY_BRACKET=7;
    public static final int RULE_ID=12;
    public static final int RULE_COLON=4;
    public static final int RULE_STRING=17;
    public static final int RULE_PIPE=10;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_OPENING_CURLY_BRACKET=6;
    public static final int RULE_EQUAL_SIGN=9;
    public static final int RULE_INT=16;
    public static final int RULE_TERM=13;
    public static final int RULE_COMMA=8;
    public static final int RULE_PLUS_SIGN=5;
    public static final int RULE_WS=11;
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
    public String getGrammarFileName() { return "../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g"; }


     
     	private VisualizationDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VisualizationDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleExpression"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:60:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:64:1: ( ruleExpression EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:65:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression66);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression73); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:75:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:80:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:81:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:81:1: ( ( rule__Expression__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:82:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:83:1: ( rule__Expression__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:83:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression103);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIsaRelationships"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:96:1: entryRuleIsaRelationships : ruleIsaRelationships EOF ;
    public final void entryRuleIsaRelationships() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:97:1: ( ruleIsaRelationships EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:98:1: ruleIsaRelationships EOF
            {
             before(grammarAccess.getIsaRelationshipsRule()); 
            pushFollow(FOLLOW_ruleIsaRelationships_in_entryRuleIsaRelationships130);
            ruleIsaRelationships();

            state._fsp--;

             after(grammarAccess.getIsaRelationshipsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsaRelationships137); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsaRelationships"


    // $ANTLR start "ruleIsaRelationships"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:105:1: ruleIsaRelationships : ( ( rule__IsaRelationships__Group__0 ) ) ;
    public final void ruleIsaRelationships() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:109:2: ( ( ( rule__IsaRelationships__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:110:1: ( ( rule__IsaRelationships__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:110:1: ( ( rule__IsaRelationships__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:111:1: ( rule__IsaRelationships__Group__0 )
            {
             before(grammarAccess.getIsaRelationshipsAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:112:1: ( rule__IsaRelationships__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:112:2: rule__IsaRelationships__Group__0
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group__0_in_ruleIsaRelationships163);
            rule__IsaRelationships__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsaRelationshipsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsaRelationships"


    // $ANTLR start "entryRuleRelationshipGroup"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:124:1: entryRuleRelationshipGroup : ruleRelationshipGroup EOF ;
    public final void entryRuleRelationshipGroup() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:125:1: ( ruleRelationshipGroup EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:126:1: ruleRelationshipGroup EOF
            {
             before(grammarAccess.getRelationshipGroupRule()); 
            pushFollow(FOLLOW_ruleRelationshipGroup_in_entryRuleRelationshipGroup190);
            ruleRelationshipGroup();

            state._fsp--;

             after(grammarAccess.getRelationshipGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipGroup197); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationshipGroup"


    // $ANTLR start "ruleRelationshipGroup"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:133:1: ruleRelationshipGroup : ( ( rule__RelationshipGroup__Group__0 ) ) ;
    public final void ruleRelationshipGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:137:2: ( ( ( rule__RelationshipGroup__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:138:1: ( ( rule__RelationshipGroup__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:138:1: ( ( rule__RelationshipGroup__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:139:1: ( rule__RelationshipGroup__Group__0 )
            {
             before(grammarAccess.getRelationshipGroupAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:140:1: ( rule__RelationshipGroup__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:140:2: rule__RelationshipGroup__Group__0
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__0_in_ruleRelationshipGroup223);
            rule__RelationshipGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationshipGroup"


    // $ANTLR start "entryRuleRelationships"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:152:1: entryRuleRelationships : ruleRelationships EOF ;
    public final void entryRuleRelationships() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:153:1: ( ruleRelationships EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:154:1: ruleRelationships EOF
            {
             before(grammarAccess.getRelationshipsRule()); 
            pushFollow(FOLLOW_ruleRelationships_in_entryRuleRelationships250);
            ruleRelationships();

            state._fsp--;

             after(grammarAccess.getRelationshipsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationships257); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationships"


    // $ANTLR start "ruleRelationships"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:161:1: ruleRelationships : ( ( rule__Relationships__Group__0 ) ) ;
    public final void ruleRelationships() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:165:2: ( ( ( rule__Relationships__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:166:1: ( ( rule__Relationships__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:166:1: ( ( rule__Relationships__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:167:1: ( rule__Relationships__Group__0 )
            {
             before(grammarAccess.getRelationshipsAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:168:1: ( rule__Relationships__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:168:2: rule__Relationships__Group__0
            {
            pushFollow(FOLLOW_rule__Relationships__Group__0_in_ruleRelationships283);
            rule__Relationships__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationships"


    // $ANTLR start "entryRuleRelationship"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:180:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:181:1: ( ruleRelationship EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:182:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship310);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship317); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:189:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:193:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:194:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:194:1: ( ( rule__Relationship__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:195:1: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:196:1: ( rule__Relationship__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:196:2: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0_in_ruleRelationship343);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleConcept"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:208:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:209:1: ( ruleConcept EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:210:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_ruleConcept_in_entryRuleConcept370);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcept377); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:217:1: ruleConcept : ( ( rule__Concept__Group__0 ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:221:2: ( ( ( rule__Concept__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:222:1: ( ( rule__Concept__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:222:1: ( ( rule__Concept__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:223:1: ( rule__Concept__Group__0 )
            {
             before(grammarAccess.getConceptAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:224:1: ( rule__Concept__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:224:2: rule__Concept__Group__0
            {
            pushFollow(FOLLOW_rule__Concept__Group__0_in_ruleConcept403);
            rule__Concept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "rule__Expression__Group__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:238:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:242:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:243:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__0437);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__0440);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:250:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__IsaRelationshipsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:254:1: ( ( ( rule__Expression__IsaRelationshipsAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:255:1: ( ( rule__Expression__IsaRelationshipsAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:255:1: ( ( rule__Expression__IsaRelationshipsAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:256:1: ( rule__Expression__IsaRelationshipsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getIsaRelationshipsAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:257:1: ( rule__Expression__IsaRelationshipsAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:257:2: rule__Expression__IsaRelationshipsAssignment_0
            {
            pushFollow(FOLLOW_rule__Expression__IsaRelationshipsAssignment_0_in_rule__Expression__Group__0__Impl467);
            rule__Expression__IsaRelationshipsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getIsaRelationshipsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:267:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:271:1: ( rule__Expression__Group__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:272:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__1497);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:278:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:282:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:283:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:283:1: ( ( rule__Expression__Group_1__0 )? )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:284:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:285:1: ( rule__Expression__Group_1__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_COLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:285:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl524);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:299:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:303:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:304:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0559);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0562);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:311:1: rule__Expression__Group_1__0__Impl : ( RULE_COLON ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:315:1: ( ( RULE_COLON ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:316:1: ( RULE_COLON )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:316:1: ( RULE_COLON )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:317:1: RULE_COLON
            {
             before(grammarAccess.getExpressionAccess().getCOLONTerminalRuleCall_1_0()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__Expression__Group_1__0__Impl589); 
             after(grammarAccess.getExpressionAccess().getCOLONTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:328:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:332:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:333:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1618);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__1621);
            rule__Expression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:340:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )* ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:344:1: ( ( ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:345:1: ( ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:345:1: ( ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:346:1: ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )*
            {
             before(grammarAccess.getExpressionAccess().getUngroupedRelationshipsAssignment_1_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:347:1: ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:347:2: rule__Expression__UngroupedRelationshipsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Expression__UngroupedRelationshipsAssignment_1_1_in_rule__Expression__Group_1__1__Impl648);
            	    rule__Expression__UngroupedRelationshipsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getUngroupedRelationshipsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:357:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:361:1: ( rule__Expression__Group_1__2__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:362:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__2679);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:368:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__GroupedRelationshipsAssignment_1_2 )* ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:372:1: ( ( ( rule__Expression__GroupedRelationshipsAssignment_1_2 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:373:1: ( ( rule__Expression__GroupedRelationshipsAssignment_1_2 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:373:1: ( ( rule__Expression__GroupedRelationshipsAssignment_1_2 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:374:1: ( rule__Expression__GroupedRelationshipsAssignment_1_2 )*
            {
             before(grammarAccess.getExpressionAccess().getGroupedRelationshipsAssignment_1_2()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:375:1: ( rule__Expression__GroupedRelationshipsAssignment_1_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_OPENING_CURLY_BRACKET) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:375:2: rule__Expression__GroupedRelationshipsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Expression__GroupedRelationshipsAssignment_1_2_in_rule__Expression__Group_1__2__Impl706);
            	    rule__Expression__GroupedRelationshipsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroupedRelationshipsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__IsaRelationships__Group__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:391:1: rule__IsaRelationships__Group__0 : rule__IsaRelationships__Group__0__Impl rule__IsaRelationships__Group__1 ;
    public final void rule__IsaRelationships__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:395:1: ( rule__IsaRelationships__Group__0__Impl rule__IsaRelationships__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:396:2: rule__IsaRelationships__Group__0__Impl rule__IsaRelationships__Group__1
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group__0__Impl_in_rule__IsaRelationships__Group__0743);
            rule__IsaRelationships__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IsaRelationships__Group__1_in_rule__IsaRelationships__Group__0746);
            rule__IsaRelationships__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__Group__0"


    // $ANTLR start "rule__IsaRelationships__Group__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:403:1: rule__IsaRelationships__Group__0__Impl : ( ( rule__IsaRelationships__RelationshipsAssignment_0 ) ) ;
    public final void rule__IsaRelationships__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:407:1: ( ( ( rule__IsaRelationships__RelationshipsAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:408:1: ( ( rule__IsaRelationships__RelationshipsAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:408:1: ( ( rule__IsaRelationships__RelationshipsAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:409:1: ( rule__IsaRelationships__RelationshipsAssignment_0 )
            {
             before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:410:1: ( rule__IsaRelationships__RelationshipsAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:410:2: rule__IsaRelationships__RelationshipsAssignment_0
            {
            pushFollow(FOLLOW_rule__IsaRelationships__RelationshipsAssignment_0_in_rule__IsaRelationships__Group__0__Impl773);
            rule__IsaRelationships__RelationshipsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__Group__0__Impl"


    // $ANTLR start "rule__IsaRelationships__Group__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:420:1: rule__IsaRelationships__Group__1 : rule__IsaRelationships__Group__1__Impl ;
    public final void rule__IsaRelationships__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:424:1: ( rule__IsaRelationships__Group__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:425:2: rule__IsaRelationships__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group__1__Impl_in_rule__IsaRelationships__Group__1803);
            rule__IsaRelationships__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__Group__1"


    // $ANTLR start "rule__IsaRelationships__Group__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:431:1: rule__IsaRelationships__Group__1__Impl : ( ( rule__IsaRelationships__Group_1__0 )* ) ;
    public final void rule__IsaRelationships__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:435:1: ( ( ( rule__IsaRelationships__Group_1__0 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:436:1: ( ( rule__IsaRelationships__Group_1__0 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:436:1: ( ( rule__IsaRelationships__Group_1__0 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:437:1: ( rule__IsaRelationships__Group_1__0 )*
            {
             before(grammarAccess.getIsaRelationshipsAccess().getGroup_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:438:1: ( rule__IsaRelationships__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_PLUS_SIGN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:438:2: rule__IsaRelationships__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IsaRelationships__Group_1__0_in_rule__IsaRelationships__Group__1__Impl830);
            	    rule__IsaRelationships__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getIsaRelationshipsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__Group__1__Impl"


    // $ANTLR start "rule__IsaRelationships__Group_1__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:452:1: rule__IsaRelationships__Group_1__0 : rule__IsaRelationships__Group_1__0__Impl rule__IsaRelationships__Group_1__1 ;
    public final void rule__IsaRelationships__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:456:1: ( rule__IsaRelationships__Group_1__0__Impl rule__IsaRelationships__Group_1__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:457:2: rule__IsaRelationships__Group_1__0__Impl rule__IsaRelationships__Group_1__1
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group_1__0__Impl_in_rule__IsaRelationships__Group_1__0865);
            rule__IsaRelationships__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IsaRelationships__Group_1__1_in_rule__IsaRelationships__Group_1__0868);
            rule__IsaRelationships__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__Group_1__0"


    // $ANTLR start "rule__IsaRelationships__Group_1__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:464:1: rule__IsaRelationships__Group_1__0__Impl : ( RULE_PLUS_SIGN ) ;
    public final void rule__IsaRelationships__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:468:1: ( ( RULE_PLUS_SIGN ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:469:1: ( RULE_PLUS_SIGN )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:469:1: ( RULE_PLUS_SIGN )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:470:1: RULE_PLUS_SIGN
            {
             before(grammarAccess.getIsaRelationshipsAccess().getPLUS_SIGNTerminalRuleCall_1_0()); 
            match(input,RULE_PLUS_SIGN,FOLLOW_RULE_PLUS_SIGN_in_rule__IsaRelationships__Group_1__0__Impl895); 
             after(grammarAccess.getIsaRelationshipsAccess().getPLUS_SIGNTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__Group_1__0__Impl"


    // $ANTLR start "rule__IsaRelationships__Group_1__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:481:1: rule__IsaRelationships__Group_1__1 : rule__IsaRelationships__Group_1__1__Impl ;
    public final void rule__IsaRelationships__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:485:1: ( rule__IsaRelationships__Group_1__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:486:2: rule__IsaRelationships__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group_1__1__Impl_in_rule__IsaRelationships__Group_1__1924);
            rule__IsaRelationships__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__Group_1__1"


    // $ANTLR start "rule__IsaRelationships__Group_1__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:492:1: rule__IsaRelationships__Group_1__1__Impl : ( ( rule__IsaRelationships__RelationshipsAssignment_1_1 ) ) ;
    public final void rule__IsaRelationships__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:496:1: ( ( ( rule__IsaRelationships__RelationshipsAssignment_1_1 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:497:1: ( ( rule__IsaRelationships__RelationshipsAssignment_1_1 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:497:1: ( ( rule__IsaRelationships__RelationshipsAssignment_1_1 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:498:1: ( rule__IsaRelationships__RelationshipsAssignment_1_1 )
            {
             before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_1_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:499:1: ( rule__IsaRelationships__RelationshipsAssignment_1_1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:499:2: rule__IsaRelationships__RelationshipsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IsaRelationships__RelationshipsAssignment_1_1_in_rule__IsaRelationships__Group_1__1__Impl951);
            rule__IsaRelationships__RelationshipsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__Group_1__1__Impl"


    // $ANTLR start "rule__RelationshipGroup__Group__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:513:1: rule__RelationshipGroup__Group__0 : rule__RelationshipGroup__Group__0__Impl rule__RelationshipGroup__Group__1 ;
    public final void rule__RelationshipGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:517:1: ( rule__RelationshipGroup__Group__0__Impl rule__RelationshipGroup__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:518:2: rule__RelationshipGroup__Group__0__Impl rule__RelationshipGroup__Group__1
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__0__Impl_in_rule__RelationshipGroup__Group__0985);
            rule__RelationshipGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipGroup__Group__1_in_rule__RelationshipGroup__Group__0988);
            rule__RelationshipGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group__0"


    // $ANTLR start "rule__RelationshipGroup__Group__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:525:1: rule__RelationshipGroup__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__RelationshipGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:529:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:530:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:530:1: ( RULE_OPENING_CURLY_BRACKET )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:531:1: RULE_OPENING_CURLY_BRACKET
            {
             before(grammarAccess.getRelationshipGroupAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_RULE_OPENING_CURLY_BRACKET_in_rule__RelationshipGroup__Group__0__Impl1015); 
             after(grammarAccess.getRelationshipGroupAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group__0__Impl"


    // $ANTLR start "rule__RelationshipGroup__Group__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:542:1: rule__RelationshipGroup__Group__1 : rule__RelationshipGroup__Group__1__Impl rule__RelationshipGroup__Group__2 ;
    public final void rule__RelationshipGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:546:1: ( rule__RelationshipGroup__Group__1__Impl rule__RelationshipGroup__Group__2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:547:2: rule__RelationshipGroup__Group__1__Impl rule__RelationshipGroup__Group__2
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__1__Impl_in_rule__RelationshipGroup__Group__11044);
            rule__RelationshipGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipGroup__Group__2_in_rule__RelationshipGroup__Group__11047);
            rule__RelationshipGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group__1"


    // $ANTLR start "rule__RelationshipGroup__Group__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:554:1: rule__RelationshipGroup__Group__1__Impl : ( ( rule__RelationshipGroup__RelationshipsAssignment_1 ) ) ;
    public final void rule__RelationshipGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:558:1: ( ( ( rule__RelationshipGroup__RelationshipsAssignment_1 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:559:1: ( ( rule__RelationshipGroup__RelationshipsAssignment_1 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:559:1: ( ( rule__RelationshipGroup__RelationshipsAssignment_1 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:560:1: ( rule__RelationshipGroup__RelationshipsAssignment_1 )
            {
             before(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:561:1: ( rule__RelationshipGroup__RelationshipsAssignment_1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:561:2: rule__RelationshipGroup__RelationshipsAssignment_1
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__RelationshipsAssignment_1_in_rule__RelationshipGroup__Group__1__Impl1074);
            rule__RelationshipGroup__RelationshipsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group__1__Impl"


    // $ANTLR start "rule__RelationshipGroup__Group__2"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:571:1: rule__RelationshipGroup__Group__2 : rule__RelationshipGroup__Group__2__Impl rule__RelationshipGroup__Group__3 ;
    public final void rule__RelationshipGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:575:1: ( rule__RelationshipGroup__Group__2__Impl rule__RelationshipGroup__Group__3 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:576:2: rule__RelationshipGroup__Group__2__Impl rule__RelationshipGroup__Group__3
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__2__Impl_in_rule__RelationshipGroup__Group__21104);
            rule__RelationshipGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipGroup__Group__3_in_rule__RelationshipGroup__Group__21107);
            rule__RelationshipGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group__2"


    // $ANTLR start "rule__RelationshipGroup__Group__2__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:583:1: rule__RelationshipGroup__Group__2__Impl : ( ( rule__RelationshipGroup__Group_2__0 )* ) ;
    public final void rule__RelationshipGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:587:1: ( ( ( rule__RelationshipGroup__Group_2__0 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:588:1: ( ( rule__RelationshipGroup__Group_2__0 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:588:1: ( ( rule__RelationshipGroup__Group_2__0 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:589:1: ( rule__RelationshipGroup__Group_2__0 )*
            {
             before(grammarAccess.getRelationshipGroupAccess().getGroup_2()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:590:1: ( rule__RelationshipGroup__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:590:2: rule__RelationshipGroup__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RelationshipGroup__Group_2__0_in_rule__RelationshipGroup__Group__2__Impl1134);
            	    rule__RelationshipGroup__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRelationshipGroupAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group__2__Impl"


    // $ANTLR start "rule__RelationshipGroup__Group__3"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:600:1: rule__RelationshipGroup__Group__3 : rule__RelationshipGroup__Group__3__Impl ;
    public final void rule__RelationshipGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:604:1: ( rule__RelationshipGroup__Group__3__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:605:2: rule__RelationshipGroup__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__3__Impl_in_rule__RelationshipGroup__Group__31165);
            rule__RelationshipGroup__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group__3"


    // $ANTLR start "rule__RelationshipGroup__Group__3__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:611:1: rule__RelationshipGroup__Group__3__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__RelationshipGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:615:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:616:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:616:1: ( RULE_CLOSING_CURLY_BRACKET )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:617:1: RULE_CLOSING_CURLY_BRACKET
            {
             before(grammarAccess.getRelationshipGroupAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_RULE_CLOSING_CURLY_BRACKET_in_rule__RelationshipGroup__Group__3__Impl1192); 
             after(grammarAccess.getRelationshipGroupAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group__3__Impl"


    // $ANTLR start "rule__RelationshipGroup__Group_2__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:636:1: rule__RelationshipGroup__Group_2__0 : rule__RelationshipGroup__Group_2__0__Impl rule__RelationshipGroup__Group_2__1 ;
    public final void rule__RelationshipGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:640:1: ( rule__RelationshipGroup__Group_2__0__Impl rule__RelationshipGroup__Group_2__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:641:2: rule__RelationshipGroup__Group_2__0__Impl rule__RelationshipGroup__Group_2__1
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group_2__0__Impl_in_rule__RelationshipGroup__Group_2__01229);
            rule__RelationshipGroup__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipGroup__Group_2__1_in_rule__RelationshipGroup__Group_2__01232);
            rule__RelationshipGroup__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group_2__0"


    // $ANTLR start "rule__RelationshipGroup__Group_2__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:648:1: rule__RelationshipGroup__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__RelationshipGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:652:1: ( ( RULE_COMMA ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:653:1: ( RULE_COMMA )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:653:1: ( RULE_COMMA )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:654:1: RULE_COMMA
            {
             before(grammarAccess.getRelationshipGroupAccess().getCOMMATerminalRuleCall_2_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__RelationshipGroup__Group_2__0__Impl1259); 
             after(grammarAccess.getRelationshipGroupAccess().getCOMMATerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group_2__0__Impl"


    // $ANTLR start "rule__RelationshipGroup__Group_2__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:665:1: rule__RelationshipGroup__Group_2__1 : rule__RelationshipGroup__Group_2__1__Impl ;
    public final void rule__RelationshipGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:669:1: ( rule__RelationshipGroup__Group_2__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:670:2: rule__RelationshipGroup__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group_2__1__Impl_in_rule__RelationshipGroup__Group_2__11288);
            rule__RelationshipGroup__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group_2__1"


    // $ANTLR start "rule__RelationshipGroup__Group_2__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:676:1: rule__RelationshipGroup__Group_2__1__Impl : ( ( rule__RelationshipGroup__RelationshipsAssignment_2_1 ) ) ;
    public final void rule__RelationshipGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:680:1: ( ( ( rule__RelationshipGroup__RelationshipsAssignment_2_1 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:681:1: ( ( rule__RelationshipGroup__RelationshipsAssignment_2_1 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:681:1: ( ( rule__RelationshipGroup__RelationshipsAssignment_2_1 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:682:1: ( rule__RelationshipGroup__RelationshipsAssignment_2_1 )
            {
             before(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_2_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:683:1: ( rule__RelationshipGroup__RelationshipsAssignment_2_1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:683:2: rule__RelationshipGroup__RelationshipsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__RelationshipsAssignment_2_1_in_rule__RelationshipGroup__Group_2__1__Impl1315);
            rule__RelationshipGroup__RelationshipsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__Group_2__1__Impl"


    // $ANTLR start "rule__Relationships__Group__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:697:1: rule__Relationships__Group__0 : rule__Relationships__Group__0__Impl rule__Relationships__Group__1 ;
    public final void rule__Relationships__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:701:1: ( rule__Relationships__Group__0__Impl rule__Relationships__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:702:2: rule__Relationships__Group__0__Impl rule__Relationships__Group__1
            {
            pushFollow(FOLLOW_rule__Relationships__Group__0__Impl_in_rule__Relationships__Group__01349);
            rule__Relationships__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationships__Group__1_in_rule__Relationships__Group__01352);
            rule__Relationships__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__Group__0"


    // $ANTLR start "rule__Relationships__Group__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:709:1: rule__Relationships__Group__0__Impl : ( ( rule__Relationships__RelationshipsAssignment_0 ) ) ;
    public final void rule__Relationships__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:713:1: ( ( ( rule__Relationships__RelationshipsAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:714:1: ( ( rule__Relationships__RelationshipsAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:714:1: ( ( rule__Relationships__RelationshipsAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:715:1: ( rule__Relationships__RelationshipsAssignment_0 )
            {
             before(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:716:1: ( rule__Relationships__RelationshipsAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:716:2: rule__Relationships__RelationshipsAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationships__RelationshipsAssignment_0_in_rule__Relationships__Group__0__Impl1379);
            rule__Relationships__RelationshipsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__Group__0__Impl"


    // $ANTLR start "rule__Relationships__Group__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:726:1: rule__Relationships__Group__1 : rule__Relationships__Group__1__Impl ;
    public final void rule__Relationships__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:730:1: ( rule__Relationships__Group__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:731:2: rule__Relationships__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relationships__Group__1__Impl_in_rule__Relationships__Group__11409);
            rule__Relationships__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__Group__1"


    // $ANTLR start "rule__Relationships__Group__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:737:1: rule__Relationships__Group__1__Impl : ( ( rule__Relationships__Group_1__0 )* ) ;
    public final void rule__Relationships__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:741:1: ( ( ( rule__Relationships__Group_1__0 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:742:1: ( ( rule__Relationships__Group_1__0 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:742:1: ( ( rule__Relationships__Group_1__0 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:743:1: ( rule__Relationships__Group_1__0 )*
            {
             before(grammarAccess.getRelationshipsAccess().getGroup_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:744:1: ( rule__Relationships__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:744:2: rule__Relationships__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Relationships__Group_1__0_in_rule__Relationships__Group__1__Impl1436);
            	    rule__Relationships__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRelationshipsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__Group__1__Impl"


    // $ANTLR start "rule__Relationships__Group_1__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:758:1: rule__Relationships__Group_1__0 : rule__Relationships__Group_1__0__Impl rule__Relationships__Group_1__1 ;
    public final void rule__Relationships__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:762:1: ( rule__Relationships__Group_1__0__Impl rule__Relationships__Group_1__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:763:2: rule__Relationships__Group_1__0__Impl rule__Relationships__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relationships__Group_1__0__Impl_in_rule__Relationships__Group_1__01471);
            rule__Relationships__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationships__Group_1__1_in_rule__Relationships__Group_1__01474);
            rule__Relationships__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__Group_1__0"


    // $ANTLR start "rule__Relationships__Group_1__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:770:1: rule__Relationships__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Relationships__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:774:1: ( ( RULE_COMMA ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:775:1: ( RULE_COMMA )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:775:1: ( RULE_COMMA )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:776:1: RULE_COMMA
            {
             before(grammarAccess.getRelationshipsAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Relationships__Group_1__0__Impl1501); 
             after(grammarAccess.getRelationshipsAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__Group_1__0__Impl"


    // $ANTLR start "rule__Relationships__Group_1__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:787:1: rule__Relationships__Group_1__1 : rule__Relationships__Group_1__1__Impl ;
    public final void rule__Relationships__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:791:1: ( rule__Relationships__Group_1__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:792:2: rule__Relationships__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relationships__Group_1__1__Impl_in_rule__Relationships__Group_1__11530);
            rule__Relationships__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__Group_1__1"


    // $ANTLR start "rule__Relationships__Group_1__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:798:1: rule__Relationships__Group_1__1__Impl : ( ( rule__Relationships__RelationshipsAssignment_1_1 ) ) ;
    public final void rule__Relationships__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:802:1: ( ( ( rule__Relationships__RelationshipsAssignment_1_1 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:803:1: ( ( rule__Relationships__RelationshipsAssignment_1_1 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:803:1: ( ( rule__Relationships__RelationshipsAssignment_1_1 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:804:1: ( rule__Relationships__RelationshipsAssignment_1_1 )
            {
             before(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_1_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:805:1: ( rule__Relationships__RelationshipsAssignment_1_1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:805:2: rule__Relationships__RelationshipsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relationships__RelationshipsAssignment_1_1_in_rule__Relationships__Group_1__1__Impl1557);
            rule__Relationships__RelationshipsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__Group_1__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:819:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:823:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:824:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__01591);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__01594);
            rule__Relationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:831:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__TypeAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:835:1: ( ( ( rule__Relationship__TypeAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:836:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:836:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:837:1: ( rule__Relationship__TypeAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:838:1: ( rule__Relationship__TypeAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:838:2: rule__Relationship__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl1621);
            rule__Relationship__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:848:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:852:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:853:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__11651);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__11654);
            rule__Relationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:860:1: rule__Relationship__Group__1__Impl : ( RULE_EQUAL_SIGN ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:864:1: ( ( RULE_EQUAL_SIGN ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:865:1: ( RULE_EQUAL_SIGN )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:865:1: ( RULE_EQUAL_SIGN )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:866:1: RULE_EQUAL_SIGN
            {
             before(grammarAccess.getRelationshipAccess().getEQUAL_SIGNTerminalRuleCall_1()); 
            match(input,RULE_EQUAL_SIGN,FOLLOW_RULE_EQUAL_SIGN_in_rule__Relationship__Group__1__Impl1681); 
             after(grammarAccess.getRelationshipAccess().getEQUAL_SIGNTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:877:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:881:1: ( rule__Relationship__Group__2__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:882:2: rule__Relationship__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__21710);
            rule__Relationship__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:888:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__DestinationAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:892:1: ( ( ( rule__Relationship__DestinationAssignment_2 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:893:1: ( ( rule__Relationship__DestinationAssignment_2 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:893:1: ( ( rule__Relationship__DestinationAssignment_2 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:894:1: ( rule__Relationship__DestinationAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getDestinationAssignment_2()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:895:1: ( rule__Relationship__DestinationAssignment_2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:895:2: rule__Relationship__DestinationAssignment_2
            {
            pushFollow(FOLLOW_rule__Relationship__DestinationAssignment_2_in_rule__Relationship__Group__2__Impl1737);
            rule__Relationship__DestinationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getDestinationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Concept__Group__0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:911:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:915:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:916:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
            {
            pushFollow(FOLLOW_rule__Concept__Group__0__Impl_in_rule__Concept__Group__01773);
            rule__Concept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concept__Group__1_in_rule__Concept__Group__01776);
            rule__Concept__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__0"


    // $ANTLR start "rule__Concept__Group__0__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:923:1: rule__Concept__Group__0__Impl : ( ( rule__Concept__IdAssignment_0 ) ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:927:1: ( ( ( rule__Concept__IdAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:928:1: ( ( rule__Concept__IdAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:928:1: ( ( rule__Concept__IdAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:929:1: ( rule__Concept__IdAssignment_0 )
            {
             before(grammarAccess.getConceptAccess().getIdAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:930:1: ( rule__Concept__IdAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:930:2: rule__Concept__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Concept__IdAssignment_0_in_rule__Concept__Group__0__Impl1803);
            rule__Concept__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__0__Impl"


    // $ANTLR start "rule__Concept__Group__1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:940:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:944:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:945:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
            {
            pushFollow(FOLLOW_rule__Concept__Group__1__Impl_in_rule__Concept__Group__11833);
            rule__Concept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concept__Group__2_in_rule__Concept__Group__11836);
            rule__Concept__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__1"


    // $ANTLR start "rule__Concept__Group__1__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:952:1: rule__Concept__Group__1__Impl : ( RULE_PIPE ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:956:1: ( ( RULE_PIPE ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:957:1: ( RULE_PIPE )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:957:1: ( RULE_PIPE )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:958:1: RULE_PIPE
            {
             before(grammarAccess.getConceptAccess().getPIPETerminalRuleCall_1()); 
            match(input,RULE_PIPE,FOLLOW_RULE_PIPE_in_rule__Concept__Group__1__Impl1863); 
             after(grammarAccess.getConceptAccess().getPIPETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__1__Impl"


    // $ANTLR start "rule__Concept__Group__2"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:969:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl rule__Concept__Group__3 ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:973:1: ( rule__Concept__Group__2__Impl rule__Concept__Group__3 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:974:2: rule__Concept__Group__2__Impl rule__Concept__Group__3
            {
            pushFollow(FOLLOW_rule__Concept__Group__2__Impl_in_rule__Concept__Group__21892);
            rule__Concept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concept__Group__3_in_rule__Concept__Group__21895);
            rule__Concept__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__2"


    // $ANTLR start "rule__Concept__Group__2__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:981:1: rule__Concept__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:985:1: ( ( ( RULE_WS )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:986:1: ( ( RULE_WS )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:986:1: ( ( RULE_WS )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:987:1: ( RULE_WS )*
            {
             before(grammarAccess.getConceptAccess().getWSTerminalRuleCall_2()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:988:1: ( RULE_WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:988:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Concept__Group__2__Impl1923); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getConceptAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__2__Impl"


    // $ANTLR start "rule__Concept__Group__3"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:998:1: rule__Concept__Group__3 : rule__Concept__Group__3__Impl rule__Concept__Group__4 ;
    public final void rule__Concept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1002:1: ( rule__Concept__Group__3__Impl rule__Concept__Group__4 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1003:2: rule__Concept__Group__3__Impl rule__Concept__Group__4
            {
            pushFollow(FOLLOW_rule__Concept__Group__3__Impl_in_rule__Concept__Group__31954);
            rule__Concept__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concept__Group__4_in_rule__Concept__Group__31957);
            rule__Concept__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__3"


    // $ANTLR start "rule__Concept__Group__3__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1010:1: rule__Concept__Group__3__Impl : ( ( rule__Concept__TermAssignment_3 ) ) ;
    public final void rule__Concept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1014:1: ( ( ( rule__Concept__TermAssignment_3 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1015:1: ( ( rule__Concept__TermAssignment_3 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1015:1: ( ( rule__Concept__TermAssignment_3 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1016:1: ( rule__Concept__TermAssignment_3 )
            {
             before(grammarAccess.getConceptAccess().getTermAssignment_3()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1017:1: ( rule__Concept__TermAssignment_3 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1017:2: rule__Concept__TermAssignment_3
            {
            pushFollow(FOLLOW_rule__Concept__TermAssignment_3_in_rule__Concept__Group__3__Impl1984);
            rule__Concept__TermAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getTermAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__3__Impl"


    // $ANTLR start "rule__Concept__Group__4"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1027:1: rule__Concept__Group__4 : rule__Concept__Group__4__Impl rule__Concept__Group__5 ;
    public final void rule__Concept__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1031:1: ( rule__Concept__Group__4__Impl rule__Concept__Group__5 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1032:2: rule__Concept__Group__4__Impl rule__Concept__Group__5
            {
            pushFollow(FOLLOW_rule__Concept__Group__4__Impl_in_rule__Concept__Group__42014);
            rule__Concept__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concept__Group__5_in_rule__Concept__Group__42017);
            rule__Concept__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__4"


    // $ANTLR start "rule__Concept__Group__4__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1039:1: rule__Concept__Group__4__Impl : ( RULE_PIPE ) ;
    public final void rule__Concept__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1043:1: ( ( RULE_PIPE ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1044:1: ( RULE_PIPE )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1044:1: ( RULE_PIPE )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1045:1: RULE_PIPE
            {
             before(grammarAccess.getConceptAccess().getPIPETerminalRuleCall_4()); 
            match(input,RULE_PIPE,FOLLOW_RULE_PIPE_in_rule__Concept__Group__4__Impl2044); 
             after(grammarAccess.getConceptAccess().getPIPETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__4__Impl"


    // $ANTLR start "rule__Concept__Group__5"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1056:1: rule__Concept__Group__5 : rule__Concept__Group__5__Impl ;
    public final void rule__Concept__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1060:1: ( rule__Concept__Group__5__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1061:2: rule__Concept__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Concept__Group__5__Impl_in_rule__Concept__Group__52073);
            rule__Concept__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__5"


    // $ANTLR start "rule__Concept__Group__5__Impl"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1067:1: rule__Concept__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Concept__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1071:1: ( ( ( RULE_WS )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1072:1: ( ( RULE_WS )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1072:1: ( ( RULE_WS )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1073:1: ( RULE_WS )*
            {
             before(grammarAccess.getConceptAccess().getWSTerminalRuleCall_5()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1074:1: ( RULE_WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1074:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Concept__Group__5__Impl2101); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getConceptAccess().getWSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__5__Impl"


    // $ANTLR start "rule__Expression__IsaRelationshipsAssignment_0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1097:1: rule__Expression__IsaRelationshipsAssignment_0 : ( ruleIsaRelationships ) ;
    public final void rule__Expression__IsaRelationshipsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1101:1: ( ( ruleIsaRelationships ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1102:1: ( ruleIsaRelationships )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1102:1: ( ruleIsaRelationships )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1103:1: ruleIsaRelationships
            {
             before(grammarAccess.getExpressionAccess().getIsaRelationshipsIsaRelationshipsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIsaRelationships_in_rule__Expression__IsaRelationshipsAssignment_02149);
            ruleIsaRelationships();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getIsaRelationshipsIsaRelationshipsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__IsaRelationshipsAssignment_0"


    // $ANTLR start "rule__Expression__UngroupedRelationshipsAssignment_1_1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1112:1: rule__Expression__UngroupedRelationshipsAssignment_1_1 : ( ruleRelationships ) ;
    public final void rule__Expression__UngroupedRelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1116:1: ( ( ruleRelationships ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1117:1: ( ruleRelationships )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1117:1: ( ruleRelationships )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1118:1: ruleRelationships
            {
             before(grammarAccess.getExpressionAccess().getUngroupedRelationshipsRelationshipsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationships_in_rule__Expression__UngroupedRelationshipsAssignment_1_12180);
            ruleRelationships();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getUngroupedRelationshipsRelationshipsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__UngroupedRelationshipsAssignment_1_1"


    // $ANTLR start "rule__Expression__GroupedRelationshipsAssignment_1_2"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1127:1: rule__Expression__GroupedRelationshipsAssignment_1_2 : ( ruleRelationshipGroup ) ;
    public final void rule__Expression__GroupedRelationshipsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1131:1: ( ( ruleRelationshipGroup ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1132:1: ( ruleRelationshipGroup )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1132:1: ( ruleRelationshipGroup )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1133:1: ruleRelationshipGroup
            {
             before(grammarAccess.getExpressionAccess().getGroupedRelationshipsRelationshipGroupParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleRelationshipGroup_in_rule__Expression__GroupedRelationshipsAssignment_1_22211);
            ruleRelationshipGroup();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getGroupedRelationshipsRelationshipGroupParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__GroupedRelationshipsAssignment_1_2"


    // $ANTLR start "rule__IsaRelationships__RelationshipsAssignment_0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1142:1: rule__IsaRelationships__RelationshipsAssignment_0 : ( ruleConcept ) ;
    public final void rule__IsaRelationships__RelationshipsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1146:1: ( ( ruleConcept ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1147:1: ( ruleConcept )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1147:1: ( ruleConcept )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1148:1: ruleConcept
            {
             before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__IsaRelationships__RelationshipsAssignment_02242);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__RelationshipsAssignment_0"


    // $ANTLR start "rule__IsaRelationships__RelationshipsAssignment_1_1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1157:1: rule__IsaRelationships__RelationshipsAssignment_1_1 : ( ruleConcept ) ;
    public final void rule__IsaRelationships__RelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1161:1: ( ( ruleConcept ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1162:1: ( ruleConcept )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1162:1: ( ruleConcept )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1163:1: ruleConcept
            {
             before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__IsaRelationships__RelationshipsAssignment_1_12273);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsaRelationships__RelationshipsAssignment_1_1"


    // $ANTLR start "rule__RelationshipGroup__RelationshipsAssignment_1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1172:1: rule__RelationshipGroup__RelationshipsAssignment_1 : ( ruleRelationship ) ;
    public final void rule__RelationshipGroup__RelationshipsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1176:1: ( ( ruleRelationship ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1177:1: ( ruleRelationship )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1177:1: ( ruleRelationship )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1178:1: ruleRelationship
            {
             before(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__RelationshipGroup__RelationshipsAssignment_12304);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__RelationshipsAssignment_1"


    // $ANTLR start "rule__RelationshipGroup__RelationshipsAssignment_2_1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1187:1: rule__RelationshipGroup__RelationshipsAssignment_2_1 : ( ruleRelationship ) ;
    public final void rule__RelationshipGroup__RelationshipsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1191:1: ( ( ruleRelationship ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1192:1: ( ruleRelationship )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1192:1: ( ruleRelationship )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1193:1: ruleRelationship
            {
             before(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__RelationshipGroup__RelationshipsAssignment_2_12335);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipGroup__RelationshipsAssignment_2_1"


    // $ANTLR start "rule__Relationships__RelationshipsAssignment_0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1202:1: rule__Relationships__RelationshipsAssignment_0 : ( ruleRelationship ) ;
    public final void rule__Relationships__RelationshipsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1206:1: ( ( ruleRelationship ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1207:1: ( ruleRelationship )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1207:1: ( ruleRelationship )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1208:1: ruleRelationship
            {
             before(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__Relationships__RelationshipsAssignment_02366);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__RelationshipsAssignment_0"


    // $ANTLR start "rule__Relationships__RelationshipsAssignment_1_1"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1217:1: rule__Relationships__RelationshipsAssignment_1_1 : ( ruleRelationship ) ;
    public final void rule__Relationships__RelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1221:1: ( ( ruleRelationship ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1222:1: ( ruleRelationship )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1222:1: ( ruleRelationship )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1223:1: ruleRelationship
            {
             before(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__Relationships__RelationshipsAssignment_1_12397);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationships__RelationshipsAssignment_1_1"


    // $ANTLR start "rule__Relationship__TypeAssignment_0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1232:1: rule__Relationship__TypeAssignment_0 : ( ruleConcept ) ;
    public final void rule__Relationship__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1236:1: ( ( ruleConcept ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1237:1: ( ruleConcept )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1237:1: ( ruleConcept )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1238:1: ruleConcept
            {
             before(grammarAccess.getRelationshipAccess().getTypeConceptParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__Relationship__TypeAssignment_02428);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getTypeConceptParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TypeAssignment_0"


    // $ANTLR start "rule__Relationship__DestinationAssignment_2"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1247:1: rule__Relationship__DestinationAssignment_2 : ( ruleConcept ) ;
    public final void rule__Relationship__DestinationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1251:1: ( ( ruleConcept ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1252:1: ( ruleConcept )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1252:1: ( ruleConcept )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1253:1: ruleConcept
            {
             before(grammarAccess.getRelationshipAccess().getDestinationConceptParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__Relationship__DestinationAssignment_22459);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getDestinationConceptParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__DestinationAssignment_2"


    // $ANTLR start "rule__Concept__IdAssignment_0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1262:1: rule__Concept__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__Concept__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1266:1: ( ( RULE_ID ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1267:1: ( RULE_ID )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1267:1: ( RULE_ID )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1268:1: RULE_ID
            {
             before(grammarAccess.getConceptAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Concept__IdAssignment_02490); 
             after(grammarAccess.getConceptAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__IdAssignment_0"


    // $ANTLR start "rule__Concept__TermAssignment_3"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1277:1: rule__Concept__TermAssignment_3 : ( RULE_TERM ) ;
    public final void rule__Concept__TermAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1281:1: ( ( RULE_TERM ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1282:1: ( RULE_TERM )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1282:1: ( RULE_TERM )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1283:1: RULE_TERM
            {
             before(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_3_0()); 
            match(input,RULE_TERM,FOLLOW_RULE_TERM_in_rule__Concept__TermAssignment_32521); 
             after(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__TermAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsaRelationships_in_entryRuleIsaRelationships130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsaRelationships137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group__0_in_ruleIsaRelationships163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipGroup_in_entryRuleRelationshipGroup190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipGroup197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__0_in_ruleRelationshipGroup223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationships_in_entryRuleRelationships250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationships257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group__0_in_ruleRelationships283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_entryRuleConcept370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcept377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__0_in_ruleConcept403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__0437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__0440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__IsaRelationshipsAssignment_0_in_rule__Expression__Group__0__Impl467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0559 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__Expression__Group_1__0__Impl589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1618 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__UngroupedRelationshipsAssignment_1_1_in_rule__Expression__Group_1__1__Impl648 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__GroupedRelationshipsAssignment_1_2_in_rule__Expression__Group_1__2__Impl706 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group__0__Impl_in_rule__IsaRelationships__Group__0743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group__1_in_rule__IsaRelationships__Group__0746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__RelationshipsAssignment_0_in_rule__IsaRelationships__Group__0__Impl773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group__1__Impl_in_rule__IsaRelationships__Group__1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group_1__0_in_rule__IsaRelationships__Group__1__Impl830 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group_1__0__Impl_in_rule__IsaRelationships__Group_1__0865 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group_1__1_in_rule__IsaRelationships__Group_1__0868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_SIGN_in_rule__IsaRelationships__Group_1__0__Impl895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group_1__1__Impl_in_rule__IsaRelationships__Group_1__1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__RelationshipsAssignment_1_1_in_rule__IsaRelationships__Group_1__1__Impl951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__0__Impl_in_rule__RelationshipGroup__Group__0985 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__1_in_rule__RelationshipGroup__Group__0988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENING_CURLY_BRACKET_in_rule__RelationshipGroup__Group__0__Impl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__1__Impl_in_rule__RelationshipGroup__Group__11044 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__2_in_rule__RelationshipGroup__Group__11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__RelationshipsAssignment_1_in_rule__RelationshipGroup__Group__1__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__2__Impl_in_rule__RelationshipGroup__Group__21104 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__3_in_rule__RelationshipGroup__Group__21107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group_2__0_in_rule__RelationshipGroup__Group__2__Impl1134 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__3__Impl_in_rule__RelationshipGroup__Group__31165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSING_CURLY_BRACKET_in_rule__RelationshipGroup__Group__3__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group_2__0__Impl_in_rule__RelationshipGroup__Group_2__01229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group_2__1_in_rule__RelationshipGroup__Group_2__01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__RelationshipGroup__Group_2__0__Impl1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group_2__1__Impl_in_rule__RelationshipGroup__Group_2__11288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__RelationshipsAssignment_2_1_in_rule__RelationshipGroup__Group_2__1__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group__0__Impl_in_rule__Relationships__Group__01349 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Relationships__Group__1_in_rule__Relationships__Group__01352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__RelationshipsAssignment_0_in_rule__Relationships__Group__0__Impl1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group__1__Impl_in_rule__Relationships__Group__11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group_1__0_in_rule__Relationships__Group__1__Impl1436 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Relationships__Group_1__0__Impl_in_rule__Relationships__Group_1__01471 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Relationships__Group_1__1_in_rule__Relationships__Group_1__01474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Relationships__Group_1__0__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group_1__1__Impl_in_rule__Relationships__Group_1__11530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__RelationshipsAssignment_1_1_in_rule__Relationships__Group_1__1__Impl1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__01591 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__01594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__11651 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__11654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_SIGN_in_rule__Relationship__Group__1__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__21710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__DestinationAssignment_2_in_rule__Relationship__Group__2__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__0__Impl_in_rule__Concept__Group__01773 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Concept__Group__1_in_rule__Concept__Group__01776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__IdAssignment_0_in_rule__Concept__Group__0__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__1__Impl_in_rule__Concept__Group__11833 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Concept__Group__2_in_rule__Concept__Group__11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PIPE_in_rule__Concept__Group__1__Impl1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__2__Impl_in_rule__Concept__Group__21892 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Concept__Group__3_in_rule__Concept__Group__21895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Concept__Group__2__Impl1923 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Concept__Group__3__Impl_in_rule__Concept__Group__31954 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Concept__Group__4_in_rule__Concept__Group__31957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__TermAssignment_3_in_rule__Concept__Group__3__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__4__Impl_in_rule__Concept__Group__42014 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Concept__Group__5_in_rule__Concept__Group__42017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PIPE_in_rule__Concept__Group__4__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__5__Impl_in_rule__Concept__Group__52073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Concept__Group__5__Impl2101 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleIsaRelationships_in_rule__Expression__IsaRelationshipsAssignment_02149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationships_in_rule__Expression__UngroupedRelationshipsAssignment_1_12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipGroup_in_rule__Expression__GroupedRelationshipsAssignment_1_22211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__IsaRelationships__RelationshipsAssignment_02242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__IsaRelationships__RelationshipsAssignment_1_12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__RelationshipGroup__RelationshipsAssignment_12304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__RelationshipGroup__RelationshipsAssignment_2_12335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Relationships__RelationshipsAssignment_02366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Relationships__RelationshipsAssignment_1_12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__Relationship__TypeAssignment_02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__Relationship__DestinationAssignment_22459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Concept__IdAssignment_02490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TERM_in_rule__Concept__TermAssignment_32521 = new BitSet(new long[]{0x0000000000000002L});

}