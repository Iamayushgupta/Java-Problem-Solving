package com.company.Basics;
import java.util.Scanner;

public class mul_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Multiplication table of " + num);
        for(int i=1;i<=10;i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
