package org.javacollections.SetEx.SortedSetEx.TreeSetEx;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        //when you need uniqueness + sorted order /range queries.
        //underlying data structure TreeMap(self balanced binary search)
        // maintains natural order --> via comparable
        //Heterogenies will not allow
        //TreeSet treeSet= new TreeSet(Comparator.reverseOrder());  //Reverse order in constructor
        //thread safe --> SortedSet s = Collections.synchronizedSortedSet(new TreeSet());
        TreeSet<Object> treeSet= new TreeSet<>();
        //treeSet.add(null);
        //if null is inserted as first element then we can't add any new elements
        //Exception in thread "main" java.lang.NullPointerException
        treeSet.add("Ravi");
        treeSet.add("Akshay");
        treeSet.add("Arun");
        treeSet.add("Sai");
        treeSet.add("Charan");
       /* treeSet.add(100);
        treeSet.add(20);*/
        //treeSet.add(null);
       // treeSet.add(null);  //from java 7 onwards, null value will not allow in the middle index
        treeSet.add("Ravi");

        System.out.println(treeSet);
        Iterator<Object> l =treeSet.descendingIterator();               //Way: 2
        while (l.hasNext()) {
            System.out.println(l.next());
        }



    }
}
