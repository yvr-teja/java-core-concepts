package org.java8andlater.StreamsAPI.SkipAndLimit;

import java.util.stream.Stream;

public class SkipAndLimitEx1 {
    public static void main(String[] args) {
        Stream<Integer> integerStream=Stream.iterate(1,n->n+1);
        integerStream.limit(20)
                .skip(10)
                .forEach(System.out::println);
    }
}
