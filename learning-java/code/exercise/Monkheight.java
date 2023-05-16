package com.learning.exercise;
//一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
//请用程序实现获取这三个和尚的最高身高。
public class Monkheight {
    public static void main(String[] args) {
        int monk1=150;
        int monk2=210;
        int monk3=165;
        int thehighest1=(monk1>monk2) ? monk1:monk2;
        int thehighest2=(thehighest1>monk3) ? thehighest1:monk3;
        System.out.println("三个和尚的最高身高的是:"+thehighest2);
    }
}
