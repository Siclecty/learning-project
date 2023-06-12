package com.learning.duoxiancheng;

public class TestYield {
    public static void main(String[] args) {
        SubThread2 st=new SubThread2();
        new Thread(st,"线程1").start();
        new Thread(st,"线程2").start();
    }
}
