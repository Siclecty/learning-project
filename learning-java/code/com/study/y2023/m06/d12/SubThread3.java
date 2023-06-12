package com.learning.duoxiancheng;

public class SubThread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
