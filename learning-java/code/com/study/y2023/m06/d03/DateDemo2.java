package com.learning.date;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        long time = d.getTime();
        System.out.println(time);
        long time1=System.currentTimeMillis();
        System.out.println(time1);
        long time2=System.currentTimeMillis();
        time2 +=(60*60+121)*1000;
        Date d1=new Date(time2);
        System.out.println(d1);

    }
}
