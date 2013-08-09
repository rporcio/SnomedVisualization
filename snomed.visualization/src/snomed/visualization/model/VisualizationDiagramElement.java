package snomed.visualization.model;

import org.eclipse.draw2d.geometry.Rectangle;


public class VisualizationDiagramElement {
	public enum VisualizationComponentType {
		CONCEPT,
		RELATIONSHIP,
		GROUP, 
		CONJUCTION
	}
	
	private boolean defined;
	private String id;
	private String term;
	private Rectangle constraint;
	private VisualizationComponentType type;
	private int zoom;
	
	public VisualizationDiagramElement(final boolean defined, final String id, final String term, final VisualizationComponentType type, final Rectangle constraint, final int zoom) {
		this.defined = defined;
		this.id = id;
		this.term = term;
		this.type = type;
		this.constraint = constraint;
		this.zoom = zoom;
	}

	public boolean isDefined() {
		return defined;
	}
	
	public void setDefined(boolean defined) {
		this.defined = defined;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
