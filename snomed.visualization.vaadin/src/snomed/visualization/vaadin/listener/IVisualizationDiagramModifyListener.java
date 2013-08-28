package snomed.visualization.vaadin.listener;

import java.lang.reflect.Method;

import snomed.visualization.vaadin.VisualizationDiagramModifyEvent;

import com.vaadin.util.ReflectTools;

public interface IVisualizationDiagramModifyListener {
	static Method METHOD = ReflectTools.findMethod(IVisualizationDiagramModifyListener.class,
            "handleModify", VisualizationDiagramModifyEvent.class);
	
	void handleModify(VisualizationDiagramModifyEvent event);
}
