package com.learning.mabstract;

public class AbstractDemo {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    public abstract void eat();
}
class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}