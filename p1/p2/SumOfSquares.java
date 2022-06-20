package com.company.p1.p2;

public class SumOfSquares {
    public int total(int[] arr){
        int c=0;
        for(int i:arr){
            c+=(i*i);
        }
        return c;
    }
}
