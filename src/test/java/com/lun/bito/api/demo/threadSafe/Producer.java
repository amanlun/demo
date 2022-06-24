package com.lun.bito.api.demo.threadSafe;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable{

    Demo demo ;

    public Producer(Demo demo) {
        this.demo = demo;
    }



    @Override
    public void run() {
        String stockName =new String("stock");
        for (int i = 0; i <= 10; i++) {
          String stock=stockName+i;
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 200));
                if(i == 10){
                    stock ="END";
                }

                System.out.println("Producer thread: "+Thread.currentThread().getName());
                demo.send(stock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
