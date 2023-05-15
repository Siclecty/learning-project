package com.learning.flot;

import java.util.Scanner;

//系统密码是520，请用户不断的输入密码验证，验证不对输出密码错误，验证成功输入欢迎进入系统，并停止程序。
public class Password {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int p = 520;
        while (true) {
            System.out.println("输入正确的密码");
            int s = i.nextInt();
            //if判断密码是否正确
            if (s == p) {
                System.out.println("登录成功");
                break;//跳出循环
            }else {
                System.out.println("密码验证错误");
            }
        }
    }
}
