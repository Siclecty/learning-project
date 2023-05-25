package com.learning.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AeeayListTest1 {
    public static void main(String[] args) {
        Student student1=new Student("20180302","王晓伟",19,"护理一班");
        Student student2=new Student("20180303","叶孤城",21,"推拿二班");
        Student student3=new Student("20180304","张三",20,"中药学三班");
        Student student4=new Student("20180305","李四",23,"神经科四班");
        ArrayList<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            System.out.println(s.getStudent_id()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getGrade());
        }
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入学号查询学生");
            String student_id= sc.next();
            Student s=getStudentById(students,student_id);
            if (s==null){
                System.out.println("查无此人");
            }else {
                System.out.println("您查询的信息如下：");
                System.out.println(s.getStudent_id()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getGrade());
            }
        }
    }

    public static Student getStudentById(ArrayList<Student> students, String student_id) {
        for (int i = 0; i < students.size(); i++) {
            Student s1 = students.get(i);
            if (s1.getStudent_id().equals(student_id)){
                return s1;
            }
        }
        return null;
    }
}
