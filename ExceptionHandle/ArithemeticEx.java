package com.company.ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithemeticEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num2==0){
                throw new ArithmeticException("zero is not allowed");
            }
            System.out.println(num1/num2);
        }
        // there cannot be sout line between try and catch
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace(); // prints in which method the error occurs
        }
        // to catch multiple exceptions
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }
}
