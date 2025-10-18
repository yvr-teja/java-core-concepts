package org.designpatterns.singletonDP;

public class Samosa {
    //approach: Lazy way of creating single object
    private static Samosa samosa;

    //constructor
    private Samosa(){
        System.out.println("Samosa created");
    }
    public static Samosa getSamosa() {
        //Object of this class
       // Samosa samosa = new Samosa();
        if(samosa==null){
            samosa= new Samosa();
        }
        return samosa;
    }
}

/*
* 1.constructor private
* 2.Object create with the help of method(method should be static)
* 3.create field to store object is private(variable should be static)
* */
