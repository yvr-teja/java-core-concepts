package org.java8andlater.fuctionalinterface.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringProcessor {
    static List<String> filter(List<String> list, Predicate<String> preedicate){
        return list.stream().filter(preedicate::test).collect(Collectors.toList());
    }
}
