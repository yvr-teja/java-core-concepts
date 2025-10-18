package org.java8andlater.StreamsAPI.Traversal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TraversalMain {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> numberGreaterthan3 = data.stream().filter(x->x<=3);
        //1st time
        numberGreaterthan3.forEach(System.out::println);
        //2nd time
        numberGreaterthan3.forEach(System.out::println);
    }
}
