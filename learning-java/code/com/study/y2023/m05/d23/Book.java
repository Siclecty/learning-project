package com.learning.encapsulation;

public class Book {
    //成员变量私有化
    String name;
    String book_id;
    double price;

    public Book() {
    }

    public Book(String name, String book_id, double price) {
        this.name = name;
        this.book_id = book_id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
