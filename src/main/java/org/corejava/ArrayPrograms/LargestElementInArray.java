package org.corejava.ArrayPrograms;
public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        int largest = arr[0];
        for(int i=0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + largest);
      
    }
}