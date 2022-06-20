package com.company.FrameworkCollection;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,5,6,7};
        int index = Arrays.binarySearch(nums,2);
        System.out.println(index);

        Arrays.sort(nums);

        Arrays.fill(nums,10);
        //makes all elements to 10
        for(int i:nums){
            System.out.print(i + " ");
        }

    }
}
