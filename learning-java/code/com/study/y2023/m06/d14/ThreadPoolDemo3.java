package com.learn.d5_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        ExecutorService es=Executors.newFixedThreadPool(10);
        Runnable run=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName()+"执行了第"+i+"次");
                }
            }
        };
        es.submit(run);
        es.submit(run);
        es.shutdown();
    }
}
