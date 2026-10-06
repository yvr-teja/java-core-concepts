package org.InterviewQuestions.removeDuplicates.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Sai", "Teja", "Sai", "Sai", "Teja"};

        // Using streams
        String[] distinct = Arrays.stream(names)
                .distinct()
                .toArray(String[]::new);
        System.out.println(Arrays.toString(distinct));

        String[] distinctLinked = Arrays.stream(names)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .toArray(new String[0]);
        System.out.println(Arrays.toString(distinctLinked));

        // Using for loop
        int len = names.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (names[i].equals(names[j])) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                names[index++] = names[i];
            }
        }
        String[] unique = Arrays.copyOf(names, index);
        System.out.println(Arrays.toString(unique));

        // Using streams with map
        Map<String,Long> counts2= Arrays.stream(names)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(counts2);
    }
}