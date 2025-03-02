package com.zhenz.java_01.charator03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException {
    public static void main(String[] args) {
        File file = new File("D:/LOL.exe");

        try{
            System.out.println("尝试打开D:/LOL.exe");
            new FileInputStream(file);
            System.out.println("成功打开");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = simpleDateFormat.parse("2024--01");
            System.out.println("Date is incorrect");
        }catch (FileNotFoundException e){
            System.out.println("D:/LOL.exe is not found");
            e.printStackTrace();
        }catch (ParseException e){
            System.out.println("date parse error");
            e.printStackTrace();
        }
    }
}
