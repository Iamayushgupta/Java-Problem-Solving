package com.company.JavaLab.EmpValid;
public class Employee {
    String eid;
    String name;
    int year;
    Employee(String eid, String name, int year){
        this.eid = eid;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

