package org.javacollections.ListExamples.ArrayListEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    public class ExamplesOfArrayListP1 {
        public static void main(String[] args) {
            //ArrayList
    /*
            // Coding to an interface
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            // Can easily change to LinkedList
            list = new LinkedList<>(list);

            // Tightly coupled to ArrayList
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            // Cannot easily switch to LinkedList without changing the declaration
            // arrayList = new LinkedList<>(); // Compilation error
    */

            // int[] arr= new int[10]; //Array - size would be declared while initialization of variable

            List<String> list = new ArrayList<>();
            System.out.println(list.getClass().getName());
            //StringBuffer checkDupStr =new StringBuffer();
            List<String> list1= Arrays.asList("Monday","Tuesday");
            System.out.println(list1.getClass().getName());
            String[] arr= {"Apple","Banana","mango"};
            List<String> list2= Arrays.asList(arr);
            System.out.println(list2.getClass().getName());
           /* //System.out.println(list2.toString());
           String values="";
            for (int i=0;i<list2.size();i++){
               // System.out.println(list2.get(i));
                if(i>0){
                    values+=",";    // This makes first index to skip appending comma
                }
                values+=list2.get(i);
            }
            System.out.println(values);*/

            list1.add(0,"string");
          //  list1.add(0,"Monday");
            System.out.println(list1);
        }
    }
