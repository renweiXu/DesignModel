/**
 * 
 */
package com.xu.factory.abstractModel;

/**
 * 通过反射的方式 
 * @author xurw
 * @Date 2019年3月16日 下午12:32:13
 * 
 */
public abstract class Factory2 {

	public abstract<T extends Fruit> T getFruit(Class<T> class1);
}
