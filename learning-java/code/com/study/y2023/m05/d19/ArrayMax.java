package com.learning.array;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 44, 33, 55, 22};
        int max=getSum(array);
        System.out.println(max);
    }
    public  static int getSum(int[] array) {
        int max;
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
