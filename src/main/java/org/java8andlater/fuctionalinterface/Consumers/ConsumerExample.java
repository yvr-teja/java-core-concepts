package org.java8andlater.fuctionalinterface.Consumers;

import java.util.function.Consumer;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<Employee> printEmployee =
                emp -> System.out.println(
                        emp.getId() + " - " + emp.getName()
                );

        Employee emp = new Employee(101, "Teja");
        Employee emp1 = new Employee(102, "Sai");

        printEmployee.accept(emp);
        printEmployee.accept(emp1);

    }
}
