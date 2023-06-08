package com.learning.fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:/tu/1.png");
        FileOutputStream fos=new FileOutputStream("D:/read.txt/2.png");
        int len;
        long begin=System.currentTimeMillis();
        while ((len=fis.read()) !=-1){
            fos.write(len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制文件耗时："+(end-begin)+"毫秒");
        fos.close();
        fis.close();
    }
}
