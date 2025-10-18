package org.java8andlater.Lambda;

public class Test {
    interface Hello {
        void sayHello();
    }

    public static void main(String[] args) {
        // Lambda expression to implement a simple interface
        Hello hello = () -> System.out.println("Hello!");
        hello.sayHello();
    }
}
