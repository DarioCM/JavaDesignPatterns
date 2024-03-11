package com.example.javadesignpatterns.singleton;

/*
The Singleton Pattern is a creational design pattern that ensures a class has only one instance and provides a global
point of access to that instance. It guarantees that there’s a single point of control for that instance within the system.
This pattern is particularly useful when you want exactly one object to coordinate actions across the system,
such as managing configuration settings, database connections, or thread pools.
 */

public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
