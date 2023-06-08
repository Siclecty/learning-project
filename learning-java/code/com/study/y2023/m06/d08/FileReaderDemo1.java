package com.learning.reader;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) throws Exception{
        Reader fr=new FileReader("calm1\\src\\data01.txt");
        //int code=fr.read();
        //System.out.println((char)code);
        int code1;
        while ((code1= fr.read()) !=-1){
            System.out.println((char) code1);
        }
    }
}
