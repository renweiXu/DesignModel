/**
 * 
 */
package com.xu.strategy.eatInterface.impl;

import com.xu.strategy.eatInterface.Eat;

/**
 * @author xurw
 * @Date 2019年3月20日 下午9:03:53
 * 
 */
public class CatEat implements Eat{

	/* (non-Javadoc)
	 * @see com.xu.strategy.eatInterface.Eat#eat()
	 */
	public void food() {
		System.out.println("猫吃鱼!");
	}

}
