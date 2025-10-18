package org.corejava.CastingAndWrapper;

class Animal {
    String name;
    String age;
    public void makeSound(){
        System.out.println("Some Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    String bread;
    void makeSoundMeow()
    {
        System.out.println("making cat sound");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting: Dog is automatically upcast to Animal
        animal.makeSound();  // Calls Dog's sound method due to polymorphism
    }
}
