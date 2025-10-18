package org.InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOnNameThenAge {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Ravi Teja",20));
        personList.add(new Person("Sai",28));
        personList.add(new Person("Gayathri",26));
        personList.add(new Person("Ravi Teja",30));
        personList.add(new Person("Janaki",55));
        personList.add(new Person("Srinivas",60));

        System.out.println(personList);
        Collections.sort(personList, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println(personList);
    }
}

