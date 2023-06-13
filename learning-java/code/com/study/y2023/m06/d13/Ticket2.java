package com.learn.d4_thread;

public class Ticket2 implements Runnable{
    private int ticket=5;
    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖出第" + ticket + "张票，还剩" + --ticket + "张票");
            }
        }
    }
}
