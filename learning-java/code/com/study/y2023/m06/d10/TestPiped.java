package com.learning.test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

public class TestPiped {
    public static void main(String[] args) throws IOException {
        Send send=new Send();
        Receive receive=new Receive();
        PipedOutputStream pos= send.getOutputStream();
        PipedInputStream pis= receive.getInputStream();
        pos.connect(pis);
        send.start();
        receive.start();
    }
}
class Send extends Thread{
    private PipedOutputStream pos=new PipedOutputStream();
    public PipedOutputStream getOutputStream(){
        return pos;
    }
    public void run(){
        String s=new String("Send发送的数据");
        try {
            pos.write(s.getBytes());
            pos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
class Receive extends Thread{
    private PipedInputStream pis=new PipedInputStream();
    public PipedInputStream getInputStream(){
        return pis;
    }
    public void run(){
        String s=null;
        byte[] b=new byte[1024];
        try {
            int len=pis.read(b);
            s=new String(b,0,len);
            System.out.println("Receive接收到了："+s);
            pis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}