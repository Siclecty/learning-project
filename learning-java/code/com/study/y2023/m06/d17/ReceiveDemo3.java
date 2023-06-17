package com.learn.d8_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo3 {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds=new DatagramSocket(8081);
        byte[] by=new byte[1024];
        DatagramPacket dp=new DatagramPacket(by,by.length);
        System.out.println("等待接收数据···");
        ds.receive(dp);
        String str=new String(dp.getData(),0,dp.getLength());
        System.out.println(str+"-->"+dp.getAddress().getHostAddress()+":"+dp.getPort());
        ds.close();
    }
}
