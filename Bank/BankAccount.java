package com.company.Bank;

public abstract class BankAccount {
    private String name;
    private String dob;
    private String address;
    private int accNum;
    private int balance;

    public BankAccount(String name, String dob, String address, int accNum, int balance) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
