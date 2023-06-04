package com.learning.set;

import java.util.TreeSet;

public class TestTreeSetSort {
    public static void main(String[] args) {
        TreeSet tree=new TreeSet(new MyComparator());
        tree.add(new Students(140));
        tree.add(new Students(50));
        tree.add(new Students(15));
        System.out.println(tree);
    }
}