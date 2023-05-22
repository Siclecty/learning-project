package com.learning.object;

public class TestCat {
    String cat_name;
    private double cat_age;
    public void setAge(double cat_age){
        if (cat_age>0) {
            this.cat_age=cat_age;
        }else {
            System.out.println("设置错误：年龄不能为负数");
        }
    }
    public void sayInformation(){
        System.out.println(this.cat_name+"\t"+this.cat_age);
    }
}
class TestCat1{
    public static void main(String[] args) {
        TestCat cat=new TestCat();
        cat.cat_name="贝妮";
        cat.setAge(-1);
        cat.sayInformation();
    }
}