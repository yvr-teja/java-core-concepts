package org.javacollections.MapEx.SortedMapEx;

import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx1 {
    public static void main(String[] args) {
        //Underlying DS->
        //Natural ordering, if need a custom Comparator passed during construction to the constructor
        //SortedMap sortedMap = new TreeMap(Comparator.reverseOrder());
        //
        SortedMap sortedMap = new TreeMap();
        // sortedMap.put(null,"vb0");
        sortedMap.put("A","value1");
        sortedMap.put("C","value5");
        sortedMap.put("D","value2");
        sortedMap.put("B","value3");
        sortedMap.put("F","value4");
        sortedMap.put("E","value6");
       // sortedMap.put(null,"vb1");
       // sortedMap.put(null,"vb2");
        sortedMap.put("key","value");
        sortedMap.put("key1",null);
        //sortedMap.put("key2","");
        System.out.println("SortedMap: " +sortedMap);
        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());
        System.out.println("HeadMap(<3): " + sortedMap.headMap("D"));
        System.out.println("TailMap(>=2): " + sortedMap.tailMap("B"));
        System.out.println("SubMap(1 to 3): " + sortedMap.subMap("B","F"));
    }
}
