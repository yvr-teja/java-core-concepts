package org.java8andlater.predicate;

public class Employee {
    private int id;
    private String name;
    private String joiningmonth;
    private String joiningyear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJoiningmonth() {
        return joiningmonth;
    }

    public void setJoiningmonth(String joiningmonth) {
        this.joiningmonth = joiningmonth;
    }

    public String getJoiningyear() {
        return joiningyear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joiningmonth='" + joiningmonth + '\'' +
                ", joiningyear='" + joiningyear + '\'' +
                '}';
    }

    public void setJoiningyear(String joiningyear) {
        this.joiningyear = joiningyear;
    }
    public Employee(int id, String name, String joiningmonth, String joiningyear) {
        this.id = id;
        this.name = name;
        this.joiningmonth = joiningmonth;
        this.joiningyear = joiningyear;
    }
}
