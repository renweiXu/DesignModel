/**
 * 
 */
package com.xu.strategy.animal;

import com.xu.strategy.eatInterface.impl.DogEat;

/**
 * @author xurw
 * @Date 2019年3月20日 下午9:17:30
 * 
 */
public class Dog extends Animal{

	/**
	 * @param eat
	 */
	public Dog() {
		super.eat = new DogEat();
	}

}
