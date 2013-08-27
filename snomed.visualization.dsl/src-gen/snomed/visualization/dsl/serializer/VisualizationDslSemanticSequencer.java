package snomed.visualization.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import snomed.visualization.dsl.services.VisualizationDslGrammarAccess;
import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.IsaRelationships;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.Relationships;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage;

@SuppressWarnings("all")
public class VisualizationDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VisualizationDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VisualizationDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VisualizationDslPackage.CONCEPT:
				if(context == grammarAccess.getConceptRule()) {
					sequence_Concept(context, (Concept) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDslPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDslPackage.ISA_RELATIONSHIPS:
				if(context == grammarAccess.getIsaRelationshipsRule()) {
					sequence_IsaRelationships(context, (IsaRelationships) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDslPackage.RELATIONSHIP:
				if(context == grammarAccess.getRelationshipRule()) {
					sequence_Relationship(context, (Relationship) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDslPackage.RELATIONSHIP_GROUP:
				if(context == grammarAccess.getRelationshipGroupRule()) {
					sequence_RelationshipGroup(context, (RelationshipGroup) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDslPackage.RELATIONSHIPS:
				if(context == grammarAccess.getRelationshipsRule()) {
					sequence_Relationships(context, (Relationships) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (id=ID term=TERM)
	 */
	protected void sequence_Concept(EObject context, Concept semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VisualizationDslPackage.Literals.CONCEPT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualizationDslPackage.Literals.CONCEPT__ID));
			if(transientValues.isValueTransient(semanticObject, VisualizationDslPackage.Literals.CONCEPT__TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualizationDslPackage.Literals.CONCEPT__TERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConceptAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getConceptAccess().getTermTERMTerminalRuleCall_3_0(), semanticObject.getTerm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (isaRelationships=IsaRelationships (ungroupedRelationships=Relationships* groupedRelationships+=RelationshipGroup*)?)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relationships+=Concept relationships+=Concept*)
	 */
	protected void sequence_IsaRelationships(EObject context, IsaRelationships semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relationships+=Relationship relationships+=Relationship*)
	 */
	protected void sequence_RelationshipGroup(EObject context, RelationshipGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Concept destination=Concept)
	 */
	protected void sequence_Relationship(EObject context, Relationship semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VisualizationDslPackage.Literals.RELATIONSHIP__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualizationDslPackage.Literals.RELATIONSHIP__TYPE));
			if(transientValues.isValueTransient(semanticObject, VisualizationDslPackage.Literals.RELATIONSHIP__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualizationDslPackage.Literals.RELATIONSHIP__DESTINATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationshipAccess().getTypeConceptParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getRelationshipAccess().getDestinationConceptParserRuleCall_2_0(), semanticObject.getDestination());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (relationships+=Relationship relationships+=Relationship*)
	 */
	protected void sequence_Relationships(EObject context, Relationships semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
