package com.company.Basics;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find Factorial");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int ans=1;
        for(int i=2;i<=num;i++){
            ans*=i;
        }
    }
}
