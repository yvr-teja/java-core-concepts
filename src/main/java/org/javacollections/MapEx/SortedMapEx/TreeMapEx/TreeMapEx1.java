package org.javacollections.MapEx.SortedMapEx.TreeMapEx;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Object, Object> treeMap= new TreeMap<>();
        treeMap.put(1,"Ravi");
        treeMap.put(5,"Sai");

        System.out.println(treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());  
        System.out.println(treeMap.headMap(3));
        System.out.println(treeMap.tailMap(3));
        System.out.println(treeMap.subMap(1,5));
        
    }
}
