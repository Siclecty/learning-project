package com.learning.array;

public class ArrayMean {
    public static void main(String[] args) {
        int[] arr2={100,50,20,90,80};
        double avg1=getAvg(arr2);
        System.out.println("平均值为:"+avg1);
        int count=getCount(arr2);
        System.out.println("比平均值小的个数为："+count);
    }
    public static int getSum(int[] arr2) {
        int sum=0;
        for (int i = 0; i < arr2.length; i++) {
            sum+=arr2[i];
        }
        return sum;
    }
    public static double getAvg(int[] arr2){
        int sum=getSum(arr2);
        double avg=(sum*1.0)/ arr2.length;
        return avg;
    }
    public static int getCount(int[] arr2){
        int count=0;
        double avg=getAvg(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]<avg){
                count++;
            }
        }
        return count;
    }
}
