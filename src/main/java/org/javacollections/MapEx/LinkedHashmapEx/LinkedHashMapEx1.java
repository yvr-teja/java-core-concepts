package org.javacollections.MapEx.LinkedHashmapEx;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        //underlying DS-> hashtable + Double LinkedList
        //Insertion order preserves, no duplicates are allowed in keys, if a duplicate key is inserted new val replaces old val.
        //one null key, multiple null values allowed
        //LinkedHashMap linkedHashMap =new LinkedHashMap(10(Initial_Capaity),0.2F(Load_factor),true(AccessOrder));
        LinkedHashMap<Object, Object> linkedHashMap =new LinkedHashMap<>();
        linkedHashMap.put(null,"1");
        linkedHashMap.put(null,"2");
        linkedHashMap.put(10,"TEN21");
        linkedHashMap.put(20,"Twenty");
        linkedHashMap.put("Test","1");
        linkedHashMap.put("Test","2");
        linkedHashMap.put(10,"TEN2");


        System.out.println(linkedHashMap);
        //most recent accessed keys moves to end, by using accessorder(Boolean: true/false)
        System.out.println(linkedHashMap.get(null));
        System.out.println(linkedHashMap.get(10));
        System.out.println(linkedHashMap);
       /* for (Object entryObject : linkedHashMap.entrySet()) {
            Map.Entry entry = (Map.Entry) entryObject;
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }*/

    }
}
