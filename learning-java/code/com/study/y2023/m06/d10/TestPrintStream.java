package com.learning.printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream {
    public static void main(String[] args) throws Exception{
        PrintStream ps=new PrintStream(new FileOutputStream("D:\\read.txt\\data.txt"));
        ps.print(2023);
        ps.print("年");
        ps.print("疫情结束");
    }
}
