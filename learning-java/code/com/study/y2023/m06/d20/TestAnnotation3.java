package com.learn.d11_annotation;

import org.junit.Test;

import java.util.Arrays;

public class TestAnnotation3 {
    @Test
    public void parseClass(){
        Class c=Demo1.class;
        if (c.isAnnotationPresent(MyTest4.class)){
            MyTest4 myTest4=(MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.ann());
            System.out.println(Arrays.toString(myTest4.el()));
        }
    }
}
