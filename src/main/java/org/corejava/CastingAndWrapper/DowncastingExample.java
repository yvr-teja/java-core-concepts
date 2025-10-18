package org.corejava.CastingAndWrapper;

public class DowncastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting
        Dog dog = (Dog) animal;      // Downcasting (explicit)
        dog.sound();  // Now we can call Dog's method

        /*
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Safe downcasting
            dog.sound();
        }
        */
    }
}

