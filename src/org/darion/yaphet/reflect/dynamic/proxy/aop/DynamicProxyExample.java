package org.darion.yaphet.reflect.dynamic.proxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyExample {

	private static class MyInvocationHandler implements InvocationHandler {

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			return null;
		}
	}

	public static void main(String[] args) {
		InvocationHandler handler = new MyInvocationHandler();
	}
}
