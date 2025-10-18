package org.corejava.switchExamples;

public class SwithMoreEnhancedWay {
    public static void main(String[] args) {
        String day="Monday";
        String result="";
        //if we want to use Arrow
      /*   result =switch (day) {
            case "Sunday" ->"20";
            case "Monday" -> "30";
            default ->  "10";
        };*/
         //if we want to use colon
        result = switch (day) {
            case "Sunday": {
                yield "20";
            }
            case "Monday": {
                yield "30";
            }
            default: {
                yield "10";
            }
        };
        System.out.println(result);
    }

}
