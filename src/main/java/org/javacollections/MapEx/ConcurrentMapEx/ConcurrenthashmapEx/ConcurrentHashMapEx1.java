package org.javacollections.MapEx.ConcurrentMapEx.ConcurrenthashmapEx;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx1 {
    public static void main(String[] args) {
        //underlying Ds-> Hash table + linked list/tree bins
        //null keys or values not allowed, Allows Heterogeneous
        //fast with multiple threads
        //put/Remove-> Use CAS (Compare-And-Swap) at the bucket level.
        //If CAS fails (two threads try same bucket), thread falls back to a lock on that bucket only, not the whole map.
        //
        ConcurrentHashMap<Object,Object> map = new ConcurrentHashMap<>();
        map.put("A","value1");
        map.put("C","value5");
        map.put("D","value2");
        map.put("B","value3");
        map.put("F","value4");
        map.put("E","value6");
        //map.put(null,"vb1");
        map.put(10,"Ten1");
        map.put(10,"Ten2");
        map.putIfAbsent(10,"Ten1");
        //map.put("key1",null);
        map.put(20,"Twenty");
        System.out.println(map);
        map.replace("B","Updated Value");
        map.replace("A","value1","Updated Value2");
        map.remove("F","value4");
        map.remove("E");
        System.out.println(map);
    }
}
