package com.learning.exercise;
//某外卖商家的菜品单价如下:
//    1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
//    2.优惠方式:
//        总金额大于100元,总金额打9折,其它无折扣
//    3.需求:
//        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?
public class Menu {
    public static void main(String[] args) {
        int shredded=24;
        int peanut=8;
        int rice=3;
        int aggregate=shredded*3+peanut*3+rice*5;
        int discount=(aggregate>100)?(int)(aggregate*0.9):aggregate;//保存int变量aggregate;
        System.out.println("最终需要付多少钱："+discount);
    }
}
