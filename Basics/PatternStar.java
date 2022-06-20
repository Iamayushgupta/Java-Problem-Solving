package com.company.Basics;

import java.util.Scanner;

public class PatternStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i;k++){
                System.out.print("* ");
            }
            System.out.print("*");
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i;k++){
                System.out.print("* ");
            }
            System.out.print("*");
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
