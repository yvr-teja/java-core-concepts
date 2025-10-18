package org.java8andlater.StreamsAPI.MapAndFlatMap;

import java.util.List;

public class Programmer {
    private String name;
    private List<String> skills;

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }

    public Programmer(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }
}
