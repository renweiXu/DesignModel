package com.xu.single;

/**
 * 饿汉模式
 * 写法简单，在类装载的时候就完成了实例化 避免了线程同步的问题
 * 缺点：如果自始至终没有使用这个类 会造成内存的浪费
 * @author xurw
 *
 */
public class SingleModelHungary {
	//使用静态常量的方式
	private static final SingleModelHungary SINGLE_MODEL_HUNGARY = new SingleModelHungary();
	
	private SingleModelHungary() {}
	
	
	public static SingleModelHungary getInstance1(){
		return SINGLE_MODEL_HUNGARY;
	}
	
	//使用静态代码块
	private static SingleModelHungary SINGLE_MODEL ;
	
	static {
		SINGLE_MODEL  = new SingleModelHungary();
	}
	
	public static SingleModelHungary getInstance2(){
		return SINGLE_MODEL_HUNGARY;
	}
	
	//静态内部类 线程安全 效率高  
	public static class SingleInstance {
		private  static final SingleModelHungary INSTANCE = new SingleModelHungary();
	}
	
	public static SingleModelHungary getInstance3(){
		return SingleInstance.INSTANCE;
	}

}
