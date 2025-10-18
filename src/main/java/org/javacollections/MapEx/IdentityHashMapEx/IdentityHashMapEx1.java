package org.javacollections.MapEx.IdentityHashMapEx;

import java.util.IdentityHashMap;

public class IdentityHashMapEx1 {
    public static void main(String[] args) {
        //Underlying DS-> resizable array(flat array) to store entries
        //Keys and values are stored in adjacent pairs
        //It uses reference equality (==) instead of object equality (equals()) for comparing keys.
        //HashMap → two keys are equal if key1.equals(key2) is true.
        //IdentityHashMap → two keys are equal only if key1 == key2 (same memory reference).
        //If collision → linear probing (searches for the next empty slot).
        //Retrieval (get): (reference equality) to check keys in the array.
        //One null key allowed, multiple null values allowed, No insertion order
        //When you care about object identity rather than logical equality.
        //Often used for object graph traversals, serialization frameworks, or interning.

        String a1 = new String("A");
        String a2 = new String("A");
        IdentityHashMap<Object, Object> identityHashMap =new IdentityHashMap<>();
        identityHashMap.put("k1","V1");
        identityHashMap.put("k2","V2");
        identityHashMap.put("k3","V3");
        identityHashMap.put("k4","V4");
        identityHashMap.put(null,"One");
        identityHashMap.put(null,"Two");
        identityHashMap.put(10,"Ten1");
        identityHashMap.put(10,"Ten2");
        identityHashMap.put(20,"Twenty");
        identityHashMap.put("k5",null);
        identityHashMap.put("k6",null);
        System.out.println("A1 : "+a1.hashCode());
        System.out.println("A2 : "+a2.hashCode());
        identityHashMap.put(a1.intern(), "First A");
        identityHashMap.put(a2.intern(), "Second A");
        System.out.println(identityHashMap);

        //{k2=V2, k3=V3, null=Two, A=Second A, 10=Ten2, k6=null, k1=V1, A=First A, 20=Twenty, k5=null, k4=V4}
    }
}
