package Loops;

import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
        //for loop
        /* for(initial variable, condition, increment/decrement)
        */
        ArrayList<String> newArrList = new ArrayList<>();
        newArrList.add("Venkata");
        newArrList.add("Ravi");
        newArrList.add("Teja");

        int count=newArrList.size();
        newArrList.stream().sorted();
        for (int i = 0; i < count; i++) {
        //    System.out.println(newArrList.get(i));
        }

        //i=1, i=2, i=3, i=4, i=5, i=6;
        int i=1;
        for ( i=1;i<6;i++){
            System.out.println(i);
        }
        //System.out.println(i);

    }
}