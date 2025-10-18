package org.corejava.ArrayPrograms;

public class IntorductionArray {

    public static void main(String[] args) {
        int[] arr=new int[2];
        arr=new int[] {0,1};
        
        //for(int i=0;i<n-1;i++){
        for(int i : arr){
            System.out.println(arr[i]);
        }
    }
}
