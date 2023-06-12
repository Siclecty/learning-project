package com.learning.quqianyewu;

public class DrawThread extends Thread{
    private Account account;

    public DrawThread(Account account,String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.drawName(100000);
    }
}
