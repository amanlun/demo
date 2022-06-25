package com.lun.bito.api.demo.threadSafe.anmail;

import com.lun.bito.api.demo.threadSafe.Racer;

public class Worker implements Runnable{
    Racer racer;

    public Worker(Racer racer){
        this.racer = racer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            racer.refillFood();
        }
    }
}
