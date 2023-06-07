package com.learning.fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        InputStream is1=new FileInputStream("calm1/src/data.txt");
        int b;
        while ((b= is1.read()) !=-1){
            System.out.println((char) b);
        }
    }
}
