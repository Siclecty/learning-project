package com.learning.genericity;

public class TestMyGeneric2 {
    public static void main(String[] args) {
        Pool<Integer> pool=new Pool<Integer>();
        pool.set(new Integer(3));
        Integer b= pool.get();
        System.out.println(b);
    }
}
class Pool<T>{
    T variable;
    public void set(T variable){
        this.variable=variable;
    }
    public T get(){
        return variable;
    }
}