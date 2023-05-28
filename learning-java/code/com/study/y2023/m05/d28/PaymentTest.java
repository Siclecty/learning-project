package com.learning.port;

import java.util.Scanner;

public class PaymentTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的支付方式：1.支付平台支付  2.银行卡网银支付  3.信用卡快捷支付");
        PaymentInterface paymentInterface=null;
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                paymentInterface=new PaymentPlatform();
                break;
            case 2:
                paymentInterface=new BankCardPayment();
                break;
            case 3:
                paymentInterface=new CreditCard();
                break;
        }
        System.out.println("请输入你的支付金额：");
        double money=sc.nextDouble();
        paymentInterface.pay(money);
    }
}
