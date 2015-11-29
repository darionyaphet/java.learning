package org.darion.yaphet.scripts;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.codehaus.groovy.control.CompilationFailedException;

import groovy.lang.GroovyClassLoader;

public class JavaCallGroovy {

	private static GroovyClassLoader groovyClassLoader;

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, CompilationFailedException, IOException, InstantiationException {
		groovyClassLoader = new GroovyClassLoader(JavaCallGroovy.class.getClassLoader());
		Class<?> scriptClass = groovyClassLoader
				.parseClass(new File("src/org/darion/yaphet/scripts/groovy/hello.groovy"));
		Object scriptInstance = scriptClass.newInstance();
		Method method = scriptClass.getDeclaredMethod("hello_world", new Class[] {});
		method.invoke(scriptInstance, new Object[] {});
	}
}
