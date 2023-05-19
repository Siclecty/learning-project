package com.learning.array;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr1={100,50,20,90,80};
        int min=getMin(arr1);
        System.out.println(min);
    }
    public static int getMin(int[] arr1) {
        int min=arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]<min){
                min=arr1[i];
            }
        }
         return min;
    }
}
