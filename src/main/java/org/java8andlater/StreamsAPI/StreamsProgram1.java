package org.java8andlater.StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsProgram1 {
    public static void main(String[] args) {
        //Java 7 or Before Java 8
        List<Dish> menu = new ArrayList<Dish>();
        menu.add(new Dish("Idly", 4));
        menu.add(new Dish("Wada", 8));
        menu.add(new Dish("Puri", 20));
        menu.add(new Dish("Dosa", 6));
        menu.add(new Dish("Bonda", 32));

        List<Dish> lowCalories = new ArrayList<Dish>();

        for (Dish tempDish : menu) {
            if (tempDish.getCalories() <= 8) {
                lowCalories.add(tempDish);
            }
        }

        Collections.sort(lowCalories, new Comparator<Dish>() {
            @Override
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });
        List<String> lowcaloriesItemsName = new ArrayList<String>();
        for (Dish dish : lowCalories) {
            lowcaloriesItemsName.add(dish.getDishName());
        }
        System.out.println(lowcaloriesItemsName);

        //with Java8 - Streams API
        List<String> lowcalitem =menu.stream()
                .filter(e -> e.getCalories() <= 8)
                //sort based of calories
                .sorted(new Comparator<Dish>() {
                            @Override
                            public int compare(Dish o1, Dish o2) {
                                return Integer.compare(o1.getCalories(), o2.getCalories());
                            }
                        }

                )
                //sort based of alphabetical order
                .sorted(Comparator.comparing(Dish::getDishName) )
                .map(Dish::getDishName)
                .collect(Collectors.toList());
        System.out.println(lowcalitem);
    }

    public static class StreamsBasics {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("Charan", "Ravi", "Sai","Hari");
           Optional<String> streamFromList = list.stream()
                   .filter(name -> name.startsWith("S"))
                    .findFirst();
            System.out.println(streamFromList);

        }
    }

    public static class StreamsExample {
        public static void main(String[] args) {
            String name="Gayathri Bhanu";

            String finalresult= name.replaceAll(" ","")
                    .chars()
                    .distinct()
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(Collectors.joining());
            System.out.println(finalresult);
        }
    }

    public static class StreamTesting {
        public static void main(String[] args) {
            //Steps1: getting string without spaces in name
            //Step2: convert string into a character array
            //Step3: For loop and remove repeated string
            String name="madam";
            String finalResult="";
            name=name.replaceAll(" ","");
            LinkedHashSet<Character> linkedHashSet =new LinkedHashSet<>();
            char[] charArray = name.toCharArray();
            StringBuilder stringBuilder=new StringBuilder();
           for (int i=0;i<charArray.length;i++)
           {
               linkedHashSet.add(charArray[i]);
           }
           for (char ch : linkedHashSet){
               stringBuilder.append(ch);
           }
            System.out.println(stringBuilder);
        }
    }
}
