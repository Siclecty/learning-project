package com.learning.quqianyewu;

public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void drawName(double money) {
        String name=Thread.currentThread().getName();
        if (this.money>=money){
            System.out.println(name+"来取钱成功,取出"+money);
            this.money-=money;
        }else {
            System.out.println("余额不足");
        }
    }
}
