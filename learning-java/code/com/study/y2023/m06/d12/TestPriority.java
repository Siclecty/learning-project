package com.learning.duoxiancheng;

public class TestPriority {
    public static void main(String[] args) {
        SubThread st1=new SubThread("优先级低的线程");
        SubThread st2=new SubThread("优先级高的线程");
        st1.setPriority(Thread.MIN_PRIORITY);
        st2.setPriority(Thread.MAX_PRIORITY);
        st1.start();
        st2.start();
    }
}
