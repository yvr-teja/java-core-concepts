package org.java8andlater.StreamsAPI;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamPrimitives {
    public static void main(String[] args) {
        //IntStream with Range
        IntStream intStream=IntStream.range(10,20);
        //intStream.forEach(System.out::println);   // Excluding 20 and prints between 10 and 20

        //IntStream with RangeClosed
        IntStream intStreamClosed=IntStream.rangeClosed(10,20);
        //intStreamClosed.forEach(System.out::println); // Including 10 and 20

        //LongStream with Range
        LongStream longStreamRange = LongStream.range(20,30);
       // longStreamRange.forEach(System.out::println);     // Excluding 30 and prints between 20 and 30

        //LongStream with Range
        LongStream longStreamRangeClose = LongStream.rangeClosed(20,30);
        longStreamRangeClose.forEach(System.out::println);

    }
}
