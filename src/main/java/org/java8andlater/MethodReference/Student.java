package org.java8andlater.MethodReference;

public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}

