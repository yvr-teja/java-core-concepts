package org.designpatterns.singletonDP;

public class Jalebi {
    //Approach: Eager way of creating singleton object
    private static Jalebi jalebi=new Jalebi();

    public static Jalebi getJalebi() {

        return jalebi;
    }

}
