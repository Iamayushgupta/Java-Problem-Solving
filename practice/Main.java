package com.company.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        while (true){
            System.out.println("1. Compare to strings");
            System.out.println("2. Get character at specified position");
            System.out.println("3. Extract a substring");
            System.out.println("4. Replace a character with given character");
            System.out.println("5. Get position of char/substring");
            System.out.println("-1 to exit");
            System.out.print("Enter the option to be performed : ");
            int opt = sc.nextInt();
            if (opt==1){
                System.out.print("Enter string 1 : ");
                String s1= br.readLine();
                System.out.print("Enter string 2 : ");
                String s2= br.readLine();
                System.out.println(s1.equals(s2));
            }
            else if (opt==2){
                System.out.print("Enter the string : ");
                String s1= br.readLine();
                System.out.print("Enter the index : ");
                int i = sc.nextInt();
                System.out.println("The character at index " + i + " is " + s1.charAt(i));
            }
            else if (opt==3){
                System.out.print("Enter the string : ");
                String s1 = br.readLine();
                System.out.println("Enter starting index of substring");
                int i = sc.nextInt();
                System.out.println("Enter ending index of substring");
                int j = sc.nextInt();
                System.out.println("The substring is " + s1.substring(i,j));

            }
            else if (opt==4){
                System.out.print("Enter the string : ");
                String s1 = br.readLine();
                System.out.print("Enter character to be replaced : ");
                char c1 = sc.next().charAt(0);
                System.out.print("Enter the replacement : ");
                char c2 = sc.next().charAt(0);
                String s2 = s1.replace(c1,c2);
                System.out.println("The string after replacement is " + s2);
            }
            else if (opt==5){
                System.out.print("Enter the string : ");
                String s1 = br.readLine();
                System.out.print("Enter substring/character : ");
                String c = br.readLine();
                System.out.println("The character is at index " + s1.indexOf(c));
            }
            else if(opt==-1){
                break;
            }
            System.out.println("\n");
            System.out.println("\n");
        }
    }
}
