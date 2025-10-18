package org.java8andlater.Lambda;

// Functional Interface
@FunctionalInterface
interface Sum {
    void add();
    default void sub(){
        System.out.println("sub");
    };
    static void mul(){
        System.out.println("mul");
    }
}

// Marker Interface
interface Marker {
    // No methods or fields
}

public class LambdaEx {
    public static void main(String[] args) {
        Sum sum = () -> System.out.println("testing lambda");
        sum.add();

        // Example class using the marker interface
        class MyClass implements Marker {
            // Marker functionality can be used for specific runtime checks
        }

        MyClass myClass = new MyClass();

        // Using 'instanceof' to check marker functionality
        if (myClass instanceof Marker) {
            System.out.println("MyClass is marked with Marker interface");
        }
    }
}