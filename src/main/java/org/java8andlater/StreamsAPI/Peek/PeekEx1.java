package org.java8andlater.StreamsAPI.Peek;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PeekEx1 {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 15)
               // .peek(n -> System.out.println("Original Element" + n))
                .map(n -> n * 2)
                //.peek(n -> System.out.println("multiply by 2:  " + n))
                .filter(n -> n % 2 == 0)
               // .peek(n -> System.out.println("Divisible by 2:   " + n))
                .sum();
        //System.out.println(sum);
        String arr[]={"Ravi","Sai","Hari","Charan","Hari","Ravi"};

        HashMap<String,Integer> occurence= new HashMap<>();

        for (String t :arr ){
            occurence.put(t,occurence.getOrDefault(t,0)+1);
        }
       // System.out.println(occurence);
       for (String name: occurence.keySet()){
         //  System.out.println(name+"->"+occurence.get(name));
       }
        Map<String, Long> collect = Arrays.stream(arr)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

       collect.forEach((k,v)-> System.out.println(k+" -> "+v));
    }
}
