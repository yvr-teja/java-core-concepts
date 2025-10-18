package org.java8andlater.optional;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getName(String name){
      Optional<String> result= Optional.ofNullable(name).or(()->Optional.of("String of Null"));
        return result;
    }
    public static void main(String[] args) {
        String name="Ravi Teja";
        Optional<String> optionalVal =getName(name) ;
        String finalName= optionalVal.map(String::toUpperCase).orElse("Default value");
        System.out.println(finalName);
    }
}
