package com.company.Basics;
import java.lang.Math;
import java.util.Scanner;

public class is_prime{
    public static void main(String[] args) {
        System.out.println("To check whether given number is prime or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int prime_flag=0;
        if (num>1){
            for(int i = 2; i<=(int)Math.sqrt(num);i++){
                if (num%i==0) {
                    prime_flag = 1;
                    break;
                }
            }
            if (prime_flag==0){
                System.out.println(num + " is a prime number");
            }
            else{
                System.out.println(num + " is not a prime number");
            }
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }


}
