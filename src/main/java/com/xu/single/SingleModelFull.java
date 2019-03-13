package com.xu.single;

/**
 * 单例模式
 * 保证当前类在全局只有一个实例
 * 懒汉模式
 * @author xurw
 *
 */
public class SingleModelFull {
	
	private static SingleModelFull singleModel = null;
	
	private SingleModelFull(){
		
	}
	
	//写法1:此写法线程不安全
	public static SingleModelFull getInstance1(){
		if (null == singleModel) {
			singleModel = new SingleModelFull();
		}
		return singleModel;
	}
	//写法2:使用synchronized关键字 进行线程同步 线程安全  效率低
	public static synchronized SingleModelFull getInstance2(){
		if (null == singleModel) {
			singleModel = new SingleModelFull();
		}
		return singleModel;
	}
	
	//写法3:使用同步代码块 比写法2效率高  但是多线程情况下 线程不安全 容易创建多个实例
	public static SingleModelFull getInstance3(){
		if (null == singleModel) {
			synchronized (SingleModelFull.class) {
				singleModel = new SingleModelFull();
			}
		}
		return singleModel;
	}
	
	//写法4:双重检查 线程安全
	public static SingleModelFull getInstance4(){
		if (null == singleModel) {
			synchronized (SingleModelFull.class){
				if (null == singleModel) {
					singleModel = new SingleModelFull();
				}
			}
		}
		return singleModel;
	}
}
