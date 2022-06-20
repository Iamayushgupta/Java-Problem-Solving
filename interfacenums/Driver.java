package com.company.interfacenums;

public class Driver {
    public static void main(String[] args) {
        Float float1 = 2.00f;
        Float float2 = 10.00f;
        System.out.println(float1 + " "  + float2);
        FloatValues floatValues = new FloatValues();
        System.out.println("Add " + floatValues.add(float1, float2));
        System.out.println("Sub " + floatValues.sub(float1, float2));
        System.out.println("Multiply " + floatValues.multiply(float1, float2));
        System.out.println("Div " + floatValues.divide(float1, float2));

        Integer integer1 = 2;
        Integer integer2 = 4;
        System.out.println(integer1 + " "  + integer2);

        IntegerValues integerValues = new IntegerValues();
        System.out.println("Add " + integerValues.add(integer1, integer2));
        System.out.println("Sub " + integerValues.sub(integer1, integer2));
        System.out.println("Multiply " + integerValues.multiply(integer1, integer2));
        System.out.println("Div " + integerValues.divide(integer1, integer2));
    }
}