package org.corejava.String_StringBuffer_StringBuilder.Strings;

public class Student {
    String name;
    String address;
    int standard;
    int rollNumber;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", standard=" + standard +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
