package com.company.interfacenums;

public class IntegerValues implements ArithmeticValues<Integer> {

    public Integer add(Integer val1, Integer val2) {
        return val1+val2;
    }

    public Integer sub(Integer val1, Integer val2) {
        return val1-val2;
    }

    public Integer multiply(Integer val1, Integer val2) {
        return val1*val2;
    }

    public Integer divide(Integer val1, Integer val2) {
        return val1/val2;
    }

}