package com.learn.d10_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test2Constructor {
    @Test
    public void testGetConstructors() {
        Class c1 = Cat.class;
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "---->" + constructor.getParameterCount());
        }
    }
}