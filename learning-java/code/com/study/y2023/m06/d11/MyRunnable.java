package com.learning.duoxiancheng;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出:"+i);
        }
    }
}
