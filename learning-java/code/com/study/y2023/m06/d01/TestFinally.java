package com.learning.anomaly;

import java.util.Scanner;

public class TestFinally {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入除数。。。");
        int divisor=input.nextInt();
        System.out.println("异常类捕获开始。。。");
        try{
            int result=10/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("捕获到异常："+e);
            System.out.println("注意：除数不能为0");
            return;
        }finally {
            input.close();
            System.out.println("Scanner类对象被关闭");
        }
        System.out.println("异常捕获结束。。。");
    }
}
