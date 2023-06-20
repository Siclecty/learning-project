package com.learn.d11_annotation;

import java.lang.reflect.Method;

public class TestAnnotation4 {
    @MyTest
    public void test1(){
        System.out.println("test1");
    }
    @MyTest
    public void test2(){
        System.out.println("test2");
    }
    @MyTest
    public void test3(){
        System.out.println("test3");
    }
    @MyTest
    public void test4(){
        System.out.println("test4");
    }

    public static void main(String[] args) throws Exception{
        TestAnnotation4 ta=new TestAnnotation4();
        Class c=TestAnnotation4.class;
        Method[] methods=c.getDeclaredMethods();
        for (Method method:methods){
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(ta);
            }
        }
    }
}
