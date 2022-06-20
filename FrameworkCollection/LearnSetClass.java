package com.company.FrameworkCollection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LearnSetClass {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("ayush",1));
        studentSet.add(new Student("rohit",2));
        studentSet.add(new Student("abhi",3));
        studentSet.add(new Student("rahul",1));
        System.out.println(studentSet);
    }
}

class Student{
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}