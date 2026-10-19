package org.corejava.OOPs.inheritance;

public class Demo {
    public static void main(String[] args) {
        VeryAdvCalc calc  = new VeryAdvCalc();

        int r1 =calc.add(2,3);
        int r2 =calc.sub(5,4);
        int r3 =calc.muti(4,5);
        int r4 =calc.div(10,2);
        double r5 =calc.power(2,2);

        System.out.println(r1 + " " +r2 + " " +r3 + " " +r4 + " " +r5);
    }
}
