/**
 * 
 */
package com.xu.factory.abstractModel;

/**
 * 苹果工厂
 * @author xurw
 * @Date 2019年3月16日 下午12:26:34
 * 
 */
public class AppleFactory extends Factory {

	/* (non-Javadoc)
	 * @see com.xu.factory.abstractModel.Factory#getFruit()
	 */
	@Override
	public Fruit getFruit() {
		return new Apple();
	}

}
