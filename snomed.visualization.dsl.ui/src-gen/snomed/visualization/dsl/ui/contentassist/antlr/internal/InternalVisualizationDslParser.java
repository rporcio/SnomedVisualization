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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TERM", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'+'", "'{'", "'}'", "','", "'='", "'|'"
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




    // $ANTLR start "entryRuleModel"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:61:1: ( ruleModel EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:69:1: ruleModel : ( ( rule__Model__ExpressionAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:73:2: ( ( ( rule__Model__ExpressionAssignment ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:74:1: ( ( rule__Model__ExpressionAssignment ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:74:1: ( ( rule__Model__ExpressionAssignment ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:75:1: ( rule__Model__ExpressionAssignment )
            {
             before(grammarAccess.getModelAccess().getExpressionAssignment()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:76:1: ( rule__Model__ExpressionAssignment )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:76:2: rule__Model__ExpressionAssignment
            {
            pushFollow(FOLLOW_rule__Model__ExpressionAssignment_in_ruleModel94);
            rule__Model__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExpressionAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:88:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:89:1: ( ruleExpression EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:90:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression121);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression128); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:97:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:101:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:102:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:102:1: ( ( rule__Expression__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:103:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:104:1: ( rule__Expression__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:104:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression154);
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

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIsaRelationships"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:116:1: entryRuleIsaRelationships : ruleIsaRelationships EOF ;
    public final void entryRuleIsaRelationships() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:117:1: ( ruleIsaRelationships EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:118:1: ruleIsaRelationships EOF
            {
             before(grammarAccess.getIsaRelationshipsRule()); 
            pushFollow(FOLLOW_ruleIsaRelationships_in_entryRuleIsaRelationships181);
            ruleIsaRelationships();

            state._fsp--;

             after(grammarAccess.getIsaRelationshipsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsaRelationships188); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:125:1: ruleIsaRelationships : ( ( rule__IsaRelationships__Group__0 ) ) ;
    public final void ruleIsaRelationships() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:129:2: ( ( ( rule__IsaRelationships__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:130:1: ( ( rule__IsaRelationships__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:130:1: ( ( rule__IsaRelationships__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:131:1: ( rule__IsaRelationships__Group__0 )
            {
             before(grammarAccess.getIsaRelationshipsAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:132:1: ( rule__IsaRelationships__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:132:2: rule__IsaRelationships__Group__0
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group__0_in_ruleIsaRelationships214);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:144:1: entryRuleRelationshipGroup : ruleRelationshipGroup EOF ;
    public final void entryRuleRelationshipGroup() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:145:1: ( ruleRelationshipGroup EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:146:1: ruleRelationshipGroup EOF
            {
             before(grammarAccess.getRelationshipGroupRule()); 
            pushFollow(FOLLOW_ruleRelationshipGroup_in_entryRuleRelationshipGroup241);
            ruleRelationshipGroup();

            state._fsp--;

             after(grammarAccess.getRelationshipGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipGroup248); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:153:1: ruleRelationshipGroup : ( ( rule__RelationshipGroup__Group__0 ) ) ;
    public final void ruleRelationshipGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:157:2: ( ( ( rule__RelationshipGroup__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:158:1: ( ( rule__RelationshipGroup__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:158:1: ( ( rule__RelationshipGroup__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:159:1: ( rule__RelationshipGroup__Group__0 )
            {
             before(grammarAccess.getRelationshipGroupAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:160:1: ( rule__RelationshipGroup__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:160:2: rule__RelationshipGroup__Group__0
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__0_in_ruleRelationshipGroup274);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:172:1: entryRuleRelationships : ruleRelationships EOF ;
    public final void entryRuleRelationships() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:173:1: ( ruleRelationships EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:174:1: ruleRelationships EOF
            {
             before(grammarAccess.getRelationshipsRule()); 
            pushFollow(FOLLOW_ruleRelationships_in_entryRuleRelationships301);
            ruleRelationships();

            state._fsp--;

             after(grammarAccess.getRelationshipsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationships308); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:181:1: ruleRelationships : ( ( rule__Relationships__Group__0 ) ) ;
    public final void ruleRelationships() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:185:2: ( ( ( rule__Relationships__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:186:1: ( ( rule__Relationships__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:186:1: ( ( rule__Relationships__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:187:1: ( rule__Relationships__Group__0 )
            {
             before(grammarAccess.getRelationshipsAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:188:1: ( rule__Relationships__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:188:2: rule__Relationships__Group__0
            {
            pushFollow(FOLLOW_rule__Relationships__Group__0_in_ruleRelationships334);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:200:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:201:1: ( ruleRelationship EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:202:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship361);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship368); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:209:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:213:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:214:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:214:1: ( ( rule__Relationship__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:215:1: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:216:1: ( rule__Relationship__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:216:2: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0_in_ruleRelationship394);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:228:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:229:1: ( ruleConcept EOF )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:230:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_ruleConcept_in_entryRuleConcept421);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcept428); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:237:1: ruleConcept : ( ( rule__Concept__Group__0 ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:241:2: ( ( ( rule__Concept__Group__0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:242:1: ( ( rule__Concept__Group__0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:242:1: ( ( rule__Concept__Group__0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:243:1: ( rule__Concept__Group__0 )
            {
             before(grammarAccess.getConceptAccess().getGroup()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:244:1: ( rule__Concept__Group__0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:244:2: rule__Concept__Group__0
            {
            pushFollow(FOLLOW_rule__Concept__Group__0_in_ruleConcept454);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:258:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:262:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:263:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__0488);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__0491);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:270:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__IsaRelationshipsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:274:1: ( ( ( rule__Expression__IsaRelationshipsAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:275:1: ( ( rule__Expression__IsaRelationshipsAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:275:1: ( ( rule__Expression__IsaRelationshipsAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:276:1: ( rule__Expression__IsaRelationshipsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getIsaRelationshipsAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:277:1: ( rule__Expression__IsaRelationshipsAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:277:2: rule__Expression__IsaRelationshipsAssignment_0
            {
            pushFollow(FOLLOW_rule__Expression__IsaRelationshipsAssignment_0_in_rule__Expression__Group__0__Impl518);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:287:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:291:1: ( rule__Expression__Group__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:292:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__1548);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:298:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:302:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:303:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:303:1: ( ( rule__Expression__Group_1__0 )? )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:304:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:305:1: ( rule__Expression__Group_1__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:305:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl575);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:319:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:323:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:324:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0610);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0613);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:331:1: rule__Expression__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:335:1: ( ( ':' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:336:1: ( ':' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:336:1: ( ':' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:337:1: ':'
            {
             before(grammarAccess.getExpressionAccess().getColonKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Expression__Group_1__0__Impl641); 
             after(grammarAccess.getExpressionAccess().getColonKeyword_1_0()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:350:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:354:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:355:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1672);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__1675);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:362:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )* ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:366:1: ( ( ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:367:1: ( ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:367:1: ( ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:368:1: ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )*
            {
             before(grammarAccess.getExpressionAccess().getUngroupedRelationshipsAssignment_1_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:369:1: ( rule__Expression__UngroupedRelationshipsAssignment_1_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:369:2: rule__Expression__UngroupedRelationshipsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Expression__UngroupedRelationshipsAssignment_1_1_in_rule__Expression__Group_1__1__Impl702);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:379:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:383:1: ( rule__Expression__Group_1__2__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:384:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__2733);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:390:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__GroupedRelationshipsAssignment_1_2 )* ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:394:1: ( ( ( rule__Expression__GroupedRelationshipsAssignment_1_2 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:395:1: ( ( rule__Expression__GroupedRelationshipsAssignment_1_2 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:395:1: ( ( rule__Expression__GroupedRelationshipsAssignment_1_2 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:396:1: ( rule__Expression__GroupedRelationshipsAssignment_1_2 )*
            {
             before(grammarAccess.getExpressionAccess().getGroupedRelationshipsAssignment_1_2()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:397:1: ( rule__Expression__GroupedRelationshipsAssignment_1_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:397:2: rule__Expression__GroupedRelationshipsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Expression__GroupedRelationshipsAssignment_1_2_in_rule__Expression__Group_1__2__Impl760);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:413:1: rule__IsaRelationships__Group__0 : rule__IsaRelationships__Group__0__Impl rule__IsaRelationships__Group__1 ;
    public final void rule__IsaRelationships__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:417:1: ( rule__IsaRelationships__Group__0__Impl rule__IsaRelationships__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:418:2: rule__IsaRelationships__Group__0__Impl rule__IsaRelationships__Group__1
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group__0__Impl_in_rule__IsaRelationships__Group__0797);
            rule__IsaRelationships__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IsaRelationships__Group__1_in_rule__IsaRelationships__Group__0800);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:425:1: rule__IsaRelationships__Group__0__Impl : ( ( rule__IsaRelationships__RelationshipsAssignment_0 ) ) ;
    public final void rule__IsaRelationships__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:429:1: ( ( ( rule__IsaRelationships__RelationshipsAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:430:1: ( ( rule__IsaRelationships__RelationshipsAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:430:1: ( ( rule__IsaRelationships__RelationshipsAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:431:1: ( rule__IsaRelationships__RelationshipsAssignment_0 )
            {
             before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:432:1: ( rule__IsaRelationships__RelationshipsAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:432:2: rule__IsaRelationships__RelationshipsAssignment_0
            {
            pushFollow(FOLLOW_rule__IsaRelationships__RelationshipsAssignment_0_in_rule__IsaRelationships__Group__0__Impl827);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:442:1: rule__IsaRelationships__Group__1 : rule__IsaRelationships__Group__1__Impl ;
    public final void rule__IsaRelationships__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:446:1: ( rule__IsaRelationships__Group__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:447:2: rule__IsaRelationships__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group__1__Impl_in_rule__IsaRelationships__Group__1857);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:453:1: rule__IsaRelationships__Group__1__Impl : ( ( rule__IsaRelationships__Group_1__0 )* ) ;
    public final void rule__IsaRelationships__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:457:1: ( ( ( rule__IsaRelationships__Group_1__0 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:458:1: ( ( rule__IsaRelationships__Group_1__0 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:458:1: ( ( rule__IsaRelationships__Group_1__0 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:459:1: ( rule__IsaRelationships__Group_1__0 )*
            {
             before(grammarAccess.getIsaRelationshipsAccess().getGroup_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:460:1: ( rule__IsaRelationships__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:460:2: rule__IsaRelationships__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IsaRelationships__Group_1__0_in_rule__IsaRelationships__Group__1__Impl884);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:474:1: rule__IsaRelationships__Group_1__0 : rule__IsaRelationships__Group_1__0__Impl rule__IsaRelationships__Group_1__1 ;
    public final void rule__IsaRelationships__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:478:1: ( rule__IsaRelationships__Group_1__0__Impl rule__IsaRelationships__Group_1__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:479:2: rule__IsaRelationships__Group_1__0__Impl rule__IsaRelationships__Group_1__1
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group_1__0__Impl_in_rule__IsaRelationships__Group_1__0919);
            rule__IsaRelationships__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IsaRelationships__Group_1__1_in_rule__IsaRelationships__Group_1__0922);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:486:1: rule__IsaRelationships__Group_1__0__Impl : ( '+' ) ;
    public final void rule__IsaRelationships__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:490:1: ( ( '+' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:491:1: ( '+' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:491:1: ( '+' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:492:1: '+'
            {
             before(grammarAccess.getIsaRelationshipsAccess().getPlusSignKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__IsaRelationships__Group_1__0__Impl950); 
             after(grammarAccess.getIsaRelationshipsAccess().getPlusSignKeyword_1_0()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:505:1: rule__IsaRelationships__Group_1__1 : rule__IsaRelationships__Group_1__1__Impl ;
    public final void rule__IsaRelationships__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:509:1: ( rule__IsaRelationships__Group_1__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:510:2: rule__IsaRelationships__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IsaRelationships__Group_1__1__Impl_in_rule__IsaRelationships__Group_1__1981);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:516:1: rule__IsaRelationships__Group_1__1__Impl : ( ( rule__IsaRelationships__RelationshipsAssignment_1_1 ) ) ;
    public final void rule__IsaRelationships__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:520:1: ( ( ( rule__IsaRelationships__RelationshipsAssignment_1_1 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:521:1: ( ( rule__IsaRelationships__RelationshipsAssignment_1_1 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:521:1: ( ( rule__IsaRelationships__RelationshipsAssignment_1_1 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:522:1: ( rule__IsaRelationships__RelationshipsAssignment_1_1 )
            {
             before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_1_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:523:1: ( rule__IsaRelationships__RelationshipsAssignment_1_1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:523:2: rule__IsaRelationships__RelationshipsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IsaRelationships__RelationshipsAssignment_1_1_in_rule__IsaRelationships__Group_1__1__Impl1008);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:537:1: rule__RelationshipGroup__Group__0 : rule__RelationshipGroup__Group__0__Impl rule__RelationshipGroup__Group__1 ;
    public final void rule__RelationshipGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:541:1: ( rule__RelationshipGroup__Group__0__Impl rule__RelationshipGroup__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:542:2: rule__RelationshipGroup__Group__0__Impl rule__RelationshipGroup__Group__1
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__0__Impl_in_rule__RelationshipGroup__Group__01042);
            rule__RelationshipGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipGroup__Group__1_in_rule__RelationshipGroup__Group__01045);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:549:1: rule__RelationshipGroup__Group__0__Impl : ( '{' ) ;
    public final void rule__RelationshipGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:553:1: ( ( '{' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:554:1: ( '{' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:554:1: ( '{' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:555:1: '{'
            {
             before(grammarAccess.getRelationshipGroupAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__RelationshipGroup__Group__0__Impl1073); 
             after(grammarAccess.getRelationshipGroupAccess().getLeftCurlyBracketKeyword_0()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:568:1: rule__RelationshipGroup__Group__1 : rule__RelationshipGroup__Group__1__Impl rule__RelationshipGroup__Group__2 ;
    public final void rule__RelationshipGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:572:1: ( rule__RelationshipGroup__Group__1__Impl rule__RelationshipGroup__Group__2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:573:2: rule__RelationshipGroup__Group__1__Impl rule__RelationshipGroup__Group__2
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__1__Impl_in_rule__RelationshipGroup__Group__11104);
            rule__RelationshipGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipGroup__Group__2_in_rule__RelationshipGroup__Group__11107);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:580:1: rule__RelationshipGroup__Group__1__Impl : ( ( rule__RelationshipGroup__RelationshipsAssignment_1 ) ) ;
    public final void rule__RelationshipGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:584:1: ( ( ( rule__RelationshipGroup__RelationshipsAssignment_1 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:585:1: ( ( rule__RelationshipGroup__RelationshipsAssignment_1 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:585:1: ( ( rule__RelationshipGroup__RelationshipsAssignment_1 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:586:1: ( rule__RelationshipGroup__RelationshipsAssignment_1 )
            {
             before(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:587:1: ( rule__RelationshipGroup__RelationshipsAssignment_1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:587:2: rule__RelationshipGroup__RelationshipsAssignment_1
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__RelationshipsAssignment_1_in_rule__RelationshipGroup__Group__1__Impl1134);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:597:1: rule__RelationshipGroup__Group__2 : rule__RelationshipGroup__Group__2__Impl rule__RelationshipGroup__Group__3 ;
    public final void rule__RelationshipGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:601:1: ( rule__RelationshipGroup__Group__2__Impl rule__RelationshipGroup__Group__3 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:602:2: rule__RelationshipGroup__Group__2__Impl rule__RelationshipGroup__Group__3
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__2__Impl_in_rule__RelationshipGroup__Group__21164);
            rule__RelationshipGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipGroup__Group__3_in_rule__RelationshipGroup__Group__21167);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:609:1: rule__RelationshipGroup__Group__2__Impl : ( ( rule__RelationshipGroup__Group_2__0 )* ) ;
    public final void rule__RelationshipGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:613:1: ( ( ( rule__RelationshipGroup__Group_2__0 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:614:1: ( ( rule__RelationshipGroup__Group_2__0 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:614:1: ( ( rule__RelationshipGroup__Group_2__0 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:615:1: ( rule__RelationshipGroup__Group_2__0 )*
            {
             before(grammarAccess.getRelationshipGroupAccess().getGroup_2()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:616:1: ( rule__RelationshipGroup__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:616:2: rule__RelationshipGroup__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RelationshipGroup__Group_2__0_in_rule__RelationshipGroup__Group__2__Impl1194);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:626:1: rule__RelationshipGroup__Group__3 : rule__RelationshipGroup__Group__3__Impl ;
    public final void rule__RelationshipGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:630:1: ( rule__RelationshipGroup__Group__3__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:631:2: rule__RelationshipGroup__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group__3__Impl_in_rule__RelationshipGroup__Group__31225);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:637:1: rule__RelationshipGroup__Group__3__Impl : ( '}' ) ;
    public final void rule__RelationshipGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:641:1: ( ( '}' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:642:1: ( '}' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:642:1: ( '}' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:643:1: '}'
            {
             before(grammarAccess.getRelationshipGroupAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__RelationshipGroup__Group__3__Impl1253); 
             after(grammarAccess.getRelationshipGroupAccess().getRightCurlyBracketKeyword_3()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:664:1: rule__RelationshipGroup__Group_2__0 : rule__RelationshipGroup__Group_2__0__Impl rule__RelationshipGroup__Group_2__1 ;
    public final void rule__RelationshipGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:668:1: ( rule__RelationshipGroup__Group_2__0__Impl rule__RelationshipGroup__Group_2__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:669:2: rule__RelationshipGroup__Group_2__0__Impl rule__RelationshipGroup__Group_2__1
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group_2__0__Impl_in_rule__RelationshipGroup__Group_2__01292);
            rule__RelationshipGroup__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipGroup__Group_2__1_in_rule__RelationshipGroup__Group_2__01295);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:676:1: rule__RelationshipGroup__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RelationshipGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:680:1: ( ( ',' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:681:1: ( ',' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:681:1: ( ',' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:682:1: ','
            {
             before(grammarAccess.getRelationshipGroupAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__RelationshipGroup__Group_2__0__Impl1323); 
             after(grammarAccess.getRelationshipGroupAccess().getCommaKeyword_2_0()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:695:1: rule__RelationshipGroup__Group_2__1 : rule__RelationshipGroup__Group_2__1__Impl ;
    public final void rule__RelationshipGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:699:1: ( rule__RelationshipGroup__Group_2__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:700:2: rule__RelationshipGroup__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__Group_2__1__Impl_in_rule__RelationshipGroup__Group_2__11354);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:706:1: rule__RelationshipGroup__Group_2__1__Impl : ( ( rule__RelationshipGroup__RelationshipsAssignment_2_1 ) ) ;
    public final void rule__RelationshipGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:710:1: ( ( ( rule__RelationshipGroup__RelationshipsAssignment_2_1 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:711:1: ( ( rule__RelationshipGroup__RelationshipsAssignment_2_1 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:711:1: ( ( rule__RelationshipGroup__RelationshipsAssignment_2_1 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:712:1: ( rule__RelationshipGroup__RelationshipsAssignment_2_1 )
            {
             before(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_2_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:713:1: ( rule__RelationshipGroup__RelationshipsAssignment_2_1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:713:2: rule__RelationshipGroup__RelationshipsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RelationshipGroup__RelationshipsAssignment_2_1_in_rule__RelationshipGroup__Group_2__1__Impl1381);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:727:1: rule__Relationships__Group__0 : rule__Relationships__Group__0__Impl rule__Relationships__Group__1 ;
    public final void rule__Relationships__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:731:1: ( rule__Relationships__Group__0__Impl rule__Relationships__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:732:2: rule__Relationships__Group__0__Impl rule__Relationships__Group__1
            {
            pushFollow(FOLLOW_rule__Relationships__Group__0__Impl_in_rule__Relationships__Group__01415);
            rule__Relationships__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationships__Group__1_in_rule__Relationships__Group__01418);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:739:1: rule__Relationships__Group__0__Impl : ( ( rule__Relationships__RelationshipsAssignment_0 ) ) ;
    public final void rule__Relationships__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:743:1: ( ( ( rule__Relationships__RelationshipsAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:744:1: ( ( rule__Relationships__RelationshipsAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:744:1: ( ( rule__Relationships__RelationshipsAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:745:1: ( rule__Relationships__RelationshipsAssignment_0 )
            {
             before(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:746:1: ( rule__Relationships__RelationshipsAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:746:2: rule__Relationships__RelationshipsAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationships__RelationshipsAssignment_0_in_rule__Relationships__Group__0__Impl1445);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:756:1: rule__Relationships__Group__1 : rule__Relationships__Group__1__Impl ;
    public final void rule__Relationships__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:760:1: ( rule__Relationships__Group__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:761:2: rule__Relationships__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relationships__Group__1__Impl_in_rule__Relationships__Group__11475);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:767:1: rule__Relationships__Group__1__Impl : ( ( rule__Relationships__Group_1__0 )* ) ;
    public final void rule__Relationships__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:771:1: ( ( ( rule__Relationships__Group_1__0 )* ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:772:1: ( ( rule__Relationships__Group_1__0 )* )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:772:1: ( ( rule__Relationships__Group_1__0 )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:773:1: ( rule__Relationships__Group_1__0 )*
            {
             before(grammarAccess.getRelationshipsAccess().getGroup_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:774:1: ( rule__Relationships__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:774:2: rule__Relationships__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Relationships__Group_1__0_in_rule__Relationships__Group__1__Impl1502);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:788:1: rule__Relationships__Group_1__0 : rule__Relationships__Group_1__0__Impl rule__Relationships__Group_1__1 ;
    public final void rule__Relationships__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:792:1: ( rule__Relationships__Group_1__0__Impl rule__Relationships__Group_1__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:793:2: rule__Relationships__Group_1__0__Impl rule__Relationships__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relationships__Group_1__0__Impl_in_rule__Relationships__Group_1__01537);
            rule__Relationships__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationships__Group_1__1_in_rule__Relationships__Group_1__01540);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:800:1: rule__Relationships__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Relationships__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:804:1: ( ( ',' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:805:1: ( ',' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:805:1: ( ',' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:806:1: ','
            {
             before(grammarAccess.getRelationshipsAccess().getCommaKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Relationships__Group_1__0__Impl1568); 
             after(grammarAccess.getRelationshipsAccess().getCommaKeyword_1_0()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:819:1: rule__Relationships__Group_1__1 : rule__Relationships__Group_1__1__Impl ;
    public final void rule__Relationships__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:823:1: ( rule__Relationships__Group_1__1__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:824:2: rule__Relationships__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relationships__Group_1__1__Impl_in_rule__Relationships__Group_1__11599);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:830:1: rule__Relationships__Group_1__1__Impl : ( ( rule__Relationships__RelationshipsAssignment_1_1 ) ) ;
    public final void rule__Relationships__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:834:1: ( ( ( rule__Relationships__RelationshipsAssignment_1_1 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:835:1: ( ( rule__Relationships__RelationshipsAssignment_1_1 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:835:1: ( ( rule__Relationships__RelationshipsAssignment_1_1 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:836:1: ( rule__Relationships__RelationshipsAssignment_1_1 )
            {
             before(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_1_1()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:837:1: ( rule__Relationships__RelationshipsAssignment_1_1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:837:2: rule__Relationships__RelationshipsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relationships__RelationshipsAssignment_1_1_in_rule__Relationships__Group_1__1__Impl1626);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:851:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:855:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:856:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__01660);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__01663);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:863:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__TypeAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:867:1: ( ( ( rule__Relationship__TypeAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:868:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:868:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:869:1: ( rule__Relationship__TypeAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:870:1: ( rule__Relationship__TypeAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:870:2: rule__Relationship__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl1690);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:880:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:884:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:885:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__11720);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__11723);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:892:1: rule__Relationship__Group__1__Impl : ( '=' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:896:1: ( ( '=' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:897:1: ( '=' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:897:1: ( '=' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:898:1: '='
            {
             before(grammarAccess.getRelationshipAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Relationship__Group__1__Impl1751); 
             after(grammarAccess.getRelationshipAccess().getEqualsSignKeyword_1()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:911:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:915:1: ( rule__Relationship__Group__2__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:916:2: rule__Relationship__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__21782);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:922:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__DestinationAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:926:1: ( ( ( rule__Relationship__DestinationAssignment_2 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:927:1: ( ( rule__Relationship__DestinationAssignment_2 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:927:1: ( ( rule__Relationship__DestinationAssignment_2 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:928:1: ( rule__Relationship__DestinationAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getDestinationAssignment_2()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:929:1: ( rule__Relationship__DestinationAssignment_2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:929:2: rule__Relationship__DestinationAssignment_2
            {
            pushFollow(FOLLOW_rule__Relationship__DestinationAssignment_2_in_rule__Relationship__Group__2__Impl1809);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:945:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:949:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:950:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
            {
            pushFollow(FOLLOW_rule__Concept__Group__0__Impl_in_rule__Concept__Group__01845);
            rule__Concept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concept__Group__1_in_rule__Concept__Group__01848);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:957:1: rule__Concept__Group__0__Impl : ( ( rule__Concept__IdAssignment_0 ) ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:961:1: ( ( ( rule__Concept__IdAssignment_0 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:962:1: ( ( rule__Concept__IdAssignment_0 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:962:1: ( ( rule__Concept__IdAssignment_0 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:963:1: ( rule__Concept__IdAssignment_0 )
            {
             before(grammarAccess.getConceptAccess().getIdAssignment_0()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:964:1: ( rule__Concept__IdAssignment_0 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:964:2: rule__Concept__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Concept__IdAssignment_0_in_rule__Concept__Group__0__Impl1875);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:974:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:978:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:979:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
            {
            pushFollow(FOLLOW_rule__Concept__Group__1__Impl_in_rule__Concept__Group__11905);
            rule__Concept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concept__Group__2_in_rule__Concept__Group__11908);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:986:1: rule__Concept__Group__1__Impl : ( '|' ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:990:1: ( ( '|' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:991:1: ( '|' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:991:1: ( '|' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:992:1: '|'
            {
             before(grammarAccess.getConceptAccess().getVerticalLineKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Concept__Group__1__Impl1936); 
             after(grammarAccess.getConceptAccess().getVerticalLineKeyword_1()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1005:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl rule__Concept__Group__3 ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1009:1: ( rule__Concept__Group__2__Impl rule__Concept__Group__3 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1010:2: rule__Concept__Group__2__Impl rule__Concept__Group__3
            {
            pushFollow(FOLLOW_rule__Concept__Group__2__Impl_in_rule__Concept__Group__21967);
            rule__Concept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concept__Group__3_in_rule__Concept__Group__21970);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1017:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__TermAssignment_2 ) ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1021:1: ( ( ( rule__Concept__TermAssignment_2 ) ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1022:1: ( ( rule__Concept__TermAssignment_2 ) )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1022:1: ( ( rule__Concept__TermAssignment_2 ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1023:1: ( rule__Concept__TermAssignment_2 )
            {
             before(grammarAccess.getConceptAccess().getTermAssignment_2()); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1024:1: ( rule__Concept__TermAssignment_2 )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1024:2: rule__Concept__TermAssignment_2
            {
            pushFollow(FOLLOW_rule__Concept__TermAssignment_2_in_rule__Concept__Group__2__Impl1997);
            rule__Concept__TermAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getTermAssignment_2()); 

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1034:1: rule__Concept__Group__3 : rule__Concept__Group__3__Impl ;
    public final void rule__Concept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1038:1: ( rule__Concept__Group__3__Impl )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1039:2: rule__Concept__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Concept__Group__3__Impl_in_rule__Concept__Group__32027);
            rule__Concept__Group__3__Impl();

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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1045:1: rule__Concept__Group__3__Impl : ( '|' ) ;
    public final void rule__Concept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1049:1: ( ( '|' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1050:1: ( '|' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1050:1: ( '|' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1051:1: '|'
            {
             before(grammarAccess.getConceptAccess().getVerticalLineKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Concept__Group__3__Impl2055); 
             after(grammarAccess.getConceptAccess().getVerticalLineKeyword_3()); 

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


    // $ANTLR start "rule__Model__ExpressionAssignment"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1073:1: rule__Model__ExpressionAssignment : ( ruleExpression ) ;
    public final void rule__Model__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1077:1: ( ( ruleExpression ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1078:1: ( ruleExpression )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1078:1: ( ruleExpression )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1079:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Model__ExpressionAssignment2099);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ExpressionAssignment"


    // $ANTLR start "rule__Expression__IsaRelationshipsAssignment_0"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1088:1: rule__Expression__IsaRelationshipsAssignment_0 : ( ruleIsaRelationships ) ;
    public final void rule__Expression__IsaRelationshipsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1092:1: ( ( ruleIsaRelationships ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1093:1: ( ruleIsaRelationships )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1093:1: ( ruleIsaRelationships )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1094:1: ruleIsaRelationships
            {
             before(grammarAccess.getExpressionAccess().getIsaRelationshipsIsaRelationshipsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIsaRelationships_in_rule__Expression__IsaRelationshipsAssignment_02130);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1103:1: rule__Expression__UngroupedRelationshipsAssignment_1_1 : ( ruleRelationships ) ;
    public final void rule__Expression__UngroupedRelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1107:1: ( ( ruleRelationships ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1108:1: ( ruleRelationships )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1108:1: ( ruleRelationships )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1109:1: ruleRelationships
            {
             before(grammarAccess.getExpressionAccess().getUngroupedRelationshipsRelationshipsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationships_in_rule__Expression__UngroupedRelationshipsAssignment_1_12161);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1118:1: rule__Expression__GroupedRelationshipsAssignment_1_2 : ( ruleRelationshipGroup ) ;
    public final void rule__Expression__GroupedRelationshipsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1122:1: ( ( ruleRelationshipGroup ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1123:1: ( ruleRelationshipGroup )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1123:1: ( ruleRelationshipGroup )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1124:1: ruleRelationshipGroup
            {
             before(grammarAccess.getExpressionAccess().getGroupedRelationshipsRelationshipGroupParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleRelationshipGroup_in_rule__Expression__GroupedRelationshipsAssignment_1_22192);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1133:1: rule__IsaRelationships__RelationshipsAssignment_0 : ( ruleConcept ) ;
    public final void rule__IsaRelationships__RelationshipsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1137:1: ( ( ruleConcept ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1138:1: ( ruleConcept )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1138:1: ( ruleConcept )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1139:1: ruleConcept
            {
             before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__IsaRelationships__RelationshipsAssignment_02223);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1148:1: rule__IsaRelationships__RelationshipsAssignment_1_1 : ( ruleConcept ) ;
    public final void rule__IsaRelationships__RelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1152:1: ( ( ruleConcept ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1153:1: ( ruleConcept )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1153:1: ( ruleConcept )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1154:1: ruleConcept
            {
             before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__IsaRelationships__RelationshipsAssignment_1_12254);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1163:1: rule__RelationshipGroup__RelationshipsAssignment_1 : ( ruleRelationship ) ;
    public final void rule__RelationshipGroup__RelationshipsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1167:1: ( ( ruleRelationship ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1168:1: ( ruleRelationship )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1168:1: ( ruleRelationship )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1169:1: ruleRelationship
            {
             before(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__RelationshipGroup__RelationshipsAssignment_12285);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1178:1: rule__RelationshipGroup__RelationshipsAssignment_2_1 : ( ruleRelationship ) ;
    public final void rule__RelationshipGroup__RelationshipsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1182:1: ( ( ruleRelationship ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1183:1: ( ruleRelationship )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1183:1: ( ruleRelationship )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1184:1: ruleRelationship
            {
             before(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__RelationshipGroup__RelationshipsAssignment_2_12316);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1193:1: rule__Relationships__RelationshipsAssignment_0 : ( ruleRelationship ) ;
    public final void rule__Relationships__RelationshipsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1197:1: ( ( ruleRelationship ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1198:1: ( ruleRelationship )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1198:1: ( ruleRelationship )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1199:1: ruleRelationship
            {
             before(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__Relationships__RelationshipsAssignment_02347);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1208:1: rule__Relationships__RelationshipsAssignment_1_1 : ( ruleRelationship ) ;
    public final void rule__Relationships__RelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1212:1: ( ( ruleRelationship ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1213:1: ( ruleRelationship )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1213:1: ( ruleRelationship )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1214:1: ruleRelationship
            {
             before(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__Relationships__RelationshipsAssignment_1_12378);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1223:1: rule__Relationship__TypeAssignment_0 : ( ruleConcept ) ;
    public final void rule__Relationship__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1227:1: ( ( ruleConcept ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1228:1: ( ruleConcept )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1228:1: ( ruleConcept )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1229:1: ruleConcept
            {
             before(grammarAccess.getRelationshipAccess().getTypeConceptParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__Relationship__TypeAssignment_02409);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1238:1: rule__Relationship__DestinationAssignment_2 : ( ruleConcept ) ;
    public final void rule__Relationship__DestinationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1242:1: ( ( ruleConcept ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1243:1: ( ruleConcept )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1243:1: ( ruleConcept )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1244:1: ruleConcept
            {
             before(grammarAccess.getRelationshipAccess().getDestinationConceptParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__Relationship__DestinationAssignment_22440);
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
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1253:1: rule__Concept__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__Concept__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1257:1: ( ( RULE_ID ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1258:1: ( RULE_ID )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1258:1: ( RULE_ID )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1259:1: RULE_ID
            {
             before(grammarAccess.getConceptAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Concept__IdAssignment_02471); 
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


    // $ANTLR start "rule__Concept__TermAssignment_2"
    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1268:1: rule__Concept__TermAssignment_2 : ( RULE_TERM ) ;
    public final void rule__Concept__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1272:1: ( ( RULE_TERM ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1273:1: ( RULE_TERM )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1273:1: ( RULE_TERM )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1274:1: RULE_TERM
            {
             before(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_2_0()); 
            match(input,RULE_TERM,FOLLOW_RULE_TERM_in_rule__Concept__TermAssignment_22502); 
             after(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Concept__TermAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExpressionAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsaRelationships_in_entryRuleIsaRelationships181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsaRelationships188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group__0_in_ruleIsaRelationships214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipGroup_in_entryRuleRelationshipGroup241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipGroup248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__0_in_ruleRelationshipGroup274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationships_in_entryRuleRelationships301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationships308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group__0_in_ruleRelationships334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_entryRuleConcept421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcept428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__0_in_ruleConcept454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__0488 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__0491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__IsaRelationshipsAssignment_0_in_rule__Expression__Group__0__Impl518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0610 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Expression__Group_1__0__Impl641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1672 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__UngroupedRelationshipsAssignment_1_1_in_rule__Expression__Group_1__1__Impl702 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__GroupedRelationshipsAssignment_1_2_in_rule__Expression__Group_1__2__Impl760 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group__0__Impl_in_rule__IsaRelationships__Group__0797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group__1_in_rule__IsaRelationships__Group__0800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__RelationshipsAssignment_0_in_rule__IsaRelationships__Group__0__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group__1__Impl_in_rule__IsaRelationships__Group__1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group_1__0_in_rule__IsaRelationships__Group__1__Impl884 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group_1__0__Impl_in_rule__IsaRelationships__Group_1__0919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group_1__1_in_rule__IsaRelationships__Group_1__0922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__IsaRelationships__Group_1__0__Impl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__Group_1__1__Impl_in_rule__IsaRelationships__Group_1__1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsaRelationships__RelationshipsAssignment_1_1_in_rule__IsaRelationships__Group_1__1__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__0__Impl_in_rule__RelationshipGroup__Group__01042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__1_in_rule__RelationshipGroup__Group__01045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationshipGroup__Group__0__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__1__Impl_in_rule__RelationshipGroup__Group__11104 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__2_in_rule__RelationshipGroup__Group__11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__RelationshipsAssignment_1_in_rule__RelationshipGroup__Group__1__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__2__Impl_in_rule__RelationshipGroup__Group__21164 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__3_in_rule__RelationshipGroup__Group__21167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group_2__0_in_rule__RelationshipGroup__Group__2__Impl1194 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group__3__Impl_in_rule__RelationshipGroup__Group__31225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelationshipGroup__Group__3__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group_2__0__Impl_in_rule__RelationshipGroup__Group_2__01292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group_2__1_in_rule__RelationshipGroup__Group_2__01295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RelationshipGroup__Group_2__0__Impl1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__Group_2__1__Impl_in_rule__RelationshipGroup__Group_2__11354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipGroup__RelationshipsAssignment_2_1_in_rule__RelationshipGroup__Group_2__1__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group__0__Impl_in_rule__Relationships__Group__01415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Relationships__Group__1_in_rule__Relationships__Group__01418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__RelationshipsAssignment_0_in_rule__Relationships__Group__0__Impl1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group__1__Impl_in_rule__Relationships__Group__11475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group_1__0_in_rule__Relationships__Group__1__Impl1502 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Relationships__Group_1__0__Impl_in_rule__Relationships__Group_1__01537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationships__Group_1__1_in_rule__Relationships__Group_1__01540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Relationships__Group_1__0__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__Group_1__1__Impl_in_rule__Relationships__Group_1__11599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationships__RelationshipsAssignment_1_1_in_rule__Relationships__Group_1__1__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__01660 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__01663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__11720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Relationship__Group__1__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__21782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__DestinationAssignment_2_in_rule__Relationship__Group__2__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__0__Impl_in_rule__Concept__Group__01845 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Concept__Group__1_in_rule__Concept__Group__01848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__IdAssignment_0_in_rule__Concept__Group__0__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__1__Impl_in_rule__Concept__Group__11905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Concept__Group__2_in_rule__Concept__Group__11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Concept__Group__1__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__2__Impl_in_rule__Concept__Group__21967 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Concept__Group__3_in_rule__Concept__Group__21970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__TermAssignment_2_in_rule__Concept__Group__2__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Group__3__Impl_in_rule__Concept__Group__32027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Concept__Group__3__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Model__ExpressionAssignment2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsaRelationships_in_rule__Expression__IsaRelationshipsAssignment_02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationships_in_rule__Expression__UngroupedRelationshipsAssignment_1_12161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipGroup_in_rule__Expression__GroupedRelationshipsAssignment_1_22192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__IsaRelationships__RelationshipsAssignment_02223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__IsaRelationships__RelationshipsAssignment_1_12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__RelationshipGroup__RelationshipsAssignment_12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__RelationshipGroup__RelationshipsAssignment_2_12316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Relationships__RelationshipsAssignment_02347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Relationships__RelationshipsAssignment_1_12378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__Relationship__TypeAssignment_02409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__Relationship__DestinationAssignment_22440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Concept__IdAssignment_02471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TERM_in_rule__Concept__TermAssignment_22502 = new BitSet(new long[]{0x0000000000000002L});

}