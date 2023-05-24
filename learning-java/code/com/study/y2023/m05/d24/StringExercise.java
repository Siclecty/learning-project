package com.learning.encapsulation;

import java.util.Random;
//随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
public class StringExercise {
    public static void main(String[] args) {
        String datas="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code="";
        Random random=new Random();
        for (int i=0;i<5;i++){
            int index= random.nextInt(datas.length());
            char c=datas.charAt(index);
            code += c;
        }
        System.out.println("随机生成的验证码为："+code);
    }
}
