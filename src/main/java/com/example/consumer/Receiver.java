package com.example.consumer;

import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(byte[] message) {
        System.out.println("Received <" + new String(message) + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}