package com.company.LabCollections.Library;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Map<Integer,Book> racks = new HashMap<>();
        // Maximum 5 books can be in rack
        for(int i=1;i<6;i++){
            System.out.print("Enter the book name : ");
            String bookName = sc.next();
            System.out.print("Enter the author : ");
            String author = sc.next();
            System.out.print("Enter the price : ");
            int price = sc.nextInt();
            System.out.print("Enter the number of copies : ");
            int noOfCopies= sc.nextInt();
            racks.put(i,new Book(bookName,author,price,noOfCopies));
        }

        Book.search(racks);

        System.out.println("Displaying the rack");
        for(Map.Entry<Integer,Book> e: racks.entrySet()){
            System.out.println(e.getKey() + " "  + e.getValue().toString());
        }

    }

}
