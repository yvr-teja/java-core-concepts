package org.java8andlater.BiFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionEx1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer,Double> add= (a,b)-> (double) a+b;
        Double result=add.apply(38,21)/2;
        System.out.println(result);
        
        BiFunction<Integer, Integer, List<Integer>> function2= (a,b)-> Arrays.asList(a,b);
        List<Integer> result1=function2.apply(2,3);
        System.out.println(result1);
    }
}
