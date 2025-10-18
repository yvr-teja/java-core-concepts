package org.java8andlater.MethodReference.Construtor;

public class MainRef {
    public static void main(String[] args) {
        StudentEmpty studentEmpty= StudentRef::new;
        System.out.println(studentEmpty.get());

        StudentWithName studentWithName = StudentRef::new;
        System.out.println(studentWithName.get("Ravi"));
    }
}
