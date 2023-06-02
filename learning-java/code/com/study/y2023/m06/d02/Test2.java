package com.learning.objecttest;

public class Test2 {
    public static void main(String[] args) {
        Animal a1=new Animal("大熊",5);
        Animal a2=new Animal("大熊",5);
        System.out.println(a1.equals(a2));
        System.out.println(a1==a2);
    }
}
