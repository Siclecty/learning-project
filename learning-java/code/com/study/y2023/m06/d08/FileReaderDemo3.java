package com.learning.reader;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo3 {
    public static void main(String[] args) throws Exception{
        File file=new File("read.txt");
        FileReader fr=new FileReader(file);
        int len;
        while ((len=fr.read()) !=-1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
