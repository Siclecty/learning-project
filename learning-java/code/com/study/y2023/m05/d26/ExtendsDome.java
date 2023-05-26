package com.learning.mextend;

public class ExtendsDome {
    public static void main(String[] args) {
        Coder c=new Coder();
        c.setName("张三");
        c.setAge(23);
    }
}
class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Coder extends Employee{

}