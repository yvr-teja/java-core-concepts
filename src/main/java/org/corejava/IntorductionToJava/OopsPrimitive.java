package org.corejava.IntorductionToJava;

public class OopsPrimitive {
    public static void main(String[] args) {
        Class<?> intClass = int.class;               // Represents primitive int
        Class<?> doubleClass = double.class;         // Represents primitive double
        Class<?> longClass = long.class;            // Represents primitive long

        System.out.println(intClass.getName());      // int
        System.out.println(doubleClass.getName());   // double
        System.out.println(longClass.getName());    // long
    }
}
