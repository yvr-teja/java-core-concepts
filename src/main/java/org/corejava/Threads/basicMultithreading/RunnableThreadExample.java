package org.corejava.Threads.basicMultithreading;

public class RunnableThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadTwo());
        Thread t3 = new Thread(()-> {
            for(int i=0;i<5;i++){
                System.out.println("Thread Three:  "+i);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }

}

class ThreadOne implements Runnable{

    @Override
    public void run() {
       for (int i=0;i<10;i++){
           System.out.println("ThreadOne "+i);
       }
    }
}
class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<15;i++){
            System.out.println("ThreadTwo "+i) ;
        }
    }
}