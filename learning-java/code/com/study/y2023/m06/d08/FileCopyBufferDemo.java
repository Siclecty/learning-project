package com.learning.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyBufferDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("D:/read.txt/2.png");
        FileOutputStream fos=new FileOutputStream("D:/tu.1.png");
        byte[] b=new byte[512];
        int len;
        long begin=System.currentTimeMillis();
        while ((len=fis.read(b)) !=-1){
            fos.write(b,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制文件耗时："+(end-begin)+"毫秒");
        fos.close();
        fis.close();
    }
}
