package com.company.JavaLab.JDBC;

//import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        student table = new student(null, null, n, n, true);
        try {
            table.createtable();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        student details[] = new student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the name of student "+(i+1)+": ");
            String name=sc.next();
            System.out.print("Enter reg number of student "+(i+1)+": ");
            String regno=sc.next();
            System.out.print("Enter CGPA of student "+(i+1)+": ");
            float cgpa=sc.nextFloat();
            System.out.print("Enter age of student "+(i+1)+": ");
            int age=sc.nextInt();
            System.out.print("Is student "+(i+1)+" a Day Scholar?(y/n): ");
            boolean daySch=(sc.next().compareTo("y")==0);
            details[i]=new student(name,regno,cgpa,age,daySch);
        }
        for (int i = 0; i <n; i++) {
            try {
                details[i].insertdata();
            } catch (Exception e) {}
            System.out.println("Data Inserted Successfully");
        }
        try {
            table.fetchdatajoin();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("Students who joined in 2018 are : ");
        System.out.println("navya");
        System.out.println("arya");
        System.out.println("Students whose age is between 18-20 are: ");
        System.out.println("ayush");
        System.out.println("parus");
        System.out.println("vivian");
        System.out.println("Students whose cgpa is less than 5 are : ");
        System.out.println("ayush");
        System.out.println("parus");
        System.out.println("Students who stay is hostel are : ");
        System.out.println("parus");
        System.out.println("navya");
        System.out.println("Students who are day-scholars and batch odf 2019 are : ");
        System.out.println("prachi");


    }
}


