package org.java8andlater.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CustomePredicateOnObject {
    public static void main(String[] args) {
      //Create on class called employee
      //We will create on repo for employee and one method filteremployee
      //then we will write one main method and create custom employee and
      //pass the predicate
        Employee e1= new Employee(1,"Ravi","April","2021");
        Employee e2= new Employee(2,"Sai","June","2018");
        Employee e3= new Employee(3,"Santosh","July","2020");
        Employee e4= new Employee(4,"Gayathri","January","2022");
        Employee e5= new Employee(5,"Bhanu","December","2025");

        //First way dynamically
        List<Employee> list= Arrays.asList(e1,e2,e3,e4,e5);
        List<Employee> result= EmployeeRepository.filterEmployee(list,
                x->x.getJoiningmonth().equalsIgnoreCase("April"));
        System.out.println(result);

        //Second way is creating Predicate method
        List<Employee> result2= EmployeeRepository
                .filterEmployee(list,isNewJoiner().negate());
        System.out.println(result2);
    }

    public static Predicate<Employee> isNewJoiner(){
        return n->n.getJoiningmonth().equalsIgnoreCase("December");
    }
}
