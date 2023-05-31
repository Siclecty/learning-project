package com.learning.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection list=new ArrayList();
        list.add("java");
        list.add(23);
        list.add(true);
        System.out.println(list);

        Collection list1=new HashSet();
        list1.add("java");
        list1.add(23);
        list1.add(true);
        System.out.println(list1);

        Collection <Integer> list3 = new ArrayList<>();
        list3.add(44);
    }
}
