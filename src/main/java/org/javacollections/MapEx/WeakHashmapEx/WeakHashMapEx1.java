package org.javacollections.MapEx.WeakHashmapEx;

import java.util.WeakHashMap;

public class WeakHashMapEx1 {
    public static void main(String[] args) {
        //Underlying DS->hashtable (Array of buckets)
        //no duplicates are allowed in keys, if a duplicate key is inserted new value replaces old value
        //one null key allowed, multiple null values allowed
        //entries can disappear automatically, if keys are no longer used elsewhere.
        //Good for building caches, listeners, or metadata maps where you don’t want unused keys to prevent GC.
        Object key1 =new String("Key1");


        WeakHashMap<Object, Object> weakHashMap= new WeakHashMap<>();
        weakHashMap.put(key1,"Value1");
        weakHashMap.put("k1","V1");
        weakHashMap.put("k2","V2");
        weakHashMap.put("k3","V3");
        weakHashMap.put("k4","V4");
        weakHashMap.put(null,"One");
        weakHashMap.put(null,"Two");
        weakHashMap.put(10,"Ten1");
        weakHashMap.put(10,"Ten2");
        weakHashMap.put(20,"Twenty");
        weakHashMap.put("k5",null);
        weakHashMap.put("k6",null);

        System.out.println(weakHashMap);
        key1=null;  //Remove strong reference to key1

        System.gc();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println(weakHashMap);
        //Entry with "Key1" is gone because GC cleared it (no strong references)
    }
}
