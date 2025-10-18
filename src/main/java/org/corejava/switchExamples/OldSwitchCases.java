package org.corejava.switchExamples;

public class OldSwitchCases {
    public static void main(String[] args) {
        String day="Sunday";

        //String today_day="Sunday";
        switch(day){
            case "Sunday":  System.out.println("today is sunday");
                break;
            case "Monday":  System.out.println("today is monday");
                break;
            default:
                System.out.println("Day is day no worry");
        }

    }

}
