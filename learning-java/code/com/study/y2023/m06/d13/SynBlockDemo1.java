package com.learn.d4_thread;

public class SynBlockDemo1 {
    public static void main(String[] args) {
        Ticket1 ticket=new Ticket1();
        Thread t1=new Thread(ticket,"窗口一");
        Thread t2=new Thread(ticket,"窗口二");
        Thread t3=new Thread(ticket,"窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
