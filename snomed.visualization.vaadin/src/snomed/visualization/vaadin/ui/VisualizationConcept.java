package snomed.visualization.vaadin.ui;

import java.io.Serializable;

import com.sun.istack.internal.NotNull;

/**
 * 
 * @author rporcio
 */
public class VisualizationConcept implements Serializable {
	
	private static final long serialVersionUID = 1391190139474507445L;

	private boolean defined;
	@NotNull
	private String id;
	@NotNull
	private String term;
	
	public VisualizationConcept() {
	}
	
	public VisualizationConcept(final boolean defined, final String id, final String term) {
		this.defined = defined;
		this.id = id;
		this.term = term;
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
}
