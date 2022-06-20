package com.company.office;

public class Employee {
    String EmpCode;
    String name;
    int age;
    int experience;

    public Employee(String empCode, String name, int age, int experience) {
        EmpCode = empCode;
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
    public Employee(){
        this.EmpCode= "11198";
        this.name="ayush";
        this.age=20;
        this.experience=2;
    }

    public String display() {
        return "Employee{" +
                "EmpCode='" + this.EmpCode + '\'' +
                ", name='" + this.name + '\'' +
                ", age=" + this.age +
                ", experience=" + this.experience +
                '}';
    }

    public void check(){
        if(this.EmpCode.length()!=6){
            System.out.println("Invalid EmpCode");
        }
        if(this.name.length()>30){
            System.out.println("Invalid name");
        }
        if(this.age<18 | this.age>58){
            System.out.println("Invalid age");
        }
        if(this.experience>this.age){
            System.out.println("Not possible");
        }
    }
}
