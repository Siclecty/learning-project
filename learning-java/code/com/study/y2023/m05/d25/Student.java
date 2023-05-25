package com.learning.arraylist;

public class Student {
    private String student_id;
    private String name;
    private int age;
    private String grade;

    public Student() {
    }

    public Student(String student_id, String name, int age, String grade) {
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /**
     * 获取
     * @return student_id
     */
    public String getStudent_id() {
        return student_id;
    }

    /**
     * 设置
     * @param student_id
     */
    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

}
