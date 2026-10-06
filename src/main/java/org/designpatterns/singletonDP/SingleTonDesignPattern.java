package org.designpatterns.singletonDP;

public final class SingleTonDesignPattern {

    // 1. Private constructor to prevent instantiation
    private SingleTonDesignPattern() {
        // Guard against reflection instantiation
        if (SingleTonDesignPattern.InstanceHolder.INSTANCE != null) {
            throw new IllegalStateException("Already initialized");
        }

    }
    // 2. Static inner helper class (loaded only when getInstance() is called)
    private static class InstanceHolder {
        private static final SingleTonDesignPattern INSTANCE = new SingleTonDesignPattern();
    }
    // 3. Public static method to retrieve the instance
    public static SingleTonDesignPattern getInstance() {
        return InstanceHolder.INSTANCE;
    }

}