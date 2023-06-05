package com.learning.genericity;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric2 {
    public static void main(String[] args) {
        List<?> list=null;
        list=new ArrayList<String>();
        list=new ArrayList<Integer>();
        //list.add(3);
        list.add(null);
        System.out.println(list);
        List<Integer> l1=new ArrayList<Integer>();
        List<String> l2=new ArrayList<String>();
        l1.add(1000);
        l2.add("phone");
        read(l1);
        read(l2);
    }
    static void read(List<?> list){
        for (Object o:list){
            System.out.println(o);
        }
    }
}
