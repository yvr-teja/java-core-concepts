package org.corejava.Threads.concurrentCollection;

import java.util.concurrent.CountDownLatch;

public class Restaurant {

    public static void main(String[] args) {
        int numberOfChefs = 3;
        CountDownLatch latch = new CountDownLatch(numberOfChefs);
        System.out.println(latch.getCount());

        new Thread(new Chef("Chef A","Pizza",latch)).start();
        new Thread(new Chef("Chef B","Biriyani",latch)).start();
        new Thread(new Chef("Chef C","Sambar Rice",latch)).start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All dishes are ready! lets start serving the customers");
    }
}

class Chef implements Runnable{

    private final  String name;
    private final  String dish;
    private final CountDownLatch latch;

    Chef(String name, String dish, CountDownLatch latch) {
        this.name = name;
        this.dish = dish;
        this.latch = latch;
    }


    @Override
    public void run() {
            try{
                System.out.println(name + " is Preparing "+ dish);
                Thread.sleep(2000);
                System.out.println(name + " has finished preparing "+ dish);
                latch.countDown();
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
    }
}
