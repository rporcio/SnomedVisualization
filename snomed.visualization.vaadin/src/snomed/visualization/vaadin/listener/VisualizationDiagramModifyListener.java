package snomed.visualization.vaadin.listener;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.vaadin.VisualizationDiagramModifyEvent;
import snomed.visualization.vaadin.client.model.VisualizationModifyType;
import snomed.visualization.vaadin.util.VisualizationDiagramUtil;

/**
 * Listener class to handle the modify event that comes from the client.
 * 
 * @author rporcio
 */
public class VisualizationDiagramModifyListener implements IVisualizationDiagramModifyListener, Serializable {

	private static final long serialVersionUID = -6149699223399112396L;

	private VisualizationDiagramUtil diagramUtil;

	public VisualizationDiagramModifyListener(VisualizationDiagramUtil visualizationDiagramUtil) {
		this.diagramUtil = visualizationDiagramUtil;
	}

	@Override
	public void handleModify(VisualizationDiagramModifyEvent event) {
		if (diagramUtil.canEdit()) {
			if (event.getModifyType().equals(VisualizationModifyType.CHARACTERISTIC_TYPE)) {
				EObject object = changeCharacteristicType(event);
				if (object instanceof Concept) {
					diagramUtil.getDiagramElements().get(event.getId()).getState().getComponentModel().setDefined(((Concept) object).isDefined());
				} else if(object instanceof Relationship) {
					diagramUtil.getDiagramElements().get(event.getId()).getState().getComponentModel().setDefined(((Relationship) object).isDefined());
				}
			} else {
				deleteDiagramElement(event);
			}
		} else {
			Notification.show("Error", "\nThe expression grammar contains errors. Fix these errors before editing the diagram.", Type.ERROR_MESSAGE);
		}
	}
	
	private EObject changeCharacteristicType(VisualizationDiagramModifyEvent event) {
		String id = event.getId();
		
		if (diagramUtil.getExpression().getConcept().getId().equals(id)) {
			diagramUtil.getExpression().getConcept().setDefined(!diagramUtil.getExpression().getConcept().isDefined());
			
			return diagramUtil.getExpression().getConcept();
		}
		
		for (Concept concept : diagramUtil.getExpression().getIsaRelationships().getRelationships()) {
			if (concept.getId().equals(id)) {
				concept.setDefined(!concept.isDefined());
				
				return concept;
			}
		}
		
		for (Relationship relationship : diagramUtil.getExpression().getUngroupedRelationships().getRelationships()) {
			if (relationship.getDestination().getId().equals(id)) {
				relationship.getDestination().setDefined(!relationship.getDestination().isDefined());
				
				return relationship.getDestination();
			} else if (relationship.getId().equals(id)) {
				relationship.setDefined(!relationship.isDefined());
				
				return relationship;
			}
		}
		
		for (RelationshipGroup relationshipGroup : diagramUtil.getExpression().getGroupedRelationships()) {
			for (Relationship relationship : relationshipGroup.getRelationships()) {
				if (relationship.getDestination().getId().equals(id)) {
					relationship.getDestination().setDefined(!relationship.getDestination().isDefined());
					
					return relationship.getDestination();
				} else if (relationship.getId().equals(id)) {
					relationship.setDefined(!relationship.isDefined());
					
					return relationship;
				}
			}
		}
		
		return null;
	}

	private void deleteDiagramElement(VisualizationDiagramModifyEvent event) {
		String id = event.getId();
		
		if (diagramUtil.getExpression().getConcept().getId().equals(id)) {
			// TODO cannot delete
		}
		
		for (Concept concept : diagramUtil.getExpression().getIsaRelationships().getRelationships()) {
			if (concept.getId().equals(id)) {
				diagramUtil.getExpression().getIsaRelationships().getRelationships().remove(concept);
				
				return;
			}
		}
		
		for (Relationship relationship : diagramUtil.getExpression().getUngroupedRelationships().getRelationships()) {
			if (relationship.getDestination().getId().equals(id) || relationship.getId().equals(id)) {
				diagramUtil.getExpression().getUngroupedRelationships().getRelationships().remove(relationship);
				
				return;
			}
		}
		
		for (RelationshipGroup relationshipGroup : diagramUtil.getExpression().getGroupedRelationships()) {
			for (Relationship relationship : relationshipGroup.getRelationships()) {
				if (relationship.getDestination().getId().equals(id) || relationship.getId().equals(id)) {
					relationshipGroup.getRelationships().remove(relationship);
					
					if (0 == relationshipGroup.getRelationships().size()) {
						diagramUtil.getExpression().getGroupedRelationships().remove(relationshipGroup);
					}
					
					return;
				}
			}
		}
	}

}
