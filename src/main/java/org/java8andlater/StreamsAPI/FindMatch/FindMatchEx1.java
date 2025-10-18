package org.java8andlater.StreamsAPI.FindMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindMatchEx1 {
    public static void main(String[] args) {
        List<String> listofskill = Arrays.asList(
                "core Java","Spring Boot","Hibernate","Angular","Java 8","Java script"
        );
        Predicate<String> predicate=x->x.startsWith("Java");
        //In general This will be used to check the URLS, it is one of the realtime example
        System.out.println(listofskill.stream().anyMatch(predicate));
        System.out.println(listofskill.stream().allMatch(predicate));
        System.out.println(listofskill.stream().noneMatch(predicate));
    }
}
