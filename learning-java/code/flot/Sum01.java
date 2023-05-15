package com.learning.flot;
//求1-5之间的数据和，并把结果在控制台输出
public class Sum01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
                sum += i;
        }
        System.out.println(sum);
    }
}
