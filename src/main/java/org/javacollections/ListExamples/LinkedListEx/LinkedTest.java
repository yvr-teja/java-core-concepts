package org.javacollections.ListExamples.LinkedListEx;

import java.util.LinkedList;

public class LinkedTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);          //O(n) //here n=2
        linkedList.addFirst(0);  //O(1)
        linkedList.addLast(4);   //O(1)
        System.out.println(linkedList.toString());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.remove(3);
        System.out.println(linkedList);
    }
 }
