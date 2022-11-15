package com.xu.builder.demo;

import com.alibaba.fastjson.JSONObject;

/**
 * 房子对象的使用者
 */
public class User {

    public static void main(String[] args) {
        House build = Director.build(new HouseBuilder());
        System.out.println(JSONObject.toJSONString(build));

    }
}
