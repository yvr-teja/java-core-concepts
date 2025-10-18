package org.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class EmpStringStartswithA {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Ravi", 20000),
                new Employee("Amit", 30000),
                new Employee("Sai", 40000),
                new Employee("Arjun", 60000)
        );

        List<Employee> employeeResult = employeeList.stream()
                .filter(emp -> emp.name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(employeeResult);

    }
}
