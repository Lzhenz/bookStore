package com.zhenz.java_01.charator;

public class APHero extends Hero implements AP,Mortal{

    @Override
    public void magicAttack() {
        System.out.println("进行了魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("AP Hero is die");
    }
}
