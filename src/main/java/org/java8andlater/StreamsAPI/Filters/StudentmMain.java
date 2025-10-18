package org.java8andlater.StreamsAPI.Filters;

import java.util.ArrayList;
import java.util.List;

public class StudentmMain {
    public static void main(String[] args) {
        List<Student> ls=new ArrayList<>();
        ls.add(new Student("Ravi",90));
        ls.add(new Student("Ravi",90));
        ls.add(new Student("Sai",95));
        ls.add(new Student("Bhanu",97));
        ls.add(new Student("Hari",92));
        ls.add(new Student("Charan",98));

        ls.stream()
                .filter(student -> student.getMarks()>89 && student.getMarks()<95)
                .distinct()
                .forEach(System.out::println);

    }
}
