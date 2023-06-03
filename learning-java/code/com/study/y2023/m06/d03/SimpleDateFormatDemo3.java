package com.learning.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        String startTime="2023-06-18 00:00:00";
        String endTime="2023-06-18 00:20:00";
        String xiaoJia="2023-06-18 00:03:47";
        String xiaoPi="2023-06-18 00:20:11";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf.parse(startTime);
        Date d2=sdf.parse(endTime);
        Date d3=sdf.parse(xiaoJia);
        Date d4=sdf.parse(xiaoPi);
        if(d3.after(d1)&&d3.before(d2)){
            System.out.println("小贾秒杀成功,可以发货");
        }else{
            System.out.println("小贾秒杀失败");
        }
        if (d4.after(d1)&&d4.before(d2)){
            System.out.println("小皮秒杀成功，可以发货");
        }else{
            System.out.println("小皮秒杀失败");
        }
    }
}
