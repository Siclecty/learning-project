package com.learning.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        OutputStream os=new FileOutputStream("calm1/src/abc");
        os.write('a');
        os.write(98);
        os.flush();
        os.close();
        byte buffer[]={'a',97,98,99};
        os.write(buffer);
        byte buffer1[]="我是中国人".getBytes();
        os.write(buffer1);
    }
}
