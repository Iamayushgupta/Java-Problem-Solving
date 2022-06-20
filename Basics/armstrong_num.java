package com.company.Basics;

import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find if given number is Armstrong number");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp=num;
        int ans=0;
        while (temp>0){
            int k= temp%10;
            ans+= (k*k*k);
            temp=temp/10;
        }
        if (ans==num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
