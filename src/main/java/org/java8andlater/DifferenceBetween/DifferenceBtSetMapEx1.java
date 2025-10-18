package org.java8andlater.DifferenceBetween;

import java.util.*;

public class DifferenceBtSetMapEx1 {
    public static void main(String[] args) {
        // Map Example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(3, null);
        map.put(null, "Testing");
        map.put(2, "Banana");
        map.put(1, "Mango");  // Key 1 gets replaced with Mango
        map.put(null, "Final Testing");
        System.out.println("Map: " + map);  // {1=Mango, 2=Banana}

        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate ignored\
        set.add(null);

        Iterator<String> iterator = set.iterator();
       /* while (iterator.hasNext()) {
            String element = iterator.next();
            if (element == null) {
                iterator.remove();
            } else {
                System.out.println(element);
            }
        }*/
        System.out.println("Set: " + set);  // [Apple, Banana]
    }
}
