package com.zhenz.java_01.charator;

public class SupportHero extends Hero implements Healer{
    @Override
    public void heal() {
        System.out.println("进行了治疗");
    }
}
