package com.zhenz.java_01.charator02;

public class TestNumber {
    public static void main(String[] args) {
        System.out.println("turn the Integer to Int");

        int i = 5;

        Integer integerNum = new Integer(i);

        System.out.println("Integer num is : " + integerNum);

        int toInt = integerNum.intValue();

        System.out.println("Int num is :" + toInt);

        System.out.println(integerNum instanceof Number);

    }
}

