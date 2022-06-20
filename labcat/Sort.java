package com.company.labcat;

public class Sort {
    public double[] bubbleSort (double arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }

    public int search (double arr[],double key){
        int i=0;
        int j=arr.length -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==key){
                return i;
            }
            else if (arr[mid]>key){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }

}
