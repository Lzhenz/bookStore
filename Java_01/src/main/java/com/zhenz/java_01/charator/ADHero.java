package com.zhenz.java_01.charator;

public class ADHero extends Hero implements AD{

    @Override
    public void physicAttack() {
        System.out.println("进行了物理攻击");
    }

}
