package com.company.Thread;

public class RunnableInterface {
    public static void main(String[] args) {
        ThreadRunnable1 t1 = new ThreadRunnable1();
        ThreadRunnable2 t2 = new ThreadRunnable2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        // Thread may run in any order
        thread1.start();
        thread2.start();
    }
}
class ThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am in 1");
    }
}
class ThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am in 2");
    }
}