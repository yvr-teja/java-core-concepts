package org.java8andlater;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertPrimitiveToCollections {
    public static void main(String[] args) {
        List<String> names=Stream.of("Ravi","Sai","Hari","Srinivas","Teja",null)
                .map(Optional::ofNullable)
                .distinct()
                .skip(1)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        System.out.println(names);
        names.forEach(System.out::println);

        List<Integer> integerList= IntStream.of(1,2,3,4,5)
                .mapToObj(Integer::valueOf)
                //.boxed() //Alternative
                .collect(Collectors.toList());
        //integerList.forEach(System.out::println);
    }
}
