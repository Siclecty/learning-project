package com.learning.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        File file=new File("read.txt");
        FileWriter fw=new FileWriter(file);
        fw.write(".com");
        fw.write(98);
        fw.write("Java程序设计");
        System.out.println("已保存到read.txt");
        fw.close();
    }
}
