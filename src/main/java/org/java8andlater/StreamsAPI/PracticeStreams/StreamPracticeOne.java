package org.java8andlater.StreamsAPI.PracticeStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPracticeOne {
    /*
       filter() => Selects employees whose salary is ₹50,000 or more.
        map() => Converts each employee into a String containing the name and salary category.
        sorted() => Sorts the resulting employee strings in ascending alphabetical order.
        collect() => Collects the final stream elements into a List<String>
     */
    public static void main(String[] args) {
        List<Employee> employeeList=
                Arrays.asList(
                        new Employee(101,"Ravi",45000),
                        new Employee(102,"Sai",60000),
                        new Employee(103,"Arun",75000),
                        new Employee(104,"Ramesh",25000),
                        new Employee(105,"Prasad",35000),
                        new Employee(106,"Satish",85000),
                        new Employee(107,"Kavitha",95000),
                        new Employee(108,"Sharanya",85000)
                );
        List<String> result = employeeList.stream()
                //.filter(emp->emp.getName().startsWith("R"))
                .filter(emp->emp.getSalary()>=75000)
                .map(emp->emp.getName()+"-"+emp.getSalary()+"-"+
                        (emp.getSalary()>=45000 ?"Senior" : "Junior"))
                .sorted()
                .collect(Collectors.toList());
        result.forEach(System.out::println);

    }
}
