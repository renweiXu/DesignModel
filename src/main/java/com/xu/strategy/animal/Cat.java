/**
 * 
 */
package com.xu.strategy.animal;

import com.xu.strategy.eatInterface.impl.CatEat;

/**
 * @author xurw
 * @Date 2019年3月20日 下午9:08:15
 * 
 */
public class Cat extends Animal{

	/**
	 * @param eat
	 */
	public Cat() {
		super.eat = new CatEat();
	}
}
