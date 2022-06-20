package com.company.FrameworkCollection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); //add element at rear end
        queue.offer(10);
        queue.offer(43);
        System.out.println(queue);
        System.out.println(queue.poll()); // removes ele from front end
        System.out.println(queue.peek());

    }
}
