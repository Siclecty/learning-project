package com.learn.d10_reflect;

public class TestClass1 {
    public static void main(String[] args) throws Exception{
        Class c1=Student.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        Class c2=Class.forName("com.learn.d10_reflect");
        System.out.println(c1==c2);
        Student s=new Student();
        Class c3=s.getClass();
        System.out.println(c3 == c2);
    }
}
