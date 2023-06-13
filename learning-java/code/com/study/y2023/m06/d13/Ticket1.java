package com.learn.d4_thread;

public class Ticket1 implements Runnable {
    private int ticket = 5;
    public void run() {
        while (true) {
            synchronized (this) {
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
}
