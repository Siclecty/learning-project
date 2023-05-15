package com.learning.exercise;
//动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
//请用程序实现判断两只老虎的体重是否相同。
//运用三元运算符
public class Zoo {
    public static void main(String[] args) {
        int h1=180;
        int h2=200;
        boolean w=(h1==h2) ? true:false;
        System.out.println("两只老虎的体重是否相同："+w);
    }
}
