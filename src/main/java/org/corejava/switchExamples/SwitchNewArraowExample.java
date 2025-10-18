package org.corejava.switchExamples;

public class SwitchNewArraowExample {
    public static void main(String[] args) {
     String day="Sunday";
     String result="";
     switch (day){
//         case "Sunday"  ->  System.out.println("Sunday");
//         case "Monday"-> System.out.println("monday ");
//         default ->   System.out.println("Testing default");
         case"Sunday" ->result="100%";
         case"Moday" -> result="30%";
         default-> result="0%";
     }
        System.out.println(result);

    }
}
