package org.javacollections.MapEx.HashTableEx;

import java.util.Hashtable;

public class HashTableEx1 {
    public static void main(String[] args) {
        // backed by array of bucket, each bucket stores as a linkedlist
        //Why would you choose Hashtable over HashMap
        //Ans: Only if synchronization is required and I don’t want to manage it externally.
        // Otherwise, HashMap or ConcurrentHashMap are better suited for modern applications.
        //Thread-safe via method-level synchronization
        //No null keys or values
        //Slower due to coarse-grained locking
        //Legacy class (since Java 1.0)
        //No. Duplicate keys are not allowed.
        //If you call put(key, value) with a key that already exists, the old value is overwritten.
        //The key remains unique—only one entry per key is stored.
        // Initial capacity =11 and Load factor is 0.75
        Hashtable<Object, Object> hashtable = new Hashtable<>   ();
        hashtable.put("Satish","1");
        //hashtable.put(null,"Test"); //Null keys are not allowed
        //hashtable.put("Test",null); //NUll values are not allowed
        hashtable.put("Satish","2");
        System.out.println(hashtable);

    }
}
