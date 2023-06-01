package com.learning.anomaly;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("请输入合法的价格");
            String priceStr=input.nextLine();
            try {
                double price=Double.valueOf(priceStr);
                if (price>0){
                    System.out.println("定价："+price);
                    break;
                }else {
                    System.out.println("价格必须是正数");
                }
            } catch (NumberFormatException e) {
                System.out.println("用户输入有误");
            }
        }
    }
}
