package com.xu.builder.demo1;

public class KfcBuilder extends AbstractBuilder{

    private Kfc kfc;

    public KfcBuilder(){
        this.kfc = new Kfc();
        // 默认套操
        kfc.setPlanA("鸡腿堡");
        kfc.setPlanB("可乐");
        kfc.setPlanC("薯条");
    }

    public AbstractBuilder planA(String plan) {
        kfc.setPlanA(plan);
        return this;
    }

    public AbstractBuilder planB(String plan) {
        kfc.setPlanB(plan);
        return this;
    }

    public AbstractBuilder planC(String plan) {
        kfc.setPlanC(plan);
        return this;
    }

    public Kfc getPlan() {
        return kfc;
    }
}
