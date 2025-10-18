package org.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
public class DoubleEvenNumList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,8,10,11,15,16,18);
        int result=0;

        for (Integer n:integerList){
                if(n%2==0) {
                    result += n * 2;
                }
        }
        System.out.println(result);
    }
}
