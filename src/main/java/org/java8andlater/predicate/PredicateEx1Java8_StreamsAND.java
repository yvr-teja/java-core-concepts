package org.java8andlater.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx1Java8_StreamsAND {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 6, 4, 7, 8, 9, 5,12,15,13,10);
        Predicate<Integer> greaterthan5 = x->x>5;
        Predicate<Integer> lessthan5 = x->x<10;
        List<Integer> valueGreater5 = integerList.stream()
                // .filter(x -> x > 5) //Expression
                .filter(greaterthan5.and(lessthan5)) //Predicate
                .collect(Collectors.toList());

        System.out.println(valueGreater5);
    }
}
