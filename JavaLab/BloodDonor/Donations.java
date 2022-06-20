package com.company.JavaLab.BloodDonor;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Donations {
    public static int getMonths(Date start, Date end){
        Calendar startCal = new GregorianCalendar();
        startCal.setTime(start);
        Calendar endCal = new GregorianCalendar();
        endCal.setTime(end);
        int diffYear = endCal.get(Calendar.YEAR) - startCal.get(Calendar.YEAR);
        int diffMonth = diffYear * 12 + endCal.get(Calendar.MONTH) -
                startCal.get(Calendar.MONTH);
        return diffMonth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Donor donors[] = new Donor[4];
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            donors[0] = new Donor("Ayush", "101", "O+ve", sdf.parse("13/01/2022"), 20);
            donors[1] = new Donor("Abhi", "100", "AB+ve",sdf.parse("15/02/2022"), 27);
            donors[2] = new Donor("Parus", "99", "A+ve", sdf.parse("12/03/2022"), 20);
            donors[3] = new Donor("Navya", "102", "A+ve", sdf.parse("12/04/2021"), 20);
        }catch (ParseException e){
            System.out.println(e);
        }
        String filename = "donations.txt";
        try{
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(donors);
            oos.close();
            fos.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        try{
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Donor[] savedDonors = (Donor[])ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Donors with A+ve and Last date of Donation > 6 months");
            for(Donor d: savedDonors) {
                if(getMonths(d.dold,new Date()) > 6 && d.bloodGroup.equals("A+ve"))
                    System.out.println(d);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
