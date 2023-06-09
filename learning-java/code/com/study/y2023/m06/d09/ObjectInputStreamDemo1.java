package com.learning.objectstream;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("D:/read.txt/tar.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student1 s1=(Student1) ois.readObject();
        System.out.println("id是："+s1.getId());
        System.out.println("name是:"+s1.getName());
    }
}

