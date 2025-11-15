package org.javacollections.SetEx.HashsetEx;

import java.util.HashSet;

public class HashsetEx1 {
    public static void main(String[] args) {
        //hashset is backed by hashmap which uses hashtable, underlying DS-> hashtable
        //insertion order not preserved, Duplicates not allowed, heterogeneous allowed
        //null insertion is possible - but only one element is inserted
        //implements Serializable and Clonable interface, but no RandomAccess Implementation
        //HashSet is the best choice, if our frequent operation is Search operation, but not frequent insertion
        //when you just need uniqueness + speed + do not preserve order.
        /*
        * Constructors of HashSet
            1) HashSet h = new HashSet();
            - Creates an empty HashSet object with default initial capacity 16
            & default Fill Retio 0.75

            2) HashSet h = new HashSet(int initalCapacity);
            - Creates an empty HashSet object with specified initial capacity
            & default Fill Retio 0.75

            3) HashSet h = new HashSet(int initalCapacity, float loadFactor);
            - Creates an empty HashSet object with specified initial capacity
            & specified Load Factor (or Fill Ratio)

            4) HashSet h = new HashSet(Collection c);
            - For inter conversion between Collection objests.
        * */
        HashSet<Object> hashSet=new HashSet<>();
        hashSet.add("Sai");
        hashSet.add(10);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("Sai");

        //System.out.println(hashSet.size());
        System.out.println(hashSet.hashCode());
        for (Object item : hashSet) {
           System.out.println(item);
            //System.out.println(item.hashCode());
        }
        System.out.println(hashSet.stream().sorted());
        System.out.println(hashSet);
    }
}
