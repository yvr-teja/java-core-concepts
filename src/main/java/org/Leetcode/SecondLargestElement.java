package org.Leetcode;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr ={1,3,45,23,15,17,4,6};
        int len=arr.length;
        System.out.println("no of elements"+len);
        for (int i=len-1;i>=0;i--){
            if(arr[i] !=arr[len-1]){
                System.out.println(arr[i]);
            }
        }

        //int[] arr = {12, 35, 1, 10, 34, 1};

        OptionalInt secondLargest = Arrays.stream(arr)
                .distinct() // Remove duplicates
                .boxed() // Convert to Stream<Integer>
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1) // Skip the first largest element
                .mapToInt(Integer::intValue) // Convert back to int
                .findFirst(); // Get the second largest

        System.out.println("Second Largest: " + (secondLargest.isPresent() ? secondLargest.getAsInt() : "Not Found"));
    }
}
