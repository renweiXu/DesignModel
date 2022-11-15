package com.xu.builder.demo;

/**
 * 具体的房子建造者
 */
public class HouseBuilder extends AbstractBuilder{

    private House house;

    public HouseBuilder(){
        /**
         * 这一步至关重要 房子建造者负责创建房子
         */
        house = new House();
    }


    public AbstractBuilder builderA() {
        // 搭建地基
        house.setBase("地基已搭建");
        return this;
    }

    public AbstractBuilder builderB() {
        // 修建墙
        house.setFloor("墙已建好");
        return this;
    }

    public AbstractBuilder builderC() {
        // 安装窗户
        house.setWindows("窗户已安装");
        return this;
    }

    public House getHouse(){
        return this.house;
    }
}
