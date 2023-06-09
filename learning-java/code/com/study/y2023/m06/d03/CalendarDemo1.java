package com.learning.calendartset;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("年"+calendar.get(Calendar.YEAR));
        System.out.println("月"+calendar.get(Calendar.MONTH));
        System.out.println("日"+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时"+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分"+calendar.get(Calendar.MINUTE));
        System.out.println("秒" + calendar.get(Calendar.SECOND));
        System.out.println("毫秒" + calendar.get(Calendar.MILLISECOND));
        calendar.add(Calendar.DAY_OF_YEAR,64);
        calendar.add(Calendar.MINUTE,59);

        Date d=calendar.getTime();
        System.out.println(d);

        long time= calendar.getTimeInMillis();
        System.out.println(time);
    }
}
