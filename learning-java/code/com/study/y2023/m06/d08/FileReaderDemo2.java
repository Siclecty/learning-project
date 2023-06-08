package com.learning.reader;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) throws Exception{
        Reader fr=new FileReader("calm1/src/data01.txt");
        char[] buffer=new char[1024];
        int len;
        while ((len=fr.read()) !=-1){
            String rs=new String(buffer,0,len);
            System.out.println(rs);
        }
    }
}
