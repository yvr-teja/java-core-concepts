package DataTypes;

public class NonPrimitiveDataTypes {

    public static void main(String[] args) {
        //String
        String str = "hello";
        System.out.println(str);
        String str1 = new String("Hello it is Constructor passed String");
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(31,37));

        // Example of an Array
        int[] numbers = {1, 2, 3};
        System.out.println("First number: " + numbers[0]);

        // Example of a Class
        Car myCar = new Car("Toyota", "Corolla");
        System.out.println("Car: " + myCar.make + " " + myCar.model);

        // Example of an Enum
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
    }
}
class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
