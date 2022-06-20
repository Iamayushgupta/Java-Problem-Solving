package com.company.singleton;

public class Singleton {
    String name;

    public Singleton(String name) {
        this.name = name;
    }
    //We make a temp variable instance and make it as static
    static Singleton instance;
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton("ayush");
        }
        // All objects point to one instance only
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}