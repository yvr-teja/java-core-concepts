package org.java8andlater.StreamsAPI.PracticeStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPracticeThree {
    /*
        filter() → Selects employees with salary ≥ ₹50,000.
        sorted() → Sorts employees by salary in descending order.
        map() → Converts each Employee into the employee name.
        collect() → Collects the names into a List<String>
    */
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Ravi", 45000),
                new Employee(102, "Anil", 60000),
                new Employee(103, "Arun", 75000),
                new Employee(104, "Sai", 40000),
                new Employee(105, "Ravi", 75000),
                new Employee(106, "Amit", 55000),
                new Employee(107, "Anil", 60000)
        );

        List<String>  result = employeeList.stream()
                .filter(emp->emp.getSalary()>=50000)
                .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
