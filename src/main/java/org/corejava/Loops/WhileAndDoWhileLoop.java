package org.corejava.Loops;

import java.util.Scanner;

public class WhileAndDoWhileLoop {
    public static void main(String[] args) {

        //initial variable
        /*while(condition)
        {
            inc/dec
        }
         */

        /*
        int i=0;
        while (i<10) {
            //System.out.println(i);
            i++;
        }

        int j=10;
        while(j>=10){
            System.out.println(j);
            j--;
        }
        */


        //do while loop
        /*initial variable
        do{
            inc/dec
        }while(condition);
        */
       /* int a=1;
        do{
            System.out.println(a);
            a=a+2;
        }while(a<=5);
        */

        try (Scanner scanner = new Scanner(System.in)) {
            String password;
            do {
                System.out.print("Enter your password: ");
                password = scanner.nextLine();
            } while (!password.equals("1234"));
        }
        System.out.println("Access Granted");




    }
}
