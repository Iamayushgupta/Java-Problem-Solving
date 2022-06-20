package com.company.FileHandling.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}
