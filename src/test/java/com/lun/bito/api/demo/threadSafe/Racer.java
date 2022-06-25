package com.lun.bito.api.demo.threadSafe;

import java.util.LinkedList;
import java.util.List;

public class Racer {
    public String name;

    public boolean runStatus =true;

    public int food = 1;
    public boolean isEat = true;

    public List<String> rank= new LinkedList<>();

    public void setName(String name) {
        this.name = name;
    }
    public synchronized String refillFood() {
        while (!isEat) {
            try {
                food++;
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted, "+e);
            }

        }
        System.out.println("Food num:"+food);
        isEat = false;

//        String runStatus = this.name+"is sleeping";
        notifyAll();
        return isEat?  (this.name+" eat the food"): ("refillFood Food num:"+food);
    }

    public synchronized String eatFood() {
        while (isEat) {
            food --;
            System.out.println(this.name+"is eating the food");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted, "+e);
            }
        }
        isEat = true;
        notifyAll();
        return isEat?  (this.name+" eat the food"): ("Food num:"+food);
    }


}
