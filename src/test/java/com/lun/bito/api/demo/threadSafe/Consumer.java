package com.lun.bito.api.demo.threadSafe;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable{
    Demo demo;
    public Consumer(Demo demo) {
        this.demo =demo;
    }

    @Override
    public void run() {
        for(String receivedMessage = demo.receive();!"END".equals(receivedMessage);receivedMessage = demo.receive()) {
//            System.out.println("Consumer thread: "+Thread.currentThread().getName());
            System.out.println(receivedMessage);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 300));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted, "+e);
            }
        }
    }
}
