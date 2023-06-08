package com.learning.fileinputstream;

import java.io.FileOutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        System.out.println("输入需要保存的文件内容：");
        int count,n=512;
        byte buffer[]=new byte[n];
        count=System.in.read(buffer);
        FileOutputStream fos=new FileOutputStream("D:/read.txt");
        fos.write(buffer,0,count);
        System.out.println("以保存到read.txt");
        fos.close();
    }
}
