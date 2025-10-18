package org.java8andlater.Function;

import java.util.function.Function;

public class FunctionEx1 {
    public static void main(String[] args) {
        //Function Apply
        Function<String, Integer> function = s -> s.trim().length();
        System.out.println(function.apply("Ravi   "));

        //andThen
        function=function.andThen(a->a/2);
        System.out.println(function.apply("Ravi   "));

        //compose
        Function<Integer, Integer> multiply = s -> s*2;
        Function<Integer, Integer>  add= s -> s+5;
        Function<Integer, Integer> andThenMultiply = multiply.compose(add);

        Integer resultOfAdd=add.apply(5);
        System.out.println(resultOfAdd);
        Integer resultMultiply=multiply.apply(20);
        System.out.println(resultMultiply);
        System.out.println(andThenMultiply.apply(5));

        //identity
        Function<Integer,Integer> identityx=Function.identity();
        System.out.println(identityx.apply(5));
    }
}
