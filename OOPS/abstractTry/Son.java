package com.company.OOPS.abstractTry;

public class Son extends Parent{
    public Son(int age) {
//        super(val);
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor" );
    }

    @Override
    void partner() {
        System.out.println("Her name is batman");
    }
}
