package com.learning.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //Set <String> set1=new HashSet<>();
        //Set<String> set1=new LinkedHashSet<>();
        Set<String> set1=new TreeSet<>();
        set1.add("abc");
        set1.add("java");
        set1.add("mysql");
        set1.add("have");
        System.out.println(set1);
    }
}
