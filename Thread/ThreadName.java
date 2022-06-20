package com.company.Thread;

public class ThreadName {
    public static void main(String[] args) {
        Thread4 thr = new Thread4("ayush");
        thr.start();
        System.out.println(thr.getName());
    }

}
class Thread4 extends Thread{
    public Thread4(String s) {
        super(s);
    }

    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("I am in Thread 1");
            i++;
        }
    }
}