package org.java8andlater.StreamsAPI.MapAndFlatMap;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<Programmer> programmerList=List.of(
          new Programmer("Ravi",List.of("Java","Python","Anguler")),
                new Programmer("Sai",List.of(".net","Python","Anguler")),
                new Programmer("Hari",List.of("Pega","Python","Anguler")),
                new Programmer("Bhanu",List.of("DevOps","Github","Anguler"))
        );
        //Map
         programmerList
                .stream()
                .map(Programmer::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //Flatmap
        Set<String> collect = programmerList.stream()
                .flatMap(x -> x.getSkills()
                        .stream())
                //.distinct()
                .sorted((o1,o2)->o2.compareTo(o1))
                //.collect(Collectors.toList())
                .collect(Collectors.toSet());
                System.out.println(collect);
        //.forEach(System.out::println);
    }
}
