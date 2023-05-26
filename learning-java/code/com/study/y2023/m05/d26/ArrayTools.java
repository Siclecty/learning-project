package com.learning.arraylist;

public class ArrayTools {
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array){
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

    public static void ArrayTools(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+",");
        }
        System.out.print(array[array.length-1]+"]");
    }
}
