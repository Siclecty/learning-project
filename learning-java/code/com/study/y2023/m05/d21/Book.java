package com.learning.object;
/*
编写一个图书类 (Book)
	属性: 编号 (id)  书名(name)  价格 (price)
	行为: 展示 (show)
		该方法中需要展示出图书的所有属性信息
编写一个图书测试类 (BookTest)
	创建 3 个图书对象,  分别赋值为
		(001, 三国, 88.88)
		(002, 水浒, 88.88)
		(003, 富婆通讯录, 10000)
	调用3个对象,  各自的show 方法展示属性信息
 */
public class Book {
    String id;
    String name;
    double price;
    public void show(){
        System.out.println("图书的所有属性信息："+id+"\t"+name+"\t"+price);
    }
}
