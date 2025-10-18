package org.java8andlater.StreamsAPI.CountMinMax;

import java.util.Optional;
import java.util.stream.Stream;

public class CountMinMaxEx1 {
    public static void main(String[] args) {
        Stream<String> s=Stream.of("Ravi","Sai","Gayathri");
        //Count
        long count = s.count();
        System.out.println(count);

        //Max and Min
        Stream<String> stream1=Stream.of("Ravi","Sai","Gayathri");
        Optional min = stream1.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);
        Stream<String> stream2=Stream.of("Ravi","Sai","Gayathri");
        Optional max = stream2.max((s1, s2) -> s1.length() - s2.length());
        max.ifPresent(System.out::println);
    }
}
