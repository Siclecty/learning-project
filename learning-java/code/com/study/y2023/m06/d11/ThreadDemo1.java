package com.learning.duoxiancheng;

public class ThreadDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println("玩游戏"+i);
            if (i==10){
                MusicThread musicThread=new MusicThread();
                musicThread.start();
            }
        }
    }
    static class MusicThread extends Thread{
        private int playTime=50;
        public void run(){
            for (int i = 0; i < playTime; i++) {
                System.out.println("播放音乐"+i);
            }
        }
    }
}
