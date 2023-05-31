package com.learning.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection <String> list=new ArrayList<>();
        list.add("app");
        list.add("sql");
        list.add("abc");
        list.add("my");
        System.out.println(list);
        //list.clear();
        //System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains("abc"));
        System.out.println(list.remove("sql"));
    }
}
