package com.lun.bito.api.demo.threadSafe;

class Res{
    boolean flag;
    String name;
}


public class HumanRunnable extends Thread{

    private Res res;
    public HumanRunnable(Res res){
        this.res = res;
    };

    @Override
    public void run() {
        int i =0;
        while (true) {
            i++;
            synchronized (res){
                try {
                    if(getName().equals("Thread-0")&& !res.flag){
                        System.out.println("who :"+getName());
                        System.out.println("Marry Stop!! ");
                        res.wait();

                    }


                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread Interrupted");
                }
                res.flag =false;
                res.notifyAll();

            }
            System.out.println(res.name+"  run....."+i+" M");
            if(i ==10){
                break;
            }
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

    }

    public static void main(String[] args)  {
        Res res = new Res();
        Res res2 = new Res();
        Res res3 = new Res();

        res.name ="Marry";
        res2.name="Peter";
        res3.name="Lun";
        HumanRunnable human= new HumanRunnable(res);
        HumanRunnable human2= new HumanRunnable(res2);
        HumanRunnable human3= new HumanRunnable(res3);


        human.start();

        human2.start();
        human3.start();
        try {
            human.join();
            human2.join();
            human3.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("END!");



    }
}


