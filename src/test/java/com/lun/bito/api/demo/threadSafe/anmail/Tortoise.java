package com.lun.bito.api.demo.threadSafe.anmail;

import com.lun.bito.api.demo.threadSafe.Racer;

public class Tortoise implements Runnable{

    Racer racer;
    public Tortoise(Racer racer) {
        this.racer = racer;
    }

    @Override
    public void run() {
        racer.setName(getClass().getName());
        for (int i = 1; i < 10; i++) {
            System.out.printf("tortois step %d\n",i);
            try {
                racer.eatFood();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        racer.rank.add(racer.name);

    }
}
