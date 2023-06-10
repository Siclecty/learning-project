package com.learning.properties;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception{
        Properties properties=new Properties();
        System.out.println(properties);
        properties.load(new FileReader("D:/read.txt/users.properties"));
        System.out.println(properties);
        String rs=new String("dlei");
    }
}
