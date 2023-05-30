package com.learning.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("....");
            }
        });
        useInterA(()-> {
            System.out.println(",,,,,,");
        });
    }
    public static void useInterA(InterA interA){
        interA.show();
    }
}
@FunctionalInterface//接口中有且仅有一个抽象方法的形式
interface InterA{
    void show();
    //void method();
}