package com.zhenz.java_01.charator;

public class ADAPHero extends Hero implements AD,AP {
    @Override
    public void physicAttack() {
        System.out.println("1.进行了物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行了魔法攻击");
    }
}
