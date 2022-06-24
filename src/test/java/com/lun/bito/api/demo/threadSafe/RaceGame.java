package com.lun.bito.api.demo.threadSafe;

import com.lun.bito.api.demo.threadSafe.anmail.Rabbit;
import com.lun.bito.api.demo.threadSafe.anmail.Tortoise;

public class RaceGame {

    public static void main(String[] args) {
        Racer racer = new Racer();
        Thread animal = new Thread(new Tortoise(racer));
        Thread animal2 = new Thread(new Rabbit(racer));
        animal.start();
        animal2.start();

        try {
            animal.join();
            animal2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End");
    }
}
