package com.lun.bito.api.demo.threadSafe;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable{
    private Data load;

    public Receiver(Data data) {
        this.load =data;
    }

    // standard constructors

    public void run() {
        for(String receivedMessage = load.receive();
            !"End".equals(receivedMessage);
            receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 200));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted, "+e);
            }
        }
        System.out.println("End");
    }

}
