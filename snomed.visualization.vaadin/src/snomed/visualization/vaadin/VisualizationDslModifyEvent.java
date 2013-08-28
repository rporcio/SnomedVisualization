package snomed.visualization.vaadin;

import com.vaadin.ui.Component;
import com.vaadin.ui.Component.Event;

/**
 * Event class for the dsl modifies.
 * 
 * @author rporcio
 */
public class VisualizationDslModifyEvent extends Event {

	private static final long serialVersionUID = 2315379834622475397L;
	private final String dsl;

	public VisualizationDslModifyEvent(Component component, String dsl) {
		super(component);
		this.dsl = dsl;
	}

	public String getDsl() {
		return dsl;
	}


}
