package com.learn.tcp_test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        System.out.println("正在发送数据···");
        Socket s=new Socket(InetAddress.getByName("127.0.0.1"),9090);
        OutputStream os=s.getOutputStream();
        os.write("服务器端，你好！This is Client!".getBytes());
        s.shutdownOutput();
        InputStream is=s.getInputStream();
        byte[] b=new byte[20];
        int len;
        while((len=is.read(b)) !=-1){
            String str=new String(b,0,len);
            System.out.print(str);
        }
        is.close();
        os.close();
        s.close();
    }
}
