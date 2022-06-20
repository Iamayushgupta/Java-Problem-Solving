package com.company.Tax;

import java.util.Arrays;
import java.util.List;

public class TaxPayee {
    String name;
    int incomeAmt;
    int taxPercent;
    int taxAmount;

    public TaxPayee(String name, int incomeAmt, int taxPercent, int taxAmount) {
        this.name = name;
        this.incomeAmt = incomeAmt;
        this.taxPercent
                = taxPercent;
        this.taxAmount = taxAmount;
    }

    public static void main(String[] args) {
        TaxPayee obj1 = new TaxPayee("ayush",100000,5,11);
        TaxPayee obj2 = new TaxPayee("ayush",200000,10,11);
        TaxPayee obj3 = new TaxPayee("ayush",300000,15,11);
        List<TaxPayee> accounts = Arrays.asList(obj1,obj2,obj3);
        for(TaxPayee taxPayee:accounts){
            if(IncomeTax.checkEligibility(taxPayee.incomeAmt)){

            }
        }
    }
}
