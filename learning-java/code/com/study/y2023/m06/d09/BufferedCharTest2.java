package com.learning.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedCharTest2 {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("D:/read.txt/data01.txt"));
            List<String> data=new ArrayList<>();
            String line;
            while ((line=br.readLine()) !=null){
                data.add(line);
            }
            System.out.println(data);
            Collections.sort(data);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
