package org.corejava.passbyvalueandpassbyreference;

public class PassByValue {
    public static void main(String[] args) {
        int a=30;
        System.out.println(a);
        int b;
        b=a;
        System.out.println(b);
        b=20;
        System.out.println(b);
        System.out.println(a);
    }
}
