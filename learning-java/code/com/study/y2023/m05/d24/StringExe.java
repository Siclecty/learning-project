package com.learning.encapsulation;

import java.util.Scanner;

public class StringExe {
    public static void main(String[] args) {
        String okLoginName="admin";
        String okPassword="itheima";
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("请输入登录名称");
            String logonName=sc.next();
            System.out.println("请输入登录密码");
            String password= sc.next();
            if (okLoginName.equals(logonName)){
                if (okPassword.equals(password)){
                    System.out.println("登录成功");
                    break;
                }else {
                    System.out.println("登录密码错误");
                }
            }else {
                System.out.println("登录名称错误");
            }
        }
    }
}
