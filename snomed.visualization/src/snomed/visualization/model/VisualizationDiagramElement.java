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
	
	private boolean mainConcept;
	private boolean defined;
	private String conceptId;
	private String relationshipId;
	private String term;
	private Rectangle constraint;
	private VisualizationComponentType type;
	private int zoom;
	
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
	
	public void setDefined(boolean defined) {
		this.defined = defined;
	}
	
	public String getConceptId() {
		return conceptId;
	}
	
	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}
	
	public String getRelationshipId() {
		return relationshipId;
	}
	
	public void setRelationshipId(String relationshipId) {
		this.relationshipId = relationshipId;
	}
	
	public String getTerm() {
		return term;
	}
	
	public void setTerm(String term) {
		this.term = term;
	}
	
	public VisualizationComponentType getType() {
		return type;
	}
	
	public void setType(VisualizationComponentType type) {
		this.type = type;
	}

	public Rectangle getConstraint() {
		return constraint;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
}
