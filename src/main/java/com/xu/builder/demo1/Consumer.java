package com.xu.builder.demo1;

import com.alibaba.fastjson.JSONObject;

/**
 * 顾客点餐
 * 将创建对象需要的属性的选择权交给使用者
 */
public class Consumer {

    public static void main(String[] args) {
        KfcBuilder builder1 = new KfcBuilder();
        Kfc plan1 = Director.build(builder1);
        System.out.println("默认套餐："+JSONObject.toJSONString(plan1));
        KfcBuilder builder2 = new KfcBuilder();
        Kfc plan2 = Director.build(builder2.planA("牛肉堡").planB("橙汁").planC("鸡块"));
        System.out.println("自定义套餐："+JSONObject.toJSONString(plan2));
    }
}
