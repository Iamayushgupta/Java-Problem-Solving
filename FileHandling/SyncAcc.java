package com.company.FileHandling;

public class SyncAcc {
    public static void main(String[] args) throws InterruptedException {
        Account acc= new Account(2000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                acc.deposit(500);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    acc.withdraw(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(acc.balance);
    }
}
class Account{
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int w) throws InterruptedException {
        System.out.println("Withdrawing amount");
        // Its waits for 9 sec and the next thread does not execute as there
        // is a lock on this process
        Thread.currentThread().sleep(9000);
        this.balance-= w;
    }
    public void deposit(int dep){
        synchronized (this) {
            System.out.println("Depositing Amount");
            this.balance += dep;
        }
        System.out.println("I am not synchronized");
    }
}