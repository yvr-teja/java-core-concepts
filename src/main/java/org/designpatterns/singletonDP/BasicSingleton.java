package org.designpatterns.singletonDP;

public class BasicSingleton {
    private static BasicSingleton instance;

    private BasicSingleton(){}

    //public static synchronized BasicSingleton getInstance(){
    // if project is multi-threaded environment declare it as synchronized
    public static BasicSingleton getInstance(){
        if(instance == null){
            instance = new BasicSingleton();
        }
        return instance;
    }
}
