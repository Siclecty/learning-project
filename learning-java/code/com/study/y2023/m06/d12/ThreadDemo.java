package com.learning.quqianyewu;

public class ThreadDemo {
    public static void main(String[] args) {
        Account account=new Account("IDco",100000);
        new DrawThread(account,"小明").start();
        new DrawThread(account,"小红").start();
    }
}
