package com.learning.exercise;

import java.util.Scanner;

public class PayTaxes {
    public static void main(String[] args) {
        Scanner pay=new Scanner(System.in);
        System.out.println("请输入税前工资:");
        double paytaxea1= pay.nextDouble();
        double ratepayment=paytaxea1-paytaxea1*0.1-5000;
        double taxes=0;
        //按照梯度范围计算个税数值
        if (ratepayment>0&&ratepayment<3000){
           taxes=ratepayment*0.03;
        }else if (ratepayment>3000&&ratepayment<12000){
            taxes=3000*0.03+(ratepayment-3000)*0.1;
        }else if (ratepayment>12000&&ratepayment<25000){
            taxes=3000*0.03+(ratepayment-3000)*0.1+(ratepayment-3000-12000)*0.2;
        }else if (ratepayment>25000&&ratepayment<35000){
            taxes=3000*0.03+(ratepayment-3000)*0.1+(ratepayment-3000-12000)*0.2+(ratepayment-3000-12000-25000)*0.25;
        }else if (ratepayment>35000&&ratepayment<55000){
            taxes=3000*0.03+(ratepayment-3000)*0.1+(ratepayment-3000-12000)*0.2+(ratepayment-3000-12000-25000)*0.3+(ratepayment-3000-12000-25000-35000)*0.3;
        }else if (ratepayment>55000&&ratepayment<80000){
            taxes=3000*0.03+(ratepayment-3000)*0.1+(ratepayment-3000-12000)*0.2+(ratepayment-3000-12000-25000)*0.3+(ratepayment-3000-12000-25000-35000)*0.3+(ratepayment-3000-12000-25000-35000-55000)*0.35;
        }else if (ratepayment>80000){
            taxes=3000*0.03+(ratepayment-3000)*0.1+(ratepayment-3000-12000)*0.2+(ratepayment-3000-12000-25000)*0.3+(ratepayment-3000-12000-25000-35000)*0.3+(ratepayment-3000-12000-25000-35000-55000)*0.35+(ratepayment-3000-12000-25000-35000-55000-80000)*0.45;
        }else {
            System.out.println("个税计算有误：");
        }
        double aftertax=paytaxea1-paytaxea1*0.1-taxes;
        System.out.println("税后工资："+aftertax+"元");
    }
}
