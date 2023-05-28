package com.learning.port;

public class PortDemo1 {
    public static void main(String[] args) {
        InterImpl ii=new InterImpl();
        ii.show();
        ii.eat();
    }
}
interface Inter{
    public abstract void show();
    public abstract void eat();
}
//1、重写接口的抽象方法
class InterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("测试...");
    }

    @Override
    public void eat() {
        System.out.println("吃晚餐...");
    }
}
//2、变为抽象类
abstract class InterImpl2 implements Inter{

}