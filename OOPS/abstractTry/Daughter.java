package com.company.OOPS.abstractTry;

public class Daughter extends Parent{

    public Daughter(int age) {
//        super(val);
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("i am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("i love ironman");
    }
}
