package com.lun.bito.api.demo.threadSafe;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable{
    private Data data;

    public Sender(Data data) {
        this.data =data;
    }

    @Override
    public void run() {
        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };
        for (String packet : packets) {
            data.send(packet);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 200));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted, "+e);
            }
        }
    }

}
