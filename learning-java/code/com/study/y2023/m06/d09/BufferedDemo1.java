package com.learning.buffered;

import java.io.*;

public class BufferedDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:/read.txt/2.png");
        FileOutputStream fos=new FileOutputStream("D:/tu/2.png");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int len;
        long begin=System.currentTimeMillis();
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制文件耗时："+(end-begin)+"毫秒");
        bos.close();
        bis.close();
    }
}
