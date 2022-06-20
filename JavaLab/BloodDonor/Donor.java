package com.company.JavaLab.BloodDonor;
import java.io.Serializable;
import java.util.Date;

public class Donor  implements Serializable {
    String name;
    String address;
    String bloodGroup;
    Date dold;
    int age;

    public Donor(String name, String address, String bloodGroup, Date dold, int age) {
        this.name = name;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.dold = dold;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", dold=" + dold +
                ", age=" + age +
                '}';
    }
}


