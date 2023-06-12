package com.learning.duoxiancheng;

public class ThreadDemo6 {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 5; i++) {
            System.out.println("输出"+i);
            if (i==3){
                Thread.sleep(3000);
            }
        }
    }
}
