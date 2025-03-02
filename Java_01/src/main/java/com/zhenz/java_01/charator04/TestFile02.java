package com.zhenz.java_01.charator04;

import java.io.*;

public class TestFile02 {
    public static void main(String[] args) {
        File file = new File("/Users/zhenz/study/otherData/LOL.txt");
        File file1 = new File("/Users/zhenz/study/otherData/LOL2.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file1);

            byte[] all = new byte[(int) file.length()];
            fileInputStream.read(all);
            for (int b : all){
                fileOutputStream.write(b);
                System.out.println(b);
            }

            fileInputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
