package com.company.p1;

public class Extract {
    public int[] extract(int n){
        int k=n;
        int c=0;
        while(k!=0){
            c++;
            k/=10;
        }
        int[] arr = new int[c];
        for(int i=c-1;i>=0;i--){
            arr[i]=n%10;
            n/=10;
        }
        return arr;
    }

}
