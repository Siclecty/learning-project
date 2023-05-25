package com.learning.arraylist;

import java.util.ArrayList;

public class ArrayListStorage {
    public static void main(String[] args) {
        Movie movie=new Movie("肖申克的救赎",9.7,"罗宾斯");
        Movie movie1=new Movie("霸王别姬",9.5,"张国荣");
        Movie movie2=new Movie("阿甘正传",9.8,"汉克");
        ArrayList<Movie> movies=new ArrayList<>();
        movies.add(movie);
        movies.add(movie1);
        movies.add(movie2);
        System.out.println(movies);
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println(m.getName());
            System.out.println(m.getScore());
            System.out.println(m.getActor());
        }
    }
}
