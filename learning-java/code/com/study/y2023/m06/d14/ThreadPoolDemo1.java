package com.learn.d5_thread;

import java.util.concurrent.*;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        ExecutorService pool=new ThreadPoolExecutor(3,5,
                6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Runnable r=new MyRunnable();
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.shutdown();
    }
}
