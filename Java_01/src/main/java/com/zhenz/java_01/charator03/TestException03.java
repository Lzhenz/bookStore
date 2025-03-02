package com.zhenz.java_01.charator03;

public class TestException03 {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method(){
        int returnData = 0;
        try {
            return  returnData=1;
        } catch (Exception e){
            return  returnData=2;
        } finally {
            return  returnData=3;
        }
    }
}
