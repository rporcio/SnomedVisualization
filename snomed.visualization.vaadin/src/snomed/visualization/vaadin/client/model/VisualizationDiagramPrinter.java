package snomed.visualization.vaadin.client.model;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.vaadin.ui.AbstractVisualizationDiagramView;
import snomed.visualization.vaadin.ui.VisualizationDiagramView;
import snomed.visualization.vaadin.ui.VisualizationDiagramView.DiagramType;
import snomed.visualization.vaadin.util.VisualizationDiagramUtil;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.UI;

/**
 * Class for the diagram printing.
 * 
 * @author rporcio
 */
public class VisualizationDiagramPrinter extends AbstractVisualizationDiagramView {

	private static final long serialVersionUID = -4839830996485895435L;
	private Expression expression;
	private DiagramType diagramType;
	
	public static class PrintUI extends UI {

		private static final long serialVersionUID = -5356024154353367380L;
		private static VisualizationDiagramPrinter printerView;
		
		public static void setDiagramView(VisualizationDiagramView diagramView) {
			printerView = new VisualizationDiagramPrinter(diagramView);
		}

		@Override
		protected void init(VaadinRequest request) {
			this.setSizeFull();
			setContent(printerView);

			JavaScript.getCurrent().execute("setTimeout(function() {print(); self.close();}, 0);");
		}
	}
	
	public VisualizationDiagramPrinter(VisualizationDiagramView diagramView) {
		VisualizationDiagramUtil diagramUtil = new VisualizationDiagramUtil(this);
		expression = diagramView.getExpression();
		diagramType = diagramView.getDiagramType();
		
		diagramUtil.setDiagramZoom(diagramView.getDiagramZoom());
		diagramUtil.visualizeDiagram();
		
	}

	@Override
	public Expression getExpression() {
		return expression;
	}

	@Override
	public boolean canEdit() {
		return false;
	}

	@Override
	public DiagramType getDiagramType() {
		return diagramType;
	}

}
