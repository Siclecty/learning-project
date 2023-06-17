package com.learn.tcp_test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(9090);
        System.out.println("等待接收数据···");
        Socket s=socket.accept();
        InputStream is=s.getInputStream();
        byte[] b=new byte[20];
        int len;
        while ((len=is.read(b)) !=-1){
            String str=new String(b,0,len);
            System.out.print(str);
        }
        OutputStream os=s.getOutputStream();
        os.write("服务器已收到。This is Server!".getBytes());
        os.close();
        is.close();
        s.close();
        socket.close();
    }
}
