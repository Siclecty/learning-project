package com.learn.d4_thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket3 implements Runnable{
    private int ticket=5;
    private final Lock lock=new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            try {
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName() + "卖出第" + ticket + "张票，还剩" + --ticket + "张票");
                }
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
