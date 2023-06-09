package com.learning.objectstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        Student s=new Student("张三","zhangsan","123456",21);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:/read.txt/data.txt"));
        oos.writeObject(s);
        oos.close();
    }
}
class Student implements Serializable {
    private String name;
    private String loginName;
    private String passWord;
    private int age;

    public Student() {
    }

    public Student(String name, String loginName, String passWord, int age) {
        this.name = name;
        this.loginName = loginName;
        this.passWord = passWord;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}