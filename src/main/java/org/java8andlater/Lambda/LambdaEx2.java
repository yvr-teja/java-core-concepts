package org.java8andlater.Lambda;

import java.util.Optional;
import java.util.function.Function;

public class LambdaEx2 {
    public static void main(String[] args) {
        String emailId="ravi.yedlapalli@gmail.com";
        Function <String, Boolean> function = email ->
                Optional.ofNullable(email)
                .map(String::trim)
                .filter(e -> !e.isEmpty())
                        .isPresent();
        System.out.println(function.apply(emailId));
        Function<String, Integer> function1 = a ->a.trim().length();
        System.out.println(function1.apply("Ravi    "));
    }
}
