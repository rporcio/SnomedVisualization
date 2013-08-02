package snomed.visualization.vaadin;

import java.lang.reflect.Method;

import com.vaadin.util.ReflectTools;

public interface VisualizationModifyListener {
	static Method METHOD = ReflectTools.findMethod(VisualizationModifyListener.class,
            "handleModify", VisualizationModifyEvent.class);
	
	void handleModify(VisualizationModifyEvent event);
}
