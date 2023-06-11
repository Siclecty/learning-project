package com.learning.duoxiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Callable<String> callable = new MyCallable(100);
        FutureTask<String> f1 = new FutureTask<>(callable);
        Thread t1 = new Thread(f1);
        t1.start();
        try {
            String rs1 = f1.get();
            System.out.println("第一个结果:"+rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}