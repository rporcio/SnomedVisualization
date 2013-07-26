package snomed.visualization.vaadin.util;

import java.io.Serializable;

import snomed.visualization.vaadin.ui.VisualizationConcept;

/**
 * 
 * @author rporcio
 */
public class VisualizationRelationship implements Serializable {

	private static final long serialVersionUID = -1101899400319914399L;

	private boolean defined;
	private String group;
	private VisualizationConcept type;
	private VisualizationConcept destination;
	
	public VisualizationRelationship() {
		this.defined = true;
		// necessary because of the nested, property binding
		destination = new VisualizationConcept(false, "", "");
	}
	
	public boolean isDefined() {
		return defined;
	}
	
	public void setDefined(boolean defined) {
		this.defined = defined;
	}
	
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public VisualizationConcept getType() {
		return type;
	}

	public void setType(VisualizationConcept type) {
		this.type = type;
	}

	public VisualizationConcept getDestination() {
		return destination;
	}

	public void setDestination(VisualizationConcept destination) {
		this.destination = destination;
	}

}
