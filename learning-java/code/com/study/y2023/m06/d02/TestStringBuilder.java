package com.learning.objecttest;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        sb1.append("a");
        sb1.append("b");
        sb1.append('a');
        sb1.append(23);
        sb1.append(false);
        sb1.append(3.3);
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder();
        sb2.append("a").append("b").append("c");
        System.out.println(sb2);
        sb2.reverse().append("110");
        System.out.println(sb2);
        System.out.println(sb2.length());
        StringBuilder sb3=new StringBuilder();
        sb3.append("123").append("456");
        String rs=sb3.toString();
        check(rs);
    }

    public static void check(String data){
        System.out.println(data);
    }
}
