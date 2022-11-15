package com.xu.builder.demo;

/**
 * 导演类
 * 负责指挥构建一个工程，工程如何构建由他决定
 *
 */
public class Director {

    public static House build(AbstractBuilder abstractBuilder){
        /**
         * 房子创建的步骤
         * 执行ABC的顺序都是由导演类来决定的
         *
         */

        return abstractBuilder.builderA().builderB().builderC().getHouse();
    }
}
