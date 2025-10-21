package org.corejava.Threads.basicMultithreading;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        /*System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());*/
        //priority starts with 1,2,3.... upto 10
        //By default main thread is having a priority of 5

        //Second example
        System.out.println(Thread.currentThread().getName() + " Says Hi");

        Thread t1 = new Thread(() -> {
            System.out.println("Thread one says Hi as well");
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        /*
        Please note that this property of main thread getting the first priority or the higher priority to get
        executed on the cup regardless of this having the lower priority which is 5 as compared to the max priority
        is only for the first time this thing gets executed once execution is starts it will go by the FIFO manage
         and then the Thread scheduler will schedule the threads based on their priority and if they happened to be
         of the same priority FIFO will be used to schedule the threads
         */
    }
}
