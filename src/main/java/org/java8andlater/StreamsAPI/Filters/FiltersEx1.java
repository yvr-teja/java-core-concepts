package org.java8andlater.StreamsAPI.Filters;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltersEx1 {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("Ravi","Ravi","Sai","Santosh","Gayathri","Hari","Pavan","Bablu")
                .filter(x->x.length()>=4).distinct();
        List<String> collect = stream.collect(Collectors.toList());
        collect.forEach(System.out::println);
       // System.out.println(collect);
    }
}
