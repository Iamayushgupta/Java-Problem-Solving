package com.company.Basics;

import java.util.Scanner;

public class upper_lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        System.out.print("The new string is : ");
        for(int i=0;i<s.length();i++){
            int ascii = s.charAt(i);
            if (ascii<=90){
                System.out.print((char) (ascii + 32));
            }
            else{
                System.out.print((char) (ascii - 32));
            }
        }
    }
}
