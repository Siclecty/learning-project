package com.learning.flot;
//世界最高山峰是珠穆朗玛峰(8848.86米=8848860毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。请问，折叠多少次，可以折成珠穆朗玛峰的高度.
public class Peak {
    public static void main(String[] args) {
        double h=8848860;
        double z=0.1;
        int i=0;
        while (z<h){
            z*=2;
            i++;
        }
        System.out.println("折叠次数："+i);
    }
}
