package org.InterviewQuestions;

import java.util.stream.IntStream;

public class MultipleOfN {
    public static void main(String[] args) {
        // Using filter
        IntStream.rangeClosed(5, 50)
                .filter(n -> n % 5 == 0)
                .forEach(i -> System.out.println(
                        "5 X " + (i / 5) + " = " + i
                ));
                //.forEach(System.out::println);

        //using for loop
        for (int i = 5; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println("5 X " + (i / 5) + " = " + i);
            }
        }
    }
}
