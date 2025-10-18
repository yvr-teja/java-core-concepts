package org.javacollections.MapEx.HashMapEx;

import java.util.HashMap;
import java.util.Map;

//import static javax.management.Query.or;

public class HashMapEx1 {
    public static void main(String[] args) {
        //underlying DS -> It's a structure with an array of buckets, where each bucket holds a linked list or balanced tree of Node objects.
        //best for fast lookups by a unique key, like in a dictionary or cache.
        //worst choice when you need to maintain a specific order or perform range queries on the data.
        //not synchronized by default → much faster in single-threaded environments.
        //HashMap implements the Map, Cloneable, and Serializable interfaces.
        //no duplicates are allowed in keys, if a duplicate key is inserted new value replaces old value
        //one null key allowed, multiple values allowed
        //insertion order not preserved, Default Initial capacity=16, Load factor= 0.75
        //When two keys map to the same bucket index → Collision occurs.
        /*
            HashMap()                        // default (capacity=16, load factor=0.75)
            HashMap(int initialCapacity)     // custom capacity
            HashMap(int initialCapacity, float loadFactor) // custom capacity & load factor
            HashMap(Map<? extends K,? extends V> m) // copy another map
         */
        HashMap<Object, Object> hashMap=new HashMap<>();
        hashMap.put("Satish","One");
        hashMap.put("Ravi","Good boy");
        hashMap.put(10,"Ten");
        hashMap.put("Test",null);
        hashMap.put(null,"Null value");
        hashMap.put("Satish","Two");

        // Retrieve

        System.out.println(hashMap.get(10));//Ten
        //System.out.println(hashMap);
        //for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
        for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
