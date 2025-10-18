package org.java8andlater.StreamsAPI.Distinct;

import java.util.stream.Stream;

public class DistinctEx1 {
    public static void main(String[] args) {
        Stream<String> ds=Stream.of("Ravi","Sai","Ravi","Sai","Gayathrti","Bhanu");
        ds.distinct().forEach(System.out::println);

        Stream<Integer> ds1=Stream.of(1,2,3,4,5,6,2,5,6,2,1,3,5,7);
        ds1.distinct().forEach(System.out::println);
    }
}
