package com.zhenz.java_01.charator03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException02 {
    public static void main(String[] args) {
        try {
            method02();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void method02 () throws FileNotFoundException {
        File file = new File("D:/LOL1.exe");
        new FileInputStream(file);
    }
}
