package org.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class EmpStringStartswithA {
    public static void main(String[] args) {
        //Predicate
        //Predicate<Employee> salaryPredicate =employee -> employee.getSalary() == 50000;

        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Ravi", 20000),
                new Employee("Amit", 30000),
                new Employee("Sai", 40000),
                new Employee("Arjun", 60000)
        );

        List<Employee> employeeResult= employeeList.stream()
                //.filter(employee -> employee.getSalary() == 50000)
                .sorted((e1,e2)-> e1.salary - e2.salary)
                        .filter(employee -> employee.getName().startsWith("A") && employee.getSalary() ==50000)
                                .collect(Collectors.toList());

        System.out.println(employeeResult);

    }
}
