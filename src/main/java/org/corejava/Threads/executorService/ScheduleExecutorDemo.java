package org.corejava.Threads.executorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorDemo {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(new ProbeTask(),1000,2000, TimeUnit.MILLISECONDS);
        try {
            if (!service.awaitTermination(12, TimeUnit.SECONDS)) {
                service.shutdownNow();
            }
        }
        catch (Exception e){
            service.shutdownNow();
        }
    }
}
class ProbeTask implements Runnable{
    @Override
    public void run() {
        System.out.println("ProbeTask end point for updates");
    }
}