package org.javacollections.MapEx.ConcurrentMapEx;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapEx1 {
    public static void main(String[] args) {
        ConcurrentMap<Object, Object> concurrentMap= new ConcurrentHashMap<>();
        concurrentMap.put("A","value1");
        concurrentMap.put("C","value5");
        concurrentMap.put("D","value2");
        concurrentMap.put("B","value3");
        concurrentMap.put("F","value4");
        concurrentMap.put("E","value6");
        // concurrentMap.put(null,"vb1");
        // concurrentMap.put(null,"vb2");
        concurrentMap.put(10,"Ten1");
        concurrentMap.put(10,"Ten2");
        concurrentMap.putIfAbsent(10,"Ten1");
        //concurrentMap.put("key1",null);
        concurrentMap.put(20,"Twenty");
       // concurrentMap.put(null,"value");
        System.out.println(concurrentMap);
        concurrentMap.replace("B","Updated Value");
        concurrentMap.replace("A","value1","Updated Value2");
        concurrentMap.remove("F","value4");
        concurrentMap.remove("E");
        System.out.println(concurrentMap);

    }
}
