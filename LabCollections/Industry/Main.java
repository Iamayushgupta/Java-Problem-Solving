package com.company.LabCollections.Industry;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Sample> samples = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        FileOutputStream fout = new FileOutputStream("temp");
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        int productId;
        Double diameter;
        Double length;
        Double weight;

        for(int i=0;i<6;i++){
            System.out.print("Enter productID : ");
            productId = sc.nextInt();
            System.out.print("Enter diameter : ");
            diameter = sc.nextDouble();
            System.out.print("Enter length : ");
            length = sc.nextDouble();
            System.out.print("Enter weight : ");
            weight = sc.nextDouble();

            samples.add(new Sample(productId,diameter,length,weight));
        }
        objout.writeObject(samples);
        objout.close();
        fout.close();

        ArrayList<Sample> products = new ArrayList<>();

        FileInputStream fis = new FileInputStream("temp");
        ObjectInputStream objin = new ObjectInputStream(fis);
        Set<Sample> correct = new LinkedHashSet<>();
        Set<Sample> defective = new LinkedHashSet<>();

        products = (ArrayList) objin.readObject();

        for (Sample obj1 : products){
            if(obj1.diameter==3 && obj1.length==10 && obj1.weight==100){
                correct.add(obj1);
            }
            else{
                defective.add(obj1);
            }
        }
        objin.close();
        fis.close();
        System.out.println("Elements in correct Set");
        for(Sample ele : correct){
            System.out.println(ele.toString());
        }
        System.out.println("Elements in defective set");
        for(Sample ele : defective){
            System.out.println(ele.toString());
        }

        System.out.println("Products in correct set in sorted order");
        List<Sample> sampleList = new ArrayList<>(correct);
        Collections.sort(sampleList);
        sampleList.forEach((s)->System.out.println(s));
    }
}
