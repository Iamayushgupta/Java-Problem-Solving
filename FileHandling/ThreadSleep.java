package com.company.FileHandling;

public class ThreadSleep {
    public static void main(String[] args) {
        Number t = new Number();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t.generate0();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.generate51();
            }
        });
        thr1.setPriority(10);
        thr2.setPriority(1);
        thr1.start();
        thr2.start();
        thr1.interrupt();
        System.out.println("The main thread");
    }
}
class Number{
    public void generate0() throws InterruptedException {
        for (int i=0;i<50;i++){
            if(i==5){
                // Thread sleep requires try-catch
                Thread.sleep(1000);
                // in this time thr2 will run
            }
            System.out.println("The number less than 50 is " + i);
        }
    }
    public void generate51(){
        for (int i=51;i<100;i++){
            System.out.println("The number less than 100 is " + i);
        }
    }
}
