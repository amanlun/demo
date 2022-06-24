package com.lun.bito.api.demo.threadSafe;

public class ThreadSafe extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            getName();
            System.out.println(getName() +"..."+i);
        }
    }


    public static void main(String[] args) {
        ThreadSafe threadSafe= new ThreadSafe();
        ThreadSafe threadSafe2= new ThreadSafe();
        threadSafe.start();
        threadSafe2.start();
//        threadSafe.run();
//        threadSafe2.run();


    }
}


