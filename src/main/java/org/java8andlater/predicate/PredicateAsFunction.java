package org.java8andlater.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateAsFunction {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Raj","Rado","Gilly","Vokud");

         System.out.println(StringProcessor.filter(list,x->x.startsWith("R")));

        System.out.println(StringProcessor.filter(list,x->x.startsWith("R") || x.startsWith("G")) );

        System.out.println(StringProcessor.filter(list,x->x.startsWith("R") && x.length()==4) );
    }
}
