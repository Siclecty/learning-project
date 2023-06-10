package com.learning.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TestSystemRedirect {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("D:\\read.txt\\data.txt"));
        System.setOut(new PrintStream("D:\\read.txt\\data.txt"));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=br.readLine()) !=null){
            System.out.println(str);
        }
    }
}
