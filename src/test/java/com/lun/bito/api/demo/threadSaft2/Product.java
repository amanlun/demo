package com.lun.bito.api.demo.threadSaft2;

public class Product implements Runnable{

    private Store store;

    Product(Store store){
        this.store = store;
    }



    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            store.productGood();
            System.out.println("目前數量: "+store.stockNum);
        }
    }
}
