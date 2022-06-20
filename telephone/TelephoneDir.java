package com.company.telephone;
import com.company.telephone.Telephone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TelephoneDir {
    public static void main(String[] args) {
        // case sensitive
        Scanner sc = new Scanner(System.in);
        Telephone t1 = new Telephone("ayush","9820576915");
        Telephone t2 = new Telephone("rahul","8820576915");
        Telephone t3 = new Telephone("abhinav","7977288889");
        Telephone t4 = new Telephone("ayesha","9350676984");
        Telephone t5 = new Telephone("tania","9440576915");
        Telephone t6 = new Telephone("parus","9320576123");
        Telephone t7 = new Telephone("navya","8976543200");
        Telephone t8 = new Telephone("suhani","7940576918");
        Telephone t9 = new Telephone("deep","9498101019");
        //Array of objects
        List<Telephone> telephoneList = Arrays.asList(t1, t2, t3, t4, t5,t6,t7,t8,t9);
        while (true) {
            System.out.println("Select an operation to be performed");
            System.out.println("1. Search for a name in directory");
            System.out.println("2. Display name and contact");
            System.out.println("3. Change name of a customer");
            System.out.println("4. Change phone number of a customer");
            System.out.print("Enter the option : ");
            int opt = sc.nextInt();
            if (opt == 1) {
                searchName(telephoneList);
            } else if (opt == 2) {
                displayDetails(telephoneList);
            } else if (opt == 3) {
                changeName(telephoneList);
            } else if (opt == 4) {
                changePhoneNumber(telephoneList);
            } else {
                System.out.println("Thank you");
                break;
            }
        }
    }

    public static void changePhoneNumber(List<Telephone> lis) {
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name whose phone number has to be changed : ");
        String ch = sc.next();
        System.out.print("Enter the new phone number : ");
        String temp = sc.next();
        for(int i=0;i<5;i++){
            if (lis.get(i).getName().equals(ch)){
                lis.get(i).setPhoneNumber(temp);
                flag=false;
            }
        }
        if (flag){
            System.out.println("Cannot find name in the directory");
        }
        else {
            System.out.println("Phone number changed successfully");
            System.out.println(lis);
        }
    }

    public static void changeName(List<Telephone> lis) {
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name to be changed : ");
        String ch = sc.next();
        System.out.print("Enter the new name : ");
        String temp = sc.next();
        for(int i=0;i<5;i++){
            if (lis.get(i).getName().equals(ch)){
                lis.get(i).setName(temp);
                flag=false;

            }
        }
        if (flag){
            System.out.println("Cannot find the name in the directory");
        }
        else {
            System.out.println("Name changed successfully");
            System.out.println(lis);
        }
    }

    public static void displayDetails(List<Telephone> lis) {
        // It searches for name or phoneNumber matching requirements of user
        boolean flag =true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial letters : ");
        String ch = sc.nextLine();
        for (Telephone ele : lis){
            if(ele.getName().contains(ch) | ele.getPhoneNumber().contains(ch)){
                System.out.println(ele);
                flag=false;
            }
        }
        if (flag){
            System.out.println("No matches found");
        }

    }

    public static void searchName(List<Telephone> lis) {
        boolean flag =true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial letters : ");
        String ch = sc.nextLine();
        System.out.println("Names matching your requirement are : ");
        for (Telephone ele : lis){
            if(ele.getName().contains(ch)){
                System.out.println(ele.getName());
                flag =false;
            }
        }
        if (flag){
            System.out.println("Cannot find the name in the directory");
        }

        //lis.stream().filter(telephone -> telephone.getName()
        //.contains(ch)).forEach(System.out::println);
    }

}
