package org.corejava.Threads.basicMultithreading;

public class JoinThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1 : " + i);
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 45; i++) {
                System.out.println("Thread 2 : " + i);
            }
        });

        System.out.println("Before executing the threads");  //this is line first printed  --> This is because of priority
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("Done executing the threads");  //this is line first printed  --> This is because of priority

        /*
        The join() method in Java allows one thread to wait until another thread has finished
        its execution, ensuring tasks run in sequence rather than concurrently.
         */
    }
}
