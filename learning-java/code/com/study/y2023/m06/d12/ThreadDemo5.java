package com.learning.duoxiancheng;

public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread t=new MyThread2();
        t.start();
        System.out.println(t.getName());
        Thread t1=new MyThread2();
        t1.start();
        System.out.println(t1.getName());
        Thread t3=Thread.currentThread();
        System.out.println(t3.getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出:"+i);
        }
    }
}
