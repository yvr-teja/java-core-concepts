package org.java8andlater.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx2Java8_StreamsOR {
    public static void main(String[] args) {
        List<String> names
                = Arrays.asList("Ravi","Sai","Rajesh","Ramesh","Sam","Santosh","Somesh");
        Predicate<String> nameStringR=x->x.startsWith("R");
        Predicate<String> nameStringEndI=x->x.endsWith("i");
        List<String> filteredNames = names.stream()
                .filter(nameStringR.or(nameStringEndI))
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
