package org.java8andlater.MethodReference;

import java.util.Arrays;
import java.util.List;

public class Test {
    //sort by name
    public static int compareByName(Student s2,Student s3)
    {
        return s2.getName().compareTo(s3.getName());
    }
    //sort by age
    public static int compareByAge(Student s2,Student s3){
        return s2.getAge().compareTo(s3.getAge());
    }

    public static void main(String[] args) {
        List<Student> list= Arrays.asList(
                new Student("Ravi",30),
                new Student("Sai",28),
                new Student("Gayathri",36)
        );

        //list.sort(Test::compareByAge);
        list.sort(Test::compareByName);
        System.out.println(list);
    }
}
