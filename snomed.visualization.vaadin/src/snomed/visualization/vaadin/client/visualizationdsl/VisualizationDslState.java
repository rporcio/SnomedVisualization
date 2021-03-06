package snomed.visualization.vaadin.client.visualizationdsl;

/**
 * State class for the dsl editor
 * 
 * @author rporcio
 */
public class VisualizationDslState extends com.vaadin.shared.AbstractComponentState {
	private static final long serialVersionUID = 1826444313494729234L;

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}