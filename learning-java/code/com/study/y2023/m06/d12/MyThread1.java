package com.learning.duoxiancheng;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()+"输出"+i);
        }
    }
}
