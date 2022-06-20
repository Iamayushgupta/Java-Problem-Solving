package com.company.JavaLab.Voting;

import java.util.Vector;

public class Count extends Thread{
    Vector vec;
    int k, i;
    public int count = 0;
    public Count(int k, Vector vec){
        this.k = k;
        this.vec = vec;
    }
    @Override
    public void run(){
        try{
            for(i = 0; i < vec.capacity(); i++){
                if(vec.elementAt(i).equals(k))
                    count++;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
