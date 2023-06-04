package com.learning.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestKeySet {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("stu1","Lily");
        map.put("stu2","Jack");
        map.put("stu3","Jone");
        Set keySet=map.keySet();
        Iterator iterator= keySet.iterator();
        while (iterator.hasNext()){
            Object key=iterator.next();
            Object value=map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
