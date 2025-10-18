package org.java8andlater.StreamsAPI.FindAnyAndFirst;

import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyFirstEx1 {
    public static void main(String[] args) {
   //FindFirstnumber
   Optional findFirstNumber =Stream.of(9, 5, 8, 7, 4, 9, 2, 11, 4)
           .filter(n->n%2==0)
           .findFirst();
        System.out.println(findFirstNumber);

    //FindAny
        Optional findAny =Stream.of(9, 5, 8, 7, 4, 9, 2, 11, 4)
                .parallel()
                .filter(n->n%2==0)
                .findAny();
        System.out.println(findFirstNumber);

    }
}
