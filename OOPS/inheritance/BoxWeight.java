package com.company.OOPS.inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.w=-1;
    }
    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // Parent class constructor
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight= other.weight;
    }

}
