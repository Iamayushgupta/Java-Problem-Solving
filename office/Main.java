package com.company.office;

public class Main {
    public static void main(String[] args) {
        Employee obj1=new Employee("1000112","ayush",20,5);
        Employee obj2=new Employee("1000112","abhi",20,90);
        obj1.check();
        System.out.println(obj2.display());
        System.out.println(obj2.display());
    }


}
