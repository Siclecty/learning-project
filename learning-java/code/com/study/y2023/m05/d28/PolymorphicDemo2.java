package com.learning.polymorphic;

public class PolymorphicDemo2 {
    public static void main(String[] args) {
        Animal a=new Cat();
        System.out.println(a.num);
        a.eat();

        Inter inter=new MyInter();
        inter.method();
    }
}
class Animal{
    int num=10;
    public void eat(){
        System.out.println("....");
    }
}
class Cat extends Animal{
    int num=20;
    @Override
    public void eat(){
        System.out.println("....");
    }
}
interface Inter{
    void method();
}
class MyInter implements Inter{

    @Override
    public void method() {
        System.out.println("A...");
    }
}