package com.zhenz.java_01.charator03;

public class TestException04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0 ; i < Integer.MAX_VALUE ; i++){
            sb.append('a');
        }
    }
}
