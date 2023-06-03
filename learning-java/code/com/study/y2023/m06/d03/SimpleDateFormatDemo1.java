package com.learning.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rs= sdf.format(d);
        System.out.println(rs);

        long time1=System.currentTimeMillis()+121*1000;
        String rs2=sdf.format(time1);
        System.out.println(rs2);
    }
}
