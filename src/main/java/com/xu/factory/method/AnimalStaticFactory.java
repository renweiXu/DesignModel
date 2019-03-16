package com.xu.factory.method;

/**
 * 静态工厂模式
 * @author xurw
 * @Date 2019年3月16日 上午11:34:39
 * 
 */
public class AnimalStaticFactory {
	
	public static Animal getCat(){
		return new Cat();
	}
	
	public static Animal getDog(){
		return new Dog();
	}
	
	public static void main(String[] args) {
		Animal dog = AnimalStaticFactory.getDog();
		dog.eat();
	}

}
