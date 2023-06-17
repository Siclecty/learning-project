package com.learn.tcp_test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class TeatClient1 {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端启动");
        Socket socket=new Socket("127.0.0.1",7777);
        OutputStream os=socket.getOutputStream();
        PrintStream ps=new PrintStream(os);
        ps.println("我是TCP的客户端，我已经与你对接");
        ps.flush();
    }
}
