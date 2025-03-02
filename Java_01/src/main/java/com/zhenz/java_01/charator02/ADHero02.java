package com.zhenz.java_01.charator02;

import com.zhenz.java_01.charator.AD;
import com.zhenz.java_01.charator.Hero;

public class ADHero02 extends Hero implements AD {

    int moveSpeed=400; //移动速度
    @Override
    public void physicAttack() {
        System.out.println("use physic Attack");
    }

    public int getMoveSpeed(){
        return super.moveSpeed;
    }

    public int getMoveSpeed2(){
        return this.moveSpeed;
    }

    public static void main(String[] args) {
        ADHero02 adHero02 = new ADHero02();

        System.out.println(adHero02.getMoveSpeed());
        System.out.println(adHero02.getMoveSpeed2());
    }
}
