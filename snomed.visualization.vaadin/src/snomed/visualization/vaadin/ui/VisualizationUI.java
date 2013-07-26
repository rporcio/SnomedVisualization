package snomed.visualization.vaadin.ui;


import javax.servlet.annotation.WebServlet;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.vaadin.example.FractureOfRadiusExample;
import snomed.visualization.vaadin.example.TetralogyOfFallotExample;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("SnomedVisualization")
public class VisualizationUI extends UI {
	
	private HorizontalSplitPanel splitPanel;
	private SnomedConceptView snomedConceptView;
	private VisualizationView visualizationView;
	
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = VisualizationUI.class, widgetset = "snomed.visualization.vaadin.Snomed_visualization_vaadinWidgetset")
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout mainWindow = new VerticalLayout();
		mainWindow.setMargin(true);
		mainWindow.setSizeFull();

		setContent(mainWindow);
		
		splitPanel = new HorizontalSplitPanel(); 
		splitPanel.setSplitPosition(15f);
		splitPanel.setSizeFull();
		
		snomedConceptView = new SnomedConceptView(this);
		visualizationView = new VisualizationView(this);
		
		splitPanel.setFirstComponent(snomedConceptView);
		splitPanel.setSecondComponent(visualizationView);

		mainWindow.addComponent(splitPanel);
		mainWindow.setExpandRatio(splitPanel, 1f);
		
		visualizeConcept("Fracture of radius");
	
	}

	public void visualizeConcept(String id) {
		Expression expression;
		if (id.equals("Fracture of radius")) {
			expression = FractureOfRadiusExample.createFactureOfRadiusExpression();
		} else {
			expression = TetralogyOfFallotExample.createTetralogyOfFallotExample();
		}
		
		visualizationView.setExpression(expression);
		visualizationView.showExpression();
	}

}