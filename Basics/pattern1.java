package com.company.Basics;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Pattern");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
