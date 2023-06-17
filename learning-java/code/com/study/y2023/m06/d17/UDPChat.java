package com.learn.d8_udp;

public class UDPChat {
    public static void main(String[] args) {
        new Thread(new TestSend()).start();
        new Thread(new TestReceiver()).start();
    }
}
