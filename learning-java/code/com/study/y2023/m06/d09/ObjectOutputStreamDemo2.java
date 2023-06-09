package com.learning.objectstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamDemo2 {
    public static void main(String[] args) throws Exception{
        Student1 s1=new Student1(10,"Lily");
        FileOutputStream fos=new FileOutputStream("D:\\read.txt\\tar.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
    }
}
