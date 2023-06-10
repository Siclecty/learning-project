package com.learning.test;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字母:");
        String next=s.next();
        try{
            Integer.parseInt(next);
        }catch (Exception e){
            System.err.println(e);
            System.out.println("程序内部发生错误");
        }
    }
}
