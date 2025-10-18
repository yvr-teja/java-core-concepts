package org.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class UsingForEach {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Akka", 20000),
                new Employee("Ravi", 20000),
                new Employee("Sai", 15000),
                new Employee("Gayathri", 140000),
                new Employee("Janaki", 160000),
                new Employee("Srinivas", 180000));

                employeeList.forEach(System.out::println);
        System.out.println(" ");
        System.out.println(" ");

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}

