package org.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
public class DoubleEvenNumListJava8 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,8,10,11,15,16,18);
         System.out.println(integerList.stream()
                 .filter(number -> number % 2 == 0)
                 .mapToInt(e -> e * 2)
                 .sum());

    }
}
