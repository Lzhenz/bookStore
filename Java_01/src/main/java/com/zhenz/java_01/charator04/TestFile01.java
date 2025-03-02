package com.zhenz.java_01.charator04;

import java.io.File;
import java.util.List;

public class TestFile01 {
    public static void main(String[] args) {
        File file = new File("C:\\apache-tomcat-9.0.87");
        File[] fs = file.listFiles();
        listFolderSize(fs);
    }

    public static void listFolderSize(File [] fs){
        if (fs == null || fs.length == 0){
            System.out.println("The file is null or length is 0");
            return;
        }

        long maxLength = Long.MIN_VALUE;
        long minLength = Long.MAX_VALUE;

        for (File file : fs){
            long fileLength = file.length();

            if (fileLength <= 0) {
                continue;
            }

            if (fileLength > maxLength){
                maxLength = fileLength;
            }

            if (fileLength < minLength) {
                minLength = fileLength;
            }
        }

        System.out.println("The Max Number is " + maxLength + " And The Min Number is " + minLength);
    }
}
