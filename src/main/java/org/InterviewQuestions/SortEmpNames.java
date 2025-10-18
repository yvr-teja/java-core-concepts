package org.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpNames {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Akka", 20000),
                new Employee("Ravi", 20000),
                new Employee("Sai", 15000),
                new Employee("Gayathri", 140000),
                new Employee("Janaki", 160000),
                new Employee("Srinivas", 180000)
        );
        System.out.println(employeeList);
       List<Employee>employees = employeeList.stream()
                .sorted((e1, e2) -> e1.name.compareTo(e2.name))
                .collect(Collectors.toList());
        System.out.println(employees);
    }
}

