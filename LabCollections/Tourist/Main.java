package com.company.LabCollections.Tourist;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Tourist> places= new ArrayList<Tourist>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of places :  ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Tourist t= new Tourist(i);
            places.add(t);
        }

        Collections.sort(places);

        for (Tourist t: places){
            System.out.println(t.toString());
        }
        System.out.print("Enter the place you have to search: ");
        String s=sc.next();
        for(Tourist t: places){
            if(t.name.compareTo(s)==0){
                System.out.println("Place found: "+t.toString());
                break;
            }
        }
        sc.close();
    }

}
