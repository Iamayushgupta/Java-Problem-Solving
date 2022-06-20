package com.company.LabCollections.Tourist;

import java.util.Scanner;

class Tourist implements Comparable<Tourist>{
    String name, state, famous_spot;
    Scanner sc= new Scanner(System.in);
    public Tourist(int i){
        System.out.print("name of place "+(i+1)+" : ");
        name=sc.nextLine();
        System.out.print("state of place "+(i+1)+" : ");
        state=sc.nextLine();
        System.out.print("famous spot : ");
        famous_spot=sc.nextLine();
    }

    public int compareTo(Tourist t){
        return -t.state.compareTo(this.state);
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", famous_spot='" + famous_spot + '\'' +
                '}';
    }
}
