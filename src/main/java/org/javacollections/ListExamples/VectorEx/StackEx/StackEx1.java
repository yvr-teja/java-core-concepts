package org.javacollections.ListExamples.VectorEx.StackEx;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<Object> stack= new Stack<>();
        stack.add("Ravi");
        stack.add(10);
        stack.add(null);
        stack.add("Sai");

        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());
        System.out.println(stack.peek());
        System.out.println(stack.indexOf(10));
        System.out.println(stack.set(1,20));
        System.out.println(stack.remove(3));
        System.out.println(stack.lastIndexOf(null));
    }
}
