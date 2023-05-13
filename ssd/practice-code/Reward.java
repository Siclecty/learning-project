package com.learning.flot;

import java.util.Scanner;

public class Reward {
    public static void main(String[] args) {
        Scanner re=new Scanner(System.in);
        System.out.println("从键盘录入成绩：");
        int re1= re.nextInt();
        if (re1>=95&&re1<=100){
            System.out.println("奖励山地自行车一辆");
        }else if (re1>=90&&re1<=94){
            System.out.println("奖励游乐场玩一次");
        }else if (re1>=80&&re1<=89){
            System.out.println("奖励变形金刚玩具一个");
        }else {
            System.out.println("胖揍一顿");
        }
    }
}