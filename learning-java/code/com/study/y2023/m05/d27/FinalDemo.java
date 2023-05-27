package com.learning.mextend;

public class FinalDemo {
    public static void main(String[] args) {

    }
}
final class Animal{

}
//class Dog extends Animal{//final修饰类不能被继承

//}
class People{
    public final void walk(){

    }
}
class Teacher extends People{
    /*@Override
    public void walk() {//final修饰方法不能被重写
        super.walk();
    }*/
}