package com.learning.innerclass;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer.Inner oi=new Outer().new Inner();
        System.out.println(oi.num);
        oi.show();
    }
}
class Outer{
    int num=20;
    private void method(){
        System.out.println("+++++");
    }

    class Inner{
        int num=10;
        public void show(){
            System.out.println(Outer.this.num);
            System.out.println(".....");
            method();
        }
    }
}