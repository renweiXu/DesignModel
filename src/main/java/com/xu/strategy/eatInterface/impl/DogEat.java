/**
 * 
 */
package com.xu.strategy.eatInterface.impl;

import com.xu.strategy.eatInterface.Eat;

/**
 * @author xurw
 * @Date 2019年3月20日 下午9:15:30
 * 
 */
public class DogEat implements Eat{

	/* (non-Javadoc)
	 * @see com.xu.strategy.eatInterface.Eat#food()
	 */
	public void food() {
		System.out.println("狗啃骨头!");
	}

}
