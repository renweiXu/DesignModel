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
	//利用反射
	public <T extends Animal>T getInstance(Class<T> class1){
		Animal animal = null;
		try {
			animal = (Animal)Class.forName(class1.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) animal;
	}
	
	public static void main(String[] args) {
		AnimalFactory factory = new AnimalFactory();
		Animal animal = factory.getAnimal("cat");
		animal.eat();
		Dog dog = factory.getInstance(Dog.class);
		dog.eat();
	}
}
