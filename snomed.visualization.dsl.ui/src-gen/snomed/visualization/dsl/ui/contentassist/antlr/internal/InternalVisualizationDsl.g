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




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getExpressionAssignment()); }
(rule__Model__ExpressionAssignment)
{ after(grammarAccess.getModelAccess().getExpressionAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExpression
entryRuleExpression 
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression
    @init {
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
{ before(grammarAccess.getExpressionAccess().getColonKeyword_1_0()); }

	':' 

{ after(grammarAccess.getExpressionAccess().getColonKeyword_1_0()); }
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
{ before(grammarAccess.getIsaRelationshipsAccess().getPlusSignKeyword_1_0()); }

	'+' 

{ after(grammarAccess.getIsaRelationshipsAccess().getPlusSignKeyword_1_0()); }
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
{ before(grammarAccess.getRelationshipGroupAccess().getLeftCurlyBracketKeyword_0()); }

	'{' 

{ after(grammarAccess.getRelationshipGroupAccess().getLeftCurlyBracketKeyword_0()); }
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
{ before(grammarAccess.getRelationshipGroupAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getRelationshipGroupAccess().getRightCurlyBracketKeyword_3()); }
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
{ before(grammarAccess.getRelationshipGroupAccess().getCommaKeyword_2_0()); }

	',' 

{ after(grammarAccess.getRelationshipGroupAccess().getCommaKeyword_2_0()); }
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
{ before(grammarAccess.getRelationshipsAccess().getCommaKeyword_1_0()); }

	',' 

{ after(grammarAccess.getRelationshipsAccess().getCommaKeyword_1_0()); }
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
{ before(grammarAccess.getRelationshipAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getRelationshipAccess().getEqualsSignKeyword_1()); }
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
{ before(grammarAccess.getConceptAccess().getVerticalLineKeyword_1()); }

	'|' 

{ after(grammarAccess.getConceptAccess().getVerticalLineKeyword_1()); }
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
{ before(grammarAccess.getConceptAccess().getTermAssignment_2()); }
(rule__Concept__TermAssignment_2)
{ after(grammarAccess.getConceptAccess().getTermAssignment_2()); }
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
{ before(grammarAccess.getConceptAccess().getVerticalLineKeyword_3()); }

	'|' 

{ after(grammarAccess.getConceptAccess().getVerticalLineKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Model__ExpressionAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_0()); }
	ruleExpression{ after(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_0()); }
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

rule__Concept__TermAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_2_0()); }
	RULE_TERM{ after(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '1'..'9' ('0'..'9')*;

RULE_TERM : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|' ')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


