package com.company.LabCollections.Library;

import java.util.Map;
import java.util.Scanner;

public class Book {
    String bookName;
    String author;
    int price;
    int noOfCopies;

    public Book(String bookName, String author, int price, int noOfCopies) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.noOfCopies = noOfCopies;
    }
    public static void search(Map<Integer,Book> temp){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book name to be searched : ");
        String name = sc.nextLine();
        boolean bool =true;
        for(Map.Entry<Integer,Book> e: temp.entrySet()){
            if(e.getValue().bookName.equals(name)){
                bool=false;
                System.out.println("The book is in rack number " + e.getKey());
                break;
            }
        }
        if (bool){
            System.out.println("The book is not in the rack");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", noOfCopies=" + noOfCopies +
                '}';
    }
}
