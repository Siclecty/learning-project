package com.learning.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestEntrySet {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("stu1","Lily");
        map.put("stu2","Jack");
        map.put("stu3","Jone");
        Set entrySet=map.entrySet();
        Iterator iterator= entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry) iterator.next();
            Object key=entry.getKey();
            Object value=entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
