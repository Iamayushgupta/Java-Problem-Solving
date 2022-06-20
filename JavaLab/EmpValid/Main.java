package com.company.JavaLab.EmpValid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InvalidEmployeeCode {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        while (true) {
            System.out.print("Enter Employee ID: ");
            String id = sc.next();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter year of birth: ");
            int year = sc.nextInt();
            try {
                validate(id);
                list.add(new Employee(id, name, year));
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Do you want to give more inputs (y/n): ");
            String choice = sc.next();
            if (choice.equals("n")){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    private static void validate(String id)throws InvalidEmployeeCode {
        String[] breakup = id.split("-");
        if(breakup[0].length() == 2 && (breakup[1].equals("S") || breakup[1].equals("F")) &&
                breakup[2].length() == 3){
        }
        else {
            throw new InvalidEmployeeCode(id);
        }
    }
    private static class InvalidEmployeeCode extends Exception {
        public InvalidEmployeeCode(String id) {
            System.out.println(id+" employee id invalid");
        }
    }
}
