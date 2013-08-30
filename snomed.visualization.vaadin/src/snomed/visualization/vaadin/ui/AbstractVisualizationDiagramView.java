package snomed.visualization.vaadin.ui;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.vaadin.ui.VisualizationDiagramView.DiagramType;

import com.vaadin.ui.AbsoluteLayout;

/**
 * Abstract class to define common methods for the diagram view and the printer view.
 * 
 * @author rporcio
 */
public abstract class AbstractVisualizationDiagramView extends AbsoluteLayout {

	private static final long serialVersionUID = -1361667535899187187L;
	
	public abstract Expression getExpression();
	public abstract boolean canEdit();
	public abstract DiagramType getDiagramType();

}
