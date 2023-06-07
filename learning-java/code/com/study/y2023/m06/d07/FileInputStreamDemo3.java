package com.learning.fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception{
        InputStream is2=new FileInputStream("calm1/src/abc");

        byte[] buffer=new byte[3];
        int len= is2.read();
        System.out.println("读取了几个字节"+len);
        String rs1=new String(buffer);
        System.out.println(rs1);
    }
}
