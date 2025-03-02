package com.zhenz.java_01.charator03;

public class Account {
    protected static double balance = 0.0d;
    protected double init;

    public Account(double init) {
        this.init = init;
    }

    public Account(){

    }

    static Account x = new Account();

    class overdraftException extends Exception {
        String message;
        double deficit;

        public overdraftException(){

        }
        public overdraftException (String msg , double deficit) {
            super(msg);
            message = msg;
        }


    }


}

















