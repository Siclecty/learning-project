package com.learning.filetset;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f1=new File("calm1/src/test1");
        System.out.println(f1.createNewFile());
        File f2=new File("D:/tu/aaa");
        System.out.println(f2.mkdir());
        File f3=new File("D:/tu/aaa/bbb/ccc");
        System.out.println(f3.mkdirs());
        System.out.println(f1.delete());
        File f4=new File("D:\\tu\\st.png");
        System.out.println(f4.delete());
    }
}
