package com.learn.d8_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端启动");
        DatagramSocket socket=new DatagramSocket();
        byte[] buffer="一只鱼".getBytes();
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length, InetAddress.getLocalHost(),8888);
        socket.send(packet);
        socket.close();
    }
}
