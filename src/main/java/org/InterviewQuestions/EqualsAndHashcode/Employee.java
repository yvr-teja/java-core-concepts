package org.InterviewQuestions.EqualsAndHashcode;

import java.util.Objects;

public class Employee {
     int id ;
     String name;

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee)obj;
        if(this.id == emp.id && this.name.equals(emp.name) ) {
            return true;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }
}
