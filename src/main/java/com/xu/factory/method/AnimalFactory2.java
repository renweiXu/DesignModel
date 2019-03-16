/**
 * 
 */
package com.xu.factory.method;

/**
 * 多工厂方法模式
 * 针对AnimalFactory增强版 防止出现传入错误的字符串
 * 不能正确创建对象
 * @author xurw
 * @Date 2019年3月16日 上午11:06:32
 * 
 */
public class AnimalFactory2 {
	
	public Animal getCat(){
		return new Cat();
	}
	
	public Animal getDog(){
		return new Dog();
	}
	
	/**
	 * 
	 */
	public static void main(String[] args) {
		AnimalFactory2 factory2 = new AnimalFactory2();
		Animal dog = factory2.getDog();
		dog.eat();
	}

}
