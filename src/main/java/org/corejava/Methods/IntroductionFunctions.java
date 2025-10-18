package org.corejava.Methods;

public class IntroductionFunctions {
        /* if you are calling function inside the static
         function you need to define function as static
        */
    //dataType (return type) nameOfFunction
    /* void printMyName(){
        //write name
         System.out.println("Ravi Teja");
    }
     */
    static void printMyName(){
        //write name
         System.out.println("Ravi Teja");
    }

    public static void main(String[] args) {
          /*Case:1 - Object must be created in case if we
        need to call method

        IntroductionFunctions introductionFunctions=new IntroductionFunctions();
        introductionFunctions.printMyName();
        */
        /* Case:2 - Static methods will execute first,
        even before calling a main method. if we what
        to call method then we need to declar method
        as static
          */
        printMyName();
    }
}
