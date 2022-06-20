package com.company.JavaLab.Voting;

import java.util.Random;
import java.util.Vector;
public class Vote extends Thread {
    Random rand = new Random();
    int max = 750;
    int min = 100;
    int v, s;
    Vector vec;

    public Vote(int v, Vector vec) {
        this.v = v;
        this.vec = vec;
    }

    public void run() {
        try {
            // while voting print id
            while (vec.size() < 240) {
                System.out.println("Thread " + this.getId() + " is Voting");
                vec.add(v);
                s = rand.nextInt((max - min) + 1) + min;
                System.out.println("Thread " + this.getId() + " is sleeping for " + s);
                Thread.sleep(s);
            }
        } catch (InterruptedException e) {
            System.out.println("Voting Exception: " + e);
        }
    }
}

