package org.java8andlater.fuctionalinterface.predicate;

import java.util.function.Predicate;

class Employees {
    private String name;
    private double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Employees> highSalary = emp -> emp.getSalary() > 50000;

        Employees emp = new Employees("Teja", 60000);

        System.out.println(highSalary.test(emp)); // true

        Predicate<Employees> lostSalary = lowSalaryemp->emp.getSalary() >70000;
        Employees emp2 = new Employees("Ravi", 550000);
        System.out.println(lostSalary.equals(emp2));

    }
}