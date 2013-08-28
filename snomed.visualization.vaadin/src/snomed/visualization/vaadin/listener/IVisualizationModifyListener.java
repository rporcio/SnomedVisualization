package snomed.visualization.vaadin.listener;

import java.lang.reflect.Method;

import snomed.visualization.vaadin.VisualizationModifyEvent;

import com.vaadin.util.ReflectTools;

public interface IVisualizationModifyListener {
	static Method METHOD = ReflectTools.findMethod(IVisualizationModifyListener.class,
            "handleModify", VisualizationModifyEvent.class);
	
	void handleModify(VisualizationModifyEvent event);
}
