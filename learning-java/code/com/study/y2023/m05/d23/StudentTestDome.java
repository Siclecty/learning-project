package com.learning.encapsulation;

public class StudentTestDome {
    public static void main(String[] args) {
        StudentTest student=new StudentTest();
        student.setAge(-18);
        int age= student.getAge();
        System.out.println(age);
    }
}
