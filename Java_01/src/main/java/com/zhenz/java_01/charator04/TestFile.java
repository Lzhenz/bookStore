package com.zhenz.java_01.charator04;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("D:/LOL.exe");
        System.out.println("now file is : " + file);
        System.out.println("is filed " + file.isFile());
    }
}
