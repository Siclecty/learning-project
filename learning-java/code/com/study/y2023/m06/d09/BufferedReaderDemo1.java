package com.learning.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        try (
            Reader fr=new FileReader("D:/read.txt/data.txt");
            BufferedReader br=new BufferedReader(fr);
        ){
            char[] buffer=new char[1024];
            int len;
            while ((len=br.read(buffer)) !=-1){
                String str=new String(buffer,0,len);
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
