package com.company.Tax;

public class IncomeTax {
    int baseAmount=50000;

    public static float computeTax(float f1,float f2){
        return f1*f2;
    }
    public static boolean checkEligibility(float f1){
        if (f1>5000){
            return true;
        }
        return false;
    }


}
