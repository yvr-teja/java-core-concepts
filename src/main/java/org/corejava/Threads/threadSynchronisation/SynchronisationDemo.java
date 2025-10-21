package org.corejava.Threads.threadSynchronisation;

public class SynchronisationDemo {

    private static int counter = 0;
    public static void main(String[] args) {
            Thread one = new Thread(() -> {
                for(int i = 0; i < 10000; i++) {
                    //counter++;  //counter=counter+1
                    increment();
                }
            });
        Thread two = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                increment();
            }
        });
        one.start();
        two.start();

        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Counter: " + counter);
        /*1.Load
        * 2.Increment
        * 3.set back the value
        * counter=0; incrementValue=1;  <-- thread1
        * counter=0; incrementValue=1 (it should be - 2);  <-- thread2
        * this is because race conditions
        * */
    }
    //Method level synchronisation
    //synchronized - declaring it in method level, will execute only by one thread at a time.
    public synchronized static void increment() {
        counter++;  // this section is called critical section
    }
}
