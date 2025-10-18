package org.javacollections.ListExamples.VectorEx;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        vector.add("A");
        vector.add(10);
        vector.add("B");
        vector.add("C");
        System.out.println(vector);
        boolean b = vector.removeElement("C");
        System.out.println(b);
        vector.set(3,"D");
        System.out.println(vector);
        vector.removeAllElements();
        vector.clear();
        System.out.println(vector);

    }
}
