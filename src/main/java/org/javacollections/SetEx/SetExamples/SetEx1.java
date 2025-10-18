package org.javacollections.SetEx.SetExamples;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<Object> set=new HashSet<>();
        set.add("Sai");
        set.add(10);
        set.add("Sai");
        set.add(null);
        set.add(20);
        System.out.println(set.size());
        System.out.println(set);

    }
}
