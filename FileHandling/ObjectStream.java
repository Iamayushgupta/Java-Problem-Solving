package com.company.FileHandling;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student("ayush",10);
        File obj =new File("22mar");
        FileOutputStream fout = new FileOutputStream(obj);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(s);
        objout.close();

        FileInputStream fin = new FileInputStream(obj);
        ObjectInputStream objin = new ObjectInputStream(fin);
        Student instudent = (Student)objin.readObject();
        System.out.println(instudent.toString());

    }
}
class Student implements Serializable{
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
}