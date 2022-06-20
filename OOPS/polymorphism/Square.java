package com.company.OOPS.polymorphism;

public class Square extends Shapes{
    // this will run when obj of Square is being created
    //hence it is overriding the parent method
    @Override
    void area() {
        System.out.println("area= a*a");
    }
}
