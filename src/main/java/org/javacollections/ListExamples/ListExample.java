package org.javacollections.ListExamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample {
    public static void main(String[] args) {

        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("ArrayList Item 1");
        arrayList.add("ArrayList Item 2");
        // Using LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("LinkedList Item 1");
        linkedList.add("LinkedList Item 2");
        // Using Arrays.asList
        List<String> arraysList = Arrays.asList("Arrays Item 1", "Arrays Item 2", "Arrays Item 3");
        // Using Collections.singletonList
        List<String> singletonList = Collections.singletonList("Singleton Item");
        // Using Stream.of
        List<String> streamList = Stream.of("Stream Item 1", "Stream Item 2", "Stream Item 3") .collect(Collectors.toList());
        // Using List.of (Java 9 and later)
        List<String> listOf = List.of("List.of Item 1", "List.of Item 2", "List.of Item 3");
        // Printing the lists to show their contents
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Arrays.asList: " + arraysList);
        System.out.println("Collections.singletonList: " + singletonList);
        System.out.println("Stream.of: " + streamList);
        System.out.println("List.of: " + listOf);


    }
}
