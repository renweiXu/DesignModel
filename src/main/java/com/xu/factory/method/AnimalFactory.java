/**
 * 
 */
package com.xu.factory.method;

/**
 * 普通动物工厂
 * @author xurw
 * @Date 2019年3月16日 上午11:00:09
 * 
 */
public class AnimalFactory {
	
	public Animal getAnimal(String type){
		if ("cat".equals(type)) {
			return new Cat();
		}else if ("dog".equals(type)) {
			return new Dog();
		}else {
			System.out.println("未知类型。");
			return null;
		}
	}
	
	public static void main(String[] args) {
		AnimalFactory factory = new AnimalFactory();
		Animal animal = factory.getAnimal("cat");
		animal.eat();
	}
}
