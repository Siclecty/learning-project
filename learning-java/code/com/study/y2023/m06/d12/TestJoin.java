package com.learning.duoxiancheng;

public class TestJoin {
    public static void main(String[] args) throws Exception{
        SubThread3 st=new SubThread3();
        Thread t=new Thread(st,"线程1");
        t.start();
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            if (i==2){
                t.join();
            }
        }
    }
}
