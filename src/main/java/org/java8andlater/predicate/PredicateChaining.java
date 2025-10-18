package org.java8andlater.predicate;

import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<String> startwithA= x->x.startsWith("A");
        Predicate<String> startwithB= x->x.startsWith("B");
        //output:Ture
        boolean result = startwithA.or(startwithB).test("AA");
        System.out.println(result);
        //output:False
        boolean result1 = startwithA.or(startwithB).test("CA");
        System.out.println(result1);
    }
}
