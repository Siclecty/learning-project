package com.learning.buffered;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class TestLineNumberReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\read.txt\\code1.txt");
        FileWriter fw=new FileWriter("D:\\read.txt\\code2.txt");
        LineNumberReader lnr=new LineNumberReader(fr);
        String str=null;
        while ((str=lnr.readLine()) !=null){
            fw.write(lnr.getLineNumber()+":"+str);
            fw.write("\r\n");
        }
        fw.close();
        lnr.close();
    }
}
