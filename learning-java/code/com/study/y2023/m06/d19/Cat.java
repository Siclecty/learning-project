package com.learn.d10_reflect;

public class Cat {
    private String name;
    private  int age;

    public Cat() {
        System.out.println("无参构造器执行");
    }

    public Cat(String name, int age) {
        System.out.println("有参构造器执行");
        this.name = name;
        this.age = age;
    }

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
