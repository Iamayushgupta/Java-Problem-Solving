package com.company.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class sort_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.printf(Arrays.toString(arr));
    }
}
