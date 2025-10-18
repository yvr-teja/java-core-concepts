package org.java8andlater.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeRepository {
    public static List<Employee> filterEmployee(List<Employee> list, Predicate<Employee> predicte){
        return list.stream()
                .filter(predicte)
                .collect(Collectors.toList());
    }
}
