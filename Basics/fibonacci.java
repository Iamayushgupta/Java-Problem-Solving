package com.company.Basics;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First n Fibonacci numbers ");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int a=0;
        int b=1;
        if (num==1){
            System.out.println(0);
        }
        else if (num==2){
            System.out.println(0+ " " + 1);
        }
        else{
            num-=2;
            System.out.print(0+ " " + 1 + " ");
            while (num!=0){
                System.out.print(a+b + " ");
                int temp=a;
                a=b;
                b+=temp;
                num-=1;
            }
            System.out.println();
        }
    }
}
