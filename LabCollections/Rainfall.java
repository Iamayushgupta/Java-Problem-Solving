package com.company.LabCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Rainfall {
    public static void main(String[] args) {
        Queue<Double> rainFall = new LinkedList<>();
        // Given Rainfall (in cm) in the q
        rainFall.offer(10.2);
        rainFall.offer(11.9);
        rainFall.offer(8.0);
        rainFall.offer(11.2);
        rainFall.offer(10.8);
        rainFall.offer(6.9);
        rainFall.offer(8.2);
        rainFall.offer(11.5);
        rainFall.offer(10.4);
        rainFall.offer(8.7);
        rainFall.offer(7.8);
        rainFall.offer(7.5);
//        System.out.println(rainFall);
        double total = 0;
        for(double ele:rainFall){
            total+=ele;
        }
        double avgRainfall = total/12;
        System.out.println("Average rain fall is " + avgRainfall);
        int count=0;

        for(double ele:rainFall){
            if (ele>avgRainfall){
                count++;
            }
        }
        System.out.println("Number of months whose rainfall is more than average is " + count);
    }
}
