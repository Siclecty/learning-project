package com.learning.port;

public class InterfaceDemo3 {
    public static void main(String[] args) {

    }
}

interface A{
    void showA();
}
interface B{
    void showB();
}
class C implements A,B{

    @Override
    public void showA() {

    }

    @Override
    public void showB() {

    }
}
class People{
    public void show() {
        System.out.println(".....");
    }
}
class Student extends People implements A,B{

    @Override
    public void showA() {

    }

    @Override
    public void showB() {

    }
}
interface D extends A,B{
    void showD();
}
class E implements A,B,D{

    @Override
    public void showA() {

    }

    @Override
    public void showB() {

    }

    @Override
    public void showD() {

    }
}