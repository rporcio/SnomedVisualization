package snomed.visualization.vaadin.ui;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.Tree;

public class SnomedConceptView extends Tree implements ItemClickListener{

	private static final long serialVersionUID = 4487216916434702499L;

	private static final String FRACTURE_OF_RADIUS = "Fracture of radius";
	private static final String TETRALOGY_OF_FALLOT = "Tetralogy of fallot";

	private final VisualizationUI visualizationUI;
	
	public SnomedConceptView(VisualizationUI visualizationUI) {
		this.visualizationUI = visualizationUI;
		addItem(FRACTURE_OF_RADIUS);
		addItem(TETRALOGY_OF_FALLOT);
		addItemClickListener(this);
	}

	@Override
	public void itemClick(ItemClickEvent event) {
		visualizationUI.visualizeConcept(event.getItemId().toString());
	}

}
