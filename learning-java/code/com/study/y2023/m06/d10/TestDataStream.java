package com.learning.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestDataStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("D:\\read.txt\\tar.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.write(10);
        dos.writeChar('c');
        dos.writeBoolean(true);
        dos.writeUTF("千峰教育");
        dos.close();
        FileInputStream fis=new FileInputStream("D:\\read.txt\\tar.txt");
        DataInputStream dis=new DataInputStream(fis);
        System.out.println(dis.read());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
