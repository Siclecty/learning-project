package com.learn.d8_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo4 {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds=new DatagramSocket(8090);
        byte[] by="1000phone.com".getBytes();
        DatagramPacket dp=new DatagramPacket(by,0,by.length, InetAddress.getByName("127.0.0.1"),8081);
        System.out.println("正在发送数据···");
        ds.send(dp);
        ds.close();
    }
}
