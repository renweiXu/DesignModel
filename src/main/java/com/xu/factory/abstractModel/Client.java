/**
 * 
 */
package com.xu.factory.abstractModel;

/**
 * @author xurw
 * @Date 2019年3月16日 下午12:28:17
 * 
 */
public class Client {
	public static void main(String[] args) {
		
		//普通抽象工厂模式
		Factory factory = new AppleFactory();
		Fruit fruit = factory.getFruit();
		fruit.type();
		
		//利用反射实现抽象工厂模式
		Factory2 factory2 = new Factory2Class();
		Banana fruit2 = factory2.getFruit(Banana.class);
		fruit2.type();
	}
}
