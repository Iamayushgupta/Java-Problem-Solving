package com.company.Thread.quiz;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Quiz q = new Quiz();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    q.question();
                    q.answer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    q.question();
                    q.answer();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }

}
class Quiz{
    public int q=1;
    public synchronized void question() throws InterruptedException {
        System.out.println("Reading the question" + this.q);
        Thread.currentThread().sleep(10000);
    }
    public synchronized void answer(){
        System.out.println("Answering the question " + this.q);
        this.q+=1;

    }
}