package com.company.FileHandling;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
    Numbers num = new Numbers();
    Thread thr1 = new Thread(new Runnable() {
        @Override
        public void run() {
            num.generateEven();
        }
    });

    Thread thr2 = new Thread(new Runnable() {
        @Override
        public void run() {
            num.generateOdd();
        }
    });
    thr1.start();
    thr1.join(); // All other will execute after the completion if thr1
    thr2.start();
    }
}
class Numbers{
    public void generateOdd(){
        for(int i=0;i<50;i++){
            if(i%2==1){
                System.out.println("Odd number " + i);
            }
        }
    }
    public void generateEven(){
        for(int i=0;i<50;i++){
            if(i%2==0){
                System.out.println("Even number " + i);
            }
        }
    }
}
