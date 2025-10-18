package org.corejava.serializationanddeserialization;

import java.io.Serializable;

public class Student implements Serializable {
    //private static final long serialVersionUID=1L;
    public String name;
    public int rollNum;
    public String grade;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }
    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
