package com.learning.duoxiancheng;

public class MusicThread implements Runnable{
    private int playTime=50;
    public void run(){
        for (int i = 0; i < playTime; i++) {
            System.out.println("播放音乐"+i);
        }
    }
}
