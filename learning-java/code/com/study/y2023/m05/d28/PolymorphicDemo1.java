package com.learning.polymorphic;

public class PolymorphicDemo1 {
    public static void main(String[] args) {

        //People p=new Student();
        UsePeople(new Student());
    }
    public static void UsePeople(People p){
        p.show();
    }
}
abstract class People{
    public abstract void show();
}
class Student extends People{

    @Override
    public void show() {
        System.out.println("跑...");
    }
}