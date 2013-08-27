package snomed.visualization.model;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Represents an element of the diagram.
 * 
 * @author rporcio
 */
public class VisualizationDiagramElement {
	
	public enum VisualizationComponentType {
		CONCEPT,
		RELATIONSHIP,
		GROUP, 
		CONJUCTION
	}
	
	private final boolean mainConcept;
	private final boolean defined;
	private final String conceptId;
	private final String relationshipId;
	private final String term;
	private final Rectangle constraint;
	private final VisualizationComponentType type;
	private final int zoom;
	
	public VisualizationDiagramElement(final boolean mainConcept, final boolean defined, final String conceptId, final String relationshipId, final String term, final VisualizationComponentType type, final Rectangle constraint, final int zoom) {
		this.mainConcept = mainConcept;
		this.defined = defined;
		this.conceptId = conceptId;
		this.relationshipId = relationshipId;
		this.term = term;
		this.type = type;
		this.constraint = constraint;
		this.zoom = zoom;
	}

	public boolean isMainConcept() {
		return mainConcept;
	}
	
	public boolean isDefined() {
		return defined;
	}

	public String getConceptId() {
		return conceptId;
	}
	
	public String getRelationshipId() {
		return relationshipId;
	}
	
	public String getTerm() {
		return term;
	}
	
	public VisualizationComponentType getType() {
		return type;
	}
	
	public Rectangle getConstraint() {
		return constraint;
	}

	public int getZoom() {
		return zoom;
	}
}
