package com.company.labcat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n=sc.nextInt();

        System.out.println("Enter the elements of array");

        double arr[] = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
        }
        Sort obj = new Sort();
        double[] sortedArr = obj.bubbleSort(arr);
        System.out.println("The array has been sorted using bubble sort");

        System.out.print("Enter the element to be searched : ");
        double k = sc.nextDouble();

        System.out.println(obj.search(sortedArr,k));

    }
}
