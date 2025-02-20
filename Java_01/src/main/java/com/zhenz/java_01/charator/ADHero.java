package com.zhenz.java_01.charator;

public class ADHero extends Hero implements AD,Mortal{

    @Override
    public void physicAttack() {
        System.out.println("进行了物理攻击");
    }

    @Override
    public void die() {
        System.out.println("AD Hero is die");
    }

    public static void battleWin(){
        System.out.println("AD Hero battle win");
    }

    public static void main(String[] args) {
        Hero.battleWin();
        ADHero.battleWin();
    }
}
