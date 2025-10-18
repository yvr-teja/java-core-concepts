package org.java8andlater.predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,String> biPredicate
                =(n,s)->{
            if(n==Integer.parseInt(s))
                return true;
            return false;
        };
        BiPredicate<Integer,String> biPredicateGreater
                =(n,s)->{
            if(n>=Integer.parseInt(s))
                return true;
            return false;
        };
        BiPredicate<Integer,String> biPredicate2
                =biPredicate.and(biPredicateGreater);
        BiPredicate<Integer,String> biPredicate3
                =biPredicate.negate();

        System.out.println(biPredicate.test(3,"3"));
        System.out.println(biPredicateGreater.test(3,"2"));
        System.out.println(biPredicate2.test(4,"4"));
        System.out.println(biPredicate3.test(3,"3"));
    }
}
