package com.company.LabCollections.Industry;

import java.io.Serializable;

public class Sample implements Serializable,Comparable<Sample> {
    int productId;
    Double diameter;
    Double length;
    Double weight;

    public Sample(int productId, Double diameter, Double length, Double weight) {
        this.productId = productId;
        this.diameter = diameter;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "productId=" + productId +
                ", diameter=" + diameter +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Sample o) {
        if(productId > o.productId){
            return 1;
        }
        else{
            return -1;
        }
    }
}
