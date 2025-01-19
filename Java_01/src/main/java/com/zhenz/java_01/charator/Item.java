package com.zhenz.java_01.charator;

public class Item {
    String name; // 商店物品名称

    int price; // 商店物品价格

    public Item(){

    }

    public static Item  instance;

    public static Item  getInstance(){
        return instance;
    }

}
