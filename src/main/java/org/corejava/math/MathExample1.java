package org.corejava.math;

public class MathExample1 {
    public static void main(String[] args) {
        int mySalary=1000;
        int deduction=500;
        int monthlyTotal=mySalary-deduction;
        int yearlyTotal=monthlyTotal*12; //multiplication
        System.out.println(yearlyTotal);
        int totalPerChild = yearlyTotal / 3; // division
        System.out.println(totalPerChild);

        int a=5;
        int b=3;
        int remainder=a%b;
        System.out.println(remainder);
    }
}
