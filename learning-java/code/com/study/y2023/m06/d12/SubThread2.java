package com.learning.duoxiancheng;

public class SubThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 6; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            if (i%3==0){
                Thread.yield();
            }
        }
    }
}
