package com.zhenz.java_01.charator;

public class Armor extends Item{
    private int ac;

    public static void main(String[] args) {
        Armor armor = new Armor();
        armor.name = "布甲";
        armor.price = 300;
        armor.ac = 30;
        System.out.println(armor.name + armor.price + armor.ac);
    }
}
