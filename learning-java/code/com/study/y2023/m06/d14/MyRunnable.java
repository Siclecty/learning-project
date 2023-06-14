package com.learn.d5_thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出错误"+i);
        }
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"本任务睡眠");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
