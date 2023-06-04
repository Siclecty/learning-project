package com.learning.set;

public class Students {
    private Integer age;
    public Students(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return age+"";
    }
}
