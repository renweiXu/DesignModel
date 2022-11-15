package com.xu.builder.demo1;

/**
 * 建造者抽象类
 */
public abstract class AbstractBuilder {

    public abstract AbstractBuilder planA(String plan);

    public abstract AbstractBuilder planB(String plan);

    public abstract AbstractBuilder planC(String plan);

    public abstract Kfc getPlan();

}
