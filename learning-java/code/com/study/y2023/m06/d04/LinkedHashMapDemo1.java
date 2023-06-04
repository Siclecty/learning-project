package com.learning.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();
        map.put("2","yellow");
        map.put("1","red");
        map.put("3","blue");
        Iterator iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry) iterator.next();
            Object key=entry.getKey();
            Object value=entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
