package snomed.visualization.vaadin.listener;

import java.lang.reflect.Method;

import snomed.visualization.vaadin.VisualizationDslModifyEvent;

import com.vaadin.util.ReflectTools;

public interface IVisualizationDslModifyListener {
	static Method METHOD = ReflectTools.findMethod(IVisualizationDslModifyListener.class,
            "handleModify", VisualizationDslModifyEvent.class);
	
	void handleModify(VisualizationDslModifyEvent event);
}
