package com.learning.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap2 {
    public static void main(String[] args) {
        Map map2=new HashMap();
        map2.put("stu1","Lily");
        map2.put("stu2","Jack");
        map2.put("stu3","Jone");
        map2.put("stu3","Lily");
        System.out.println(map2);
    }
}
