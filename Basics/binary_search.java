package com.company.Basics;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements in sorted order");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the element to be searched : ");
        int tar= sc.nextInt();
        if (bin_search(0,n-1,arr,tar)){
            System.out.println("Element is present in the array");
        }
        else{
            System.out.println("Element is not present in the array");
        }

    }
    static boolean bin_search(int low,int high,int[] arr,int target){
        while(low<=high){
            int mid= (low+high)/2;
            if (arr[mid]==target){
                return true;
            }
            else if (arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
