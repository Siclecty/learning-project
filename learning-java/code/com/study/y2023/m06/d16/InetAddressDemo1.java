package com.learn.d7_inetaddress;

import java.net.InetAddress;

public class InetAddressDemo1 {
    public static void main(String[] args) throws Exception{
        InetAddress ip1=InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getAddress());
        InetAddress ip2=InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getAddress());
        InetAddress ip3=InetAddress.getByName("112.80.248.76");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());
        System.out.println(ip3.isReachable(5000));
    }
}
