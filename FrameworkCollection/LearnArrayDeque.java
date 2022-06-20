package com.company.FrameworkCollection;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(13);
        adq.offerLast(14);
        adq.offerLast(17);
        //offer and offerLast does the same thing

        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        //peek and peekFirst does the same thing

        System.out.println(adq.pollLast());
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        //poll and pollFirst does the same thing
    }
}
