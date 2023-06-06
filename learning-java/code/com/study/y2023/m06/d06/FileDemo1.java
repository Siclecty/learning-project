package com.learning.filetset;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File f=new File("D:\\1545854716\\FileRecv\\MobileFile\\1661438412317.jpg");
        long size=f.length();
        System.out.println(size);
        File f2=new File("calm1/src/images");
        System.out.println(f2.length());
        File f3=new File("D:\\resources");
        System.out.println(f3.exists());
    }
}
