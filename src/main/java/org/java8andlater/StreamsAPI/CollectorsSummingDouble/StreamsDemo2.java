package org.java8andlater.StreamsAPI.CollectorsSummingDouble;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"Anitha", "Marketing", 18000,List.of("Digital Marketing", "SocialMedia")),
                new Employee(2,"Akash", "HR", 90000,List.of("Leadership", "Time Management")),
                new Employee(3,"Rohan", "IT", 150000,List.of("Java", "React")),
                new Employee(4,"Mano", "IT", 60000,List.of("Java", "Spring")),
                new Employee(5,"Roni", "Marketing", 10000,List.of("Copywriting", "SocialMedia")),
                new Employee(6,"Kevin", "IT", 125000,List.of("Java", "Spring", "React")),
                new Employee(7,"Janani", "HR", 50000,List.of("SocialMedia", "Lead")),
                new Employee(8,"Kavya", "IT", 80000,List.of("Java", "Spring", "React"))
        );
    //Collectors.averagingDouble
    //  Average salary of all employees
        double avgAllEmps = employees.stream()
                //.collect(Collectors.averagingDouble(emp1->emp1.getSalary()));
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average salary of All employee: " + avgAllEmps);
        //  Average salary of Marketing dept
        double avgItEmps = employees.stream()
                .filter(employee -> employee.getDepartment().equals("Marketing"))
                //.collect(Collectors.averagingDouble(emp1->emp1.getSalary()));
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average salary of IT employee: " + avgItEmps);
    //  Average salary of employees earning more than 80k
        double highAvgEmps = employees.stream()
                .filter(emp -> emp.getSalary() > 80000)
                //.collect(Collectors.averagingDouble(emp1->emp1.getSalary()));
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average salary of All employee: " + highAvgEmps);
    //  Average bonus of employees(Bonus is 10% salary)
        double avgBonus = employees.stream()
                .collect(Collectors.averagingDouble(emp1->emp1.getSalary()*0.10));
        System.out.println("Average salary of All employee: " + avgBonus);
    //  Average number of skills per employee
        double avgSkillEmps = employees.stream()
                .collect(Collectors.averagingDouble(emp-> emp.getSkills().size()));
        System.out.println(avgSkillEmps);
    //  Average training cost per employee(Cost per skill is 2k)
        double avgTraningCost = employees.stream()
                .collect(Collectors.averagingDouble(emp1->emp1.getSkills().size()*2000));

        System.out.println(avgTraningCost);
    }
}
