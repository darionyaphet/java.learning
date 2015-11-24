package org.darion.yaphet.reflect.dynamic.proxy.aop;

/**
 * http://www.cnblogs.com/techyc/p/3455950.html
 * 
 * @author Darion.Yaphet
 *
 */
public class Main {
	public static void main(String[] args) {
		IVehical car = new Car();
		VehicalProxy proxy = new VehicalProxy(car);
		IVehical proxyObj = proxy.create();
		proxyObj.run();
	}
}