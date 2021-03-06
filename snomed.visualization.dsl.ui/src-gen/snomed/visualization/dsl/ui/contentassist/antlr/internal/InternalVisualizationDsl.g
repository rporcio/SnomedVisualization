/*
* generated by Xtext
*/
grammar InternalVisualizationDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package snomed.visualization.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleExpression
entryRuleExpression 
@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
}
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Expression
ruleExpression
    @init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExpressionAccess().getGroup()); }
(rule__Expression__Group__0)
{ after(grammarAccess.getExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}



// Entry rule entryRuleIsaRelationships
entryRuleIsaRelationships 
:
{ before(grammarAccess.getIsaRelationshipsRule()); }
	 ruleIsaRelationships
{ after(grammarAccess.getIsaRelationshipsRule()); } 
	 EOF 
;

// Rule IsaRelationships
ruleIsaRelationships
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIsaRelationshipsAccess().getGroup()); }
(rule__IsaRelationships__Group__0)
{ after(grammarAccess.getIsaRelationshipsAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRelationshipGroup
entryRuleRelationshipGroup 
:
{ before(grammarAccess.getRelationshipGroupRule()); }
	 ruleRelationshipGroup
{ after(grammarAccess.getRelationshipGroupRule()); } 
	 EOF 
;

// Rule RelationshipGroup
ruleRelationshipGroup
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRelationshipGroupAccess().getGroup()); }
(rule__RelationshipGroup__Group__0)
{ after(grammarAccess.getRelationshipGroupAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRelationships
entryRuleRelationships 
:
{ before(grammarAccess.getRelationshipsRule()); }
	 ruleRelationships
{ after(grammarAccess.getRelationshipsRule()); } 
	 EOF 
;

// Rule Relationships
ruleRelationships
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRelationshipsAccess().getGroup()); }
(rule__Relationships__Group__0)
{ after(grammarAccess.getRelationshipsAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRelationship
entryRuleRelationship 
:
{ before(grammarAccess.getRelationshipRule()); }
	 ruleRelationship
{ after(grammarAccess.getRelationshipRule()); } 
	 EOF 
;

// Rule Relationship
ruleRelationship
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRelationshipAccess().getGroup()); }
(rule__Relationship__Group__0)
{ after(grammarAccess.getRelationshipAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConcept
entryRuleConcept 
:
{ before(grammarAccess.getConceptRule()); }
	 ruleConcept
{ after(grammarAccess.getConceptRule()); } 
	 EOF 
;

// Rule Concept
ruleConcept
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConceptAccess().getGroup()); }
(rule__Concept__Group__0)
{ after(grammarAccess.getConceptAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Expression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group__0__Impl
	rule__Expression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getIsaRelationshipsAssignment_0()); }
(rule__Expression__IsaRelationshipsAssignment_0)
{ after(grammarAccess.getExpressionAccess().getIsaRelationshipsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getGroup_1()); }
(rule__Expression__Group_1__0)?
{ after(grammarAccess.getExpressionAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Expression__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1__0__Impl
	rule__Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getCOLONTerminalRuleCall_1_0()); }
	RULE_COLON
{ after(grammarAccess.getExpressionAccess().getCOLONTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1__1__Impl
	rule__Expression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getUngroupedRelationshipsAssignment_1_1()); }
(rule__Expression__UngroupedRelationshipsAssignment_1_1)*
{ after(grammarAccess.getExpressionAccess().getUngroupedRelationshipsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getGroupedRelationshipsAssignment_1_2()); }
(rule__Expression__GroupedRelationshipsAssignment_1_2)*
{ after(grammarAccess.getExpressionAccess().getGroupedRelationshipsAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__IsaRelationships__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IsaRelationships__Group__0__Impl
	rule__IsaRelationships__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IsaRelationships__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_0()); }
(rule__IsaRelationships__RelationshipsAssignment_0)
{ after(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IsaRelationships__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IsaRelationships__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IsaRelationships__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIsaRelationshipsAccess().getGroup_1()); }
(rule__IsaRelationships__Group_1__0)*
{ after(grammarAccess.getIsaRelationshipsAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__IsaRelationships__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IsaRelationships__Group_1__0__Impl
	rule__IsaRelationships__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IsaRelationships__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIsaRelationshipsAccess().getPLUS_SIGNTerminalRuleCall_1_0()); }
	RULE_PLUS_SIGN
{ after(grammarAccess.getIsaRelationshipsAccess().getPLUS_SIGNTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IsaRelationships__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IsaRelationships__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IsaRelationships__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_1_1()); }
(rule__IsaRelationships__RelationshipsAssignment_1_1)
{ after(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__RelationshipGroup__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RelationshipGroup__Group__0__Impl
	rule__RelationshipGroup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationshipGroup__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipGroupAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); }
	RULE_OPENING_CURLY_BRACKET
{ after(grammarAccess.getRelationshipGroupAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RelationshipGroup__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RelationshipGroup__Group__1__Impl
	rule__RelationshipGroup__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationshipGroup__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_1()); }
(rule__RelationshipGroup__RelationshipsAssignment_1)
{ after(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RelationshipGroup__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RelationshipGroup__Group__2__Impl
	rule__RelationshipGroup__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationshipGroup__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipGroupAccess().getGroup_2()); }
(rule__RelationshipGroup__Group_2__0)*
{ after(grammarAccess.getRelationshipGroupAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RelationshipGroup__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RelationshipGroup__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationshipGroup__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipGroupAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_3()); }
	RULE_CLOSING_CURLY_BRACKET
{ after(grammarAccess.getRelationshipGroupAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__RelationshipGroup__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RelationshipGroup__Group_2__0__Impl
	rule__RelationshipGroup__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationshipGroup__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipGroupAccess().getCOMMATerminalRuleCall_2_0()); }
	RULE_COMMA
{ after(grammarAccess.getRelationshipGroupAccess().getCOMMATerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RelationshipGroup__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RelationshipGroup__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationshipGroup__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_2_1()); }
(rule__RelationshipGroup__RelationshipsAssignment_2_1)
{ after(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Relationships__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Relationships__Group__0__Impl
	rule__Relationships__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relationships__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_0()); }
(rule__Relationships__RelationshipsAssignment_0)
{ after(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Relationships__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Relationships__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relationships__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipsAccess().getGroup_1()); }
(rule__Relationships__Group_1__0)*
{ after(grammarAccess.getRelationshipsAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Relationships__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Relationships__Group_1__0__Impl
	rule__Relationships__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relationships__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipsAccess().getCOMMATerminalRuleCall_1_0()); }
	RULE_COMMA
{ after(grammarAccess.getRelationshipsAccess().getCOMMATerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Relationships__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Relationships__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relationships__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_1_1()); }
(rule__Relationships__RelationshipsAssignment_1_1)
{ after(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Relationship__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Relationship__Group__0__Impl
	rule__Relationship__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relationship__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); }
(rule__Relationship__TypeAssignment_0)
{ after(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Relationship__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Relationship__Group__1__Impl
	rule__Relationship__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Relationship__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipAccess().getEQUAL_SIGNTerminalRuleCall_1()); }
	RULE_EQUAL_SIGN
{ after(grammarAccess.getRelationshipAccess().getEQUAL_SIGNTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Relationship__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Relationship__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relationship__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipAccess().getDestinationAssignment_2()); }
(rule__Relationship__DestinationAssignment_2)
{ after(grammarAccess.getRelationshipAccess().getDestinationAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Concept__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Concept__Group__0__Impl
	rule__Concept__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getIdAssignment_0()); }
(rule__Concept__IdAssignment_0)
{ after(grammarAccess.getConceptAccess().getIdAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Concept__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Concept__Group__1__Impl
	rule__Concept__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getPIPETerminalRuleCall_1()); }
	RULE_PIPE
{ after(grammarAccess.getConceptAccess().getPIPETerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Concept__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Concept__Group__2__Impl
	rule__Concept__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getWSTerminalRuleCall_2()); }
(	RULE_WS)*
{ after(grammarAccess.getConceptAccess().getWSTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Concept__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Concept__Group__3__Impl
	rule__Concept__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getTermAssignment_3()); }
(rule__Concept__TermAssignment_3)
{ after(grammarAccess.getConceptAccess().getTermAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Concept__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Concept__Group__4__Impl
	rule__Concept__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getPIPETerminalRuleCall_4()); }
	RULE_PIPE
{ after(grammarAccess.getConceptAccess().getPIPETerminalRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Concept__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Concept__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getWSTerminalRuleCall_5()); }
(	RULE_WS)*
{ after(grammarAccess.getConceptAccess().getWSTerminalRuleCall_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}















rule__Expression__IsaRelationshipsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getIsaRelationshipsIsaRelationshipsParserRuleCall_0_0()); }
	ruleIsaRelationships{ after(grammarAccess.getExpressionAccess().getIsaRelationshipsIsaRelationshipsParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__UngroupedRelationshipsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getUngroupedRelationshipsRelationshipsParserRuleCall_1_1_0()); }
	ruleRelationships{ after(grammarAccess.getExpressionAccess().getUngroupedRelationshipsRelationshipsParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__GroupedRelationshipsAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getGroupedRelationshipsRelationshipGroupParserRuleCall_1_2_0()); }
	ruleRelationshipGroup{ after(grammarAccess.getExpressionAccess().getGroupedRelationshipsRelationshipGroupParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IsaRelationships__RelationshipsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_0_0()); }
	ruleConcept{ after(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IsaRelationships__RelationshipsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_1_1_0()); }
	ruleConcept{ after(grammarAccess.getIsaRelationshipsAccess().getRelationshipsConceptParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RelationshipGroup__RelationshipsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_1_0()); }
	ruleRelationship{ after(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RelationshipGroup__RelationshipsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_2_1_0()); }
	ruleRelationship{ after(grammarAccess.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Relationships__RelationshipsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_0_0()); }
	ruleRelationship{ after(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Relationships__RelationshipsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); }
	ruleRelationship{ after(grammarAccess.getRelationshipsAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Relationship__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipAccess().getTypeConceptParserRuleCall_0_0()); }
	ruleConcept{ after(grammarAccess.getRelationshipAccess().getTypeConceptParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Relationship__DestinationAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRelationshipAccess().getDestinationConceptParserRuleCall_2_0()); }
	ruleConcept{ after(grammarAccess.getRelationshipAccess().getDestinationConceptParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__IdAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getIdIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getConceptAccess().getIdIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__TermAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_3_0()); }
	RULE_TERM{ after(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '1'..'9' ('0'..'9')*;

RULE_TERM : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|' ')*;

RULE_WS : (' '|'\t'|'\n'|'\r');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_PIPE : '|';

RULE_COLON : ':';

RULE_OPENING_CURLY_BRACKET : '{';

RULE_CLOSING_CURLY_BRACKET : '}';

RULE_EQUAL_SIGN : '=';

RULE_COMMA : ',';

RULE_PLUS_SIGN : '+';

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ANY_OTHER : .;


