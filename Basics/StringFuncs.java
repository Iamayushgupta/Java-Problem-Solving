package com.company.Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringFuncs{
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder("Ayush");
        Scanner sc = new Scanner(System.in);
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        while(true){
            System.out.println("1. Append in String");
            System.out.println("2. Insert in String");
            System.out.println("3. Delete in String");
            System.out.print("Select your option : ");
            int opt= sc.nextInt();
            if (opt==1){
                String temp = br.readLine();
//                String temp = sc.nextLine();
                str.append(temp);
                System.out.println(str.toString());
            }
            else if (opt==2){
//                String temp = br.readLine();
                String temp = sc.next();
                str.append(temp);

                str.insert(1,temp);
                System.out.println(str.toString());

            }
            else if(opt==3){
                str.delete(1,3);
                System.out.println(str.toString());

            }
            else{
                break;
            }
        }
    }
}
