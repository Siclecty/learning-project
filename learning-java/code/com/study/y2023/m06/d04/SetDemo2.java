package com.learning.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Student> sets=new HashSet<>();
        Student s1=new Student("张三",'男',20);
        Student s2=new Student("张三",'男',20);
        Student s3=new Student("李四",'男',21);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(sets);
    }
}
