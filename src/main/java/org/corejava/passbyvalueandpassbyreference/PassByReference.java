package org.corejava.passbyvalueandpassbyreference;


public class PassByReference {
    public static void main(String[] args) {
        Car firstObj =new Car();
        firstObj.name="BMW";
        firstObj.mileage=25.8f;
        firstObj.cost=250;

        Car secondObj;
        secondObj=firstObj;

        System.out.println(secondObj.name);
        System.out.println(secondObj.mileage);
        System.out.println(secondObj.cost);

        secondObj.name="Skonda";
        secondObj.mileage=25.2f;
        secondObj.cost=230;

        System.out.println(secondObj.name);
        System.out.println(secondObj.mileage);
        System.out.println(secondObj.cost);

        System.out.println(firstObj.name);
        System.out.println(firstObj.mileage);
        System.out.println(firstObj.cost);

        System.out.println(firstObj.hashCode());
        System.out.println(secondObj.hashCode());
    }
}
