package com.learning.printstream;

import java.io.PrintStream;

public class PrintDemo1 {
    public static void main(String[] args) throws Exception{
        PrintStream ps=new PrintStream("D:\\read.txt\\tar.txt");
        ps.println(97);
        ps.println(2.3);
        ps.println('c');
        ps.println("abc");
        ps.println(true);
        ps.close();
    }
}
