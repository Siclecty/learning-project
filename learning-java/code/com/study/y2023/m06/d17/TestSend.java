package com.learn.d8_udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestSend implements Runnable{
    @Override
    public void run() {
        try{
            DatagramSocket ds=new DatagramSocket();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String line=null;
            DatagramPacket dp=null;
            do {
                line=br.readLine();
                byte[] buffer=line.getBytes();
                dp=new DatagramPacket(buffer, buffer.length, InetAddress.getByName("127.0.0.1"),9090);
                ds.close();
            }while (!line.equals("exit"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
