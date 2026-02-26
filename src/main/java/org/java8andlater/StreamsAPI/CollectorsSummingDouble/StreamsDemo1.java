package org.java8andlater.StreamsAPI.CollectorsSummingDouble;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo1 {
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

//Collectors.summingDouble
        //Total salary of all employees
        double sumTotSal= employees.stream()
                        .mapToDouble(emp1-> emp1.getSalary())
                                .sum();
        System.out.println("Beginner way of sum of total: " +sumTotSal);

        double totalsum= employees.stream()
                //.collect(Collectors.summingDouble(employee ->employee.getSalary()));
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total salary of all employees:" +totalsum);
        //Total salary of IT dept
        double totItEmpSal = employees.stream()
                .filter(emp1 -> emp1.getDepartment().equals("IT"))
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total salary of IT employees:" +totItEmpSal);
        //Total salary of employees earning more than 80k(Filtered Analytics)
        double salGr80k = employees.stream()
                .filter(emp -> emp.getSalary() > 80000)
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Employees earning more than 80k Salary: " +salGr80k);

        //Total number of skills across all employees
        Integer collect = employees.stream()
                .collect(Collectors.summingInt(emp1 -> {
                    List<String> skills = emp1.getSkills();
                    int size = skills.size();
                    return size;
                }));
        System.out.println("Total no of Skills: method1 =" +collect);
        Double collect1 = employees.stream()
                .collect(Collectors.summingDouble(emp1 -> emp1.getSkills().size()));
        System.out.println("Total no of Skills: method2 =" +collect1);
        //Total skills among IT employees
        //Total training cost of all skills of IT employees,it each skill is 2000(Filtered Analytics)
        int allEmpSkillCount = employees.stream()
                .collect(Collectors.summingInt(emp1 -> emp1.getSkills().size() ));
        System.out.println("Total All Employees skill count: "+allEmpSkillCount);
        int itSkillCount = employees.stream()
                .filter(emp->emp.getDepartment().equals("IT"))
                .collect(Collectors.summingInt(emp1 -> emp1.getSkills().size() ));
        System.out.println("Total IT skill count: "+itSkillCount);
        int itTrainingCost = employees.stream()
                .filter(emp->emp.getDepartment().equals("IT"))
                .collect(Collectors.summingInt(emp1 -> emp1.getSkills().size() * 2000));
        System.out.println("Total cost of Skills of IT Employee = " +itTrainingCost);
        //Total bonus payout (10% salary)
        Double totalBouns = employees.stream()
                .collect(Collectors.summingDouble(emp1 -> emp1.getSalary() * 0.10));
        System.out.println("Total bouns: " +totalBouns);
        //Total training cost of all skills
        Double totalTrainingCost = employees.stream()
                .collect(Collectors.summingDouble(emp1 -> emp1.getSkills().size() * 2000));
        System.out.println("Total cost of Skills of all Employee = " +totalTrainingCost);
    }
}
