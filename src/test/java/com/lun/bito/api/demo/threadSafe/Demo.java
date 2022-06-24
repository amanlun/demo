package com.lun.bito.api.demo.threadSafe;

public class Demo {

    private String stock;
    private boolean falg =true;



    synchronized String receive(){
//        while (falg) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//                System.out.println("Thread interrupted, "+e);
//            }
//        }
//        falg = true;

        String returnPacket = stock;
//        notifyAll();
        return returnPacket;
    }

    synchronized void send(String stock){
//        while (!falg) {
//            try {
//                if(falg){
//                    wait();
//                }
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        falg =false;
        this.stock = stock;
//        notifyAll();
        
    }

    public static void main(String[] args) {
        Demo demo =new Demo();
        Thread producer = new Thread(new Producer(demo));
        Thread cosumer = new Thread(new Consumer(demo));
        
        producer.start();
        cosumer.start();
    }
}
