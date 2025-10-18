package org.java8andlater.StreamsAPI.Sorted;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEx1 {
    public static void main(String[] args) {
        Stream<String> s=Stream.of(
          "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
        );
        //s.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> listEx= Arrays.asList(
                "Ravi","Sai","Gayathri","Bhanu"
        );
        listEx.stream().sorted().forEach(System.out::println);

        List<String> collect = listEx.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        collect.forEach(System.out::println);


        List<String> originalList = new ArrayList<>();
        originalList.add("Ravi");
        originalList.add("Sai");
        originalList.add("Gayathri");
        originalList.add("Bhanu");
        originalList.add("Charan");
        originalList.add("Hari");
        System.out.println("Original List"+originalList);

        List<String> resultList =new ArrayList<>(originalList);
        Collections.reverse(resultList);

        System.out.println("Final Result"+resultList);

        List<String> collect1 = resultList.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
        System.out.println("Reverse order alphabetical");
        collect1.forEach(System.out::println);


    }
}
