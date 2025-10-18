package org.java8andlater.StreamsAPI.Filters;

import java.util.Objects;

public class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return marks == student.marks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
