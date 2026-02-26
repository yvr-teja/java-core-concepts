package org.java8andlater.StreamsAPI.CollectorsSummingDouble;

import java.util.List;

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
    //
    //  Average salary of all employees
    //  Average salary of IT dept
    //  Average salary of employees earning more than 80k
    //  Average bonus of employees
    //  Average number of skills per employee
    //  Average training cost per employee
    }
}
