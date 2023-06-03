package com.learning.system;

import java.util.Arrays;

public class SystemDemo2 {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        int[] arr2=new int[5];
        System.arraycopy(arr1,3,arr2,2,2);
        System.out.println(Arrays.toString(arr2));
    }
}
