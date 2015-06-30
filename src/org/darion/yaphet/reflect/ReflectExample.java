package org.darion.yaphet.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectExample {

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class clazz = Class
				.forName("org.darion.yaphet.java.reflect.ReflectSource");

		Constructor[] constructor = clazz.getConstructors();
		ReflectSource source = (ReflectSource) constructor[0].newInstance();
		source.printMethod();
		source.printMethod("Yaphet");
		System.out.println(source.makeStringMethod("Johannes"));
	}
}
