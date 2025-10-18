package org.corejava.String_StringBuffer_StringBuilder.Strings;

public class StringMemoryDemo {
    public static void main(String[] args) {
        //  Stored in String Constant Pool
        String s1 = "Hello";
        String s2 = "Hello";

        //  Stored in Heap (new object each time)
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        //  Comparisons
        System.out.println("s1 == s2 : " + (s1 == s2)); // true (same reference from pool)
        System.out.println("s3 == s4 : " + (s3 == s4)); // false (different heap objects)
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (pool vs heap)
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true (same content)
        System.out.println("s1.equals(s3) : " + s1.equals(s2)); // true (same content)

        //  Using intern()
        String s5 = s3.intern(); // returns pooled reference
        System.out.println("s1 == s5 : " + (s1 == s5)); // true
    }
}