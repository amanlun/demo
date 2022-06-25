package com.lun.bito.api.demo.threadSaft2;

public class Store {
    public int stockNum= 0;
    public boolean isProduct=true;
    synchronized void productGood(){

        if(!isProduct){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        stockNum ++;
        if(stockNum ==10){
            isProduct =false;
            notifyAll();
        }
    }

    synchronized void buyStock(){
        if(isProduct){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        stockNum--;
        if(stockNum ==0){
            isProduct =true;
            notifyAll();
        }


    }

    public static void main(String[] args) {
        Store store = new Store();
        Product product = new Product(store);
        Consumer consumer = new Consumer(store);
        Thread th = new Thread(product);
        Thread th2 = new Thread(consumer);


        th.start();
        th2.start();
    }
}
