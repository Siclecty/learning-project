package com.learn.d5_thread;

public class Member implements Runnable{
    String[] name;
    int index;
    RedBag bag;
    double idmoney;
    public Member(int id, RedBag bag, String[] name) {
        this.index=id;
        this.bag=bag;
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name[index]+",开始抢红包");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        idmoney= bag.shareBag();
        if (idmoney>0){
            System.out.println("恭喜，"+name[index]+"抢到"+idmoney+"元");
        }else {
            System.out.println("很遗憾，"+name[index]+"手速慢了，未抢到红包");
        }
    }
}
