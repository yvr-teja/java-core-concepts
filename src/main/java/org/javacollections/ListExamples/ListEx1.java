package org.javacollections.ListExamples;


import java.util.*;

public class ListEx1 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Satish");
        ls.add("Bharth");
        ls.add("Charan");
        ls.add("Prasad");
        ls.add("Faraz");
        ls.add("Eshwar");
        ls.add("Ravi");
        ls.add("Ravi");
        ls.add("Sai");
        ls.add("Shravani");
        ls.add("Akshay");

        //Way 1:-
        Iterator<String> iterator = ls.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();  // Retrieve element
            System.out.println(element);

        }
        System.out.println("---------------");

        //Way 2:-
        ListIterator<String> listIterator = ls.listIterator();
        System.out.println("--Forward--");
        while(listIterator.hasNext()) {

            System.out.println(listIterator.next());
        }
        System.out.println("--Backward--");
        while(listIterator.hasPrevious()) {

            System.out.println(listIterator.previous());

        }
        System.out.println("---------------");

        //Way 3:-
        for (String element : ls) {
            System.out.println(element);

        }
        System.out.println("---------------");
        //Way 4:-
        for (int i = 0; i < ls.size(); i++) {
            String element = ls.get(i);
            System.out.println(element);
        }

        //Safe Removal of elements using iterator
        //Way 1:-
        System.out.println("------Removal Way:1---------");
        Iterator<String> it = ls.iterator();        // Safe removal
        while (it.hasNext()) {
            String element = it.next();
            if (element.startsWith("Z")) {
                it.remove();
            }
        }
        System.out.println(ls);

        System.out.println("------Removal Way:2---------");
        //Way 2:-
        ls.removeIf(i -> i.equals("Shravani")); // Clean and safe
        System.out.println(ls);

        System.out.println("---------------");
        //Sorting
        Collections.sort(ls);  // Sorts list in natural ascending order
        System.out.println(ls);
        System.out.println("---------------");
        // Sort in reverse (descending) order
        Collections.sort(ls, Collections.reverseOrder());
        System.out.println(ls);

        //Finding of Element
        System.out.println("---------------");
        boolean hasCharan = ls.contains("Charan");
        int index = ls.indexOf("Akshay");

        System.out.println("Charan String is Present or not : "+hasCharan);
        System.out.println("Index of Akshay: "+index);
        System.out.println("Last index of List ls: "+ls.lastIndexOf("Akshay"));

        //Conversion
        //List To array
        System.out.println("List to Array Conversion");
        String[] array = ls.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s);
        }
        // From array to List
        System.out.println("Array to List Conversion");
        List<String> newList = Arrays.asList(array);
        System.out.println(newList);

        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> list2 = new ArrayList<>(Arrays.asList("D", "E"));

        // Merging
        list1.addAll(list2);
        System.out.println(list1);
        // Iterating merged list
        list1.forEach(System.out::print);

    }
}
