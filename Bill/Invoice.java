package com.company.Bill;

import java.util.Arrays;
import java.util.List;

public class Invoice {

    public static void main(String[] args) {
        Items item1 = new Items("Chips",5,20,100);
        Items item2 = new Items("Chocolate",10,30,300);
        Items item3 = new Items("Biscuit",2,35,70);
        Items item4 = new Items("Shampoo",1,400,350);
        // Total cost will not be equal to (quantity)x(price) as there may be discount
        List<Items> itemsList = Arrays.asList(item1,item2,item3,item4);
        printBill(itemsList);

    }

    public static void printBill(List<Items> itemsList){
        itemsList.forEach(items -> System.out.println(items.toString()));
    }
}
