package com.company.FileHandling;

import java.io.File;

public class DemoClass {
    public static void main(String[] args) {
        File obj = new File("D:\\GitHub\\Competitive-Coding\\Python_CC");
        String names[] = obj.list();
        for(String ele : names){
            System.out.println(ele);
        }

        File obj2 = new File("D:\\GitHub\\Competitive-Coding\\Python_CC");
        File names2[] = obj2.listFiles();
        for(File ele : names2){
            System.out.println(ele.getName());
        }
    }
}
