package com.learning.mabstract;
//某加油站推出了2种支付卡，一种是预存10000的金卡，后续加油享受8折优惠，另一种是预存5000的银卡 ,后续加油享受8.5折优惠。
//请分别实现2种卡片进入收银系统后的逻辑，卡片需要包含主人名称，余额，支付功能。
public class AbstractDemo2 {
    public static void main(String[] args) {
        GoldCard goldCard=new GoldCard();
        goldCard.setName("飞");
        goldCard.setBalance(10000);
        goldCard.payment(500);
        System.out.println(goldCard.getBalance());
    }
}
abstract class Card{
   private String name;
   private double balance;
   public abstract void payment(double balance1);

    public Card() {
    }

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class GoldCard extends Card{
    @Override
    public void payment(double balance1) {
        System.out.println(balance1);
        System.out.println(getBalance());
        double rs=balance1*0.8;
        System.out.println(rs);
        setBalance(getBalance()-rs);
    }
}
class SilverCard extends Card{
    @Override
    public void payment(double balance1) {
        System.out.println(balance1);
        System.out.println(getBalance());
        double rs1=balance1*0.85;
        System.out.println(rs1);
        setBalance(getBalance()-rs1);
    }
}