package com.learning.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapDemo1 {
    public static void main(String[] args) {
        String[] selects={"a","b","c","d"};
        StringBuilder sb=new StringBuilder();
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);
        Map<Character,Integer> infos=new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
            if (infos.containsKey(ch)){
                infos.put(ch,infos.get(ch)+1);
            }else {
                infos.put(ch,1);
            }
        }
        System.out.println(infos);
    }
}
