package org.corejava.Threads.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        //TaskOne taskOne; //=new TaskOne();
        try(ExecutorService service = Executors.newCachedThreadPool()){
            for(int i = 0; i < 10; i++){
                service.execute(new TaskOne(i));
            }
        }
    }
}
class TaskOne implements Runnable {
    private final int taskId;
    public TaskOne(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println("Task  : "+taskId + " Being executed by "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}