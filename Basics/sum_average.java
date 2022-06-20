package com.company.Basics;

import java.util.Scanner;

public class sum_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        double sum =0;
        System.out.println("Enter the n numbers");
        for(int i=0;i<n;i++){
            sum+= sc.nextInt();
        }
        System.out.println("The sum of the numbers is : " + sum);
        System.out.println("The average of the numbers is : " + sum/n);

    }
}
