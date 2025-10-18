package org.javacollections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStringWithCommaToList {
    public static void main(String[] args) {
        String config = "DEV,TEST,PROD";
        Stream<String> environments = Stream.of(config.split(","))
                .map(String::trim)
                .filter(env -> !env.equals("TEST"));
       /* for (String s : environments.collect(Collectors.toList())) {
            System.out.println(s);
        }*/
        List<String> li =environments.collect(Collectors.toList());
        System.out.println(li);

        //System.out.println(environments.collect(Collectors.toList()));
/*        String config = "DEV,TEST,PROD";
        Stream<String> environments = Stream.of(config.split(","))
                .map(String::trim)
                .filter(env -> !env.equals("TEST"))    // Exclude TEST
                .forEach(System.out::println);
*/

    }
}
