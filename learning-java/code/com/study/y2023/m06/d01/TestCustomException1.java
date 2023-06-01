package com.learning.anomaly;

public class TestCustomException1 {
    public static int div(int a, int b) throws DivException{
        if (0==b)
            throw new DivException("除数不能为0");
            return a/b;
    }
    public static void main(String[] args) {
        try {
            int val=div(10,0);
            System.out.println(val);
        }catch (DivException e){
            System.out.println(e.getMessage());
        }
    }
}
class DivException extends Exception{
    public DivException() {
        super();
    }

    public DivException(String message) {
        super(message);
    }
}