/**
 * 
 */
package com.xu.factory.abstractModel;

/**
 * 使用反射创实现抽象工厂模式
 * @author xurw
 * @Date 2019年3月16日 下午12:34:52
 * 
 */
public class Factory2Class extends Factory2 {

	/* (non-Javadoc)
	 * @see com.xu.factory.abstractModel.Factory2#getFruit(java.lang.Class)
	 */
	@Override
	public <T extends Fruit> T getFruit(Class<T> class1) {
		Fruit fruit = null;
		try {
			fruit = (Fruit)Class.forName(class1.getName()).newInstance();
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
		return (T)fruit;
	}

}
