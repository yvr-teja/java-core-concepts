package org.InterviewQuestions;

import org.InterviewQuestions.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class ComparingTwoEmployeeWithOld {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Ravi", 20000),
                new Employee("Amit", 30000),
                new Employee("Sai", 40000),
                new Employee("Arjun", 60000)
        );

/*        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getSalary().compare(e2.getSalary());
            }
        });*/

        //With Java 8 features
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println(employeeList);

        /*employeeList.stream()
                .filter((Employee e1,Employee e2)->e1.getName().compareTo(e2.getName()));*/
    }
}
