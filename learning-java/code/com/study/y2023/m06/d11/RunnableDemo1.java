package com.learning.duoxiancheng;

public class RunnableDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println("玩游戏"+i);
            if (i==10){
                ThreadDemo1.MusicThread musicThread=new ThreadDemo1.MusicThread();
                musicThread.start();
            }
        }
    }
}
