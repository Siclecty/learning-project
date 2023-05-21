package com.learning.object;

public class CatTest {
    String name;
    String color;
    int age;
    public CatTest(String name, String color, int age) {
        this.name=name;
        this.color=color;
        this.age=age;
    }
}
class Cat{
    public static void main(String[] args) {
        CatTest cat = new CatTest("贝妮","黑色",2);
        System.out.println(cat.name + "\t" + cat.color + "\t" + cat.age);
    }
}