package com.learning.port;

public class PaymentPlatform implements PaymentInterface{
    @Override
    public void pay(double money) {
        System.out.println("通过支付平台支付了："+money+"元！");
    }
}
class BankCardPayment implements PaymentInterface{

    @Override
    public void pay(double money) {
        System.out.println("通过银行卡网银支付了："+money+"元！");
    }
}
class CreditCard implements PaymentInterface{

    @Override
    public void pay(double money) {
        System.out.println("通过信用卡支付了"+money+"元！"); }
}