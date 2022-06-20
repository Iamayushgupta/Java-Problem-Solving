package com.company.FileHandling;

import java.io.*;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File obj =new File("ayush.txt");
        FileInputStream fin = new FileInputStream(obj);
        int data=fin.read();
        System.out.println(data); // prints ascii/ansi for first char
        int data2;
        while((data2=fin.read())!=-1){
            System.out.println(data2);
        }

        byte b[] =new byte[4];
        fin.read(b);
        for(byte ele : b){
            System.out.println((char)ele);
        }
    }
}
