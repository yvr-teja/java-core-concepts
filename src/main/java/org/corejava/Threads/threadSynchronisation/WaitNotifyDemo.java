package org.corejava.Threads.threadSynchronisation;

public class WaitNotifyDemo {
    private static final Object Lock= new Object();
    public static void main(String[] args)  {
        Thread one = new Thread(()->{
            try {
                m1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread two = new Thread(()->{
            try {
                m2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        one.start();
        two.start();
    }
    private static void m1() throws InterruptedException {
        synchronized (Lock){
            System.out.println("Hello from m1 method");
            Lock.wait();
            System.out.println("Back again to the m1 method");
        }
    }
    private static void m2() throws InterruptedException {
        synchronized (Lock){
            System.out.println("Hello from m2 method");
            Lock.notify();
            System.out.println("Hello from m2 method even after notifying....!");
        }
    }
}
