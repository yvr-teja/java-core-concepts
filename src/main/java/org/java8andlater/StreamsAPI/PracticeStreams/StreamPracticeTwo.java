package org.java8andlater.StreamsAPI.PracticeStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPracticeTwo {
    /*
     filter() → Selects employees based on a condition.
map() → Transforms each employee into the required output.
sorted() → Sorts the employees based on the specified criteria.
collect() → Collects the final stream elements into a List.
     */
    public static void main(String[] args) {
        //System.gc();  // or Runtime.getRuntime().gc()
        List<Employee> employeeList=
                Arrays.asList(
                        new Employee(101, "Ravi",65000),
                        new Employee(102, "Anil",70000.2),
                        new Employee(103, "Arun",75000),
                        new Employee(104, "Sai",40000),
                        new Employee(105, "Ravi",85000),
                        new Employee(106, "Amit",55000),
                        new Employee(107, "Anil",60000.01),
                        new Employee(108, "Rajesh",60000),
                        new Employee(109, "Rajesh",70000)
                );
        //Using List
       /* List<String> bonusEligibleEmployees=
        employeeList.stream()
                //Employee earning 50,000 or more are eligible
                .filter(emp->emp.getSalary()>=50000)
                .map(emp->emp.getName() +"-"+emp.getSalary()+"-"+
                        (emp.getSalary()>=60000
                                ?"Eligible for 20% Bonus" : "Eligible for 10% Bonus")
                        )
                .distinct()
                .toList();
        bonusEligibleEmployees.forEach(System.out::println);*/

        //Using Map
        Map<String,Double> bonusEligibleEmployees =
                employeeList.stream()
                        .filter(emp -> emp.getSalary() >= 50000)
                        .filter(emp -> emp.getName() != null)
                        .collect(Collectors.toMap(
                                Employee::getName,
                                Employee::getSalary,
                                Double::max)
                        );
        System.out.println(bonusEligibleEmployees);
    }
}
/*
*{Ravi=75000.0, Arun=75000.0, Amit=55000.0, Anil=60000.0}
*{Ravi=75000.0, Arun=75000.0, Amit=55000.0, Anil=60000.0}
* */