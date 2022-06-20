package com.company.FileHandling.Serialization;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e[] = new Employee[2];
        Scanner sc = new Scanner(System.in);
        File f = new File("temp.txt");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        String name;
        int empId;
        for(int i=0;i<e.length;i++){
            name = sc.next();
            empId=sc.nextInt();
            e[i] = new Employee(name,empId);
            objout.writeObject(e[i]);  // to serialize the objects
        }
        objout.writeObject(new EndOfFile()); // ending objout
        objout.close();

        ObjectInputStream objin = new ObjectInputStream(new FileInputStream(new File("temp.txt")));
        Object obj1;
        while((obj1 = objin.readObject()) instanceof EndOfFile == false){
            System.out.println(obj1.toString());
        }
        objin.close();
    }
}
