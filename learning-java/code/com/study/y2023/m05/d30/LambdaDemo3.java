package com.learning.lambda;

import java.util.Random;

public class LambdaDemo3 {
    public static void main(String[] args) {
        useRandomNumHandle(new RandomNumHandle() {
            @Override
            public int getNum() {
               return new Random().nextInt(100)+1;
            }
        });
        useRandomNumHandle(()-> new Random().nextInt(100)+1);
    }
    public static void useRandomNumHandle(RandomNumHandle randomNumHandle){
        int result= randomNumHandle.getNum();
        System.out.println(result);
    }
}
interface RandomNumHandle{
    int getNum();
}