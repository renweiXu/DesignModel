/**
 * 
 */
package com.xu.factory.abstractModel;

/**
 * 具体水果
 * @author xurw
 * @Date 2019年3月16日 下午12:17:36
 * 
 */
public class Banana extends Fruit{

	/* (non-Javadoc)
	 * @see com.xu.factory.abstractModel.Fruit#type()
	 */
	@Override
	public void type() {
		System.out.println("我是香蕉");
	}

}
