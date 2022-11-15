package com.xu.builder.demo;

import lombok.Data;

/**
 * 真正的产品
 * 房子
 */
@Data
public class House {

    /**
     * 房子的三个属性  地基 墙  窗户
     */
    private String base;

    private String floor;

    private String windows;


}
