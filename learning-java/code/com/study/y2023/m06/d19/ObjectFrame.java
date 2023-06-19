package com.learn.d10_reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {
    public static void saveObject(Object obj) throws Exception{
        PrintStream ps=new PrintStream(new FileOutputStream("calm2\\src\\data.txt",true));
        Class c=obj.getClass();
        String cname=c.getSimpleName();
        ps.println("-------"+cname+"------");
        Field[] fields=c.getDeclaredFields();
        for (Field field:fields){
            String name=field.getName();
            String value=field.get(obj)+"";
            ps.println(name+"="+value);
        }
        ps.close();
    }
}
