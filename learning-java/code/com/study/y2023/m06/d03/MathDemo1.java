package com.learning.mathtest;

public class MathDemo1 {
    public static void main(String[] args) {
        System.out.println("-10的绝对值："+Math.abs(-10));
        System.out.println("大于2.5的最小整数："+Math.ceil(2.5));
        System.out.println("小于2.5的最大整数："+Math.floor(2.5));
        System.out.println("5和6的较大值"+Math.max(5, 6));
        System.out.println("5和6的较小值"+Math.min(5, 6));
        System.out.println("6.6四舍五入为"+Math.round(6.6));
        System.out.println("36平方根为"+Math.sqrt(36));
        System.out.println("2的3次幂为"+Math.pow(2, 3));
        for (int i = 0; i < 5; i++) {
            System.out.println("随机数"+(i+1)+"->"+Math.random());
        }
    }
}
