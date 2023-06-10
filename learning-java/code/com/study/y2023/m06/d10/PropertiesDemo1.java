package com.learning.properties;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception{
        Properties properties=new Properties();
        properties.setProperty("admin","12345678");
        properties.setProperty("dlei","23478478");
        System.out.println(properties);
        properties.store(new FileWriter("D:/read.txt/users.properties"),"this is users!!");
    }
}
