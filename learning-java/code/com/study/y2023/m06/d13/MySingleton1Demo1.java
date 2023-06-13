package com.learn.d4_thread;

public class MySingleton1Demo1 {
    private static MySingleton1Demo1 instance=new MySingleton1Demo1();
    private MySingleton1Demo1(){}
    public static MySingleton1Demo1 getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("“饿汉式”单例模式");
    }
}
