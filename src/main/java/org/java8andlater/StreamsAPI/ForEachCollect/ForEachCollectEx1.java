package org.java8andlater.StreamsAPI.ForEachCollect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachCollectEx1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java","Hibernate","Angular");
        //stream.forEach(System.out::println);

        //Collects
        stream.filter(x -> x.startsWith("A"))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
