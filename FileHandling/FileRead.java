package com.company.FileHandling;

import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {
        try {
            File obj = new File("temp.txt");
            FileReader fir = new FileReader(obj);
            char c[] = new char[4];
            fir.read(c);  // putting the first 4 char in the array
            for (char ele:c){
                System.out.println(ele);
            }

            char x[] =new char[4];
            fir.read(x,1,2); // putting two chars from index 1
            for (char ele:x){
                System.out.println(ele);
            }
            fir.close();

            int data = fir.read();
            System.out.println(data);
            fir.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
