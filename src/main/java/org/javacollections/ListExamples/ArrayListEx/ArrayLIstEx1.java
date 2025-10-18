package org.javacollections.ListExamples.ArrayListEx;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayLIstEx1 {
  public static void main(String[] args) {
        //Underlying DS-> array
        //Allows Heterogeneous, Duplicate, Null values. Preserve insertion order
        // Implements Serializable and Clonable, RandomAccess interface
        //ArrayList is the Best choice if our frequent retrieve operation and worst for Frequent insertion
        //Default capacity - 10 and grows by 1.5 times of old size (formula =(cc*3/2)+10)
        //
        ArrayList fruits = new ArrayList<>();
        // Adding elements
        fruits.add("Apple");        //1
        fruits.add(10);       //3
        fruits.add(null);        //4
        fruits.add(0,"Berry");  //0
        fruits.add(4,"Cherry"); //5
        fruits.add(2,"Pinapple"); //2

        //0(First) , 5(Last) - changes are done, no impact on performance
        //Since we are inserting in the middle of an arraylist with index 2.
        // all the remaining elements has to shift the index

        System.out.println("index based retrieve: "+fruits.get(2));



        /*// Accessing elements
        System.out.println(fruits.get(1)); // Banana

        // Updating elements
       // fruits.set(1, "Blueberry");

        // Removing elements
        //fruits.remove("Apple");

        // Iterating
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking size
        System.out.println("Size: " + fruits.size());

        // Searching
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Clearing
        fruits.clear();
        System.out.println("Is empty? " + fruits.isEmpty());*/

        ArrayList l1=new ArrayList();
        LinkedList l2=new LinkedList ();
        System.out.println (l1 instanceof Serializable); //true
        System.out.println (l2 instanceof Cloneable);   //true
        System.out.println (l1 instanceof RandomAccess); //true
        System.out.println (l2 instanceof RandomAccess); //false

        ArrayLIstEx1 arrayLIstEx1  = new ArrayLIstEx1();
       // System.out.println(arrayLIstEx1 instanceof  TestInterface);
        // instance --> checking if the class implemented interface or not

    }
}
