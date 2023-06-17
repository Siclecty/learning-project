package com.learn.d8_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestReceiver implements Runnable{
    @Override
    public void run() {
        try{
            DatagramSocket ds=new DatagramSocket(9090);
            byte[] buffer=new byte[1024];
            DatagramPacket dp=new DatagramPacket(buffer, buffer.length);
            String line=null;
            do {
                ds.receive(dp);
                line=new String(buffer,0,dp.getLength());
                System.out.println(line);
            }while (!line.equals("exit"));
            ds.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
