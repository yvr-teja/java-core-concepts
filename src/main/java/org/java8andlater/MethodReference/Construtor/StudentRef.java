package org.java8andlater.MethodReference.Construtor;

public class StudentRef {
    private String name;
    public StudentRef(String name){
        System.out.println("With parameter");
        this.name=name;
    }
    public StudentRef(){
        System.out.println("no parameter");
    }
}
