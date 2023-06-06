package com.learning.filetset;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        File f=new File("D:\\tu\\1.png");
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println(f.length());
        long time=f.lastModified();
        System.out.println("最后修改时间："+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
    }
}
