package com.learning.flot;

import java.util.Scanner;

public class CryptographicCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("键盘录入用户密码:");
        long ch = input.nextLong();
        if (ch == 1111111) {
            System.out.println("程序输出密码正确");
        } else{
            System.out.println("程序输出密码错误");
        }
    }
}