package com.learning.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("D:/read.txt");
            int n=512;
            byte buffer[]=new byte[n];
            while ((fis.read(buffer,0,n) !=-1)&&(n>0)){
                System.out.println(new String(buffer));
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
