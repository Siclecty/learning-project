package com.learning.flot;
//求1-10之间的奇数和，并把求和结果在控制台输出
public class Oddsum {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++){
            if (i%2==1){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}
