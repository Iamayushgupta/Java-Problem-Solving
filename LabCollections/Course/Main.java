package com.company.LabCollections.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,ArrayList> h1 = new HashMap<String, ArrayList>();
        System.out.print("Enter the number of Students : ");
        int n = sc.nextInt();
        while (n!=0){
            // Maximum courses can be Three
            ArrayList<String> course = new ArrayList<>();
            System.out.print("Enter Student Name : ");
            String name = sc.next();
            System.out.print("Enter the  number of courses : ");
            int k = sc.nextInt();
            System.out.println("Enter the courses :-");
            for(int i =0;i<k;i++){
                course.add(sc.next());
            }
            h1.put(name , course);
            n--;
        }
        Map<String,String > h2 = new HashMap<String,String>();
        for (int i=0;i<3;i++){
            System.out.print("Enter the course name : ");
            String course = sc.next();
            System.out.print("Enter the faculty name : ");
            String fac = sc.next();
            h2.put(course,fac);
        }
        for(Map.Entry<String ,ArrayList> e:h1.entrySet()){
            System.out.print(e.getKey() + "=");
            for(Object ele : e.getValue()){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        for(Map.Entry<String ,String> e:h2.entrySet()){
            System.out.println(e);
        }
//        System.out.println("Enter the name of Student to be removed : ");
//        String name = sc.next();
//        h1.remove(name);
//        System.out.println("Name has been removed successfully");

        System.out.print("Enter Student name whose faculty has to be fetched : ");
        String name=sc.next();
        for (Object ele : h1.get(name)){
            System.out.print(ele + "-");
            System.out.println(h2.get(ele));
        }
    }

}
