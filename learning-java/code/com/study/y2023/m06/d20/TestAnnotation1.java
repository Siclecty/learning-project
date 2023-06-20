package com.learn.d11_annotation;
@MyTest1(aa="贝妮",cc={"admin","java"})
@MyTest2(value = "孙悟空",age=1000)
public class TestAnnotation1 {
    @MyTest1(aa="布布旺",bb = false,cc={"python","前端","java"})
    public void test1(){
    }
}
