package com.company.Thread;

public class AnonymousThread {
    public static void main(String[] args) {
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am from thread1");
            }
        });

        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am from thread2");
            }
        });

        thr1.start();
        thr1.setPriority(10);

        thr2.start();
        thr2.setPriority(1);


        //for the main the priority is always 5
        System.out.println("I am from main");
    }
}
