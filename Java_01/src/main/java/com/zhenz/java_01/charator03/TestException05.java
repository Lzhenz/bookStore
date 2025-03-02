package com.zhenz.java_01.charator03;

import java.io.File;
import java.io.FileInputStream;

public class TestException05 {
    public static void main(String[] args) {
        File file = new File("D:/LOL1.exe");
        try{
            new FileInputStream(file);
        }catch (Throwable t){
            t.printStackTrace();
        }

    }
}
