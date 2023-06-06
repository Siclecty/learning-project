package com.learning.filetset;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File f1=new File("D:\\tu");
        String[] names=f1.list();
        for (String name:names){
            System.out.println(name);
        }
        File[] files=f1.listFiles();
        for (File f:files){
            System.out.println(f.getAbsolutePath());
        }
        File dir=new File("D:/tu/ddd");
        File[] files1=dir.listFiles();
        System.out.println(files1);
    }
}
