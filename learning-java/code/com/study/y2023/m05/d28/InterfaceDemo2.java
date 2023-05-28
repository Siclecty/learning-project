package com.learning.port;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        System.out.println(InterTest.num);
    }
}
interface InterTest{
    int num=10;//只能定义常量
    void show();//只能是抽象方法
}
