package com.zhenz.java_01.charator;

import javax.crypto.spec.PSource;

public class Hero {
    String name; // 名字

    float hp; // 血量

    float armor; // 护甲

    int moveSpeed; // 移动速度

    public Hero(){
        System.out.println("Hero 的构造方法");
    }

    private Hero(String heroName, float heroHp){
        name = heroName;
        hp = heroHp;
    }

//    private static Hero instance;
//
//    public static Hero getInstance(){
//        if(instance == null){
//            instance = new Hero();
//        }
//        return instance;
//    }

    public enum HeroType{
        TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING
    }

    private Hero(String heroName, float heroHp, float heroArmor,int heroMoveSpeed){
        name = heroName;
        hp = heroHp;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }

    void keng(){
        System.out.println("坑队友");
    }

    float getArmor(){
        return armor;
    }

    float getHp(){
        return hp;
    }

    void addMoveSpeed(int speed){
        this.moveSpeed += speed;
    }

    void legendary(){
        System.out.println("您已经超神了！");
    }

    void recovery(float recoveryHp){
        this.hp += recoveryHp;
    }

    public void heroIsDie(Mortal mortal){
        mortal.die();
    }

    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public static void main(String[] args) {
        Hero hero = new Hero();

        ADHero adHero = new ADHero();
        APHero apHero = new APHero();
        ADAPHero adapHero = new ADAPHero();

        hero.heroIsDie(adHero);
        hero.heroIsDie(apHero);
        hero.heroIsDie(adapHero);

    }
}















