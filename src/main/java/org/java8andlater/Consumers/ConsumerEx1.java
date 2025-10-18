package org.java8andlater.Consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
    public static void main(String[] args) {
        Consumer<String> print =x-> System.out.println(x);
        print.accept("Ravi");

        //List of Data
        List<String> list = Arrays.asList("Ravi","Sam","Rajesh","Kurien");
        List<Integer> integerListlist = Arrays.asList(20,40,30,11,24,57,55);
        Consumer<String> consumer=(String x)-> System.out.println(x);
        Consumer<Integer> consumer2=(Integer x)-> System.out.println(x);
        forEach(list,consumer);
        forEach(integerListlist,consumer2);
    }
    static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T s:list){
            System.out.println(s);
        }
    }
}
