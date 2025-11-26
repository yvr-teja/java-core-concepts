package org.corejava.memorymanagement.stackExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StackEx1 {
    public static void main(String[] args) {
        int value = 7;
        value = calculate(value);
        System.out.println(value);
    }
    public static int calculate(int data) {
        int tempValue=data+3;
        int newValue=tempValue*2;
        return newValue;
    }
}
/*
    5 important points about Stack Memory in Java:
    ====================================================
    1.Stores method-level data
        → Local variables, method parameters, and references are stored in the stack.
    2.Follows LIFO (Last In, First Out)
        → Each method call creates a *stack frame*; when the method ends, its frame is removed.
    3.Fast memory allocation
        → Stack operations (push/pop of frames) are very fast compared to heap memory.
     4.Scoped & automatically freed
        → Memory is released automatically when the method finishes—no garbage collection needed.
     5.Size is limited → StackOverflowError
        → Deep recursion or too many nested calls can exhaust stack space and cause `StackOverflowError`.
 */