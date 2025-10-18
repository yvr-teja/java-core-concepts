package org.java8andlater.Lambda;

public class LambdaClass {
    public static void main(String[] args) {
        // Lambda expression to implement a simple interface
        MyFunctionalInterface greet = (name) -> System.out.println("Hello, " + name + "!");
        String firstname="charan";
        greet.sayHello(firstname);
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello(String name);
}