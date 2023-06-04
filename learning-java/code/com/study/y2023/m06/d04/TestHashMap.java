package com.learning.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("stu1","Lily");
        map.put("stu2","Jack");
        map.put("stu3","Jone");
        map.put(null,null);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("stu2"));
    }
}
