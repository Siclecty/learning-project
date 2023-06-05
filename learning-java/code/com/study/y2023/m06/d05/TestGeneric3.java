package com.learning.genericity;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric3 {
    public static void main(String[] args) {
        List<? extends Person> list=null;
        list=new ArrayList<Person>();
        list=new ArrayList<Man>();
        List<? super Man> list2=null;
        list2=new ArrayList<Person>();
        list2=new ArrayList<Man>();
    }
}
class Person{

}
class Man extends Person{

}