package com.learning.exercise;

import java.util.Scanner;

//让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
public class Minimum {
    public static void main(String[] args) {
        Scanner number1=new Scanner(System.in);
        System.out.println("第一个整数：");
        int min1= number1.nextInt();
        Scanner number2=new Scanner(System.in);
        System.out.println("第二个整数：");
        int min2= number1.nextInt();
        Scanner number3=new Scanner(System.in);
        System.out.println("第三个整数：");
        int min3= number1.nextInt();
        int min4;
        if (min1<min2&&min1<min3){
            min4=min1;
        }else if (min2<min1&&min2<min3){
            min4=min3;
        }else {
            min4=min2;
        }
        System.out.println("最小的整数是："+min4);
    }
}
