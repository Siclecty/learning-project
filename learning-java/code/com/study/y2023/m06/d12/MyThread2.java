package com.learning.duoxiancheng;

public class MyThread2 extends Thread{
    public MyThread2() {
    }
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()+"输出"+i);
        }
    }
}
