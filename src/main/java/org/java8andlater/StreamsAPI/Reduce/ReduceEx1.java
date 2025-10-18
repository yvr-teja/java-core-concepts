package org.java8andlater.StreamsAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceEx1 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("AA","AAAAAA","A","AAA","AAAA");
        Optional<String> reduce = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
        System.out.println(reduce);
    }
}
