package com.company.FrameworkCollection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(32);
        pq.offer(2);
        pq.offer(19);
//        System.out.println(pq.peek());
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);


        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(12);
        pq1.offer(32);
        pq1.offer(2);
        pq1.offer(19);
        System.out.println(pq1.peek());
        System.out.println(pq1);
    }
}
