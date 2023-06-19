package com.learn.d10_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldTest3 {
    @Test
    public void testGetField() throws Exception{
        Class c=Cat.class;
        Field[] fields=c.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field.getName()+"---->"+field.getType());
        }
        Field fName=c.getDeclaredField("name");
        System.out.println(fName.getName()+"---->"+fName.getType());
        Cat cat=new Cat();
        fName.setAccessible(true);
        fName.set(cat,"贝妮");
        System.out.println(cat);
        String name=(String) fName.get(cat);
        System.out.println(name);
    }
}
