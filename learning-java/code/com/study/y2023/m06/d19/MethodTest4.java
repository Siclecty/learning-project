package com.learn.d10_reflect;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodTest4 {
    @Test
    public void testGetMethods() throws Exception{

        Class c=Cat.class;
        Method[] methods=c.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(method.getName()+"---->"
                    +method.getParameterCount()+"---->"+method.getReturnType());
            Method run=c.getDeclaredMethod(null);
            System.out.println(run.getName()+"---->"
            +run.getParameterCount()+"---->"+run.getReturnType());
        }
    }
}
