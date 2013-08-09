package snomed.visualization.hyperlink;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {

	public static class Parameter<T> extends Pair<Class<T>, T> {
		
		public Parameter() {
		}
		
		public Parameter(Class<T> clazz, T value) {
			super(clazz, value);
		}
	}
	
	public static <R, T> R getField(Class<T> clazz, T instance, String fieldName) {
		try {
			Field field = clazz.getDeclaredField(fieldName);
			field.setAccessible(true);
			return (R) field.get(instance);
		
		} catch (SecurityException e) {
			handleException(e);
		} catch (NoSuchFieldException e) {
			handleException(e);
		} catch (IllegalAccessException e) {
			handleException(e);
		}
		return null;
	}
	
	public static <T> void setField(Class<T> clazz, T instance, String fieldName, Object value) {
		try {
			Field field = clazz.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(instance, value);
		
		} catch (SecurityException e) {
			handleException(e);
		} catch (NoSuchFieldException e) {
			handleException(e);
		} catch (IllegalAccessException e) {
			handleException(e);
		}
	}
	
	public static <R, T> R callMethod(Class<T> clazz, T instance, String methhodName, Parameter<?>... parameters) {
		
		try {
			Method method = clazz.getDeclaredMethod(methhodName, getClasses(parameters));
			method.setAccessible(true);
			return (R) method.invoke(instance, getValues(parameters));
		} catch (SecurityException e) {
			handleException(e);
		} catch (NoSuchMethodException e) {
			handleException(e);
		} catch (IllegalAccessException e) {
			handleException(e);
		} catch (InvocationTargetException e) {
			handleException(e);
		}
		return null;
	}
	
	protected static void handleException(Throwable e) {
		throw new RuntimeException("An error occured while reflecting", e);
	}

	protected static Class<?>[] getClasses(Parameter<?>... parameters) {
		Class<?>[] classes = new Class[parameters.length];
		for(int i = 0; i < classes.length; i++) {
			classes[i] = parameters[i].getA();
		}
		return classes;
	}

	protected static Object[] getValues(Parameter<?>... parameters) {
		Object[] values = new Object[parameters.length];
		for(int i = 0; i < values.length; i++) {
			values[i] = parameters[i].getB();
		}
		return values;
	}
}
 