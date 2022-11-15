package com.xu.builder.demo;

/**
 * 抽象的建造者
 * 只定义一些接口和方法
 */
public abstract class AbstractBuilder {

    public abstract AbstractBuilder builderA();

    public abstract AbstractBuilder builderB();

    public abstract AbstractBuilder builderC();

    abstract House getHouse();

}
