package com.company.JavaLab;

import java.util.Scanner;

public class TimeException {

    public static void main(String args[]){

        double timeInHours;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current time in hours : ");
        timeInHours = sc.nextDouble();
        System.out.println();

        try{
            throw new customTimeException(timeInHours);
        }
        catch(customTimeException e){
            System.out.println(e) ;
        }
    }
}



class customTimeException extends Exception{

    private double timeOfDay;

    public customTimeException(double timeofDay) {
        this.timeOfDay = timeofDay;
    }

    public String toString(){

        String msg = null;

        if(timeOfDay >=5 && timeOfDay < 12) {
            msg = "Morning, Have Fresh Vegetable Juice and then Sugar Tablet with mild walking";
        }
        else if(timeOfDay >=12 && timeOfDay < 17) {
            msg = "It's Day Time, after lunch have tablet to avoid sleep";
        }
        else if(timeOfDay >=17 && timeOfDay < 18.30) {
            msg = "Hello, Good Evening have a dinner";
        }
        else {
            msg = "Night, Go for sleep";
        }

        return msg;

    }

}
