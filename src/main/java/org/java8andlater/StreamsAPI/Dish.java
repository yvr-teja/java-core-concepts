package org.java8andlater.StreamsAPI;

public class Dish {
    private String dishName;
    private int calories;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Dish(String dishName, int calories) {
        this.dishName = dishName;
        this.calories = calories;
    }
}
