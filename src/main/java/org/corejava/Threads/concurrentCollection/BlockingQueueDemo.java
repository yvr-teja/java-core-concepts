package org.corejava.Threads.concurrentCollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    static final int QUEUE_CAPACITY = 10;
    static BlockingQueue<Integer> taskQueue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);

    public static void main(String[] args){

        //Producer Thread
        Thread producer = new Thread(()->{
           try{
                for(int i=1;i<20;i++){
                    taskQueue.put(i);
                    System.out.println("task produced : "+ i);
                    Thread.sleep(100);
                }
           }
           catch (InterruptedException e){
               throw new RuntimeException(e);
           }
        });

        //Consumer Thread one
        Thread consumerOne = new Thread(()->{
            try{
                while(true){
                    int task=taskQueue.take();
                    processTask(task,"Consumer One");
                }
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        //Consumer Thread two
        Thread consumerTwo = new Thread(()->{
            try{
                while(true){
                    int task=taskQueue.take();
                    processTask(task,"Consumer Two");
                }
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        //starting the threads
        producer.start();
        consumerOne.start();
        consumerTwo.start();
    }

    private static void processTask(int task, String consumerName) throws InterruptedException {
        System.out.println("Task being processed by : "+ consumerName +" : "+task );
        Thread.sleep(1000);
        System.out.println("Task consumed by : "+ consumerName +" : "+task );
    }
}
