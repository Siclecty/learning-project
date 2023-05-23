package com.learning.encapsulation;

public class StudentTest {
    private int age;
    public void setAge(int age) {
        if (age>0&&age<=100){
            this.age = age;
        }else{
            System.out.println("年龄有误：");
        }
    }
    public int getAge() {
        return age;
    }
}
