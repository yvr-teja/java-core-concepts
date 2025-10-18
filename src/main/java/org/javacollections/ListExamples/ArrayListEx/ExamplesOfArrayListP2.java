package org.javacollections.ListExamples.ArrayListEx;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

public class ExamplesOfArrayListP2
{
    public static void main(String[] args) {

       //Comparable
        List<Student> students =new ArrayList<>();
        students.add(new Student("Alice",3.5));
        students.add(new Student("Bod",3.7));
        students.add(new Student("Charlie",3.5));
        students.add(new Student("Akshit",3.9));
        students.sort((o1, o2) -> {
            if(o2.getGpa() - o1.getGpa()>0)
            {
                return 1;
            }
            else {
                int i = 0;
                if(o2.getGpa() - o1.getGpa()< i){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        for (Student s : students){
            System.out.println(s.getName()+"--"+s.getGpa());
        }

        //Comparator

       /* List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(0);
        System.out.println(list1.toString());
        //Collections.sort(list1);    // it will sort in order
        list1.sort(null);
        System.out.println(list1);
       /*
       //It will work in java 9
        List<Integer> list2 = List.of(4,5,6,7,8,9);
        list1 addAll(list2);
        System.out.println(list1);*/



    }
}
