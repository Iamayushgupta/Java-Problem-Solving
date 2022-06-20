package com.company.OOPS.inheritance;

public class Box {
    private double l;
    double h;
    double w;
    Box(){
        this.h=-1;
        this.w=-1;
        this.h=-1;
    }
    Box(double side){
        this.w=side;
        this.h=side;
        this.l=side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
}

