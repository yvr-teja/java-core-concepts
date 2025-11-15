package org.corejava.Threads.concurrentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronisedCollection {
    public static void main(String[] args) {
        //List<Integer> list=new ArrayList<Integer>();

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread one = new  Thread(() ->{
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });
        Thread two = new  Thread(() ->{
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });

        one.start();
        two.start();
        try {
            one.join();
            two.join();
        }
        catch (InterruptedException e){
            System.out.println("Interrupted"+e.getMessage());
        }
        System.out.println(list.size());
    }
}
