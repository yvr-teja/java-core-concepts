package org.javacollections.SetEx.HashsetEx.LinkedhashSetEx;

import java.util.LinkedHashSet;

public class LinkedHashsetEx1 {
    public static void main(String[] args) {
        //underlying DS -> hashtable + linkedlist
        // hashtable-> for faster loopup and uniqueness
        // linked list-> uses Doubly LinkedList for preserving order
        //when you need uniqueness + insertion order.
        LinkedHashSet<Object> linkedHashset=new LinkedHashSet<>();
        linkedHashset.add("Satish");
        linkedHashset.add(10);
        linkedHashset.add("Ravi");
        linkedHashset.add("Prasad");
        linkedHashset.add("Prasad");
        linkedHashset.add("Sai");
        linkedHashset.add("HariBabu");
        linkedHashset.add("HariBabu");
        linkedHashset.add("HariBabu");
        linkedHashset.add(null);
        linkedHashset.add(null);

        System.out.println(linkedHashset);
    }
}
