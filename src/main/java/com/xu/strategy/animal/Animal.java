/**
 * 
 */
package com.xu.strategy.animal;

import com.xu.strategy.eatInterface.Eat;

/**
 * @author xurw
 * @Date 2019年3月20日 下午9:06:25
 * 
 */
public class Animal {
	
	Eat eat;
	
	public Animal (){

	}
	
	public void doEat(){
		eat.food();
	}

}
