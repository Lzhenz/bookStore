package com.zhenz.java_01.charator;

import java.util.function.DoubleToIntFunction;

public class Item {
    String name; // 商店物品名称

    int price; // 商店物品价格

    public Item(){

    }

    public static Item  instance;

    public static Item  getInstance(){
        return instance;
    }

    public void buy(){
        System.out.println("够吗");
    }

    public void effect(){
        System.out.println("物品使用后，产生效果");
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.effect();

        LifePotion lifePotion = new LifePotion();
        lifePotion.effect();

        MagicPotion magicPotion = new MagicPotion();
        magicPotion.effect();
    }

}
