package com.company.JavaLab;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptHandle{
    static void validate(String r, String n){
        if(r.length() != 9){
            System.out.println("Invalid");
            throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
        }
        if(n.length() != 10) {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
        }
        Pattern a = Pattern.compile("^\\d{10}$");
        Matcher m1 = a.matcher(n);
        if(!m1.find()){
            throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
        }
        String pattern2 = "^[0-9]{2}[A-Z a-z]{3}[0-9]{4}$";
        Pattern b = Pattern.compile(pattern2);
        Matcher m2 = b.matcher(r);
        if(!m2.find()){
            throw new NoSuchElementException("Registration Number cannot contain any character other than digits and alphabets");
        }
    }
    public static void main(String args[]){
        String reg;
        String no;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter registration number : ");
            reg = sc.nextLine();
            System.out.print("Enter Phone number : ");
            no = sc.nextLine();
        }
        validate(reg, no);
        System.out.println("Valid");
    }
}