package com.learning.array;

public class ArraySum2 {
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33}, {33, 44, 55}};
        printArray(arr);
        int sum = getSum(arr);
        System.out.println("求和结果为:" + sum);
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    public static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
