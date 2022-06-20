package com.company.interfacenums;

public class FloatValues implements ArithmeticValues<Float> {
    public Float add(Float val1, Float val2) {
        return val1+val2;
    }

    public Float sub(Float val1, Float val2) {
        return val1-val2;
    }

    public Float multiply(Float val1, Float val2) {
        return val1*val2;
    }

    public Float divide(Float val1, Float val2) {
        return val1/val2;
    }
}
