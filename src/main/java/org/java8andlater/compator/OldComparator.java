package org.java8andlater.compator;

import java.util.ArrayList;
import java.util.Collections;

public class OldComparator
{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(2);
        al.add(8);
        al.add(5);
        al.add(7);
        al.add(4);
        al.add(9);
        System.out.println("before Array compared and sort"+al);

        //before Java 8
       /* Collections.sort(al,new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1 - num2;
            }
        } );
        System.out.println("Without java 8 features"+al);*/

        //After java 8 features
        Collections.sort(al,( num1,  num2)->(num1>num2)?1:(num1<num2)?-1:0);
        System.out.println("With Java 8 features"+al);
    }
}

