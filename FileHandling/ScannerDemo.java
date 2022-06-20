package com.company.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("ayush.txt");
        Scanner input = new Scanner(obj);

        // reading a single word
        String word = input.next();
        System.out.println(word);

        // line by line data reading
        while (input.hasNext()){
            String line = input.nextLine();
            System.out.println(line);
        }

        //word by word
        while(input.hasNext()){
            String line = input.next();
            System.out.println(line);
        }
    }
}
