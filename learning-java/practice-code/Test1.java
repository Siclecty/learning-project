package com.learning.exercise;
//定义一个int类型的变量,初始化值为1234,求这个数的个位,十位,百位,千位分别是多少?
public class Test1 {
    public static void main(String[] args) {
        int a=1234;
        int b=a%10;
        int c=a/10%10;
        int d=a/100%10;
        int e=a/1000%10;
        System.out.println("个位："+b+"\t"+"十位:"+c+"\t"+"百位:"+d+"\t"+"千位:"+e);
    }
}

