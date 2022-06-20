package com.company.Thread;

public class ExtendingThreadCLass {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        // It runs both the threads simultaneously
        t1.start();
        t2.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("I am in Thread 1");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("I am in Thread 2");
        }
    }
}