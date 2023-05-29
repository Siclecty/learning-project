package com.learning.innerclass;

public class InnerClassDemo3 {
    public static void main(String[] args) {

        useInter(new InterImpl());
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println(".......");
            }
        });
    }
    public static void useInter(Inter inter1){
        inter1.show();
    }
}
interface Inter{
    void show();
}
class InterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("+++++");
    }
}