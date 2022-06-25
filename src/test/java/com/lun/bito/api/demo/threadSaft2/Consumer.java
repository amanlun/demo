package com.lun.bito.api.demo.threadSaft2;

public class Consumer implements Runnable{
    private Store store;



    public Consumer(Store store) {
        this.store = store;
    }


    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            store.buyStock();
            System.out.println("拿走1 剩下: " + store.stockNum);
        }
        //System.out.println("總共拿走: "+ product.takeGoodNum);
    }
}
