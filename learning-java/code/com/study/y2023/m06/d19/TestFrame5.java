package com.learn.d10_reflect;

import org.junit.Test;

public class TestFrame5 {
    @Test
    public void save() throws Exception{
        Student s1=new Student("张三","23214",19);
        Teacher t1=new Teacher("李四",99.9);
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(t1);
    }
}
