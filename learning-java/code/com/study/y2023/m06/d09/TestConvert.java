package com.learning.buffered;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestConvert {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("D:\\read.txt\\source.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        FileOutputStream fos=new FileOutputStream("D:\\read.txt\\target.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        int len;
        while ((len=isr.read()) !=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
