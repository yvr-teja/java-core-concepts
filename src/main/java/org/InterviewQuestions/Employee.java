package org.InterviewQuestions;

public class Employee {
     String name;
     int salary;

    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    public Employee() {

    }

    public Employee(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
