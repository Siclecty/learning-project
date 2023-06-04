package com.learning.set;

import java.util.Comparator;

public class MyComparator implements Comparator {
    public int compare(Object o1,Object o2) {
        if (o1 instanceof Students&o2 instanceof Students){
            Students s1=(Students) o1;
            Students s2=(Students) o2;
            if (s1.getAge()>s2.getAge()){
                return -1;
            }else if (s1.getAge()<s2.getAge()){
                return 1;
            }
        }
        return 0;
    }
}
