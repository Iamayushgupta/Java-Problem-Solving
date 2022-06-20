package com.company.p1.p2.p3;
import com.company.p1.Extract;
import com.company.p1.p2.Sum;
import com.company.p1.p2.SumOfSquares;

public class Main {
    public static void main(String[] args) {
        Extract obj1 = new Extract();
        int[] arr = obj1.extract(123456);
        Sum obj2=new Sum();
        int val1= obj2.total(arr);
        SumOfSquares obj3 = new SumOfSquares();
        int val2 = obj3.total(arr);
        System.out.println(val2/val1);
    }
}
