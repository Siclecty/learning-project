package com.learning.objecttest;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        sb1.append("He");
        sb1.append('l');
        sb1.append("lo");
        StringBuffer sb2=new StringBuffer();
        sb2.append("\t");
        sb2.append("World");
        sb1.append(sb2);
        System.out.println(sb1);
        sb1.delete(5,6);
        System.out.println("字符串删除："+sb1);
        String s="----";
        sb1.insert(5,s);
        System.out.println("字符串插入："+sb1);
        sb1.reverse();
        System.out.println("字符串反转："+sb1);
    }
}
