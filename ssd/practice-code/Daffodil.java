package com.learning.flot;

public class Daffodil {
    public static void main(String[] args) {
        for (int a = 100; a <= 999; a++) {
            int b = a % 10;
            int c = a / 10 % 10;
            int d = a / 100 % 10;
            if (b * b * b + c * c * c + d * d * d == a) {
                System.out.print(a+"\t");
            }
        }
    }
}