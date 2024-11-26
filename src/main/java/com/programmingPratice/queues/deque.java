package com.programmingPratice.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.addLast(50);
        deque.addFirst(50);
        System.out.println(deque); // in deque we can add last and first and also remove first and last
    }
}
