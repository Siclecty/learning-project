package com.learning.fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        InputStream is=new FileInputStream("calm1/src/data.txt");
        int b1=is.read();
        System.out.println((char) b1);
        int b2= is.read();
        System.out.println((char) b2);
    }
}