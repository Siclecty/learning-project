package com.learn.d5_thread;

import java.math.BigDecimal;

public class RedBag {
    int num;
    double money;

    public RedBag(int num, double money) {
        this.num = num;
        this.money = new BigDecimal(money).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    synchronized public double shareBag() {
        double ramoney;
        if (num > 1) {
            ramoney = new BigDecimal(Math.random() * money).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            money -= ramoney;
            num--;
        } else if (num==1){
            ramoney=new BigDecimal(money).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
            money=0;
            num--;
        }else {
            ramoney=0;
        }
        return ramoney;
    }
}
