package org.javacollections.ListExamples.LinkedListEx;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        //Underlying DS-> Double Linked list
        //Allow duplicates, Heterogeneous(null values allowed), insertion order preserved.
        //Implements Serializable and Clonable, but not RandomAccess interface
        //LinkedList is the best choice if our frequent operation is insertion or deletion in the middle.
        //LinkedList is the worst choice if our frequent operation is retrieve operation.

        LinkedList<Object> linkedList =new LinkedList<>();
        linkedList.add("Ravi");
        linkedList.add(10);
        linkedList.add("Satish");
        linkedList.add(null);
        linkedList.set(2,"Prasad");

        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
    }
}
