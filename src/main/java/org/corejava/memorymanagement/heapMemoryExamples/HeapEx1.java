package org.corejava.memorymanagement.heapMemoryExamples;

import org.corejava.Threads.executorService.CpuIntensiveTask;

import java.util.ArrayList;
import java.util.List;

public class HeapEx1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        printList(myList);
    }
    public static void printList(List<String> data) {
        //System.out.println(data);
        String value=data.get(1);
        data.add("four");
        System.out.println(value);
        System.out.println(data);
    }
}

/*
 5 important points about Heap Memory in Java:
    1.Stores objects
       → All objects, arrays, and their instance variables are stored in the heap.
    2.Shared across all threads
       → Unlike stack memory, the heap is common to every thread in the JVM.
    3.Managed by Garbage Collector (GC)
       → Memory is freed automatically when objects are no longer referenced.
    4.Slower than stack
       → Allocation and cleanup take longer because GC is involved.
    5.Can cause OutOfMemoryError
       → If too many objects are created or GC can't free memory, JVM throws java.lang.OutOfMemoryError: Java heap space.
 */