package com.learning.object;

public class Student {
    String student_id;
    String student_name;
    int student_age;
    public Student(String student_id, String student_name, int student_age) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_age = student_age;
    }
    public void student_information(){
        System.out.println("学生学号："+student_id);
        System.out.println("学生姓名："+student_name);
        System.out.println("学生年龄："+student_age);
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student student1=new Student("001","李白",18);
        student1.student_information();
        Student student2=new Student("001","李四",20);
        student2.student_information();
    }
}