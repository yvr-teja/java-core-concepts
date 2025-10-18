package org.javacollections.MapEx.EnumMapEx;

import java.util.EnumMap;

public class EnumMapEx1 {
    public static void main(String[] args) {
        //Underlying DS-> array indexed by enum
        //Key must be enum(no null), Values can be null
        //It follows the order, The order in which the enum constants are declared
        //performance:  O(1)
        //Use Case: Best when mapping enums to values (like schedules, states, configurations).

        EnumMap<Status, String> serviceStatus = new EnumMap<>(Status.class);
        serviceStatus.put(Status.STARTING, "Initializing resources");
        serviceStatus.put(Status.RUNNING, "Service is live");
        serviceStatus.put(Status.FAILED, "Error occurred");
        serviceStatus.put(Status.STOPPED, "Service has been shut down");

        for (Status status : serviceStatus.keySet()) {
            System.out.println(status + ": " + serviceStatus.get(status));
        }
    }
}