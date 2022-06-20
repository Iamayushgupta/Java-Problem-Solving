package com.company.Basics;

import java.util.Scanner;

public class binary_hex_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        String binaryNumber = Integer.toString(n, 2);
        System.out.println(n+ " in Base 2 : " + binaryNumber);

        String octalNumber = Integer.toString(n, 8);
        System.out.println(n + " in Base 8 : " + octalNumber);

        String hexNumber = Integer.toString(n, 16);
        System.out.println(n + " in Base 16 : " + hexNumber);
    }
}
