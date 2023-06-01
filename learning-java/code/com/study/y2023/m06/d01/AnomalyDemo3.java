package com.learning.anomaly;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnomalyDemo3 {
    public static void main(String[] args) throws ParseException {
        System.out.println("程序开始....");
        parseTime("2022-11-22 11:11:11");
    }
    public static void parseTime(String date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Date d=sdf.parse(date);
        //System.out.println(d);
        //InputStream is=new FileInputStream("E:/meinv.jpg");
    }
}
