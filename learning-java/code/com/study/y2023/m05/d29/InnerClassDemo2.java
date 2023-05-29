package com.learning.innerclass;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        People.Student ps=new People.Student();
        ps.show();
        People.Student.method();
    }
}
class People{

    static class Student{
        public void show(){
            System.out.println("......");
        }
        public static void method(){
            System.out.println("as");
        }
    }
}