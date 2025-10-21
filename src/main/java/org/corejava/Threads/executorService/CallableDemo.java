package org.corejava.Threads.executorService;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        System.out.println("Starting CallableDemo");
        /*
            A Future object in Java holds the result of a task that runs in a separate thread
            and gets filled once the thread finishes its work.
         */
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<String> result = service.submit(new ReturnValueTask());
        /* execute() → runs a task without returning any result.
         submit() → runs a task and returns a `Future so you can get the result or check completion.
        */
        //System.out.println(result.get()); //this has an overloaded method
        System.out.println(result.get(6,TimeUnit.SECONDS));
        System.out.println("Main thread execution completed !! ");
        /* Three more important methods
        1. result.cancel(true)
        2. boolean cancelled = result.isCancelled();
        3. boolean done = result.isDone();
         */
    }
}

//class ReturnValueTask implements Runnable{
class ReturnValueTask implements Callable<String> {


    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Hello Ravi Teja";
    }
}

