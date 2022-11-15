package com.xu.builder.demo;

import com.alibaba.fastjson.JSONObject;

/**
 * 使用者
 */
public class Worker {

    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        // 完成创建房子的步骤
        houseBuilder.builderA().builderB().builderC();
        House house = houseBuilder.getHouse();
        System.out.print( JSONObject.toJSONString(house));
    }
}
