package snomed.visualization.vaadin;

import java.lang.reflect.Method;

import com.vaadin.util.ReflectTools;

public interface IVisualizationModifyListener {
	static Method METHOD = ReflectTools.findMethod(IVisualizationModifyListener.class,
            "handleModify", VisualizationModifyEvent.class);
	
	void handleModify(VisualizationModifyEvent event);
}
