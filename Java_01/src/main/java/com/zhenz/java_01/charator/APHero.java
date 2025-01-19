package com.zhenz.java_01.charator;

public class APHero extends Hero implements AP{

    @Override
    public void magicAttack() {
        System.out.println("进行了魔法攻击");
    }
}
