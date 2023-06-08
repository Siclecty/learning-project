package com.learning.fileinputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        System.out.println("需要保存的文件:");
        int count,n=512;
        byte buffer[]=new byte[n];
        count=System.in.read(buffer);
        FileOutputStream fos=new FileOutputStream("D:/read.txt");
        fos.write(buffer,0,count);
        System.out.println("以保存到read.txt!");
        fos.close();
    }
}
