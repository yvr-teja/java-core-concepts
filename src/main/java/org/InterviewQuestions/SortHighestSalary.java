package org.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Ravi",80000)
        ,new Employee("Srinivas",10000)
                , new Employee("Gayathri"
                        ,20000),new Employee("Janaki",5000)
        ,new Employee("Sai",30000));

        System.out.println(employeeList);
       List<Employee> employees= employeeList.stream().
                sorted((e1, e2) -> e1.salary - e2.salary).
                collect(Collectors.toList());
        System.out.println(employees);
    }
}
