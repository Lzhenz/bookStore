package com.zhenz.java_01.charator;

import com.zhenz.java_01.charator03.HeroIsDiedException;

import javax.crypto.spec.PSource;

public class Hero {
    String name; // 名字

    float hp; // 血量

    float armor; // 护甲

    public int moveSpeed; // 移动速度

    public Hero(){
        System.out.println("Hero 的构造方法");
    }

    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
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

    public void attackHero(Hero hero) throws HeroIsDiedException {
        if (hero.hp == 0){
            throw new HeroIsDiedException(hero.name + "已经死了，不要再攻击他了。");
        }
    }
    public static void main(String[] args) {
        Hero hero = new Hero();

        ADHero adHero = new ADHero();
        APHero apHero = new APHero();
        ADAPHero adapHero = new ADAPHero();

        hero.heroIsDie(adHero);
        hero.heroIsDie(apHero);
        hero.heroIsDie(adapHero);

        Hero garen = new Hero();
        garen.hp = 100;
        garen.name = "盖伦";

        Hero timo = new Hero();
        timo.hp = 0;
        timo.name = "提莫";

        try{
            garen.attackHero(timo);
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}















