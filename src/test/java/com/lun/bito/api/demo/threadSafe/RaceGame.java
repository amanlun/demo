package com.lun.bito.api.demo.threadSafe;

import com.lun.bito.api.demo.threadSafe.anmail.Tortoise;
import com.lun.bito.api.demo.threadSafe.anmail.Worker;

public class RaceGame {
//        TO do LIST: 一次只能有一個人吃東西，其它人繼續跑

    public static void main(String[] args) {
        Racer racer = new Racer();
        Thread animal = new Thread(new Tortoise(racer));
//        Thread animal2 = new Thread(new Rabbit(racer));
        Thread work = new Thread(new Worker(racer));
        animal.start();
//        animal2.start();
        work.start();
        try {
            animal.join();
//            animal2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < racer.rank.size(); i++) {
            System.out.println("第"+i +"名: "+racer.name);
            racer.runStatus= false;
        }
    }
}
