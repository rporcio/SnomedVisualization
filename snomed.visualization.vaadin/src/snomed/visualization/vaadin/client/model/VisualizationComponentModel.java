package snomed.visualization.vaadin.client.model;

import java.io.Serializable;

/**
 * @author rporcio
 */
public class VisualizationComponentModel implements Serializable {
	
	private static final long serialVersionUID = 758531915496256814L;

	public enum ComponentType {
		CONCEPT,
		RELATIONSHIP,
		GROUP, 
		CONJUCTION
	}
	
	private boolean defined;
	private String id;
	private String term;
	private ComponentType type;
	private int size;
	
	public VisualizationComponentModel() {
		// TODO Auto-generated constructor stub
	}
	
	public VisualizationComponentModel(final boolean defined, final String id, final String term, final ComponentType type, final int size) {
		this.defined = defined;
		this.id = id;
		this.term = term;
		this.type = type;
		this.size = size;
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
	
	public ComponentType getType() {
		return type;
	}
	
	public void setType(ComponentType type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
