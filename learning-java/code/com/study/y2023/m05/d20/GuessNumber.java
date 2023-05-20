package com.learning.array;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int[] number=new int[5];
        Random nu=new Random();
        for (int i=0;i<number.length;i++){
            number[i]= nu.nextInt(1,20);
        }
        Scanner sc=new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("输入一个1-20之间的整数：");
            int nu2= sc.nextInt();
            for (int i = 0; i < number.length; i++) {
                if (number[i]==nu2){
                    System.out.println("你已经猜中了该数据："+i);
                    break OUT;
                }
            }
            System.out.println("未命中:");
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+"\t");
        }
    }
}
