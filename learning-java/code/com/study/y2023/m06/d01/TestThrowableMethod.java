package com.learning.anomaly;

public class TestThrowableMethod {
    public static int div(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        try{
            int val=div(10,0);
            System.out.println(val);
        }catch (Exception e){
            System.out.println("getMessage:");
            System.out.println(e.getMessage());
            System.out.println("------toString------");
            System.out.println(e.toString());
            System.out.println("------printStackTrace-----");
            e.printStackTrace();
            System.out.println("------getStackTrace------");
            StackTraceElement [] els=e.getStackTrace();
            for (int i=0;i<els.length;i++){
                System.out.println("method:"+els[i].getMethodName());
                System.out.println("("+els[i].getClassName()+":");
                System.out.println(els[i].getLineNumber()+")");
            }
        }
    }
}
