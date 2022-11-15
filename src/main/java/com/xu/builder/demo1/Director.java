package com.xu.builder.demo1;

import com.xu.builder.demo.House;

/**
 * 导演类
 * 指挥创建kfc套餐的人
 */
public class Director {

    public static Kfc build(AbstractBuilder builder){
        return builder.getPlan();
    }
}
