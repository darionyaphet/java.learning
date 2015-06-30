package org.darion.yaphet.reflect;

public class ReflectSource {
	public ReflectSource() {
		System.out.println("Init Reflect Source");
	}

	public void printMethod() {
		System.out.println("Hello, Darion");
	}

	public void printMethod(String source) {
		System.out.println("Hello, " + source);
	}

	public String makeStringMethod(String source) {
		return "Hello, " + source;
	}
}
