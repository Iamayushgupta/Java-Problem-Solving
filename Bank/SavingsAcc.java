package com.company.Bank;

import java.util.Scanner;

public class SavingsAcc extends BankAccount {

     public SavingsAcc(String name, String dob, String address, int accNum, int balance) {
        super(name, dob, address, accNum, balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accNumber = 1;
        while(true){
            System.out.println("1. Create a new account");
            System.out.println("2. Withdraw from your account");
            System.out.println("3. Deposit amount in account");
            System.out.println("4. Delete an account");
            System.out.print("Select your option : ");
            int opt= sc.nextInt();
            if (opt==1){
                newAcc(accNumber);
                accNumber+=1;
            }
            else if (opt==2){
                withdrawMoney();
            }
            else if(opt==3){
                depositMoney();
            }
            else if(opt==4){
                deleteAcc();
            }
            else{
                break;
            }
        }
    }

    public static void deleteAcc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure you want to delete you account");
        System.out.println("Y/N");
        String tok = sc.nextLine();
        if (tok.equals("Y") | tok.equals("y")){
            System.out.print("Enter your account number : ");
            int acc= sc.nextInt();
        }

    }

    public static void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account number : ");
        int acc= sc.nextInt();
        System.out.print("Enter amount to be deposited : ");
        int mon = sc.nextInt();

    }

    public static void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account number : ");
        int acc= sc.nextInt();
        System.out.print("Enter amount to be withdrawn : ");
        int mon =sc.nextInt();

    }

    public static void newAcc(int num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your date of birth(xx-xx-xxxx) : ");
        String dob = sc.nextLine();
        System.out.print("Enter your address : ");
        String address = sc.nextLine();
        System.out.print("Enter amount to be deposited in acc : ");
        int bal = sc.nextInt();
        SavingsAcc acc= new SavingsAcc(name,dob,address,num,bal);
        System.out.println("Account created successfully");

    }
}
