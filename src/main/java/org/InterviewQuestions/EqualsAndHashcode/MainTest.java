package org.InterviewQuestions.EqualsAndHashcode;

import java.util.HashSet;

public class MainTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.id = 1;
        emp1.name = "John";
        emp2.id = 1;
        emp2.name = "John";

        System.out.println(emp1.equals(emp2));

        HashSet<Employee> empSet = new HashSet<>();
        empSet.add(emp1);
        empSet.add(emp2);

        System.out.println(empSet.size());

    }
}
