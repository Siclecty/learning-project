package com.learn.d7_inetaddress;

import java.net.InetAddress;

public class InetAddressDemo2 {
    public static void main(String[] args) throws Exception{
        InetAddress localHost=InetAddress.getLocalHost();
        System.out.println("本机的IP地址："+localHost.getHostAddress());
        InetAddress ip=InetAddress.getByName("www.mobiletrain.org");
        System.out.println("2s内是否可达："+ip.isReachable(2000));
        System.out.println("1000phone的IP地址："+ip.getHostAddress());
        System.out.println("1000phone的主机名："+ip.getHostName());
    }
}
