package com.learn.d4_thread;

public class SynMethodDemo1 {
    public static void main(String[] args) {
        Ticket2 ticket2=new Ticket2();
        Thread t1=new Thread(ticket2,"窗口一");
        Thread t2=new Thread(ticket2,"窗口二");
        Thread t3=new Thread(ticket2,"窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
