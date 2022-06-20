package com.company.practice;

import java.util.Scanner;

public class Student {
    String regNo;
    String name;
    String branch;
    int year;
    int sem;
    int[] marks;

    public Student(String regNo, String name, String branch, int year, int sem, int[] marks) {
        this.regNo = regNo;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.sem = sem;
        this.marks = marks;
    }
    public String grade(){
        int grade=0;
        for(int ele:marks){
            if(ele>=90){
                grade+=9;
            }
            else if(ele>=80){
                grade+=8;
            }
            else if (ele>=70){
                grade+=7;
            }
            else if (ele>=60){
                grade+=6;
            }
            else{
                grade+=5;
            }
        }
        grade/=5;
        if (grade>=9){
            return "A";
        }
        else if (grade>=8){
            return "B";
        }
        else if (grade>=7){
            return "C";
        }
        else{
            return "D";
        }
    }
    public void readMarks(){
        for(int i=0;i<5;i++){
            System.out.println("Your marks in course " + (i+1) + " is " + marks[i]);
        }
    }


    public static void main(String[] args) {
        //reading student details in constructor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your registration number : ");
        String regNo = sc.nextLine();
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your Branch : ");
        String branch = sc.nextLine();
        System.out.print("Enter your academic year : ");
        int year = sc.nextInt();
        System.out.print("Enter your semester : ");
        int sem = sc.nextInt();
        System.out.println("Enter your marks in 5 courses offered");
        int[] marks = new int[5];
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        // putting values in class Student
        Student student1= new Student(regNo,name,branch,year,sem,marks);
        // Reading marks in each course
        student1.readMarks();
        //Method to find grade
        System.out.println("Your grade is " + student1.grade());
    }
}
