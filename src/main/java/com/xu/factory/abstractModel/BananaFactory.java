/**
 * 
 */
package com.xu.factory.abstractModel;

/**
 * @author xurw
 * @Date 2019年3月16日 下午12:27:27
 * 
 */
public class BananaFactory extends Factory {

	/* (non-Javadoc)
	 * @see com.xu.factory.abstractModel.Factory#getFruit()
	 */
	@Override
	public Fruit getFruit() {
		return new Banana();
	}

}
