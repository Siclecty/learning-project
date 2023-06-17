package com.learn.tcp_test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSend2 {
    public static void main(String[] args) throws Exception{
        System.out.println("服务端启动成功");
        ServerSocket serverSocket=new ServerSocket(7777);
        Socket socket= serverSocket.accept();
        InputStream is=socket.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String msg;
          if ((msg=br.readLine()) !=null){
            System.out.println(socket.getRemoteSocketAddress()+"说了："+msg);
        }
    }
}
