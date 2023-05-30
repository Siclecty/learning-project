package com.learning.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类。。。");
            }
        });
        useInter(()->{
            System.out.println("Lambda表达式。。。");
        });
    }
    public static void useInter(Inter inter){
        inter.show();
    }
}
interface Inter{
    void show();
}