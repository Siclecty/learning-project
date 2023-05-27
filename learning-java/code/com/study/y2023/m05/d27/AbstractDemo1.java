package com.learning.mabstract;

public class AbstractDemo1 {
    public static void main(String[] args) {
        //People people=new People();//抽象类不能实例化
        Student s=new Student();
        s.method();
    }
}
abstract class People{
    public People(){

    }
    public abstract void Show();

    public void method(){
        System.out.println(".......");//抽象类中可以存在普通方法
    }
}
class Student extends People{
    public Student(){
        super();
    }
    //重写抽象方法
    @Override
    public void Show() {

    }
}
