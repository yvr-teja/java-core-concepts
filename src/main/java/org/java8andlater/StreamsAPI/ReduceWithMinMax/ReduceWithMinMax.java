package org.java8andlater.StreamsAPI.ReduceWithMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceWithMinMax {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(-3,2,3,4,8,5,2);
        Optional<Integer> reduce = ls.stream().reduce((x, y) -> x < y ? x : y);
        System.out.println(reduce);
    }
}
