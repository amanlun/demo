package com.lun.bito.api.demo.threadSafe.anmail;

import com.lun.bito.api.demo.threadSafe.Racer;

import java.util.concurrent.ThreadLocalRandom;

public class Rabbit implements Runnable{
    Racer racer;
    public Rabbit(Racer racer) {
        this.racer =racer;
    }

    @Override
    public void run() {
        racer.setName(getClass().getName());
        for (int i = 1; i < 101; i++) {
            System.out.printf("Rabbit step...%d\n", i);
            try {
                racer.eatFood();
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        racer.rank.add(racer.name);
    }
}
